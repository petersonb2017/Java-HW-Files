   import javax.swing.JPanel;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.Color;
	import java.awt.Rectangle;
	import java.awt.geom.Ellipse2D;
   import java.awt.Font;

public class CalcPanel extends JPanel
         {
            public void paintComponent( Graphics g )    // Method: paintComponent
            {
		      Graphics2D g2 = (Graphics2D) g;          // Technicality...
			   
            
            
			   Rectangle r1 = new Rectangle(0,0,this.getWidth(),this.getHeight()/4);
            g2.setColor(Color.BLACK);
            g2.draw(r1);
            
            g2.setColor(Color.BLACK);
            Rectangle r2 = new Rectangle(0,this.getHeight()/4,this.getWidth(),this.getHeight()/4);
            g2.draw(r2);
                        
            g2.setColor(Color.BLACK);
			   Rectangle r3 = new Rectangle(0,this.getHeight()/2,this.getWidth(),this.getHeight()/4);
            g2.draw(r3);
                        
            g2.setColor(Color.BLACK);
            Rectangle r4 = new Rectangle(0,(3*this.getHeight())/4,this.getWidth(),this.getHeight()/4);
            g2.draw(r4);
                        
            g2.setColor(Color.BLACK);
			   Rectangle r5 = new Rectangle(0,0,this.getWidth()/4,this.getHeight());
            g2.draw(r5);
                        
            g2.setColor(Color.BLACK);
            Rectangle r6 = new Rectangle(this.getWidth()/4,0,this.getWidth()/4,this.getHeight());
            g2.draw(r6);      
            
            g2.setColor(Color.BLACK);
			   Rectangle r7 = new Rectangle(this.getWidth()/2,0,this.getWidth()/4,this.getHeight());
            g2.draw(r7);

            g2.setColor(Color.BLACK);
            Rectangle r8 = new Rectangle((this.getWidth()*3)/4,0,this.getWidth()/4,this.getHeight());
            g2.draw(r8);
                        
            g2.setColor(Color.BLACK);
            Font font = new Font("Serif", Font.PLAIN, this.getHeight()/8);
            g2.setFont(font);

            g2.drawString("7", (this.getWidth()/8), (this.getHeight()/8)+this.getHeight()/16);
            g2.drawString("8", ((this.getWidth()*3)/8), (this.getHeight()/8)+this.getHeight()/16);
            g2.drawString("9", ((this.getWidth()*5)/8), (this.getHeight()/8)+this.getHeight()/16);
            g2.drawString("4", (this.getWidth()/8), ((this.getHeight()*3)/8)+this.getHeight()/16);
            g2.drawString("5", ((this.getWidth()*3)/8), ((this.getHeight()*3)/8)+this.getHeight()/16);
            g2.drawString("6", ((this.getWidth()*5)/8), ((this.getHeight()*3)/8)+this.getHeight()/16);
            g2.drawString("1", (this.getWidth()/8), (this.getHeight()*5/8)+this.getHeight()/16);
            g2.drawString("2", (this.getWidth()*3/8), (this.getHeight()*5/8)+this.getHeight()/16);
            g2.drawString("3", (this.getWidth()*5/8), (this.getHeight()*5/8)+this.getHeight()/16);
            g2.drawString("0", (this.getWidth()/8), (this.getHeight()*7/8)+this.getHeight()/16);
            g2.drawString("C", (this.getWidth()*3/8), (this.getHeight()*7/8)+this.getHeight()/16);
            g2.drawString("=", (this.getWidth()*5/8), (this.getHeight()*7/8)+this.getHeight()/16);
            g2.drawString("+", (this.getWidth()*7/8), (this.getHeight()*7/8)+this.getHeight()/16);
            g2.drawString("-", (this.getWidth()*7/8), (this.getHeight()*5/8)+this.getHeight()/16);
            g2.drawString("/", (this.getWidth()*7/8), (this.getHeight()/8)+this.getHeight()/16);
            g2.drawString("*", (this.getWidth()*7/8), (this.getHeight()*3/8)+this.getHeight()/16);
      
            }
         }
