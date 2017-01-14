import java.lang.Math;
import javax.swing.JOptionPane;
import java.util.Scanner; 
import java.math.BigDecimal;


public class HW_5_8
{
   public static void main(String[] args)
   {
	   Scanner input = new Scanner(System.in);
         
      System.out.println("Enter a value for n:");
      int n = input.nextInt();
      System.out.println("Enter a value for a:");
      int a = input.nextInt();
         
      BigDecimal x, xx,xPow1,xPow2,xMin,xMult,xDiv;		
	   x = BigDecimal.ONE;
      for(int i=1; i<=100; i++) 
	   {
	      xx = x;
		   xPow1 = x.pow(n);
         xMin = xPow1.subtract(BigDecimal.valueOf(a));
         xPow2 = x.pow((n-1));
         xMult = xPow2.multiply(BigDecimal.valueOf(n));
         xDiv = xMin.divide(xMult,100,BigDecimal.ROUND_FLOOR);
         x = xx.subtract(xDiv);							
	   }
         
      System.out.println("The " + n + " root of " + a + " is:");
      System.out.println(x);	
   }		
}
