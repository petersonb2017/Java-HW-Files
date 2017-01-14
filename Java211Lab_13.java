import java.util.Scanner;    // Library for keyboard input
import java.util.ArrayList;
import java.lang.Math;

public class Java211Lab_13
{
   public static void main( String[] args )
   {
      Scanner in = new Scanner(System.in);
      double a;
      double b;
      double n;
      double w;
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
      double sum = 0;
      
      for(int i = 0; i <= (int)(n-1); i++){
            
         sum += ((b - a)/(double)(n))*(1 + (4.0*(double)(i))/(double)(n))*Math.log(1 + ((b - a)*(double)(i))/(double)(n));
      
      System.out.printf("%s %.8f","The Sum of the Function using the left endpoints is: ", sum);
      System.out.println();
      }
      
      System.out.println("more data? T/F");
      moreData = in.nextBoolean();
      }while(moreData == true);
      //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!right
      do{
      System.out.println("Enter the value of a:");
      a = in.nextDouble();
      System.out.println("Enter the value of b:");
      b = in.nextDouble();
      System.out.println("Enter the value of n:");
      n = in.nextDouble();
      double sum = 0;
      
      for(int i = 0; i <= (int)(n); i++){
      
            
           
         sum += ((b - a)/(double)(n))*(1.0 + (4.0*(double)(i))/(double)(n))*Math.log(1.0 + ((b - a)*(double)(i))/(double)(n));
      
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
      n = in.nextDouble();
      double sum = 0;
      
      for(int i = 0; i <= (int)(n-1); i++){
            
         sum += ((b - a)/(double)(n))*(1.0 + (4.0*(0.5 +(double)(i)))/(double)(n))*Math.log(1.0 + ((b - a)*(0.5+(double)(i)))/(double)(n));
      
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
      n = in.nextDouble();
      double sum = 0;
      
      for(int i = 0; i <= (int)(n); i++){
      
      w = 2;
      if (i == 0)
      {
      w = 1;
      }
      if (i == n)
      {
      w = 1; 
      }
    
         sum += w*((b - a)/(2*(n)))*(1 + ((b - a)*(double)(i))/(double)(n))*Math.log(1 + ((b - a)*(double)(i))/(double)(n));
      
         
      System.out.printf("%s %.8f","The Sum of the Function using the trap is: ", sum);
      System.out.println();
      }
      
      System.out.println("more data? T/F");
      moreData3 = in.nextBoolean();
      }while(moreData3 == true);

      do{
      System.out.println("Enter the value of a:");
      a = in.nextDouble();
      System.out.println("Enter the value of b:");
      b = in.nextDouble();
      System.out.println("Enter the value of n:");
      n = in.nextDouble();
      double sum = 0;
      
      for(int i = 0; i <= (int)(n-1); i++){
      
      w = 4;
      if ((i%2)==0)
      {
      w = 2;
      }
      if (i == 0)
      {
      w = 1;
      }
      if (i == n)
      {
      w = 1; 
      }
    
         sum += w*((b - a)/(3*n))*(1 + ((b - a)*(double)(i))/(double)(n))*Math.log(1 + ((b - a)*(double)(i))/(double)(n));
      
         
      System.out.printf("%s %.8f","The Sum of the Function using simpsons is: ", sum);
      System.out.println();
      }
      
      System.out.println("more data? T/F");
      moreData3 = in.nextBoolean();
      }while(moreData3 == true);

   }
}