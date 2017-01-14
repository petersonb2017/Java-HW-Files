import java.util.Scanner;
import java.sql.Timestamp;
import java.util.Date;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;

public class DotProductTester
{
   private static int[][] matrix;
   private static int[] vector;
   private static int n;
   private static Random rand = new Random();
   
   public static void main(String [] args)
   {
      //Random rand = new Random();
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter n which corresponds to the size of the nXn matrix: ");
      n = keyboard.nextInt();
      matrix = new int[n][n];
      vector = new int[n];
      fillMatrix(matrix);
      fillVector(vector);
      dotProd(matrix, vector);
      
      
   }
   
   public static void fillMatrix(int[][] a)
   {
      for(int i=0; i < a.length; i++)
      {
         for(int j=0; j < a.length; j++)
         {
         a[i][j] = rand.nextInt(a.length);
         //System.out.print(a[i][j]+"  ");
         }
      //System.out.println();
      }
   }
   
   public static void fillVector(int[] v)
   {
      for(int i=0; i < v.length; i++)
      {
         v[i] = rand.nextInt(v.length);
         //System.out.print(v[i]);
      //System.out.println();
      }   
   }
}