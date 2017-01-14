import java.lang.Math;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.JTable;

public class HW_5_7
{
   public static void main(String[] args)
   {
   
   
                   int limit = 1000000;
                   
               
                System.out.println("Prime numbers between 1 and " + limit);
               
                //loop through the numbers one by one
                for(int i=1; i < 1000000; i++){
                       
                        boolean isPrime = true;
                       
                        //check to see if the number is prime
                        for(int j=2; j < i ; j++) {
                               
                                if(i % j == 0){
                                        isPrime = false;
                                        break;
                                }
                        }
                        // print the number
                        if(isPrime){
                                
                                System.out.printf("%10d",i);
                                
                                
                        }
                }
        }
}   
   
