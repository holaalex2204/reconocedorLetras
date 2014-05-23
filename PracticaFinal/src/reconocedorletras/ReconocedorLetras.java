/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reconocedorletras;

import javax.swing.JApplet;
import javax.swing.JFrame;

/**
 *
 * @author holaalex2204
 */
public class ReconocedorLetras {

    /**
     * @param args the command line arguments
     */
    public static Network n;
    protected final static int NUM_INPUT = 448;
    protected final static int NUM_OUTPUT = 7;
    protected final static int NUM_HIDDEN = 7;
    protected final static double RATE = 0.5;
    protected final static double MOMENTUM = 0.7;

    protected static double[] BitFromDouble(Double d) {
        byte[] output = new byte[8];
        Long lng = Double.doubleToLongBits(d);
        for (int i = 0; i < 8; i++) {
            output[i] = (byte) ((lng >> ((7 - i) * 8)) & 0xff);
        }
        return toBinary(output);
    }

    protected static double[] toBinary(byte[] bytes) {
        double[] res = new double[(bytes.length * Byte.SIZE)];
        for (int i = 0; i < Byte.SIZE * bytes.length; i++) {
            res[i] = ((bytes[i / Byte.SIZE] << i % Byte.SIZE & 0x80) == 0 ? 0 : 1);
        }
        return res;
    }

    protected static double[][] getGrid() {
        return DatosGrandotes.getGrid();
    }

    protected static double[][] getIdeal() {
        return DatosGrandotes.getIdeal();
    }

    public static double[] getBinaryNumber(int n) {
        int num = n;
        int ind = 0;
        double[] res = {0, 0, 0, 0, 0, 0, 0};
        while (num != 0) {
            if (num % 2 == 1) {
                res[ind] = 1;
                num--;
            }
            ind++;
            num = num / 2;
        }
        return res;
    }

    public static int getDecimalNumber(double[] ar) {
        int pot = 1;
        int res = 0;
        int pos = 0;
        while (ar.length > pos) {
            res += pot * Math.round(ar[pos]);
            pot = pot * 2;
            pos++;
        }
        return res;
    }

    protected static void train() {
        double xorData[][] = getGrid();
        double xorIdeal[][] = getIdeal();
        int update = 0;
        int max = 1000;
        double temp[];
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < xorData.length; j++) {
                n.computeOutputs(xorData[j]);
                n.calcError(xorIdeal[j]);
                n.learn();
            }
            update++;
            if (update == 100) {
                System.out.println("Cycles Left:" + (max - i) + ",Error:" + n.getError(xorData.length));
                update = 0;
            }
        }
        for (int k = 0; k < xorData.length; k++) {
            temp = n.computeOutputs(xorData[k]);
            System.out.println(getDecimalNumber(xorIdeal[k]) + " -->" + getDecimalNumber(temp));
        }
    }
   public void menu(){
       JApplet theApplet = new PaintDemo();
        n = new Network(
                NUM_INPUT,
                NUM_HIDDEN,
                NUM_OUTPUT,
                RATE,
                MOMENTUM);
        train();
        //... Create a window (JFrame) and make applet the content pane.
        JFrame window = new JFrame();
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Paint Demo 2");
        window.pack();
        window.setLocationRelativeTo(null); // Center window.
        window.setResizable(false);
        window.setVisible(true);
   }
    
}
