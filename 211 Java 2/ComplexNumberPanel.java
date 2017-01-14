import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;
import java.awt.BasicStroke;
import java.lang.Math;
import java.awt.Font;
 
 public class ComplexNumberPanel extends JPanel
   {
   
   
   double v1 = ComplexNumberFrame.real1;
   double w1 = ComplexNumberFrame.imaginary1;
   double v2 = ComplexNumberFrame.real2;
   double w2 = ComplexNumberFrame.imaginary2;
      
   double [] xx = {v1, w1};
   double [] yy = {v2, w2};
   
   ComplexNumber x = new ComplexNumber(xx);
   ComplexNumber y = new ComplexNumber(yy);
   
   double d;
   double b;  
   double t;
   int r;
   
      public void setOperation(int index)
         {
            if (index==1)
            {
               ComplexNumber z3 = ComplexNumber.add(x,y);
               d = z3.getComponent(0);
               b = z3.getComponent(1);
               r = 1;
               if (d>0)
               {
                  t = Math.atan(b/d);
               }
               if (d<0 && b>=0)
               {
                  t = Math.atan(b/d) + Math.PI;
               }
               if (d<0 && b<0)
               {
                  t = Math.atan(b/d) - Math.PI;
               }
               z3.print("v= ");
               System.out.println(t);
            }
            
            if (index==2)
            {
               ComplexNumber z3 = ComplexNumber.subtract(x,y);
               d = z3.getComponent(0);
               b = z3.getComponent(1);
               r = 2;
               if (d>0)
               {
                  t = Math.atan(b/d);
               }
               if (d<0 && b>=0)
               {
                  t = Math.atan(b/d) + Math.PI;
               }
               if (d<0 && b<0)
               {
                  t = Math.atan(b/d) - Math.PI;
               }
               z3.print("v= ");
               System.out.println(t);
            }
            
            if (index==3)
            {
               ComplexNumber z3 = ComplexNumber.mult(x,y);
               d = z3.getComponent(0);
               b = z3.getComponent(1);
               r = 3;
               if (d>0)
               {
                  t = Math.atan(b/d);
               }
               if (d<0 && b>=0)
               {
                  t = Math.atan(b/d) + Math.PI;
               }
               if (d<0 && b<0)
               {
                  t = Math.atan(b/d) - Math.PI;
               }
               z3.print("v= ");
               System.out.println(t);
            }
            
            if (index==4)
            {
               ComplexNumber z3 = ComplexNumber.divide(x,y);
               d = z3.getComponent(0);
               b = z3.getComponent(1);
               r = 4;
               if (d>0)
               {
                  t = Math.atan(b/d);
               }
               if (d<0 && b>=0)
               {
                  t = Math.atan(b/d) + Math.PI;
               }
               if (d<0 && b<0)
               {
                  t = Math.atan(b/d) - Math.PI;
               }
               z3.print("v= ");
               System.out.println(t);
            }
            
        }
               
 
 public void paintComponent( Graphics g )    // Method: paintComponent
      {
		   Graphics2D g2 = (Graphics2D) g;
			
         Color c = new Color(0,0,0);
         
         Font f1 = new Font ("serif", Font.BOLD, 30);  
    		g2.setFont(f1);
         
         g2.setColor(c);
         Ellipse2D.Double e1 = new Ellipse2D.Double(13,13,713,713);
         g2.draw(e1);
                  
         Line2D.Double newLine = 
               new Line2D.Double((int)370, (int)800, (int)370, (int)0);
            g2.draw(newLine);
         Line2D.Double newLine2 = 
               new Line2D.Double((int)0, (int)370, (int)800, (int)370);
            g2.draw(newLine2);
      
         Line2D.Double newLine3 = 
               new Line2D.Double((int)370, (int)370, (int)(370+(Math.cos(t)*355)), (int)(370-(Math.sin(t)*355)));
            g2.draw(newLine3);
            
          
         g2.drawString("Re",740,355);
         g2.drawString("Im",320,52);
         
         if (r==1)
         {
            g2.drawString("z1 + z2 = "+d+"+"+b+"i", 20, 752);
         } 
         
         if (r==2)
         {
            g2.drawString("z1 - z2 = "+d+"+"+b+"i", 20, 752);
         }
           
         if (r==3)
         {
            g2.drawString("z1 x z2 = "+d+"+"+b+"i", 20, 752);
         } 
          
         if (r==4)
         {
            g2.drawString("z1/z2 = "+d+"+"+b+"i", 20, 752);
         }           
      }
 }