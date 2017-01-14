import java.lang.Math;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.math.BigInteger;

public class HW_5_3
{
   public static void main(String[] args)
   {
   
    
      
   
   
      int intX, intMultiplier, n;
      BigInteger bigXtoTheN, bigMultiplier;
      BigInteger bigX, bigY, bigSum, bigDiff, bigProd, bigQuot, bigRem;
      Scanner in = new Scanner(System.in);
   
      bigXtoTheN = BigInteger.valueOf(0);
      System.out.println("Enter an big ol' integer: ");
      intMultiplier = in.nextInt();
      bigMultiplier = BigInteger.valueOf(intMultiplier);
   
      
      for(n=1; n<=intMultiplier; n++)
      {
         bigXtoTheN = bigXtoTheN.add(BigInteger.valueOf(n));
         //System.out.println("The Sum of the first " + n + " integers: " +  bigXtoTheN);
      }
      
      System.out.println("The Sum of the first " + intMultiplier + " integers: " +  bigXtoTheN);
   
            
   }
}