   import java.util.Scanner;
   import java.util.Random;

   public class Dice
   {
      private int s;   // Number of sides of the dice     
   
      public Dice (int sides)
      {
          s = sides;
      }
      
      public Dice ()
      {
      }
      
      public void setSides(int sides)
      {
          s = sides;
      }
      
      public int rollDie()
      {      
         Random r = new Random();
         int roll = r.nextInt(s) + 1;
         return (roll);
      }
   }
