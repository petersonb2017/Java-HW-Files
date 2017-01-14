   import javax.swing.JFrame;
	
   public class CalcApplication
   {		
      public static void main(String[] args)
      {
         
         
         //JFrame frame = new JFrame();
         
         
         			
         //frame.setSize(500,500);          // JFrame METHODS setsize, setTitle, setDefaultCloseOperation
			//frame.setTitle("My First Java Graphics Frame");
			//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//MousePanel panel = new MousePanel();  // new OBJECT, called panel
         //frame.add(panel);
			
			//frame.setVisible(true);
         
         CalcManager mf = new CalcManager();
			mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			mf.setSize(400, 400);
			mf.setVisible(true);

      }
   }
   