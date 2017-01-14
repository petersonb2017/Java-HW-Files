import java.util.Scanner;
import java.sql.Timestamp;
import java.util.Date;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;

public class BinarySearch
{
   public static int size;
   public static int[] data;
   
   public static void main( String[] args )
   {
      Random rand = new Random();
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter n the corresponds to the number of elements in the array: ");
      size = keyboard.nextInt();
      data = new int[size];
      
      for (int i = 0; i < data.length; i++)
         data[i] = rand.nextInt(size) + 1;
         Arrays.sort(data);
         //System.out.println(Arrays.toString(data));

      long t1, t2, totalTime = 0;
      
      
      
      t1 = System.nanoTime();
      for(int i = 0; i<= 25; i++){
         binarySearch(rand.nextInt(size));
         
         }
      t2 = System.nanoTime();
      System.out.println("It took an average of this many nano secs ---> " + (t2 - t1)/25);
         
   }

public static boolean binarySearch(int key)
   {
         int low = 0;
         int high = size - 1;
          
         while(high >= low) {
             int middle = (low + high) / 2;
             if(data[middle] == key) {
                 return true;
                 //System.out.println("The int you are searching for is at index: " + middle);
                 //break;
             }
             if(data[middle] < key) {
                 low = middle + 1;
             }
            if(data[middle] > key) {
                high = middle - 1;
             }
        }
        return false;
        //System.out.println("Nope");
   }
   
}