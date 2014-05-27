/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reconocedorletras;

import java.util.ArrayList;

/**
 *
 * @author Alex Ortiz
 */
public class DatosEntrenamiento {
    public static ArrayList<Patron> patrones = new ArrayList<Patron>();
    public static Network n;
    protected final static int NUM_INPUT = 7;
    protected final static int NUM_OUTPUT = 1;
    protected final static int NUM_HIDDEN = 15;
    protected final static double RATE = 0.50;
    protected final static double MOMENTUM = 0.70;

    public DatosEntrenamiento() {
        n = new Network(
                NUM_INPUT,
                NUM_HIDDEN,
                NUM_OUTPUT,
                RATE,
                MOMENTUM);
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
    public static double[][] getListResultados(){
        double[][] resultado = new double[patrones.size()][patrones.get(0).getResultado().length];
        for(int pos = 0 ; pos<patrones.size(); pos++)
        {
            resultado[pos] = patrones.get(pos).getResultado();
        }
        return resultado;
    }
    public static void addPatron(Patron nuevoPatron)
    {
        patrones.add(nuevoPatron);        
    }        
    protected static void train() {
        double xorData[][] = getListPatrones();
        double xorIdeal[][] = getListResultados();
        System.out.println(xorData.length);
        int update = 0;
        int max = 1000;
        double temp[];
        for (int i = 0; i < max; i++)
        {
            for (int j = 0; j < xorData.length; j++) 
            {
                System.out.println(j);
                n.computeOutputs(xorData[j]);
                System.out.println(j);
                n.calcError(xorIdeal[j]);
                n.learn();
            }
            update++;
            if (update == 10) {
                System.out.println("Cycles Left:" + (max - i) + ",Error:" + n.getError(xorData.length));
                update = 0;
            }
        }
        System.out.println("Resultados de la red ");
        System.out.println("");
        System.out.println("");
        for (int k = 0; k < xorData.length; k++) {
            temp = n.computeOutputs(xorData[k]);            
            System.out.println(xorIdeal[k][0] + " -->" + temp[0]);
            
        }
    }
}
