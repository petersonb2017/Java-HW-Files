import java.util.Scanner;
import java.util.Random;

   public class RandomPrice
   {
      public static void main(String[] args)
      {
      Random rand = new Random();
      System.out.println(rand.nextInt(995)*0.01 + 10);
   
   
      }
   }