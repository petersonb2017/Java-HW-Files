import javax.swing.JFrame;

public class OlympicRingsViewer
{
   
   public static void main( String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(1300,750);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      OlympicRingsComponent component = new OlympicRingsComponent(100,100);
      frame.add(component);
      
      frame.setVisible(true);
   }
}