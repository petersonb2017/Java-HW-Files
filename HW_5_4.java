import java.lang.Math;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class HW_5_4
{
   public static void main(String[] args)
   {
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Enter a Number r, such that |r|<1");
   double sum = 0;
   double r = scan.nextDouble();
   
   System.out.println("Enter a Integer k,");
   int k = scan.nextInt();
   
   
      for(int i=0; i<=k; i++){
      sum += Math.pow(r, i);
         
         }
      System.out.println("The sum of the first " + k +" terms of r^k is: "+ sum);
            
   }
}   
   
