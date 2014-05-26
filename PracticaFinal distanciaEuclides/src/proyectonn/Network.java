/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectonn;
/**
 *
 * @author Uriel
 */

public class Network {

 /**
  *
  * El error global para el entrenamiento
  */
 protected double globalError;

 /**
  * 
  * Numero de neuronas de entrada
  */
 protected int entradaCuenta;

 /**
  * 
  * Numero de neuronas ocultas
  */
 protected int ocultoCuenta;

 /**
  * 
  * Numero de neuronas de salida
  */
 protected int salidaCuenta;

 /**
  * Numero total de neuronas en la red neuronal.
  */
 protected int neuronaCuenta;

 /**
  * Numero de pesos en la Red Neuronal.
  */
 protected int pesoCuenta;

 /**
  * Tasa de aprendizaje
  */
 protected double aprenTasa;

 /**
  * Salidas de varias niveles
  */
 protected double fire[];

 /**
  * Matriz de pesos (Memoria de la red neuronal)
  */
 protected double matrix[];

 /**
  * Errores del ultimo calculo
  */
 protected double error[];

 /**
  * Matriz de deltas acumuladas para el entrenamiento.
  */
 protected double accMatrixDelta[];

 /**
  * Memoria de la red neuronal
  */
 protected double umbrals[];

 /**
  * Cambios que se deben hacer a la matriz de pesos
  */
 protected double matrixDelta[];

 /**
  * Acumlacion de las deltas.
  */
 protected double accThresholdDelta[];

 /**
  * Deltas.
  */
 protected double umbralDelta[];

 /**
  * Momento.
  */
 protected double momento;

 /**
  * Cambios en los errores.
  */
 protected double errorDelta[];


 /**
  * Construccion de la red neuronal.
  *
  * entradaCuenta Numero de neuronas de entrada.
  * ocultoCuenta Numero de neuronas ocultas.
  * salidaCuenta Numero de neuronas de salida.
  * aprenTasa Tasa de aprendizaje.
  * momento Momento.
  */
 public Network(int entradaCuenta,
         int ocultoCuenta,
         int salidaCuenta,
         double aprenTasa,
         double momento) {

  this.aprenTasa = aprenTasa;
  this.momento = momento;

  this.entradaCuenta = entradaCuenta;
  this.ocultoCuenta = ocultoCuenta;
  this.salidaCuenta = salidaCuenta;
  neuronaCuenta = entradaCuenta + ocultoCuenta + salidaCuenta;
  pesoCuenta = (entradaCuenta * ocultoCuenta) + (ocultoCuenta * salidaCuenta);

  fire    = new double[neuronaCuenta];
  matrix   = new double[pesoCuenta];
  matrixDelta = new double[pesoCuenta];
  umbrals = new double[neuronaCuenta];
  errorDelta = new double[neuronaCuenta];
  error    = new double[neuronaCuenta];
  accThresholdDelta = new double[neuronaCuenta];
  accMatrixDelta = new double[pesoCuenta];
  umbralDelta = new double[neuronaCuenta];

  reset();
 }



 /**
  * Raiz del error cuadratico para un conjunto de entrenamiento.
  * @param len La longitud del conjunto de entrenamiento.
  * @return Error actual de la red neuronal.
  */
 public double getError(int len) {
  double err = Math.sqrt(globalError / (len * salidaCuenta));
  globalError = 0; // Limpia el acumulador
  return err;

 }

 /**
  * The umbral method. You may wish to override this class to provide other
  * umbral methods.
  *
  * @param sum Acticacion de la neurona.
  * @return Activacion aplicado a los umbrals.
  */
 public double umbral(double sum) {
  return 1.0 / (1 + Math.exp(-1.0 * sum));
 }

