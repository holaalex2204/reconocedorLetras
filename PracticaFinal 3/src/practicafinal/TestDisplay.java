package practicafinal;

import java.text.*;

public class TestDisplay {
 public static void main(String args[])
 {
  double DisplayInput[][] =
  {
   {1.0,1.0,1.0,1.0,1.0,1.0,0.0},//0
   {0.0,1.0,1.0,0.0,0.0,0.0,0.0},//1
   {1.0,1.0,0.0,1.0,1.0,0.0,1.0},//2
   {1.0,1.0,1.0,1.0,0.0,0.0,1.0},//3
   {0.0,1.0,1.0,0.0,0.0,1.0,1.0},//4
   {1.0,0.0,1.0,1.0,0.0,1.0,1.0},//5
   {1.0,0.0,1.0,1.0,1.0,1.0,1.0},//6
   {1.0,1.0,1.0,0.0,0.0,0.0,0.0},//7
   {1.0,1.0,1.0,1.0,1.0,1.0,1.0},//8
   {1.0,1.0,1.0,1.0,0.0,1.0,1.0},//9
   {1.0,1.0,1.0,0.0,1.0,1.0,1.0},//A
   {0.0,0.0,1.0,1.0,1.0,1.0,1.0},//B
   {1.0,0.0,0.0,1.0,1.0,1.0,0.0},//C
   {0.0,1.0,1.0,1.0,1.0,1.0,1.0},//D
   {1.0,0.0,0.0,1.0,1.0,1.0,1.0},//E
   {1.0,0.0,0.0,0.0,1.0,1.0,1.0} //F
  };

  double DisplayIdeal[][] =
  { 
    {0.0,0.0,0.0,0.0},
    {0.0,0.0,0.0,1.0},
    {0.0,0.0,1.0,0.0},
    {0.0,0.0,1.0,1.0},
    {0.0,1.0,0.0,0.0},
    {0.0,1.0,0.0,1.0},
    {0.0,1.0,1.0,0.0},
    {0.0,1.0,1.0,1.0},
    {1.0,0.0,0.0,0.0},
    {1.0,0.0,0.0,1.0},
    {1.0,0.0,1.0,0.0},
    {1.0,0.0,1.0,1.0},
    {1.0,1.0,0.0,0.0},
    {1.0,1.0,0.0,1.0},
    {1.0,1.0,1.0,0.0},
    {1.0,1.0,1.0,1.0}
    };

  System.out.println("Learn:");

  Network network = new Network(7,5,4,0.5,0.5);

  NumberFormat percentFormat = NumberFormat.getPercentInstance();
  percentFormat.setMinimumFractionDigits(4);


  for (int i=0;i<10000;i++) {
   for (int j=0;j<DisplayInput.length;j++) {
       //System.out.println(DisplayInput[15][2]);
       network.computeOutputs(DisplayInput[j]);
       network.calcError(DisplayIdeal[j]);
       //System.out.println(DisplayIdeal[15]);
       network.learn();
   }
   
   System.out.println( "Trial #" + i + ",Error:" +
             percentFormat .format(network.getError(DisplayInput.length)) );
  }

   System.out.println("Recall:");

  for (int i=0;i<DisplayInput.length;i++) {

   for (int j=0;j<DisplayInput[0].length;j++) {
    System.out.print( DisplayInput[i][j] +":" );
   }

   double out[] = network.computeOutputs(DisplayInput[i]);
   System.out.println("="+out[0]);
   System.out.println("="+out[1]);
   System.out.println("="+out[2]);
   System.out.println("="+out[3]);
  }
 }
}