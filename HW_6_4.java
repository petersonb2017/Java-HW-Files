import java.lang.Math;
import javax.swing.JOptionPane;
import java.util.Scanner; 
import java.util.Random;

public class HW_6_4
{
   public static void main(String[] args)
   {
      
      Scanner in = new Scanner(System.in);
      
      String para = "If a char has an integer value which lies from 65 to 90, it is a CAPITAL letter from A to Z. If a character has an integer value which lies from 97 to 122, it is a lower character letter from a to z. Declare and initialize a String variable with a paragraph. The paragraph should have at least 100 characters. The more characters, the more interesting your result will be. Use the above facts to the following";
      
      char alph[] = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

      int temp[] = new int[52];
      
      String [] stars = new String[26];
      
      for(int i = 0; i < temp.length; i++)
         temp[i] = 0;

      
      
      System.out.println(para.length());
      
      char x[] = new char[para.length()];
      
      for(int i = 0; i < para.length(); i++)
         x[i] = para.charAt(i);
         
      
      for(int i = 0; i < para.length(); i++)
         System.out.printf("%1s", x[i]);
      
      System.out.println();
      System.out.println("Value  Frequency  Bar Graph      ");

      
      for(int i = 0; i < para.length(); i++)
         for(int j = 0; j < alph.length; j++)
            if(x[i] == alph[j])
               temp[j] += 1;
               
      for(int i = 0; i < 26; i++)
         temp[i] += temp[i + 26];
      
      int [] starnumbers = new int[26];
      for(int i = 0; i < starnumbers.length; i++)
         starnumbers[i] = (100*temp[i]/para.length());
         
     for(int i = 0; i < stars.length; i++)
         stars[i] = " ";
         
      for(int i = 0; i < stars.length; i++)
         for(int j = 0; j < starnumbers[i]; j++)
            stars[i] += "*";
                     
      
      for (int i = 0; i < 26; i++){
         System.out.printf("%2c %14d %-9s\n", alph[i], temp[i], stars[i]);
         
      }
      
      
   }
}