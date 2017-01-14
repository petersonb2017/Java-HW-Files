import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileInBytes
{
   public static void main(String[] args) throws FileNotFoundException, IOException
   {
      Scanner keyboard = new Scanner(System.in);
   	
      // Prompt user for input and output file names	
      //System.out.print("Input File name: ");
      String inputFileName = "bear4.jpg"; // get NAME of input file
      //System.out.print("Output File name: ");
      String outputFileName = "bear5.jpg"; // get NAME of input file
      
      byte checksum = 00000000;
      byte checksumxor = 00000000;
      
      PrintWriter outputFile = new PrintWriter(outputFileName); // pointer to output FILE
      
      Path path = Paths.get(inputFileName);   // turn file name into a "Path"
      byte[] data = Files.readAllBytes(path); // static method: read file -> byte array
      long size = Files.size(path);           // get file size
   
      for (int i = 0; i < size; i+=8)          
      {
         outputFile.printf("%4X:   ", i);    // Start line with address
         for (int j = 0; j < 8; j++)         // Each line contains 8 bytes
         {
            checksum += data[j];
            checksumxor = (byte)(checksumxor ^ data[j]);
            
            if (i+j >= size)                 // ... if last line has < 8 bytes
               break;
            outputFile.printf("%2X  ", data[i+j]);
         }
         outputFile.printf("%n");
      }  
      outputFile.close();
      System.out.println(Integer.toBinaryString(checksum & 0xFF));
      System.out.println(Integer.toBinaryString(checksumxor & 0xFF));

   }
}
