import javax.swing.JFrame;
   import java.awt.geom.Ellipse2D;
   import javax.swing.JPanel;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.Color;
	import java.awt.Rectangle;
	import java.awt.geom.Ellipse2D;


   public class BarChartViewer     // Class
   {
      public static void main( String[] args )    // Method: paintComponent
      {
      
         
         
		   JFrame frame = new JFrame();     // new OBJECT of class type JFrame
			frame.setSize(550, 450);          // JFrame METHODS setsize, setTitle, setDefaultCloseOperation
			frame.setTitle("My First Java Graphics Frame");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			BarChartComponent panel = new BarChartComponent();  // new OBJECT, called panel
			//panel.add(new Grid);
         frame.add(panel);                             // add panel to frame
			
			frame.setVisible(true);                       // ... so we can SEE it.
      }
   }
