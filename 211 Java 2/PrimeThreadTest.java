import java.util.Date;
import java.math.BigInteger;
import java.io.FileNotFoundException;
import java.lang.Thread.State;

public class PrimeThreadTest
{
   public static void main(String [] args)
   {
      // Set up 5 versions of the Prime Thread to find prime numbers in 5 different ranges.
      PrimeThread t1 = new PrimeThread(new BigInteger("2"), new BigInteger("10000"));
      PrimeThread t2 = new PrimeThread(new BigInteger("10001"), new BigInteger("20000"));
      PrimeThread t3 = new PrimeThread(new BigInteger("20001"), new BigInteger("30000"));
      PrimeThread t4 = new PrimeThread(new BigInteger("30001"), new BigInteger("40000"));
      PrimeThread t5 = new PrimeThread(new BigInteger("400000000001"), new BigInteger("400000000243"));
      
      // Start the threads.
      t1.start();
      t2.start();
      t3.start();
      t4.start();
      t5.start();
      
      // Wait until the last process terminated to print out status information
      while(t5.getState() != Thread.State.TERMINATED){}
      
      // Print the status of each thread
      System.out.println("Id:   Name:      Priority:  State:");
      System.out.println(t1.getId() + "      " + t1.getName() + "   " + t1.getPriority() + "          " + t1.getState());
      
      System.out.println(t2.getId() + "      " + t2.getName() + "   " + t2.getPriority() + "          " + t2.getState());
      
      System.out.println(t3.getId() + "     " + t3.getName() + "   " + t3.getPriority() + "          " + t3.getState());
      
      System.out.println(t4.getId() + "     " + t4.getName() + "   " + t4.getPriority() + "          " + t4.getState());
      
      System.out.println(t5.getId() + "     " + t5.getName() + "   " + t5.getPriority() + "          " + t5.getState());
      
   }
}