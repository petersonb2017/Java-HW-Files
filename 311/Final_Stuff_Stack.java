import java.util.Stack;
import java.util.Random;

public class Final_Stuff_Stack
{
   public static Stack<Double> A = new Stack<Double>();
   public static void main( String[] args )
   {
      Random rand = new Random();
      //Stack<Double> Am = new Stack<Double>();
      for(int i = 0; i < 10; i++)
      {
         double b = (double)rand.nextInt(100);
         A.push(b);
         System.out.println("unsorted list: " + b);
      }
   
      stackSort(A);
      
      
   
   }
   public static void stackSort(Stack<Double> A)
   {
      double x;
      Stack<Double> B = new Stack<Double>();
      Stack<Double> C = new Stack<Double>();
      while(A.empty() == false){
         if(B.empty() == true || B.peek() <= A.peek())   B.push(A.pop());
         else C.push(A.pop());
         if(C.empty() == false && B.empty() == false)
         {
            while(B.peek() > C.peek() || B.empty() == false)
            {
               A.push(B.pop());
               if(B.empty() == true)
                  break;     
            }
            B.push(C.pop());
         }
      }
      
      while(B.empty()== false)System.out.println("Sorted List B: " + B.pop());
   }
}