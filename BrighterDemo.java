   import javax.swing.JFrame;
	import java.awt.Color;

   public class BrighterDemo    // Class
   {
      public static void main(String[] args) 
      {
		   JFrame frame = new JFrame();
         frame.setSize(200, 200);
         Color myColor = new Color(50, 100, 150);
         myColor.brighter();
         frame.getContentPane().setBackground(myColor.brighter());
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);  			
      }
   }
