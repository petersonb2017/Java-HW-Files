import java.util.Scanner;

public class BugTester
{
   public static void main(String[] args)
   {
      Bug lady = new Bug(10);
      
      lady.move();
      lady.move();
      lady.turn();
      lady.move();
      lady.move();
      
      lady.move();
      lady.move();

      lady.move();
      lady.move();

      System.out.println(lady.getPosition());
   
   }
} 