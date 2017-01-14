   import javax.swing.JPanel;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.Color;
	import java.awt.Rectangle;
	import java.awt.geom.Ellipse2D;

public class MousePanel extends JPanel
         {
            public void paintComponent( Graphics g )    // Method: paintComponent
            {
		      Graphics2D g2 = (Graphics2D) g;          // Technicality...
			
			
         
         
                        

			   g2.setColor(Color.BLACK);
			   Rectangle r1 = new Rectangle(0,0,400,100);
            g2.draw(r1);
            g2.fill(r1);
            Rectangle r2 = new Rectangle(100,0,400,100);
            g2.draw(r2);
            
			   Rectangle r3 = new Rectangle(200,0,400,100);
            g2.draw(r3);
            Rectangle r4 = new Rectangle(300,0,400,100);
            g2.draw(r4);
            
			   Rectangle r5 = new Rectangle(0,0,100,400);
            g2.draw(r5);
            Rectangle r6 = new Rectangle(0,100,100,400);
            g2.draw(r6);      
         
			   Rectangle r7 = new Rectangle(0,200,100,400);
            g2.draw(r7);
            Rectangle r8 = new Rectangle(0,300,100,400);
            g2.draw(r8);
      
            }
         }
