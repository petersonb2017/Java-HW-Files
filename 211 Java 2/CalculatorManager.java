import java.awt.Color;
import java.awt.Rectangle;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.BasicStroke;


public class CalculatorManager extends JFrame
{
   private JPanel infoPanel;
   private JLabel infoLabel;
   private static int state = 0; // State 0: 0 or 1; State 1: + or *
   private static int curValue = 0;
   private static int operand = 0;
   private static int operator = 0;   // 0: +;    1: *;
		
   public CalculatorManager()
   {
      super("Binary Calculator");
      CalculatorPanel infoPanel = new CalculatorPanel();
      //infoPanel = new JPanel();
      infoPanel.setBackground(Color.GREEN);
      this.add( infoPanel, BorderLayout.CENTER);
   		
      infoLabel = new JLabel("Binary Calculator");
      add (infoLabel, BorderLayout.NORTH);
   		
      MouseHandler mh = new MouseHandler();
      infoPanel.addMouseListener(mh);
      //infoPanel.addMouseMotionListener(mh);
   }
   
   private class MouseHandler implements MouseListener
   {
      String [][] keysString = {{"0", "+"}, {"1", "*"}};

      public void mouseClicked(MouseEvent event)
      {
         int row = event.getY() / 250;
         int col = event.getX() / 250;
         int inVal = 2*row+col;
         
         //State------->  0 (last key: digit)   1  (last key: operator)
         // inVal is:
         //  0:  0        operand *=2           if (operator = 0) curValue = curValue
         //                                     else curValue = 0
         //                                     state 0
         //                                     operand = 0
         //
         //  1:  1        operand *=2 + 1       if (operator = 0) curValue++
         //                                     else curValue = curValue
         //                                     state 0
         //                                     operand = 1
         //
         //  2:  +         operator = 0         Error:    state = 1
         //                state = 1                            
         //                                             
         //
         //
         //  3:  *         operator = 1         Error:    state = 1
         //                operand = 0
         //                state = 1
 
         switch (state) 
         {
            case 0 : switch (inVal) // state, curValue, operand, operator
                     {
                        case 0 :  operand *= 2;                                  
                                  break;
                        case 1 :  operand = operand * 2 + 1;
                                  break;
                        case 2 :  if (operator == 0)
                                     curValue += operand;
                                  else
                                     curValue *= operand;
                                  operand = 0;
                                  operator = 0;
                                  state = 1;
                                  break;
                        case 3 :  if (operator == 0)
                                     curValue += operand;
                                  else
                                     curValue *= operand;                                     
                                  operand = 0;
                                  operator = 1;
                                  state = 1;
                                  break;
                        default : break;
                     }  break;
                     
            case 1 : switch (inVal) // state, curValue, operand, operator
                     {
                        case 0 :  operand = 0;
                                  state = 0;
                                  break;
                        case 1 :  operand = 1;
                                  state = 0;
                                  break;
                        case 2 :  
                                  break;
                        case 3 : 
                                  break;
                        default : break;
                     }  break;
         }
      Font font1 = new Font ("COURIER", Font.BOLD, 20); 
         infoLabel.setFont(font1);  
         if (state == 0)                   
            infoLabel.setText ( String.format( "%d", operand ) );
         else if (state == 1)
            infoLabel.setText ( String.format( "%d", curValue ) );
         
      }
   		
      public void mousePressed(MouseEvent event){}   		
      public void mouseReleased(MouseEvent event){}
      public void mouseEntered(MouseEvent event){}
      public void mouseExited(MouseEvent event){}
   }
}