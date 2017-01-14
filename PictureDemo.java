import java.lang.Object;

 
public class PictureDemo
{
   public static void main(String[] args)
   {
      Picture pic = new Picture();
      pic.load("C:/Users/Bailey/Pictures/Moto.JPG");
      double newWidth = pic.getWidth() * 0.5;
      double newHeight = pic.getHeight() * 0.5;
      pic.scale(newWidth, newHeight);
      pic.move(pic.getWidth() * 0.25, pic.getHeight() * 0.25);
   }
}