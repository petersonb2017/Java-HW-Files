import java.util.Scanner;
import java.sql.Timestamp;
import java.util.Date;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;

public class ThreadedDotProduct extends Thread
{
   private double[][] matrix;
   private double[] vector;
   private int n;
   private double prod;
   private int ref;

   public ThreadedDotProduct(double[][] m, double[] v, int r)
   {
   this.matrix = m;
   this.vector = v;
   this.ref = r;
   }
   

   @Override
   public void run()
   {
      prod = 0.0;
      for(int i = 0; i < vector.length; i++)
         prod = prod + vector[i]*matrix[ref][i];
         
     //System.out.println("thread prod:  " + prod );
     //return prod;
   }
   
}