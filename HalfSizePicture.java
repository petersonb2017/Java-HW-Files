import java.lang.Object;

 
public class PictureDemo
{
   public static void main(String[] args)
   {
      Picture pic = new Picture();
      pic.load("queen-mary.png");
      int newWidth = pic.getWidth() * 0.5;
      int newHeight = pic.getHeight() * 0.5;
      pic.scale(newWidth, newHeight);
      //pic.move(
   }
}