import java.lang.Math;
import javax.swing.JOptionPane;
import java.util.Scanner; 
import java.util.Random;

public class Numerical_Integration
{
   public static void main(String[] args)
      {

         double a = 0;
         double b = 5;
         int n = 25;
         double sum;
         
         for(int i = 0; i < 25; i++){
            double x;
            x = a + i(5.0/n);
            sum += (x * Math.pow(x, Math.E))/n ;
            System.out.println(sum);
            }
       }
}