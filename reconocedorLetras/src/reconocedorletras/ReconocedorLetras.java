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
    protected final static int NUM_INPUT = 7;
    protected final static int NUM_OUTPUT = 7;
    protected final static int NUM_HIDDEN = 5;
    protected final static double RATE = 0.5;
    protected final static double MOMENTUM = 0.7;
    
    protected static double[][] getGrid(){        
        
        double[][] res =  {
        {-4.3780298211306525E-8,4.000000147259861,1.51594655220622E-12,7.180218733359523E-14,-7.521442855688828E-27,9.068803849303819E-22,6.302780733355807E-27},
            {-5.048652287139922E-8,4.000000144193241,4.745146539835868E-13,4.074890677730451E-13,1.5706091296817154E-26,-3.948308408751007E-21,-7.12177589903096E-26},
            {-7.756159989869875E-8,4.000000180647287,2.2796753053375735E-12,2.6469405692597203E-13,-1.5141246110036215E-24,1.2699868742059077E-20,-6.597386750245364E-25},
                {-7.84311892780857E-8,4.000000178917688,2.4478461701420807E-12,1.2683751122635036E-13,1.1495727442321233E-27,-2.536017757170978E-22,-5.123341210486078E-27}
        };
        return res;        
    }
    protected static double[][] getIdeal() {
        double[][] res = new double[4][7];
        double [] temp;
        for(int i = 65; i<=68;i++)
        {
            temp = getBinaryNumber(i);
            for(int j = 0 ; j<7;j++)
            {                                
                res[(i-65)][j]= temp[j] ;
            }
            
        }
        return res;      
    }
    public static double[] getBinaryNumber(int n)
    {
        int num = n;
        int ind=0;
        double[] res ={0,0,0,0,0,0,0};
        while(num!=0)
        {
            if(num%2==1)
            {
                res[ind] = 1;                
                num--;
            }
            ind++;
            num = num/2;
        }        
        return res;
    }
    public static int getDecimalNumber(double[] ar)
    {
        int pot = 1;
        int res = 0;
        int pos = 0;
        while(ar.length>pos)
        {
            res+= pot*Math.round(ar[pos]);
            pot=pot*2;
            pos++;
        }        
        return res;
    }
    
    protected static void train() {
        double xorData[][] = getGrid();
        double xorIdeal[][] = getIdeal();
    int update=0;

    int max = 10000;
    for (int i=0;i<max;i++) {        
      for (int j=0;j<xorData.length;j++) {
        n.computeOutputs(xorData[j]);
        n.calcError(xorIdeal[j]);
        n.learn();
      }

      update++;
      if (update==100) {
          System.out.println( "Cycles Left:" + (max-i) + ",Error:" + n.getError(xorData.length) );
        update=0;
      }
    }
    }

    public static void main(String[] args) {        
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
        // System.out.println(theApplet.getSize()); // to get applet size.
        window.setVisible(true);
    }

    

}
