import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Component;


public class NameViewer
{
      public static void main(String[] args) 
      {

          {

		   JFrame frame = new JFrame();
         frame.setSize(200, 200);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
         //g2.drawString("Bailey Peterson", 50, 100);	
         NameComponent panel = new NameComponent();
         frame.add(panel);
         frame.setVisible(true);
         }		
      }
}
