import java.util.Scanner;
import java.sql.Timestamp;
import java.util.Date;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class DotProductTester
{
   private static double[][] matrix;
   private static double[] vector;
   private static int n;
   private static Random rand = new Random();
   public static ArrayList<ThreadedDotProduct> threadList;
   
   public static void main(String [] args)
   {
      //Random rand = new Random();
      Scanner keyboard = new Scanner(System.in);
      
      NonThhreadingDotProduct  ntdp = new NonThhreadingDotProduct();
            
      System.out.println("Enter n which corresponds to the size of the nXn matrix: ");
      n = keyboard.nextInt();
      matrix = new double[n][n];
      vector = new double[n];
      fillMatrix(matrix);
      fillVector(vector);
      long t1,t2,t3,t4,t5,t6;
      
      t1 = System.nanoTime();
      for(int i=0; i < 200; i++)
         ntdp.dotProd(matrix, vector);
      t2 = System.nanoTime();
      System.out.println("Normal dot avg time : "  + (double)(t2-t1)/(double)200);
      
      threadList = new ArrayList<ThreadedDotProduct>();
      for(int i=0; i < vector.length; i++)
      {
         ThreadedDotProduct tdp = new ThreadedDotProduct(matrix, vector, i);
         threadList.add(new ThreadedDotProduct(matrix, vector, i));
      }
      
      t5 = System.nanoTime();
      for(int j=0; j < 200; j++)
         for(int i=0; i < vector.length; i++)
         {
             ThreadedDotProduct tdp = new ThreadedDotProduct(matrix, vector, i);            
            //tdp.start();
         }
      t6 = System.nanoTime();
      double extraTime = (double)(t6-t5)/(double)200;
      
      t3 = System.nanoTime();
      for(int j=0; j < 200; j++)
         for(int i=0; i < vector.length; i++)
         {
            ThreadedDotProduct tdp = new ThreadedDotProduct(matrix, vector, i);            
            tdp.start();
         }
      t4 = System.nanoTime();
      //System.out.println("Normal dot avg time : "  + ((double)(t4-t3)/(double)200));
      System.out.println("Thread dot avg time : "  + (((double)(t4-t3)/(double)200) - extraTime));
   }
   
   public static void fillMatrix(double[][] a)
   {
      //System.out.println("Your Matrix is: ");
      for(int i=0; i < a.length; i++)
      {
         for(int j=0; j < a.length; j++)
         {
            a[i][j] = (double)rand.nextInt(a.length) + rand.nextDouble();
         //System.out.printf("%3.2f ",a[i][j]);
         }
      //System.out.println();
      }
   }
   
   public static void fillVector(double[] v)
   {
      //System.out.println("Your Vector is: ");
      for(int i=0; i < v.length; i++)
      {
         v[i] = (double)rand.nextInt(v.length) + rand.nextDouble();
         //System.out.printf("%5.2f ",v[i]);
      //System.out.println();
      }   
   }
   public static void printVector(double[] v)
   {
      System.out.println();
      for(int i=0; i < v.length; i++)
      {
         System.out.printf("%5.2f ",v[i]);
      //System.out.println();
      }   
   }
}