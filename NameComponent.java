import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JPanel;


public class NameComponent extends JPanel
{
     
     public void paintComponent( Graphics g )
     {
      Graphics2D g2 = (Graphics2D) g;
      
      g2.setColor(Color.BLUE);
      Rectangle r = new Rectangle (50,50,100,50);
      g2.draw(r);
      g2.fill(r);

      g2.setColor(Color.RED);
      g2.drawString("Bailey Peterson", 50, 100);
      
            }
}