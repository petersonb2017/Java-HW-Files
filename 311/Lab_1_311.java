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

public class Lab_1_311
{
   public static void main(String [] args)
   {
      Random rand = new Random();
      
      for(int k = 1; k <= 10; k++)
      {
      int n = 5*k*k;
      System.out.println("N is : " + n);
      long t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14;
      
      t1 = System.nanoTime();
      for(int i = 0; i<20; i++)isPrime1(n);
      t2 = System.nanoTime();
      System.out.println("Avg for i<n : " + (t2-t1)/20);
      t3 = System.nanoTime();
      for(int i = 0; i<20; i++)isPrime1(n);
      t4 = System.nanoTime();
      System.out.println("Avg for i<sqrt(n) : " + (t4-t3)/20);
   
      }
   }
   static boolean isPrime1(int n) 
   {
      for(int i=2;i<n;i++) {
         if(n%i==0)
            return false;
      }
      return true;
   }
   static boolean isPrime2(int n) {
    for(int i=2;i<(int)Math.sqrt(n);i++) {
        if(n%i==0)
            return false;
    }
    return true;
}
   
   
}