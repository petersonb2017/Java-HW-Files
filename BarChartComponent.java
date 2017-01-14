import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class BarChartComponent extends JPanel
{
   public void paintComponent( Graphics g )    // Method: paintComponent
      {
		   Graphics2D g2 = (Graphics2D) g;
         
   Rectangle r5 = new Rectangle(0,0, 500, 400);
   g2.setColor(Color.DARK_GRAY);
   g2.draw(r5);
   g2.fill(r5);
         
   Rectangle r1 = new Rectangle(0, 0,420,100);
   g2.setColor(Color.BLACK);
   g2.draw(r1);
   g2.setColor(Color.RED);
   g2.fill(r1);
   
   g2.drawString("Golden Gate", 425, 50);
         
   Rectangle r2 = new Rectangle(0,100,160,100);
   g2.setColor(Color.BLACK);
   g2.draw(r2);
   g2.setColor(Color.BLUE);
   g2.fill(r2);
   
   g2.drawString("Brooklyn", 165, 150);
         
   Rectangle r3 = new Rectangle(0,200,215,100);
   g2.setColor(Color.BLACK);
   g2.draw(r3);
   g2.setColor(Color.YELLOW);
   g2.fill(r3);
   
   g2.drawString("Delaware Memorial", 220, 250);

   Rectangle r4 = new Rectangle(0,300,380,100);
   g2.setColor(Color.BLACK);
   g2.draw(r4);
   g2.setColor(Color.CYAN);
   g2.fill(r4);
   
   g2.drawString("Mackinac", 385, 350);
   
      }
}
   