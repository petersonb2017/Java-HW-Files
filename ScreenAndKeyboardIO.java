   import java.util.Scanner;    // Library for keyboard input
 
   public class ScreenAndKeyboardIO      // Class name
   {
      public static void main( String[] args )   // Single method for this class: "main"
      {
		   Scanner in = new Scanner(System.in);    // Instantiate the keyboard Scanner
         String   s = new String();
         
         System.out.println("Enter a line of input at the KEYBOARD \n");
         s = in.nextLine();
         System.out.println();
		   System.out.println("You entered: \n\n" + s);	
      }
   }
   