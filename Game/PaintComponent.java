import javax.swing.SwingUtilities;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseMotionAdapter;

public class PaintComponent {

   public static void main(String[] args) {
      SwingUtilities.invokeLater(
         new Runnable() {
            public void run() {
               createAndShowGUI();
            }
         });
   }

   private static void createAndShowGUI() {
      System.out.println("Created GUI on EDT? "
             + SwingUtilities.isEventDispatchThread());
      JFrame f = new JFrame("Swing Paint Demo");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.add(new MyPanel());
      f.pack();
      f.setVisible(true);
   }

}

class MyPanel extends JPanel {

   private int squareX = 50;
   private int squareY = 50;
   private int squareW = 20;
   private int squareH = 20;
   public int posX = squareX;
   public int posY = squareY;

   public MyPanel() {
      setFocusable(true);
      
      
   
      setBorder(BorderFactory.createLineBorder(Color.black));
      @Override
public static void keyPressed(KeyEvent e)
{
    if (e.getKeyCode() == KeyEvent.VK_LEFT)
        move(-deltaX, 0);
    else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
        move(deltaX, 0);
    else if (e.getKeyCode() == KeyEvent.VK_UP)
        move(0, -deltaY);
    else if (e.getKeyCode() == KeyEvent.VK_DOWN)
        move(0, deltaY);
}
   


      
       /* addMouseListener(new MouseAdapter() { public void
       * mousePressed(MouseEvent e) { moveSquare(e.getX(),e.getY()); } });
       * 
       * addMouseMotionListener(new MouseAdapter() { public void
       * mouseDragged(MouseEvent e) { moveSquare(e.getX(),e.getY()); } });
       */
   
   

   private void moveSquareRight(int x) {
      int OFFSET = 2;
   
          
   
      repaint(squareX, squareY, squareW + OFFSET, squareH + OFFSET);
      squareX = x + 2;
      repaint(squareX, squareY, squareW + OFFSET, squareH + OFFSET);
      posX = posX + 2;
          
   
   }
   private void moveSquareUp(int x) {
        int OFFSET = 2;

            

               repaint(squareX, squareY, squareW + OFFSET, squareH + OFFSET);
    squareY = x - 2;
    repaint(squareX, squareY, squareW + OFFSET, squareH + OFFSET);
    posX = posX - 2;
            

        }
        private void moveSquareLeft(int x) {
        int OFFSET = 2;

            

               repaint(squareX, squareY, squareW + OFFSET, squareH + OFFSET);
    squareX = x - 2;
    repaint(squareX, squareY, squareW + OFFSET, squareH + OFFSET);
    posX = posX - 2;
            
         }
        private void moveSquareDown(int x) {
        int OFFSET = 2;

            

               repaint(squareX, squareY, squareW + OFFSET, squareH + OFFSET);
    squareY = x + 2;
    repaint(squareX, squareY, squareW + OFFSET, squareH + OFFSET);
    posX = posX + 2;
            

        }
        



   public Dimension getPreferredSize() {
      return new Dimension(500, 500);
   }

   protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(Color.RED);
      g.fillRect(squareX, squareY, squareW, squareH);
      g.setColor(Color.BLACK);
      g.drawRect(squareX, squareY, squareW, squareH);
   }

}
private class MotionAction extends AbstractAction implements ActionListener
{
    private int deltaX;
    private int deltaY;
 
    public MotionAction(String name, int deltaX, int deltaY)
    {
        super(name);
 
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }
 
    public void actionPerformed(ActionEvent e)
    {
        move(deltaX, deltaY);
    }
}