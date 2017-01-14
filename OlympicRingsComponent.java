import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.BasicStroke;

public class OlympicRingsComponent extends JComponent
{
   private int width;
   private int height;
   public OlympicRingsComponent(int x,int y)
   {
      width = x;
      height = y;
   }
   
   public void paintComponent( Graphics g )
   {
      Graphics2D g2 = (Graphics2D) g;
      g2.setStroke(new BasicStroke (15.0F, BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL));
      
      Ellipse2D.Double ring1 = new Ellipse2D.Double(width+100,height+100,300,300);
      g2.setColor(Color.BLUE);
      g2.draw(ring1);
      
      Ellipse2D.Double ring2 = new Ellipse2D.Double(width+414,height+100,300,300);
      g2.setColor(Color.BLACK);
      g2.draw(ring2);
      
      Ellipse2D.Double ring3 = new Ellipse2D.Double(width+728,height+100,300,300);
      g2.setColor(Color.RED);
      g2.draw(ring3);

      
      Ellipse2D.Double ring4 = new Ellipse2D.Double(width+264,height+250,300,300);
      g2.setColor(Color.YELLOW);
      g2.draw(ring4);
      
      Ellipse2D.Double ring5 = new Ellipse2D.Double(width+578,height+250,300,300);
      g2.setColor(Color.GREEN);
      g2.draw(ring5);
      
      
   }
}
