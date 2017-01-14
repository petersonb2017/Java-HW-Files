   import java.util.Scanner;            
   import java.lang.Math;
   import static java.lang.Math.pow;
   
   public class JavaHW3p1_13    
   {
      public static void main( String[] args )
      { 
      float sum = 0; 

       
      double k;
       
      for(k = 0.0; k <= 1500.0; ++k) 
      {
      //double i = Math.pow(-1, k);
      sum +=  (4 * pow(-1, k)) / ((2 * k) + 1); 
      } 
      System.out.println(sum);
      
      }      
   }
   