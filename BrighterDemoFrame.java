   import javax.swing.JFrame;

   public class BrighterDemoFrame     // Class
   {
      public static void main( String[] args )    // Method: paintComponent
      {
		   JFrame frame = new JFrame();     // new OBJECT of class type JFrame
			frame.setSize(500,500);          // JFrame METHODS setsize, setTitle, setDefaultCloseOperation
			frame.setTitle("My First Java Graphics Frame");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			BrighterDemo panel = new BrighterDemo();  // new OBJECT, called panel
			frame.add(panel);                             // add panel to frame
			
			frame.setVisible(true);                       // ... so we can SEE it.
      }
   }
