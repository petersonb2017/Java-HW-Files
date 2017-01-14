import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.BasicStroke;

public class MazePanel extends JPanel     // Class
{
   public void paintComponent( Graphics g )    // Method: paintComponent
   {
      Graphics2D g2 = (Graphics2D) g;          // Technicality...
   		
 
      int strokeSize = 5;
      g2.setStroke(new BasicStroke (strokeSize, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL)); 
      g2.draw(new Line2D.Double(0, 0, 30, 40));

   }
}

