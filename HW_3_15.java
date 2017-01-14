 import javax.swing.JPanel;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.Color;
	import java.awt.Rectangle;
	import java.awt.geom.Ellipse2D;

   public class HW_3_15 extends JPanel     // Class
   {

		   public void paintComponent( Graphics g )    // Method: paintComponent
      {
		   Graphics2D g2 = (Graphics2D) g;          
                        // move the rectangle but just draw the outline

			g2.setColor(Color.BLACK);    // set color to BLUE and draw some ellipses
			Ellipse2D.Double e1 = new Ellipse2D.Double(0,0,500,500);
			g2.draw(e1);
         g2.setColor(Color.BLACK);
         g2.fill(e1);
         
         
			g2.setColor(Color.WHITE);    // set color to BLUE and draw some ellipses
			Ellipse2D.Double e2 = new Ellipse2D.Double(50,50,400,400);
			g2.draw(e2);
         g2.setColor(Color.WHITE);
         g2.fill(e2);


			g2.setColor(Color.BLACK);    // set color to BLUE and draw some ellipses
			Ellipse2D.Double e3 = new Ellipse2D.Double(100,100,300,300);
			g2.draw(e3);
         g2.setColor(Color.BLACK);
         g2.fill(e3);


			g2.setColor(Color.WHITE );    // set color to BLUE and draw some ellipses
			Ellipse2D.Double e4 = new Ellipse2D.Double(150,150,200,200);
			g2.draw(e4);
         g2.setColor(Color.WHITE);
         g2.fill(e4);


			g2.setColor(Color.BLACK);    // set color to BLUE and draw some ellipses
			Ellipse2D.Double e5 = new Ellipse2D.Double(200,200,100,100);
			g2.draw(e5);
         g2.setColor(Color.BLACK);
         g2.fill(e5);


         
         }
         
}