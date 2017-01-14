import java.util.Scanner;    // Scanner Library, to enter data from keyboard
import java.util.Random;    // Scanner Library, to enter data from keyboard
import java.awt.Color;
import javax.swing.JFrame;

// Tester Class to TEST the class ComplexNumber
public class Game3 
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
      int MaxBadPoints = 400;
      int playerNumber = 1;
      int numberOfPlayers = 1;
      int redGuess = 0;
      int greenGuess = 0;
      int blueGuess = 0;
      
      System.out.println("Game Time:  Guess the RGB pixel values.  Lowest (Error) Score Wins!");
      System.out.println("... Enter the number of players, from 1 to 3 ");
      numberOfPlayers = in.nextInt();
      if (numberOfPlayers < 0 || numberOfPlayers > 3)   numberOfPlayers = 2;
               
      do {
         int red = r.nextInt(256);
         int green = r.nextInt(256);
         int blue = r.nextInt(256);
         
         Color redComponent = new Color(red,0,0);
         Color greenComponent = new Color(0,green,0);
         Color blueComponent = new Color(0,0,blue);
         Color mixedColor = new Color(red,green,blue);

         JFrame redFrame = new JFrame("Red");
         JFrame greenFrame = new JFrame("Green");
         JFrame blueFrame = new JFrame("Blue");
         JFrame mixedFrame = new JFrame("Mixed Color");
         
         mixedFrame.setSize(900, 200);
         mixedFrame.setLocation(100,100);
         mixedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         mixedFrame.getContentPane().setBackground(mixedColor);
         mixedFrame.setVisible(true);

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

         System.out.printf("Player %2d:  Enter the 3 RGB pixes of the color shown: ", playerNumber);
         redGuess = in.nextInt();
         greenGuess = in.nextInt();
         blueGuess = in.nextInt();
         
         
         redFrame.setVisible(true);         
         greenFrame.setVisible(true);         
         blueFrame.setVisible(true);         
         System.out.printf("%n%n");
         System.out.printf("Actual Pixels:  R = %3d   G = %3d   B = %3d%n", red, green, blue);
         System.out.printf("You Guessed:    R = %3d   G = %3d   B = %3d%n", 
                            redGuess, greenGuess, blueGuess);
         System.out.printf("Absolute Error: R = %3d   G = %3d   B = %3d%n", 
               Math.abs(redGuess-red), Math.abs(greenGuess-green), Math.abs(blueGuess-blue));
         scoreThisRound = Math.abs(redGuess-red) + Math.abs(greenGuess-green)+ Math.abs(blueGuess-blue);
         System.out.printf("%n%nPlayer %2d: Your score this round: %3d %n", playerNumber, scoreThisRound);
         
         if (playerNumber == 1)
         {
            player1Score += scoreThisRound;
            System.out.printf("%n%nYour total score:    %5d %n", player1Score);
         }
         if (playerNumber == 2)
         {
            player2Score += scoreThisRound;
            System.out.printf("%n%nYour total score:    %5d %n", player2Score);
         }
         if (playerNumber == 3)
         {
            player3Score += scoreThisRound;
            System.out.printf("%n%nYour total score:    %5d %n", player3Score);
         }
         
         
         worstScore = Math.max(Math.max(player1Score, player2Score), player3Score);
         if (worstScore < MaxBadPoints)
         {
            System.out.println("Enter 0 to continue");
            in.nextInt();
            if (playerNumber == numberOfPlayers)  playerNumber = 1;
            else                                  playerNumber++;
            redFrame.setVisible(false);         
            greenFrame.setVisible(false);         
            blueFrame.setVisible(false);         

         }  
      }  while (worstScore < MaxBadPoints);
      System.out.printf("%n Game Completed.  Final Summary:%n");     
      System.out.printf("Player1: %d %n", player1Score);
      System.out.printf("Player2: %d %n", player2Score);
      System.out.printf("Player3: %d %n", player3Score);
   }   	
}
