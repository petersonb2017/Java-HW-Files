import java.util.Scanner;    // Scanner Library, to enter data from keyboard
import java.util.Random;    // Scanner Library, to enter data from keyboard
import java.awt.Color;
import javax.swing.JFrame;

// Tester Class to TEST the class ComplexNumber
public class Game  
{
   public static void main(String[] args)   // main is a method
   {
      // Declare local variables needed to run
      Scanner in = new Scanner(System.in);
      Random r = new Random();
      int scoreThisRound;
      int worstScore = 0;
      int player1Score = 0;
      int player2Score = 0;
      int player3Score = 0;
      int MaxBadPoints = 2000;
      int playerNumber = 1;
      int numberOfPlayers = 1;
      int redGuess = 0;
      int greenGuess = 0;
      int blueGuess = 0;
      
               
      do {
         int red = r.nextInt(256);
         int green = r.nextInt(256);
         int blue = r.nextInt(256);
         
         System.out.println("Enter the red pixel intensity value (an interger between)");
         redGuess = in.nextInt();
         greenGuess = in.nextInt();
         blueGuess = in.nextInt();
         
         Color redComponent = new Color(redGuess,0,0);
         Color greenComponent = new Color(0,greenGuess,0);
         Color blueComponent = new Color(0,0,blueGuess);
         Color mixedColor = new Color(redGuess,greenGuess,blueGuess);

         JFrame redFrame = new JFrame("Red");
         JFrame greenFrame = new JFrame("Green");
         JFrame blueFrame = new JFrame("Blue");
         JFrame mixedFrame = new JFrame("Mixed Color");
         
         mixedFrame.setSize(900, 200);
         mixedFrame.setLocation(100,100);
         mixedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         mixedFrame.getContentPane().setBackground(mixedColor);
         mixedFrame.setVisible(false);

         redFrame.setSize(300, 200);
         redFrame.setLocation(100,300);
         redFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         redFrame.getContentPane().setBackground(redComponent);
         redFrame.setVisible(false);
         
         greenFrame.setSize(300, 200);
         greenFrame.setLocation(400,300);
         greenFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         greenFrame.getContentPane().setBackground(greenComponent);
         greenFrame.setVisible(false);

         blueFrame.setSize(300, 200);
         blueFrame.setLocation(700,300);
         blueFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         blueFrame.getContentPane().setBackground(blueComponent);
         blueFrame.setVisible(false);


         
         
         mixedFrame.setVisible(true);
         redFrame.setVisible(true);         
         greenFrame.setVisible(true);         
         blueFrame.setVisible(true);         

         

      }  while (1 < 2);

   }   	
}
