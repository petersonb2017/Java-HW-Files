import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class HouseComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      
      House h1 = new House(100,475,1);
      House h2 = new House(400,325,2);
      House h3 = new House(850,150,3);
      
      h1.draw(g2);
      h2.draw(g2);
      h3.draw(g2);
    }
}