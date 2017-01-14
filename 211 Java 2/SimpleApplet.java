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
	
   
public class SimpleApplet extends JApplet
{
   //private static JFrame gameFrame = new JFrame("Take my great quiz...");
   SimpleApplet s = new SimpleApplet();
   JPanel mainPanel = new JPanel();
   JButton button1 = new JButton();

   int HEIGHT = 400;
   int WIDTH  = 500;

   
   
   s.setMinimumSize(new Dimension(WIDTH, HEIGHT));
   setSize(WIDTH, HEIGHT);
   JPanel buttonPanel = new JPanel();
   button1.setBackground(new Color(150,150,150));
   buttonPanel.setLayout(new GridLayout(4,4,100,100));
   buttonPanel.add(button1);
   mainPanel.setSize(WIDTH,HEIGHT);
   mainPanel.setLayout(new BorderLayout());
   mainPanel.add(buttonPanel, BorderLayout.CENTER);

   add(mainPanel);
   setVisible(true);

      
      
           
      class AddButton1Listener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            Random r = new Random();
            Random r3 = new Random();
            
            int r1 = r.nextInt(255);
            int g1 = r.nextInt(255);
            int b1 = r.nextInt(255);
   

            int r2 = r3.nextInt(255);
            int g2 = r3.nextInt(255);
            int b2 = r3.nextInt(255);
                        
            mainPanel.removeAll();
            mainPanel.setSize(WIDTH, HEIGHT);
            mainPanel.setBackground(new Color(r1,g1,b1));
            JPanel buttonPanel = new JPanel();
            JPanel titlePanel = new JPanel();
            
            JLabel pictureLabel = new JLabel();            
            

           
            button1.setBackground(new Color(r2,g2,b2));
            //Dimension d = new Dimension(100,100);
            
            buttonPanel.setLayout(new GridLayout(r2 % 10, r2%10,r2,r2));
            buttonPanel.add(button1);
            Font font1 = new Font ("COURIER", Font.ITALIC,24);     // Select Font

                        
            //mainPanel.setLayout(new BorderLayout());
            mainPanel.add(buttonPanel);

            add(mainPanel);
            setVisible(true);
            validate();

         }
      }


      
      ActionListener listener1 = new AddButton1Listener();
      button1.addActionListener(listener1);

   }
   
   
}