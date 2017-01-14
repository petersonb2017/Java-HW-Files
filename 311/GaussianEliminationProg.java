import java.util.Scanner;
import java.sql.Timestamp;
import java.util.Date;
import java.io.File;
import java.io.FileNotFoundException;
 
public class GaussianEliminationProg
{
   public static void main( String[] args )throws FileNotFoundException
   {
      
      File inFile = new File("Matrix.txt");
      
      Scanner in = new Scanner(inFile);
      Scanner keyboard = new Scanner(System.in);
      in.useDelimiter(";");
      in.useDelimiter("[ ]+");
      
      long t1, t2, totalTime = 0;
      long count;
      double avgTime;
      double maxx;
      int maxxIndex;
      double temp;
      double factor;
      double sum;
      
      
      System.out.println("Enter n: ");
      int n = keyboard.nextInt();
      
      //while(in.hasNextLine()){
      //   n++;
      //   in.nextLine();
      //}
      
      //System.out.println("n is : " + n + "     " + in.nextInt());

      double[][] A = new double[n][n+1];
      double[] x = new double[n];

      while (in.hasNextLine()) {
      
         for(int r = 0; r < n; r++)
         {
            for(int c = 0; c <= n; c++)
            {
               A[r][c] = in.nextInt();
               System.out.println("A[" + r + "][" + c + "] = " + A[r][c]);
            }
         in.nextLine();
         }
      }
      

   	int grid[][] = new int[n][n+1];
      
      t1 = System.nanoTime();

      for(int c = 0; c <= n-1; c++) //to n-1  // Proceed column by column from left to right
      {
         // First Step:  Perform pivoting 
         maxx = Math.abs(A[c][c]);
         maxxIndex = (int)c;
         for(int r = c; r <= n-1; r++) //row from c to n-1
         {
            if(Math.abs(A[r][c]) > maxx)
            {
               maxx = Math.abs(A[r][c]);
               maxxIndex = r;
            }
         }
         if (A[maxxIndex][c] == 0.0)
         {
            System.out.println("Singular Matrix:  Unable to Proceed.");
            break;
         }
            
         if (maxx > Math.abs(A[c][c]))   // Swap row "maxIndex" with row "c" in Pivoting
         {
            for(int c1 = c; c1 <= n; c1++) //c1 from c to n
            {
               temp = A[c][c1];
               A[c][c1] = A[maxxIndex][c1];
               A[maxxIndex][c1] = temp;
            }
         }
                           
         // Set all elements below diagonal to 0 using a row operation
         for(int r = c + 1; r <= n-1; r++) //r from c+1 to n-1
            {
               if (A[r][c] != 0.0)
               {
                  factor = (A[r][c] / A[c][c]);
                  for(int c1 = c; c1 <= n; c1++) //c1 from c to n
                     A[r][c1] -= factor * A[c][c1];
               }
            }
      }
      
      // Back Substitution
      x[n-1] = A[n-1][n] / A[n-1][n-1];
      for(int r = n-2; r <= 0; r++) //r from n-2 to 0
      {
         sum = A[r][n];
            for(int k = r + 1; k <= n-1; k++) //k from r+1 to n-1  
               sum -= A[r][k]*x[k];
         x[r] = sum / A[r][r];
      }

      t2 = System.nanoTime();
      
      System.out.println("The reduced matrix is:");
      for(int c = 0; c <= n-1; c++)
      {
         for(int r = 0; r <= n; r++)
         {
         
         System.out.printf("%9.4s", A[c][r]);
         }
      System.out.println();
      }
      
      
      for (int r = 0; r <= n-1; r++)
         System.out.println("The solution x_" + (r+1) + " is: " + x[r]);//print solution vector:  x[0]...x[n-1]
         
      System.out.println("It took " + (t2-t1) + " nano seconds.");
      
   }
}