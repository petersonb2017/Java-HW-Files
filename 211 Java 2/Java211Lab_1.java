import java.util.Scanner;    // Library for keyboard input
import java.util.ArrayList;
import java.lang.Math;

public class Java211Lab_1
{
   public static void main( String[] args )
   {
      Scanner in = new Scanner(System.in);
      double a;
      double b;
      int n;
      double w = 0;
      double fxi = 0;
  
      boolean moreData = true;
      boolean moreData1 = true;
      boolean moreData2 = true;
      boolean moreData3 = true;
      //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!left
      do{
      System.out.println("Enter the value of a:");
      a = in.nextDouble();
      System.out.println("Enter the value of b:");
      b = in.nextDouble();
      System.out.println("Enter the value of n:");
      n = in.nextInt();
      
      for(int i = 0; i < n; i++){   
         int tt = 1;
         fxi += (a + (double)(i)*((b-a)/((double)(n - 1))))*Math.pow(Math.E, (a + (double)(i)*((b-a)/((double)(n - 1)))));
         wxi +=
         System.out.printf("%s %.8f","The Sum of the Function using the left endpoints is: ", fxi);
         System.out.println();
      }
      System.out.printf("%s %.8f","The Sum of the Function using the left endpoints is: ", f(xi));
      
      System.out.println("more data? T/F");
      moreData = in.nextBoolean();
      }while(moreData == true);
/**      //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!right
      do{
      System.out.println("Enter the value of a:");
      a = in.nextDouble();
      System.out.println("Enter the value of b:");
      b = in.nextDouble();
      System.out.println("Enter the value of n:");
      n = in.nextInt();
      
/**      for(int i = 0; i <= n; i++){
         double sum = 0;   
         sum += (b - a)*(a + (double)(i + 1))*((b - a)/(double)(n))*Math.pow(Math.E, (a + (double)(i + 1))*((b - a)/(double)(n)));
      
      System.out.printf("%s %.8f","The Sum of the Function using the right endpoints is: ", sum);
      System.out.println();
      }
      
      System.out.println("more data? T/F");
      moreData1 = in.nextBoolean();
      }while(moreData1 == true);
      //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!midpoint
      do{
      System.out.println("Enter the value of a:");
      a = in.nextDouble();
      System.out.println("Enter the value of b:");
      b = in.nextDouble();
      System.out.println("Enter the value of n:");
      n = in.nextInt();
      
      for(int i = 0; i <= n; i++){
         double sum = 0;   
         sum += (b - a)*(a + ((double)i + 0.5))*((b - a)/(double)(n))*Math.pow(Math.E, (a + ((double)i + 0.5))*((b - a)/(double)(n)));
      
      System.out.printf("%s %.8f","The Sum of the Function using the midpoint is: ", sum);
      System.out.println();
      }
      
      System.out.println("more data? T/F");
      moreData2 = in.nextBoolean();
      }while(moreData2 == true);
      //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!trapazoid
      do{
      System.out.println("Enter the value of a:");
      a = in.nextDouble();
      System.out.println("Enter the value of b:");
      b = in.nextDouble();
      System.out.println("Enter the value of n:");
      n = in.nextInt();
      
      for(int i = 0; i <= n; i++){
         double sum = 0;
          
         sum += (b - a)*(a + (double)(i))*((b - a)/(double)(n))*Math.pow(Math.E, (a + (double)(i))*((b - a)/(double)(n)));
      
      System.out.printf("%s %.8f","The Sum of the Function using the left endpoints is: ", sum);
      System.out.println();
      }
      
      System.out.println("more data? T/F");
      moreData3 = in.nextBoolean();
      }while(moreData3 == true);


*/
   }
}