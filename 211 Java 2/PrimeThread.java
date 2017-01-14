import java.math.BigInteger;
import java.math.BigDecimal;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class PrimeThread extends Thread
{
   // Define Big Constants!
   private BigInteger low, high;
   private BigInteger bigI;
   private BigInteger bigJ;
   private BigInteger bigZero;
   private BigInteger bigOne;
   private BigInteger bigTwo;
   private BigDecimal bigDecTwo;

   public PrimeThread(BigInteger l, BigInteger h)
   {
      // Set the low and high range where we wish to look for primes
      this.low = l;
      this.high = h;
   }

   @Override
   // Run the prime checking method
   public void run()
   {
      // Set the values of the Big constants
      bigZero   = BigInteger.valueOf(0);
      bigOne    = BigInteger.valueOf(1);
      bigTwo    = BigInteger.valueOf(2);
      bigDecTwo = BigDecimal.valueOf(2.0);

      // For each Big Integer in the range....
      for(bigI = this.low; bigI.compareTo(this.high) < 0; bigI = bigI.add(bigOne) )
      {
         // Assume the number is prime...
         boolean prime = true;
         // Check to see if bigJ divides bigI for bigJ from 2 up to Sqrt(BigI)
         for(bigJ = bigTwo; bigJ.compareTo(sqrtApprox(bigI)) < 0; bigJ = bigJ.add(bigOne) )
         {
            // if bigJ divides bigI, the number isn't prime.
            if (bigI.mod(bigJ).equals(bigZero))
            {
               prime = false;
                break;
            }
         }
         
         // If the number is prime, write it to the prime number data file
         if (prime)
         {
            try
            {
               // The "true" parameter indicates that the file should be opened in 
               // "append mode".  This means that the existent data should not be
               // erased upon opening.  Data is added to the end.
               PrintWriter outputFile = 
                  new PrintWriter(new FileOutputStream(new File("primes.txt"),true));
                                  outputFile.printf("%s %n", bigI);
               outputFile.close();
            }
            catch(FileNotFoundException e)
            {}
            //System.out.println(bigI);
         }
      }
   }

   // Approximate the square root of a BigInteger number
   private BigInteger sqrtApprox(BigInteger bigN)
   {
      int bits = bigN.bitLength();
      int shiftbits;
      
      if (bits <= 28)
         // A number of <= 28 bits can be converted to an int and processed simply.
         return(BigInteger.valueOf((int)(Math.sqrt(bigN.doubleValue()) + 1)));
      else
      {
         // If n = R*2^(2k), then sqrt(n) = sqrt(R)*2^k
         // R is extracted by shifting the BigInteger right until R is in the int range.
         // As an int, compute sqrt(R).  Then shift the number left by half as many digits.
         shiftbits = (bits / 2) * 2;
         double root = Math.sqrt(bigN.shiftRight(shiftbits - 26).doubleValue()) + 1;
         return(
           BigDecimal.valueOf(root).multiply(bigDecTwo.pow((shiftbits-26)/2)).toBigInteger());
      } 
   }
}