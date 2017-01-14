   import javax.swing.JPanel;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.Color;
	import java.awt.Rectangle;
	import java.awt.geom.Ellipse2D;

   public class JavaHW2_FlagPanel extends JPanel     // Class
   {
      public void paintComponent( Graphics g )    // Method: paintComponent
      {
		   Graphics2D g2 = (Graphics2D) g;          // Technicality...
			
			
         
          Rectangle r1 = new Rectangle(0, 0, 535, 530);
         g2.setColor(Color.DARK_GRAY);
         g2.draw(r1);
         g2.fill(r1);

         
         Rectangle r2 = new Rectangle(0, 0, 250, 150);
         g2.setColor(Color.WHITE);
         g2.draw(r2);
         g2.fill(r2);
                        // move the rectangle but just draw the outline

			g2.setColor(Color.RED);    // set color to BLUE and draw some ellipses
			Ellipse2D.Double e1 = new Ellipse2D.Double((175/2),(75/2),75,75);
			g2.fill(e1);
         
         Rectangle r3 = new Rectangle(270,0,(500/6), 150);
         g2.setColor(Color.BLUE);
         g2.draw(r3);
         g2.fill(r3);
         Rectangle r4 = new Rectangle((270+(500/6)),0,(500/6), 150);
         g2.setColor(Color.WHITE);
         g2.draw(r4);
         g2.fill(r4);
         Rectangle r5 = new Rectangle((520-(500/6)),0,(500/6), 150);
         g2.setColor(Color.RED);
         g2.draw(r5);
         g2.fill(r5);
         
          
         Rectangle r6 = new Rectangle(0,170,(500/6), 150);
         g2.setColor(Color.GREEN);
         g2.draw(r6);
         g2.fill(r6);
         Rectangle r7 = new Rectangle((500/6),170,(500/6), 150);
         g2.setColor(Color.WHITE);
         g2.draw(r7);
         g2.fill(r7);
         Rectangle r8 = new Rectangle((1000/6),170,(500/6), 150);
         g2.setColor(Color.RED);
         g2.draw(r8);
         g2.fill(r8);
         
          
         Rectangle r9 = new Rectangle(270,170,250, 50);
         g2.setColor(Color.CYAN);
         g2.draw(r9);
         g2.fill(r9);
         Rectangle r10 = new Rectangle(270,220,250, 50);
         g2.setColor(Color.BLACK);
         g2.draw(r10);
         g2.fill(r10);
         Rectangle r11 = new Rectangle(270,270,250, 50);
         g2.setColor(Color.WHITE);
         g2.draw(r11);
         g2.fill(r11);
         
         Rectangle r12 = new Rectangle(140,340,250, 50);
         g2.setColor(Color.RED);
         g2.draw(r12);
         g2.fill(r12);
         Rectangle r13 = new Rectangle(140,390,250, 50);
         g2.setColor(Color.WHITE);
         g2.draw(r13);
         g2.fill(r13);
         Rectangle r14 = new Rectangle(140,440,250, 50);
         g2.setColor(Color.BLACK);
         g2.draw(r14);
         g2.fill(r14);



   
			
			
      }
   }
