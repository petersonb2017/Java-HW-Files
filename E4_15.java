import java.util.Scanner;

public class E4_15
{
   public static void main( String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a 5-digit integer");
      String input = keyboard.next();
      
      char digit1 = input.charAt(0);
      char digit2 = input.charAt(1);
      char digit3 = input.charAt(2);
      char digit4 = input.charAt(3);
      char digit5 = input.charAt(4);
      System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
   }
}