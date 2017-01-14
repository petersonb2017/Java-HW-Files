import java.util.Scanner;
import java.lang.Math;
import java.lang.Math;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.math.BigInteger;

public class BigFibonacciRecursive
{     
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      long t1;
      long t2;
      BigInteger f1;
            
      System.out.println("Enter an integer, n > 0, to compute the nth Fibonacci number ");
      int n = in.nextInt();
      
      t1 = System.nanoTime();
      f1 = getFibonacci(n);
      t2 = System.nanoTime();      
      
      System.out.println(f1 + "   The time it took for Recursive was: " + (t2 - t1));      
   }

	
	public static BigInteger getFibonacci(int n)
	{
      if ((n == 1) || (n == 2))
         return BigInteger.valueOf(1);        
      else
         return(BigInteger.valueOf(getFibonacci(n-1).intValue()).add(BigInteger.valueOf(getFibonacci(n-2).intValue())));
   }
}

