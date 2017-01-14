import java.lang.Math;
import javax.swing.JOptionPane;
import java.util.Scanner; 
import java.util.Random;

public class HW_6_3
{
   public static void main(String[] args)
   {
      
      Scanner in = new Scanner(System.in);
      
      int sum = 0;
      int data[] = new int[10000];
      int frequencies[] = new int[26];
      int temp[] = new int[26];
      String [] stars = new String[26];
      
      
      for(int i = 0; i < temp.length; i++)
         temp[i] = 0;
         
      for(int i = 0; i < temp.length; i++)
         System.out.printf("%3d", temp[i]);
      
      System.out.println("  ");
      
      for(int i = 0; i < frequencies.length; i++)
         frequencies[i] = i;
         
      for (int i = 0; i < frequencies.length; i++)
         System.out.printf("%3d",frequencies[i]);
         
      System.out.println("  "); 
      
      Random rand = new Random();
      for(int i = 0; i < 10000; i++){
         data[i] = rand.nextInt(26);
      }
      
      
      for(int i = 0; i < data.length; i++){
         for(int j = 0; j < frequencies.length; j++)
            if(data[i] == frequencies[j])
               temp[j] += 1;
      }
      
      
      int [] starnumbers = new int[26];
      
      
      for(int i = 0; i < starnumbers.length; i++)
         starnumbers[i] = temp[i]/100;
         
     for(int i = 0; i < stars.length; i++)
         stars[i] = " ";
         
      for(int i = 0; i < stars.length; i++)
         for(int j = 0; j < starnumbers[i]; j++)
            stars[i] += "*";
      
      
      System.out.println("Value  Frequency  Bar Graph");
      
      for (int i = 0; i < frequencies.length; i++){
         System.out.printf("%2d %13d %-1s\n", i, temp[i], stars[i]);
         
      }
         
         
      //int smallest = data[0];
      //int biggest = data[0]; 
               
      //for (int i = 0; i < data.length; i++)
      //   if (data[i] < smallest)
      //      smallest = data[i];
            
      //for (int i = 0; i < data.length; i++)
      //   if (data[i] > biggest)
      //      biggest = data[i];
            
      //for (int i = 0; i < data.length; i++)
      //   System.out.printf("%3d",data[i]);
      //System.out.println();
      
      //for (int i = 0; i < data.length; i++)
      //   sum += data[i];
      //System.out.println("The Sum is: " + sum);   

      //double average = (double)sum/(double)data.length;

      //System.out.println("The average is: " + average);

      
      //System.out.println("Smallest Value is: " + smallest);
      //System.out.println("Biggest Value is: " + biggest);  

   }
}