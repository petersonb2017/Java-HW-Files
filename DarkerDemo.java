  import javax.swing.JFrame;
	import java.awt.Color;

   public class DarkerDemo    // Class
   {
      public static void main(String[] args) 
      {
		   JFrame frame = new JFrame();
         frame.setSize(200, 200);
         Color myColor = new Color(50, 100, 150);
         Color r = Color.RED;
         Color r1 = r.darker();
         Color r2 = r1.darker();
         frame.getContentPane().setBackground(r2);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);  			
      }
   }
