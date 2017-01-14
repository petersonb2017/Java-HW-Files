import java.lang.Math;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class HW_4_4
{
   public static void main(String[] args)
   {
   
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Enter First Number");
   double a = scan.nextDouble();
   System.out.println("Enter Second Number");
   double b = scan.nextDouble();

   
   System.out.printf("%-10s %10.2f\n", "Sum", (a + b));
   System.out.printf("%-10s %10.2f\n", "Difforence", (a - b));
   System.out.printf("%-10s %10.2f\n", "Product", (a * b));
   System.out.printf("%-10s %10.2f\n", "Average", ((a * b)/2));
   System.out.printf("%-10s %10.2f\n", "Distance", Math.abs(a - b));
   System.out.printf("%-10s %10.2f\n", "Max", Math.max(a, b));
   System.out.printf("%-10s %10.2f\n", "Min", Math.min(a, b));
   
   
   }
}