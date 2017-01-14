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
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;


/**
  This is version 4 of the voting machine:  V4.  It includes two frames as well as several I/O features.
*/

   public class CalcManager extends JFrame
   {
	   public CalcPanel panel;
		private JLabel infoLabel;

		
		public CalcManager()
		{
		   super("Mouse Action");
			
         //infoPanel = new JPanel();
			panel = new CalcPanel();
         //infoPanel.setBackground(Color.CYAN);
			this.add( panel, BorderLayout.CENTER);
			
			infoLabel = new JLabel("Mouse");
			add (infoLabel, BorderLayout.NORTH);
			
			MouseHandler mh = new MouseHandler();
			panel.addMouseListener(mh);
			panel.addMouseMotionListener(mh);
         panel.getHeight();
         
         
         
         
                     
		}
		
		
		private class MouseHandler implements MouseListener, MouseMotionListener
		{
		   public void mouseClicked(MouseEvent event) 
			{
         int x;
         int y;
         String o;
         int r;
         
         
			   infoLabel.setText (
				          String.format( "Clicked at[%d, %d]", event.getX(), event.getY() ) );
				//Color c = new Color(200, event.getX()/2, event.getY()/2);
			   //infoPanel.setBackground(c);


/* for 7  */if(event.getX() <= panel.getWidth()/4 && event.getY() <= panel.getHeight()/4){
               infoLabel.setText(String.format("Clicked: %s", "7"));
               }
/* for 8  */if(panel.getWidth()/4 <= event.getX() && event.getX() <= panel.getWidth()/2 && event.getY() <= panel.getHeight()/4){
               infoLabel.setText(String.format("Clicked: %s", "8"));
               }
/* for 9  */if(panel.getWidth()/2 <= event.getX() && event.getX() <= panel.getWidth()*3/4 && event.getY() <= panel.getHeight()/4){
               infoLabel.setText(String.format("Clicked: %s", "9"));
               }
/* for /  */if(panel.getWidth()*3/4 <= event.getX() && event.getX() <= panel.getWidth() && event.getY() <= panel.getHeight()/4){
               infoLabel.setText(String.format("Clicked: %s", "/"));
               }
/* for 4  */if(event.getX() <= panel.getWidth()/4 && event.getY() <= panel.getHeight()/4){
               //infoLabel.setText(String.format("Clicked: %d", 1));
               }
/* for 5  */if(event.getX() <= panel.getWidth()/4 && event.getY() <= panel.getHeight()/4){
               //infoLabel.setText(String.format("Clicked: %d", 1));
               }
/* for 6  */if(event.getX() <= panel.getWidth()/4 && event.getY() <= panel.getHeight()/4){
               //infoLabel.setText(String.format("Clicked: %d", 1));
               }
/* for *  */if(event.getX() <= panel.getWidth()/4 && event.getY() <= panel.getHeight()/4){
               //infoLabel.setText(String.format("Clicked: %d", 1));
               }
/* for 1  */if(event.getX() <= panel.getWidth()/4 && event.getY() <= panel.getHeight()/4){
               //infoLabel.setText(String.format("Clicked: %d", 1));
               }
/* for 2  */if(event.getX() <= panel.getWidth()/4 && event.getY() <= panel.getHeight()/4){
               //infoLabel.setText(String.format("Clicked: %d", 1));
               }
/* for 3  */if(event.getX() <= panel.getWidth()/4 && event.getY() <= panel.getHeight()/4){
               //infoLabel.setText(String.format("Clicked: %d", 1));
               }
/* for -  */if(event.getX() <= panel.getWidth()/4 && event.getY() <= panel.getHeight()/4){
               //infoLabel.setText(String.format("Clicked: %d", 1));
               }
/* for 0  */if(event.getX() <= panel.getWidth()/4 && event.getY() <= panel.getHeight()/4){
               //infoLabel.setText(String.format("Clicked: %d", 1));
               }
/* for C  */if(event.getX() <= panel.getWidth()/4 && event.getY() <= panel.getHeight()/4){
               //infoLabel.setText(String.format("Clicked: %d", 1));
               }
/* for =  */if(event.getX() <= panel.getWidth()/4 && event.getY() <= panel.getHeight()/4){
               //infoLabel.setText(String.format("Clicked: %d", 1));
               }
/* for +  */if(event.getX() <= panel.getWidth()/4 && event.getY() <= panel.getHeight()/4){
               //infoLabel.setText(String.format("Clicked: %d", 1));
               }
                           
			}
			
		   public void mousePressed(MouseEvent event)
			{
			   infoLabel.setText (
				          String.format( "Pressed at[%d, %d]", event.getX(), event.getY() ) );
			}
			
			public void mouseReleased(MouseEvent event)
			{
			   infoLabel.setText (
				          String.format( "Released at[%d, %d]", event.getX(), event.getY() ) );
			}
	
			public void mouseEntered(MouseEvent event)
			{
			   infoLabel.setText (
				          String.format( "Mouse entered at[%d, %d]", event.getX(), event.getY() ) );
				//infoPanel.setBackground(Color.BLUE);
			}
	
			public void mouseExited(MouseEvent event)
			{
			   infoLabel.setText (
				          String.format( "Mouse exited at[%d, %d]", event.getX(), event.getY() ) );
				//infoPanel.setBackground(Color.LIGHT_GRAY);
			}
	
			public void mouseDragged(MouseEvent event)
			{
			   infoLabel.setText (
				          String.format( "Dragged at[%d, %d]", event.getX(), event.getY() ) );
			}
	
			public void mouseMoved(MouseEvent event)
			{
			   infoLabel.setText (
				          String.format( "Moved at[%d, %d]       Color(%d, %d, %d)", 
							 event.getX(), event.getY(), 200, event.getX()/2, event.getY()/2) );
				//Color c = new Color(200, event.getX()/2, event.getY()/2);
			   //infoPanel.setBackground(c);
			}
         
         	
		
            
      }
   }