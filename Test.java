import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
   public static void main(String[] args) throws Exception
   {
      URL imageLocation = new URL("http://fjanews.org/wp-content/uploads/2013/08/welcome-mat-image.jpg");
      JOptionPane.showMessageDialog(null, "Welcome", "Hello", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
   }
}      