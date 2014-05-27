/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reconocedorletras;
import reconocedorletras.Network;
import java.util.ArrayList;

/**
 *
 * @author Alex Ortiz
 */
public class DatosEntrenamiento {
    public static ArrayList<Patron> patrones = new ArrayList<Patron>();
    protected final static int NUM_INPUT = 15900;
    protected final static int NUM_OUTPUT = 7;
    protected final static int NUM_HIDDEN = 7;
    protected final static double RATE = 0.5;
    protected final static double MOMENTUM = 0.70;
    public static Network n = new Network(
                NUM_INPUT,
                NUM_HIDDEN,
                NUM_OUTPUT,
                RATE,
                MOMENTUM);
    

    public DatosEntrenamiento() {
        n = new Network(
                NUM_INPUT,
                NUM_HIDDEN,
                NUM_OUTPUT,
                RATE,
                MOMENTUM);
        n.reset();
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
    public static ArrayList<Patron> getPatrones() {
        return patrones;
    }

    public static void setPatrones(ArrayList<Patron> patrones) {
        DatosEntrenamiento.patrones = patrones;
    }
    public static double[][] getListPatrones(){
        double[][] resultado = new double[patrones.size()][patrones.get(0).getCadenaPatron().length];
        for(int pos = 0 ; pos<patrones.size(); pos++)
        {
            resultado[pos] = patrones.get(pos).getCadenaPatron();
        }
        return resultado;
    }

    public static double[][] getListResultados() {
        double[][] resultado = new double[patrones.size()][patrones.get(0).getResultado().length];
        for (int pos = 0; pos < patrones.size(); pos++) {
            resultado[pos] = patrones.get(pos).getResultado();
        }
        return resultado;
    }

    public static void addPatron(Patron nuevoPatron) {
        patrones.add(nuevoPatron);
    }

    protected static void train() {
        double xorData[][] = getListPatrones();
        double xorIdeal[][] = getListResultados();
        System.out.println(xorData.length);
        if (n == null) {
            n = new Network(
                    NUM_INPUT,
                    NUM_HIDDEN,
                    NUM_OUTPUT,
                    RATE,
                    MOMENTUM);
        }
        int max = 3000;
        double error;
        double temp[];
        int i = 0;
        do{
            for (i = 0; i < max; i++) {
                for (int j = 0; j < xorData.length; j++) {
                    n.computeOutputs(xorData[j]);
                    n.calcError(xorIdeal[j]);
                    n.learn();
                }
            }
            error = n.getError(xorData.length);

        }while ( error > 0.1) ;
        System.out.println("Resultados de la red ");
        System.out.println("");
        System.out.println("");
        for (int k = 0; k < xorData.length; k++) {
            temp = n.computeOutputs(xorData[k]);
            System.out.println(getDecimalNumber(xorIdeal[k]) + " -->" + getDecimalNumber(temp));

        }
    }
}
