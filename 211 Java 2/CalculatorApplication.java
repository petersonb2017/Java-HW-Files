   import javax.swing.JFrame;
	
   public class CalculatorApplication
   {		
      public static void main(String[] args)
      {
         CalculatorManager cm = new CalculatorManager();
			cm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			cm.setSize(525, 575);
			cm.setVisible(true);
      }
   }