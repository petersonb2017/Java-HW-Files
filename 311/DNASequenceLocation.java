import java.util.Scanner;
import java.sql.Timestamp;
import java.util.Date;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

public class DNASequenceLocation
{
   public static int size_n;     // n is the length of each DNA string
   public static int size_m;     // m is the length of the 'common' string your trying to find
   public static char[] ref = {'a','c','g','t'};
   public static char[] DNA1;
   public static char[] DNA2;
   
   
   public static void main( String[] args )
   {
      Random rand = new Random();
      Scanner keyboard = new Scanner(System.in);
      long t1, t2;
      
      //System.out.println("Enter n which corresponds to the number of elements in the DNA: ");
      for(int i = 0; i<5;i++)
      {
         size_n = 5*(i+1);
      
         DNA1 = new char[size_n];
      
      
      //System.out.println("Enter m which corresponds to the length of common elements you're searching for: ");
         for(int j = 0; j<5;j++)
         {
            size_m = 25*(int)Math.pow((double)2,(double)j);
            DNA2 = new char[size_m];
         
            System.out.println("m is " + size_m);
         
            System.out.print("The first DNA strand: ");
            for(int k = 0; k < size_n; k++){ // fills array with n characters
               DNA1[k] = ref[rand.nextInt(4)];
            //System.out.print(DNA1[i]);
            }
         
            System.out.println();
            System.out.print("The second DNA strand: ");
            for(int k = 0; k < size_m; k++){ // fills array with n characters
               DNA2[k] = ref[rand.nextInt(4)];
            //System.out.print(DNA2[i]);
            }
         //System.out.println();
         
            t1 = System.nanoTime();
            SequenceLocation(DNA1,DNA2,size_m); // Search for similar element of length m DNA1 and DNA2
            t2 = System.nanoTime();
            System.out.println("time is: " + (t2-t1));
         }
      }
      
   }
   public static void SequenceLocation(char[] d1, char[] d2, int m) // For every array of m consecutive chars in DNA1
   {                                                         // check to see if the same same array is present in DNA2
                         
         
      char[] temp1 = new char[m];
      
      //System.out.print("temp " + i + ": ");
      
      for(int k = 0; k <= (d2.length - m); k++)
      {
         for(int p = 0; p < m; p++)
         {
            temp1[p] = d2[k+p];
         }
         charCompare(d1, temp1);
      }
      //System.out.println();
      
      
   }
   public static boolean charCompare(char[] ch1, char[] ch2)
   {
      int sum = 0;
      for(int i = 0; i < ch1.length; i++)
      {
         if(ch1[i] == ch2[i])
            sum = sum + 0;
         
         else 
            sum = sum + 1;
      }
      if(sum > 0) 
         return false;
      else 
         return true;
   }
}