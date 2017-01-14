import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.BasicStroke;
import java.util.Random;

public class PosterComponent extends JComponent
{

public PosterComponent()
{
   return;
}

   public void paintComponent( Graphics g )
   {
      Graphics2D g2 = (Graphics2D) g;
			Font f1 = new Font ("serif", Font.BOLD, 18);
			
                     // Draw Greek Letter String
         
         Image img1 = Toolkit.getDefaultToolkit().getImage("");
         g2.drawImage(img1, 500, 333, this);

         g2.setColor(Color.RED);    
			Ellipse2D.Double e1 = new Ellipse2D.Double(0,0,500,500);
			g2.fill(e1);
         g2.setColor(Color.BLACK);
         Ellipse2D.Double e2 = new Ellipse2D.Double(0,0,500,500);
         g2.draw(e2);
         
         g2.setColor(Color.BLUE);
         Rectangle r1 = new Rectangle(350, 20, 50, 300);
         g2.fill(r1);
         Rectangle r2 = new Rectangle(20, 350, 300, 50);
         g2.fill(r2);
      
         			
			String s1 = "\u0042", s2 = "\u0041", s3 = "\u0050";  // Create Greek letters
			Font font1 = new Font ("serif", Font.BOLD, 120);     // Select Font
			g2.setColor(Color.BLUE);                           // Select and Set Color
			g2.setFont(font1);                                   // Set Font
			g2.drawString(s1 + s2 + s3, 100,200);                // Draw Greek Letter String
         


      }
   }
