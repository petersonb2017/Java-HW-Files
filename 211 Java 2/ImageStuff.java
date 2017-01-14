   import java.io.File;
   import java.io.FileNotFoundException;
   import java.io.PrintWriter;
   import java.util.Scanner;
   import java.util.ArrayList;
   import java.util.Random;
   import java.awt.Image;
   import java.awt.image.BufferedImage;
   import javax.imageio.ImageIO;
   import java.io.IOException;

   public class ImageStuff
   {
      static BufferedImage img1 = null; 
      static int type, width, height;
   
      public static void main(String[] args) throws FileNotFoundException
      {
         try 
         {
            img1 = ImageIO.read(new File("BigFlo.jpg"));
         } 
            catch (IOException e) {}
      
      
         type = img1.getType();
         width = img1.getWidth();
         height = img1.getHeight();
         BufferedImage img2 = new BufferedImage(width, height, type);
      
      
         System.out.println("type:   " + type);
         System.out.println("width:  " + width);
         System.out.println("height: " + height);
      
         for (int y = 0; y < height; y++)
         {
            for(int x = 0; x < width; x++)
            {
               int pixel = img1.getRGB(x,y);
               int red   = (pixel & 0xFF0000) >> 16;
               int green = (pixel & 0x00FF00) >>  8;
               int blue  = (pixel & 0x0000FF);
               System.out.print("(" + red + ","+  green + "," + blue + ") ");
					int r2 = red, g2 = green, b2 = blue;
					
					// Case 1:  g->r, b->g, r->b
					//r2 = green;  g2 = blue;  b2 = red;
					// Case 2:  zero out top bit of r, g, b
					//r2 = red & 0x7f;  g2 = green & 0x7f;  b2 = blue & 0x7f;
					// Case 3:  Flip all bits of r, g, b
					// r2 = red ^ 0xFF;  g2 = green ^ 0xff;  b2 = blue ^ 0xff;
					// Case 4:  zero out top 2 bits of r, g, b
					//r2 = red & 0x3f;  g2 = green & 0x3f;  b2 = blue & 0x3f;
					// Case 5:  zero out lower 4 bits of r, g, b
					//r2 = red & 0xf0;  g2 = green & 0xf0;  b2 = blue & 0xf0;
					// Case 6: Average colors and r = g = b = average
					//int avg = (red + green + blue) / 3; r2 = avg; g2 = avg; b2 = avg;
					// Case 7:  red -> green;
					//if ((red > 2.0*green) && (red > 2.0*blue))
					//   {  r2 = red >> 2;  g2 = red;  b2 = red >> 2;  }
					// Case 8:  white -> yellow
					int big = 250; if (red > big && green > big && blue > big)
					   {r2 = 255; g2 = 255; b2 = 0;}
					
					
					pixel = ((r2 << 16)& 0xFF0000) |
					        ((g2 << 8) & 0x00FF00) | (b2 & 0x0000FF);
				   img2.setRGB(x,y, pixel);
            }
            System.out.println();
         }
      
         try 
         {
            ImageIO.write(img2, "jpg", new File("ZodderFlo.jpg"));
         } 
            catch (IOException e) {}
      
      }
   }
