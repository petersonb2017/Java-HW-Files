import java.lang.Math;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class HW_5_2
{
   public static void main(String[] args)
   {
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Enter a Number");
   long sum = 0;
   long a = scan.nextLong();
   
      for(int i=1; i<=a; i++){
      sum += i;
         
         }
      System.out.println("The sum of the first " + a + " integers is: " + sum);
            
   }
}   
   
