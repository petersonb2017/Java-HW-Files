   import java.io.File;
   import java.io.FileNotFoundException;
   import java.io.PrintWriter;
   import java.util.Scanner;

   public class FileIOStuff1
   {
      public static void main(String[] args) throws FileNotFoundException
      {
         Scanner keyboard = new Scanner(System.in);
			
         System.out.print("Input File name: ");
         String inputFileName = keyboard.next(); // get NAME of input file
         System.out.print("Output File name: ");
         String outputFileName = keyboard.next();// get NAME of output file
      
         File inputFile = new File(inputFileName); // pointer to  input FILE
      
         Scanner inFile = new Scanner(inputFile);  // Scanner for input FILE
         inFile.useDelimiter("[^A-za-z0-9 ']+");    // 
         //inFile.useDelimiter("[A-Za-z]+");
         //inFile.useDelimiter("[M-Zm-z]+");
         //inFile.useDelimiter("[^2-9]+");
         //inFile.useDelimiter(",$#");
         //inFile.useDelimiter("[,$#]");
      
         PrintWriter outputFile = new PrintWriter(outputFileName); // pointer to output FILE
      
		   int lineNumber = 1;
         while (inFile.hasNextLine())
         {
            String nextLine = inFile.nextLine();
            //outputFile.println(nextLine);
            outputFile.printf("New Line %3d: %s%n", lineNumber++, nextLine);
         }
			
         // Close both input and output files
         inFile.close();
         outputFile.close();
			
			
			// Repeat the above process with a NEW output file...
			inFile = new Scanner(inputFile);  // Scanner for input FILE
			int nameLength = outputFileName.length();
			int dotPosition = outputFileName.indexOf('.');
			String outputFileName2 = outputFileName.substring(0,dotPosition)
			                         + "V2" + 
			                         outputFileName.substring(dotPosition, nameLength);
         outputFile = new PrintWriter(outputFileName2); // pointer to output FILE

		   lineNumber = 1;
         while (inFile.hasNext())
         {
            String nextThing = inFile.next();
            
            if (nextThing == 1){
               System.out.println("Yup");
            }         // Close both input and output files
         inFile.close();
         outputFile.close();


      }
   }
