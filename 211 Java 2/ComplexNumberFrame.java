import java.util.Scanner;
import java.lang.Math;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ComplexNumberFrame
{
      public static double real1;
      public static double real2;
      public static double imaginary1;
      public static double imaginary2;
      
   public static void main(String[] args)      
   {         
         
      Scanner in = new Scanner(System.in);
      
      
      System.out.println("Enter the real component of z1: ");
      real1 = in.nextDouble();
      System.out.println("Enter the imaginary component of z1: ");
      imaginary1 = in.nextDouble();

      System.out.println("Enter the real component of z2: ");
      real2 = in.nextDouble();
      System.out.println("Enter the imaginary component of z2: ");
      imaginary2 = in.nextDouble();
      
      System.out.println("What operation would you like to perform on these complex numbers?");
      System.out.println("(1: add, 2: subtract, 3: multiply, 4: divide)");   
      int index = in.nextInt();
         
      JFrame frame = new JFrame();
	   frame.setSize(800,800);
		frame.setTitle("Complex Plane");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
		ComplexNumberPanel panel = new ComplexNumberPanel();         
		frame.add(panel);
      frame.setVisible(true);
      
      panel.setOperation(index);
   }
   
}