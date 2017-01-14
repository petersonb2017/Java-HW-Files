public class Bug
{

   private int position;
   private int direction = 1;
   
      public Bug(int initialPosition)
      {
      position = initialPosition;
      
      }
      
      public void turn()
      {
      direction = 1;
      direction = direction * (-1);
      }
      
      public void move()
      {
      
      position += direction;
      }
      
      public int getPosition()
      {
      
      return position;
      }
   
}