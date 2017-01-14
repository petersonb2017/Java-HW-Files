import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
	
public class Quiz
{	
   private static int buttonOnePushes   = 0;
   private static int buttonTwoPushes   = 0;
   private static int buttonThreePushes = 0;
   	
   public static void main(String[] args)
   {
      JFrame buttonFrame = new JFrame("Button Frame");
      
      JButton button1 = new JButton("Button 1");
      JButton button2 = new JButton("Button 2");
      JButton button3 = new JButton("Button 3"); 
      JPanel buttonPanel = new JPanel();
      GridLayout g13 = new GridLayout(3,1,10,10);
      buttonPanel.setLayout(g13);
      buttonPanel.add(button1);
      buttonPanel.add(button2);
      buttonPanel.add(button3);
           
      final JLabel label1 = new JLabel("Label 1");
      final JLabel label2 = new JLabel("Label 2");
      final JLabel label3 = new JLabel("Label 3");
      JPanel labelPanel = new JPanel();
      labelPanel.setLayout(g13);
      labelPanel.add(label1);
      labelPanel.add(label2);
      labelPanel.add(label3);
      
      
      final JCheckBox checkBox1 = new JCheckBox("Checkbox 1", false);
      JColorChooser colorChooser1 = new JColorChooser(new Color(50, 200, 150) );
      JPanel checkBoxPanel = new JPanel();
      JPanel colorChooserPanel = new JPanel();
      checkBoxPanel.add(checkBox1);
      colorChooserPanel.add(colorChooser1);
      
      buttonFrame.add(buttonPanel, BorderLayout.WEST);
      buttonFrame.add(labelPanel, BorderLayout.EAST);
      buttonFrame.add(checkBoxPanel, BorderLayout.NORTH);
      buttonFrame.add(colorChooserPanel, BorderLayout.CENTER);

      buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      buttonFrame.setSize(900, 500);
      buttonFrame.setVisible(true);
           
      class AddButton1Listener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            label1.setText("Button 1 was pushed " + ++buttonOnePushes + " times.");
         }
      }
      class AddButton2Listener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            label2.setText("Button 2 was pushed " + ++buttonTwoPushes + " times.");
         }
      }
      class AddButton3Listener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            label3.setText("Button 3 was pushed " + ++buttonThreePushes + " times.");
         }
      }
      class AddCheckBox1Listener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            System.out.println(e);
            if (!checkBox1.isSelected())
                  JOptionPane.showMessageDialog(null, "Check me ... pleaze!");
               else
                  JOptionPane.showMessageDialog(null, "You're nothing but a ... checker!");
               
         }
      }






      
      ActionListener listener1 = new AddButton1Listener();
      button1.addActionListener(listener1);
      ActionListener listener2 = new AddButton2Listener();
      button2.addActionListener(listener2);
      ActionListener listener3 = new AddButton3Listener();
      button3.addActionListener(listener3);
      ActionListener listener4 = new AddCheckBox1Listener();
      checkBox1.addActionListener(listener4);
      
   }
}