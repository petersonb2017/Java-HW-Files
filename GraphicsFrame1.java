   import javax.swing.JFrame;

   public class GraphicsFrame1     // Class
   {
      public static void main( String[] args )    // Method: paintComponent
      {
		   JFrame frame = new JFrame();     // new OBJECT of class type JFrame
			frame.setSize(e1.getWidth(),e1.getHeight());          // JFrame METHODS setsize, setTitle, setDefaultCloseOperation
			frame.setTitle("My First Java Graphics Frame");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			GraphicsPanel1 panel = new GraphicsPanel1();  // new OBJECT, called panel
			frame.add(panel);                             // add panel to frame
			
			frame.setVisible(true);                       // ... so we can SEE it.
      }
   }
