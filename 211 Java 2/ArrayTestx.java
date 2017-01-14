import java.util.Scanner;             // Library for keyboard input
import java.lang.Double;             // Library for keyboard input
 
public class ArrayTestx      // Class name
{
   private static int [] a = new int[10];
   private static int [] b = new int[10];
   private static int [][] aa = new int [5][10];
   private static int [][] bb = new int [7][10];
    
   public static void main( String[] args )   // Single method for this class: "main"
   {
      for (int i = 0; i < 10; i++)     // Fill a
         a[i] = i;
         
      for (int i = 0; i < 10; i++)     // Fill aa (2 dimensions)
         for (int j = 0; j < 5; j++)
            aa[j][i] = j*100 + i;
          
      b = fix(a, 10, 4);               // b is a, modified
      
      for (int i = 0; i < 10; i++)     // Print out b
         System.out.printf("%3d ", b[i]);
      System.out.println();
      
      bb[3] = fix(aa[2], 10, 11);      // fix one line of bb (2 dimensions)
      
      for (int i = 0; i < 10; i++)     // Print Row 2 of aa
         System.out.printf("%3d ", aa[2][i]);
      System.out.println();
   
      for (int i = 0; i < 10; i++)     // Print Row 3 of bb
         System.out.printf("%3d ", bb[3][i]);
         
   }
   
   
   public static int[] fix(int[] c, int size, int offset)   
   {
      int [] x = new int[size];
       
      for (int i = 0; i < size; i++)   // Add the value of 'offset'
         x[i] = c[i] + offset;         // to input array, and return as x
       
      return x;
   }
}