   import javax.swing.JPanel;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.Color;
	import java.awt.Rectangle;
	import java.awt.geom.Ellipse2D;

   public class GraphicsPanel1 extends JPanel     // Class
   {
      public void paintComponent( Graphics g )    // Method: paintComponent
      {
		   Graphics2D g2 = (Graphics2D) g;          // Technicality...
			
			
         
         
                        // move the rectangle but just draw the outline

			g2.setColor(Color.RED);    // set color to BLUE and draw some ellipses
			Ellipse2D.Double e1 = new Ellipse2D.Double(0,0,500,500);
			g2.fill(e1);
         g2.setColor(Color.BLACK);
         Ellipse2D.Double e2 = new Ellipse2D.Double(0,0,500,500);
         g2.draw(e2);
         
         
         

   
			
			
      }
   }
