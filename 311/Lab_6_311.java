import java.util.Date;
import java.math.BigInteger;
import java.io.FileNotFoundException;
import java.lang.Thread.State;
import java.util.Scanner;
import java.sql.Timestamp;
import java.util.Date;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

public class Lab_6_311
{
   public static void main(String [] args)
   {
      Random rand = new Random();
      System.out.println("enter k ");
      //Scanner keyboard = new Scanner(System.in);
      double k = 8.5;
      int roll1 = 0;
      int roll2 = 0;
      long t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14;
      
      
      t1 = System.nanoTime();
      for(int i = 0; i < (int)Math.pow(10.0, (double)k); i++)
      {
         while(roll1 != 3)roll1 = rand.nextInt(6) + 1;
      }
      
      t2 = System.nanoTime();
      System.out.println("Time: " + ((double)(t2-t1))/1000000000.0 + " seconds");
      System.out.println("First Test Avg. Time: " + (((double)(t2-t1))/Math.pow(10.0, (double)k)));
      
      
      t3 = System.nanoTime();
      for(int i = 0; i < (int)Math.pow(10.0, (double)k);i++)
      {
         while(roll1 != 3|| roll2 != 5)
         {
         roll1 = rand.nextInt(6) + 1;
         roll2 = rand.nextInt(6) + 1;
         }
      }
      t4 = System.nanoTime();
      System.out.println("Time: " + ((double)(t4-t3))/1000000000.0 + " seconds");
      System.out.println("Second Test Avg. Time: " + (((double)(t4-t3))/Math.pow(10.0, (double)k)));
      
      t5 = System.nanoTime();
      for(int i = 0; i < (int)Math.pow(10.0, (double)k);i++)
      {
         while(roll1 + roll2 != 7)
         {
         roll1 = rand.nextInt(6) + 1;
         roll2 = rand.nextInt(6) + 1;
         }
      }
      t6 = System.nanoTime();
      System.out.println("Time: " + ((double)(t6-t5))/1000000000.0 + " seconds");
      System.out.println("Third Test Avg. Time: " + (((double)(t6-t5))/Math.pow(10.0, (double)k)));
      
      t7 = System.nanoTime();
      for(int i = 0; i < (int)Math.pow(10.0, (double)k);i++)
      {
      while(roll1 + roll2 != 10)
         {
         roll1 = rand.nextInt(6) + 1;
         roll2 = rand.nextInt(6) + 1;
         }
      }
      t8 = System.nanoTime();
      System.out.println("Time: " + ((double)(t8-t7))/1000000000.0 + " seconds");
      System.out.println("Fourth Test Avg. Time: " + (((double)(t8-t7))/Math.pow(10.0, (double)k)));
      
      k = 5.0;
      
      int[] A = new int[(int)Math.pow(10.0, k)];
      int[] B = new int[(int)Math.pow(10.0, k)];
      int[] C = new int[(int)Math.pow(10.0, k)];
      A[0] = A.length;
      A[1] = A.length - 1;
      A[2] = A.length - 2;
      for(int i = 3; i < A.length; i++)A[i] = i;
      
      for(int i = 0; i < B.length; i++)B[i] = rand.nextInt(B.length);
      
      C[0] = 0;
      C[1] = 1;
      C[2] = 2;
      for(int i = 3; i < C.length; i++)C[i] = C.length - i;
      
      t9 = System.nanoTime();
      BubbleSort(A);
      t10 = System.nanoTime();
      System.out.println("Time: " + ((double)(t10-t9))/1000000000.0 + " seconds");
      System.out.println("Bubble 1 Test Avg. Time: " + (((double)(t10-t9))/Math.pow(10.0, (double)k)));
      
      t11 = System.nanoTime();
      BubbleSort(B);
      t12 = System.nanoTime();
      System.out.println("Time: " + ((double)(t12-t11))/1000000000.0 + " seconds");
      System.out.println("Bubble 2 Test Avg. Time: " + (((double)(t12-11))/Math.pow(10.0, (double)k)));
      
      t13 = System.nanoTime();
      BubbleSort(C);
      t14 = System.nanoTime();
      System.out.println("Time: " + ((double)(t14-t13))/1000000000.0 + " seconds");
      System.out.println("Bubble 3 Test Avg. Time: " + (((double)(t14-t13))/Math.pow(10.0, (double)k)));
      
   }
  
   public static void BubbleSort( int [ ] num )
   {
      int j;
      boolean flag = true;   // set flag to true to begin first pass
      int temp;   //holding variable
   
      while ( flag )
      {
         flag= false;    //set flag to false awaiting a possible swap
         for( j=0;  j < num.length -1;  j++ )
         {
            if ( num[ j ] < num[j+1] )   // change to > for ascending sort
            {
               temp = num[ j ];                //swap elements
               num[ j ] = num[ j+1 ];
               num[ j+1 ] = temp;
               flag = true;              //shows a swap occurred  
            } 
         } 
      } 
   }
}