import javax.swing.JFrame;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Polygon;

 public class HW_3_16 extends JPanel     // Class
   {

         
         
         public void paintComponent( Graphics g )    // Method: paintComponent
      {
		   Graphics2D g2 = (Graphics2D) g;          
                        // move the rectangle but just draw the outline

         
         
         Rectangle r1 = new Rectangle(200, 100,100,100);
         g2.setColor(Color.BLACK);
         g2.draw(r1);
         
         Rectangle r2 = new Rectangle(220,150,25,50);
         g2.setColor(Color.BLACK);
         g2.draw(r2);
         
         Rectangle r3 = new Rectangle(260,155,25,25);
         g2.setColor(Color.BLACK);
         g2.draw(r3);
         
         Polygon p = new Polygon(new int[]{200, 250, 300}, new int[]{100, 50, 100},3);
         g2.draw(p);
         
                  
 

         }            
         
         
         
}