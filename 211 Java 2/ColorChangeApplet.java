import javax.swing.JApplet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import java.util.Random;
	
   
public class ColorChangeApplet extends JApplet
{
   //private static JFrame gameFrame = new JFrame("Take my great quiz...");
   private static JPanel mainPanel = new JPanel();
   private static JButton button1 = new JButton();
   private static int[] responses = new int[20];
   private final int HEIGHT = 400;
   private final int WIDTH  = 500;

   public void init()
   {	
      getContentPane().setBackground(new Color(150, 240, 180));
      setMinimumSize(new Dimension(WIDTH, HEIGHT));
      setSize(WIDTH, HEIGHT);

      mainPanel.setSize(WIDTH, HEIGHT);
      setVisible(true);
      add(mainPanel);
      
      issueQuestion(1);
           
      class AddButton1Listener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            responses[1] += 1;
            issueQuestion(1);
         }
      }

      ActionListener listener1 = new AddButton1Listener();
      button1.addActionListener(listener1);
   }
   
   
      public  void issueQuestion (int q)
      {
      System.out.println(q);
      System.out.println(responses[1]);
       if (q == 1)
         {
            if(responses[1]%15 == 14){
               
               mainPanel.removeAll();
               mainPanel.setSize(WIDTH, HEIGHT);
               mainPanel.setBackground(new Color(0,0,0));
               JPanel buttonPanel = new JPanel();
               
               GridLayout g44 = new GridLayout(4,4,10,10);
               buttonPanel.setLayout(g54);
   
               button1.setText("Change Colors");
               button1.setBackground(new Color(250,0,0));
               buttonPanel.add(button1);
               
               mainPanel.setLayout(new BorderLayout());
               mainPanel.add(buttonPanel, BorderLayout.SOUTH);
   
               validate();
            }else{
            Random r = new Random();
            int r1 = r.nextInt(255);
            int g1 = r.nextInt(255);
            int b1 = r.nextInt(255);
            int r2 = r.nextInt(255);
            int g2 = r.nextInt(255);
            int b2 = r.nextInt(255);
            
            mainPanel.removeAll();
            mainPanel.setSize(WIDTH, HEIGHT);
            mainPanel.setBackground(new Color(r1,g1,b1));
            JPanel buttonPanel = new JPanel();

            button1.setText("Change Colors");
            button1.setBackground(new Color(r2,g2,b2));
            buttonPanel.setLayout(new GridLayout(1,4,10,10));
            buttonPanel.add(button1);
            
            mainPanel.setLayout(new BorderLayout());
            mainPanel.add(buttonPanel, BorderLayout.SOUTH);

            validate();
            }
         }
      }
}