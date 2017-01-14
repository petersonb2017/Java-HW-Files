import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;

public class House
{
   private int x;
   private int y;
   private int s;
   
   public House(int initialX,int initialY,int size)
   {
      x = initialX;
      y = initialY;
      s = size;
   }
   
   public void draw(Graphics2D g2)
   {
      Rectangle frame = new Rectangle(x,y,(s*150),(s*150));
      g2.draw(frame);
      
      Rectangle door = new Rectangle(x+(s*25),y+(s*100),s*25,s*50);
      g2.draw(door);
      
      Ellipse2D.Double knob = new Ellipse2D.Double(x+(s*30),y+(s*125),s*3,s*3);
      g2.draw(knob);
      
      Rectangle window1 = new Rectangle(x+(s*90),y+(s*+50),s*35,s*20);
      g2.draw(window1);
      
      Point2D.Double p1 = new Point2D.Double(x,y);
      Point2D.Double p2 = new Point2D.Double(x+(s*75),y-(s*50));
      Point2D.Double p3 = new Point2D.Double(x+(s*150),y);
      Line2D.Double roof1 = new Line2D.Double(p1,p2);
      Line2D.Double roof2 = new Line2D.Double(p3,p2);
      g2.draw(roof1);
      g2.draw(roof2);
   }
}
