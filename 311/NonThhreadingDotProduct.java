import java.util.Scanner;
import java.sql.Timestamp;
import java.util.Date;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;

public class NonThhreadingDotProduct
{
   private static double[][] matrix;
   private static double[] vector;
   private static int n;
   private static Random rand = new Random();
   
   public static double[] dotProd(double[][] matrix, double[] vector)
   {
   double[] temp = new double[vector.length];
   for(int i = 0; i < vector.length; i++)
      for(int j = 0; j < vector.length; j++)
         temp[i] = temp[i] + vector[j]*matrix[i][j];
   return temp;
   }
}