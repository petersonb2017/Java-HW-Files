import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PosterViewer extends JFrame
{
   
   public static void main( String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(1440,900);
      frame.setTitle("Bailey Poster");
      frame.setDefaultCloseOperation(JFr ame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);

      
      
      PosterComponent component = new PosterComponent();
      frame.add(component);
      
            
      frame.setVisible(true);
   }
}