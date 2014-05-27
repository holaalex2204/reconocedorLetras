package reconocedorletras;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex Ortiz
 */
public class Patron {
    double[] cadenaPatron;
    double[] resultado;

    public Patron(double[] cadenaPatron, double[] resultado) {
        this.cadenaPatron = cadenaPatron;
        this.resultado = resultado;
    }

    public double[] getResultado() {
        return resultado;
    }

    public void setResultado(double[] resultado) {
        this.resultado = resultado;
    }

    
    public double[] getCadenaPatron() {
        return cadenaPatron;
    }

    public void setCadenaPatron(double[] cadenaPatron) {
        this.cadenaPatron = cadenaPatron;
    }
}
