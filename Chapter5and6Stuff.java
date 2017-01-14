import java.util.Scanner;
import java.util.Random;

public class Chapter5and6Stuff
{
   public static void main( String[] args )
   {
   
      Scanner in =  new Scanner(System.in);
      
      int [] x = {3, 1, 4, 1, 4, 5, 9, 2, 6, 5, 3, 5, 8, 9, 3, 6, 0};
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
      
      System.out.println("Smallest Value is: " + smallest);
      System.out.println("Biggest Value is: " + biggest);                      
   
      int [] y = new int[x.length];
      
      for (int i = 0; i < x.length; i++)
         y[i] = x[(x.length - i) - 1];
            
      for (int i = 0; i < y.length; i++)
         System.out.printf("%3d",y[i]);
      System.out.println();
          
      for (int i = 1; i < x.length; i++)
         for (int j = i - 1; j < i ; j++)
            if (x[j] > x[j + 1])
            {
               int temp = x[j];
               x[j] = x[j+1];
               x[j+1] = temp;
            }
            
      for (int i = 0; i < x.length; i++)
         System.out.printf("%3d",x[i]);
      System.out.println();
   
   
   }
}