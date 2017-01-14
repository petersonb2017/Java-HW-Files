   import javax.swing.JFrame;
   import java.awt.geom.Ellipse2D;
   import javax.swing.JPanel;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.Color;
	import java.awt.Rectangle;
	import java.awt.geom.Ellipse2D;


   public class HW_3_15Frame     // Class
   {
      public static void main( String[] args )    // Method: paintComponent
      {
      
         
         
		   JFrame frame = new JFrame();     // new OBJECT of class type JFrame
			frame.setSize(517, 540);          // JFrame METHODS setsize, setTitle, setDefaultCloseOperation
			frame.setTitle("My First Java Graphics Frame");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			HW_3_15 panel = new HW_3_15();  // new OBJECT, called panel
			frame.add(panel);                             // add panel to frame
			
			frame.setVisible(true);                       // ... so we can SEE it.
      }
   }
