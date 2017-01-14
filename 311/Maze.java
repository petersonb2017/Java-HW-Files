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
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.BasicStroke;
import java.util.Scanner;
import java.awt.geom.Line2D;
import java.lang.Math;



public class Maze

{
   public static int n;
   public static double r;
   public static void main( String[] args )
   {
      
      Scanner in = new Scanner(System.in);
      System.out.println("Enter n : ");
      n = in.nextInt() + 1;
      
      System.out.println("Enter r : ");
      r = in.nextDouble();
         
      JFrame frame = new JFrame();
      frame.setSize(750, 550);
      frame.setTitle("My First Java Graphics Frame");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	
      //GridLayout gl = new GridLayout(n,n);
      	
      MazeComponent panel = new MazeComponent(n,r);
   	
      frame.add(panel);	
      frame.setVisible(true);
   }
}
class MazeComponent extends JPanel
{
   public int n;
   public double r;
   
   public MazeComponent(int n_size, double prob)
   {
      n = n_size;
      r = prob;
   }
   public void paintComponent( Graphics g )    // Method: paintComponent
   {
      Graphics2D g2 = (Graphics2D) g;
      ArrayList<Line2D.Double> lineList = new ArrayList<Line2D.Double>();// size is = 83+(n-2)4
      g2.setStroke(new BasicStroke(2f));
      g2.draw(new Line2D.Double((double)(550/n),(double)(450/n),(double)(550),(double)(450/n)));
      g2.draw(new Line2D.Double((double)(550/n),(double)(450/n),(double)(550/n),450));
      g2.draw(new Line2D.Double((double)(550),(double)(450/n),550,450 ));
      g2.draw(new Line2D.Double((double)(550/n),450,(double)550,450));
      
      
      
      for(int i = 1; i < n; i++)
      { 
         for(int j = 1; j < n; j++)
         {
            lineList.add(new Line2D.Double((double)i*(550/n), (double)j*(450/n), (double)i*(550/n) + (double)(550/n), (double)j*(450/n)));
            //g2.draw(new Line2D.Double((double)i*(550/n), (double)j*(450/n), (double)i*(550/n) + (double)(550/n), (double)j*(450/n)));
         }
      }
      for(int i = 1; i < n; i++)
      { 
         for(int j = 1; j < n; j++)
         {
            //if(i == 2)g2.setStroke(new BasicStroke(4f));
            lineList.add(new Line2D.Double((double)i*(550/n), (double)j*(450/n), (double)i*(550/n), (double)j*(450/n)+(double)(450/n)));
            //g2.draw(new Line2D.Double((double)i*(550/n), (double)j*(450/n), (double)i*(550/n), (double)j*(450/n)+(double)(450/n)));
            g2.setStroke(new BasicStroke(2f));
         }
      }
      Random rand = new Random();
      int[] randList = new int[lineList.size()];
      
      for(int i=0; i<randList.length; i++)randList[i]= -1;
      
      for(int i=0; i < (int)lineList.size()*r; i++)
      {
         int a = 0;
      
         do{
            a = rand.nextInt(lineList.size());
            if(randList[a] == -1) randList[a] = 1;
         
         }while(randList[a] == -1);
      
      //randList[a]=1;
      //System.out.println(randList);
      }
      
      for(int i = 0; i <randList.length; i++)System.out.println(randList[i]);
      
      
      
      System.out.println(lineList.size());
      for(int i = 0; i < lineList.size(); i++)
      {
         if(randList[i] == -1)g2.setStroke(new BasicStroke(4f));
         g2.draw(lineList.get(i));
         g2.setStroke(new BasicStroke(2f));
      }
   }
}