 /**
  * Resuelve la salida para una entrada en la red neuronal
  * @param input La entrada que se da a la red neuronal.
  * @return Resultados de las neuronas de salida.
  */
 public double []computeOutputs(double input[]) {
  int i, j;
  final int hiddenIndex = entradaCuenta;
  final int outIndex = entradaCuenta + ocultoCuenta;

  for (i = 0; i < entradaCuenta; i++) {
   fire[i] = input[i];
  }

  // Primeracapa
  int inx = 0;

  for (i = hiddenIndex; i < outIndex; i++) {
   double sum = umbrals[i];

   for (j = 0; j < entradaCuenta; j++) {
    sum += fire[j] * matrix[inx++];
   }
   fire[i] = umbral(sum);
  }

  //Capa Oculta

  double result[] = new double[salidaCuenta];

  for (i = outIndex; i < neuronaCuenta; i++) {
   double sum = umbrals[i];

   for (j = hiddenIndex; j < outIndex; j++) {
    sum += fire[j] * matrix[inx++];
   }
   fire[i] = umbral(sum);
   result[i-outIndex] = fire[i];
  }

  return result;
 }


 /**
  *Calcula el error para el reconocimiento.
  * @param ideal Lo que las neuronas de salida deberian de dar.
  */
 public void calcError(double ideal[]) {
  int i, j;
  final int hiddenIndex = entradaCuenta;
  final int outputIndex = entradaCuenta + ocultoCuenta;

  // Limpiar errores de la capa oculta
  for (i = entradaCuenta; i < neuronaCuenta; i++) {
   error[i] = 0;
  }

  // Errores y deltas para la capa de salida
  for (i = outputIndex; i < neuronaCuenta; i++) {
   error[i] = ideal[i - outputIndex] - fire[i];
   globalError += error[i] * error[i];
   errorDelta[i] = error[i] * fire[i] * (1 - fire[i]);
  }

  // Errores de la capa Oculta
  int winx = entradaCuenta * ocultoCuenta;

  for (i = outputIndex; i < neuronaCuenta; i++) {
   for (j = hiddenIndex; j < outputIndex; j++) {
    accMatrixDelta[winx] += errorDelta[i] * fire[j];
    error[j] += matrix[winx] * errorDelta[i];
    winx++;
   }
   accThresholdDelta[i] += errorDelta[i];
  }

  //deltas de la capa oculta
  for (i = hiddenIndex; i < outputIndex; i++) {
   errorDelta[i] = error[i] * fire[i] * (1 - fire[i]);
  }

  // Errores en la capa de entrada
  winx = 0; // offset en la matriz de pesos
  for (i = hiddenIndex; i < outputIndex; i++) {
   for (j = 0; j < hiddenIndex; j++) {
    accMatrixDelta[winx] += errorDelta[i] * fire[j];
    error[j] += matrix[winx] * errorDelta[i];
    winx++;
   }
   accThresholdDelta[i] += errorDelta[i];
  }
 }

 /**
  * Modifica la matriz de pesos y umbrals basada en el ultimo resultado de error.
  */
 public void learn() {
  int i;

  // Procesa la matriz
  for (i = 0; i < matrix.length; i++) {
   matrixDelta[i] = (aprenTasa * accMatrixDelta[i]) + (momento * matrixDelta[i]);
   matrix[i] += matrixDelta[i];
   accMatrixDelta[i] = 0;
  }

  // procesa los umbrals
  for (i = entradaCuenta; i < neuronaCuenta; i++) {
   umbralDelta[i] = aprenTasa * accThresholdDelta[i] + (momento * umbralDelta[i]);
   umbrals[i] += umbralDelta[i];
   accThresholdDelta[i] = 0;
  }
 }

 /**
  *
  * Limpia la matriz de pesos y los umbrals;
  */
 public void reset() {
  int i;

  for (i = 0; i < neuronaCuenta; i++) {
   umbrals[i] = 0.5 - (Math.random());
   umbralDelta[i] = 0;
   accThresholdDelta[i] = 0;
  }
  for (i = 0; i < matrix.length; i++) {
   matrix[i] = 0.5 - (Math.random());
   matrixDelta[i] = 0;
   accMatrixDelta[i] = 0;
  }
 }
}