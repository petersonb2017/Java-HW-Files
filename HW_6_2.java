import java.lang.Math;
import javax.swing.JOptionPane;
import java.util.Scanner; 
import java.util.Random;

public class HW_6_2
{
   public static void main(String[] args)
   {
      
      Scanner in = new Scanner(System.in);
      
      int sum = 0;
      int x[] = new int[50];
      
      Random rand = new Random();
      for(int i = 0; i < 50; i++){
         x[i] = rand.nextInt(100);
      }
      
      
      int smallest = x[0];
      int biggest = x[0]; 
               
      for (int i = 0; i < x.length; i++)
         if (x[i] < smallest)
            smallest = x[i];
            
      for (int i = 0; i < x.length; i++)
         if (x[i] > biggest)
            biggest = x[i];
            
      for (int i = 0; i < x.length; i++)
         System.out.printf("%3d",x[i]);
      System.out.println();
      
      for (int i = 0; i < x.length; i++)
         sum += x[i];
      System.out.println("The Sum is: " + sum);   

      double average = (double)sum/(double)x.length;

      System.out.println("The average is: " + average);

      
      System.out.println("Smallest Value is: " + smallest);
      System.out.println("Biggest Value is: " + biggest);  

      for (int i = 0; i < x.length - 1; i++){
         for (int j = i + 1; j < x.length ; j++){
            if (x[i] > x[j])
            {
               int temp = x[i];
               x[i] = x[j];
               x[j] = temp;
            }
         }
      }

      System.out.println("Sorted in ascending order: ");
      for (int i = 0; i < x.length; i++)
         System.out.printf("%3d",x[i]);
      System.out.println();
      
      for (int i = 0; i < x.length - 1; i ++ )  
      {
         for (int j = i + 1; j < x.length; j ++ )
         {
            if( x[i] < x[j] )
            {
               int temp = x[i];
               x[i] = x[j];
               x[j] = temp; 
            }           
         }
      }
      
      System.out.println("Sorted in descending order: ");
      for (int i = 0; i < x.length; i++)
      System.out.printf("%3d",x[i]);

   }
}