// This program is from "Java: How to Program, 9th ed."
// By Paul Deitel and Harvey Deitel
import java.applet.AudioClip;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class LoadAudioAndPlay extends JApplet
{
   private AudioClip sound1, sound2, currentSound;
   private JButton playJButton, loopJButton, stopJButton;
   private JComboBox soundJComboBox;
   
   public void init()
   {
      setLayout( new FlowLayout() );
      String choices[] = {"Welcome", "Hi" };
      soundJComboBox = new JComboBox (choices);
      
      soundJComboBox.addItemListener(
         new ItemListener()
         {
            public void itemStateChanged (ItemEvent e)
            {
               currentSound.stop();
               currentSound = soundJComboBox.getSelectedIndex() == 0 ? 
                  sound1 : sound2;
            }
         }
      );
   
      add( soundJComboBox );
      ButtonHandler handler = new ButtonHandler();
      playJButton = new JButton( "Play" );
      playJButton.addActionListener ( handler );
      add( playJButton );
      
      loopJButton = new JButton ("Loop");
      loopJButton.addActionListener(handler);
      add(loopJButton);
      
      stopJButton = new JButton("Stop");
      stopJButton.addActionListener(handler);
      add(stopJButton);
      
      sound1 = getAudioClip( getDocumentBase(), "beach.mp3" );
      sound2 = getAudioClip( getDocumentBase(), "yahoo_ring_03.wav" );
      currentSound = sound1;
   }
   
   public void stop()
   {
      currentSound.stop();
   }
   
   private class ButtonHandler implements ActionListener
   {
      public void actionPerformed(ActionEvent actionEvent)
      {
         if (actionEvent.getSource() == playJButton){
            System.out.println(playJButton);
            currentSound.play();}
         else if (actionEvent.getSource() == loopJButton)
            currentSound.loop();
         else if (actionEvent.getSource() == stopJButton)
            currentSound.stop();
      }
   }
}
