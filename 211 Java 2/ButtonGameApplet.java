import javax.swing.JApplet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import java.util.Random;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import java.applet.AudioClip;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ButtonGameApplet extends JApplet
{
   private JButton click, b;
   private JButton[] buttonArray;
   private JPanel buttonPanel;
   private int responseNum;
   private int[] correct = new int[12];
   private long t1, t2;
   private String score;
   private AudioClip sound1, sound2;
   private PrintWriter outputFile; 
   private ArrayList<Double> scoreList = new ArrayList<Double>();
   private ImageIcon startImg, buttonImg, buttonImg1, buttonImg2, buttonImg3;
   private double seconds = 0;
   
   public void init()
   {
      setLayout( new GridLayout(4,4,8,8) );
      responseNum = 0;
      this.setSize(1200,600);
      startImg = new ImageIcon("Smile.png");
      infoBox("Click the Red Target","Start",startImg);   
      buttonArray = new JButton[16];
      makeButtons();
      

   }
   
   public void makeButtons(){                //This method initializes all of the buttons, and puts them into the grid.
      
      for (int i = 0; i < 15; i++)
         {
            b = new JButton();
            b.setLabel(String.format("Start"));
            buttonArray[i] = b;
            add(b);
         } 
      
      ButtonHandler handler = new ButtonHandler();
      click = new JButton("Start");
      buttonArray[15] = click;
      add(click);   
            
      click.addActionListener ( handler );
      
      for (int i = 0; i < 15; i++)
         buttonArray[i].addActionListener(handler);
      
      
      }
   
   public static void infoBox(String infoMessage, String titleBar)
   {
      JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
   }
   
   public static void infoBox(String infoMessage, String titleBar, ImageIcon icon)
   {
      JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE, icon);
   }   
      
   public void switchButtons(){              //this method randomizes the button titles, not the buttons themselves.
      
      Random r = new Random();
      int rand = r.nextInt(16); 
      buttonImg = new ImageIcon("Target1.png");
      int rando;
      int rand1;
      
      
      do 
      {
      rando = r.nextInt(16);
      }
      while (rando == rand);
      
      do
      {
      rand1 = r.nextInt(16);
      }
      while (rand1 == rando || rand1 == rand);
      
      
      for (int i = 0; i < 16; i++)
         {
         int red = (r.nextInt(150)+ 105);
         int green = 0;
         int blue = 0/*r.nextInt(255)*/;
         
         Color randColor = new Color(red, green, blue);
         
        
         buttonArray[(i + rand + 1)%16].setText("  ");
         buttonArray[(i + rand + 1)%16].setBackground(randColor);
         buttonArray[(i + rand + 1)%16].setIcon(buttonImg);
         
         
                  
         }
         
         int red1 = (r.nextInt(150)+ 105);
         int green1 = 0;
         int blue1 = 0/*r.nextInt(255)*/;
         
         Color randColor1 = new Color(red1, green1, blue1);
         
         buttonImg1 = new ImageIcon("Target.png");
         buttonImg2 = new ImageIcon("checkmark.png");
         buttonImg3 = new ImageIcon("tick.png");
         
         
           
         buttonArray[(rand)%16].setText(" ");        
         buttonArray[(rand)%16].setIcon(buttonImg1);        
         //buttonArray[(rando)%16].setIcon(buttonImg2);
         //buttonArray[(rand1)%16].setIcon(buttonImg3);
         
         responseNum++;
         System.out.println("The Number of Clicks is: " + responseNum);
   }
   
   public static void BubbleSort( ArrayList<Double> num )
   {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        double temp;   //holding variable
   
        while ( flag )
        {
               flag= false;    //set flag to false awaiting a possible swap
               for( j=0;  j < num.size() -1;  j++ )
               {
                      if ( num.get(j) > num.get(j+1) )   // change to > for ascending sort
                      {
                              temp = num.get(j);
                              num.set(j, num.get(j+1));
                              num.set(j+1, temp);
                              flag = true;              //shows a swap occurred  
                     } 
               } 
         } 
   }
   
   private class ButtonHandler implements ActionListener             //This it the listener for a Right button click.
   {
      public void actionPerformed(ActionEvent e)
      {
            System.out.println(e.getActionCommand());
            switchButtons();
            
            if(e.getActionCommand() == " ")
            {
               //correct[responseNum - 2] = 1;
               sound2 = getAudioClip(getDocumentBase(), "CHIMES.wav");
               sound2.play();
            }
            
            if(e.getActionCommand() == "  ")
            {
               sound1 = getAudioClip(getDocumentBase(), "Wrong.wav");
               sound1.play();
               seconds = seconds - 1500;
            }       
                 
            if(responseNum == 1)
            t1 = System.nanoTime();

            if(responseNum == 13)
            {
               t2 = System.nanoTime();
               seconds = seconds + (double)(17000 - ((t2 - t1) / 1000000.0));
               String time = " " + seconds;
               if (seconds<0)
               {
               seconds = 0;
               String time2 = " " + seconds;
               infoBox("Grade = F   Your Score Was: " + time2,  "Game Over");
               }
               if (seconds<6000 && seconds>0)
               {
               infoBox("Grade = D   Your Score Was: " + time,  "Game Over");
               }
               if (seconds>6000 && seconds<8000)
               {
               infoBox("Grade = C   Your Score Was: " + time,  "Game Over");
               }  
               if (seconds>8000 && seconds<10000)
               {
               infoBox("Grade = B   Your Score Was: " + time,  "Game Over");
               }
               if (seconds>10000 && seconds<15000)
               {
               infoBox("Grade = A   Your Score Was: " + time,  "Game Over");
               }
               int sum = 0;
               
               for(int i = 0; i < correct.length; i++){
                  sum += correct[i];
                  System.out.println(correct[i]);
                  score = " " + sum;
                  }
               scoreList.add(seconds);
               BubbleSort(scoreList);
               
               infoBox("Your High Score is: " + scoreList.get(scoreList.size()-1), "Game Over");
               responseNum = 0;
               seconds = 0;
               
            }
             
      }
   }
}