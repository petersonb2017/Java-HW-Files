import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.BasicStroke;

public class CalculatorPanel extends JPanel     // Class
{
   public void paintComponent( Graphics g )    // Method: paintComponent
   {
      Graphics2D g2 = (Graphics2D) g;          // Technicality...
   		
      g2.setColor(Color.GREEN);
      Rectangle r1 = new Rectangle(0, 0, 500, 500);   // Draw orange rectangle, r1
      g2.fill(r1);
      g2.setColor(Color.GREEN);
      Font font1 = new Font ("COURIER", Font.ITALIC, 150); 
      int strokeSize = 5;
      g2.setStroke(new BasicStroke (strokeSize, BasicStroke.CAP_BUTT, 
                                          BasicStroke.JOIN_BEVEL)); 
      String [][] keysString = {{"0", "+"}, {"1", "*"}};
      for (int i = 0; i < 2; i++)
         for (int j = 0; j < 2; j++)
         {
            g2.setColor(Color.ORANGE);
            Rectangle r = new Rectangle(250*i, 250*j, 250, 250);
            g2.draw(r);
            g2.setColor(Color.BLUE);
            g2.setFont(font1);      
            g2.drawString(keysString[i][j], 250*i + 80, 250*j + 200);
         }
   }
}
