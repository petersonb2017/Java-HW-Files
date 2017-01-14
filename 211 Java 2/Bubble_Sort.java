import java.util.Scanner;
import java.util.Random;

 
public class Bubble_Sort
{
   public static void main(String[] args) 
   {
    Random r = new Random();

    long t1;
    long t2;
    int a[] = new int [1000];
      for(int i = 0; i < a.length; i++)
         a[i] = r.nextInt(1000000);
    
    int b[] = new int [5000];
      for(int i = 0; i < b.length; i++)
         b[i] = r.nextInt(1000000);
    
    int c[] = new int [10000];
      for(int i = 0; i < c.length; i++)
         c[i] = r.nextInt(1000000);
    
    int d[] = new int [500000];
      for(int i = 0; i < d.length; i++)
         d[i] = r.nextInt(1000000);
    
    int e[] = new int [1000000];
      for(int i = 0; i < e.length; i++)
         e[i] = r.nextInt(1000000);
    
    int f[] = new int [5000000];
      for(int i = 0; i < f.length; i++)
         f[i] = r.nextInt(1000000);
        System.out.println("----------Bubble Sort------------");

    t1 = System.nanoTime();
    BubbleSort(a);
    t2 = System.nanoTime();
    System.out.println("The time it took for 1,000 is: " + (t2 - t1));
    
    t1 = System.nanoTime();
    BubbleSort(b);
    t2 = System.nanoTime();
    System.out.println("The time it took for 5,000 is: " + (t2 - t1));
    
    t1 = System.nanoTime();
    BubbleSort(c);
    t2 = System.nanoTime();
    System.out.println("The time it took for 10,000 is: " + (t2 - t1));
    
    t1 = System.nanoTime();
    BubbleSort(d);
    t2 = System.nanoTime();
    System.out.println("The time it took for 500,000 is: " + (t2 - t1));
    
    t1 = System.nanoTime();
    BubbleSort(e);
    t2 = System.nanoTime();
    System.out.println("The time it took for 1,000,000 is: " + (t2 - t1));
    
    t1 = System.nanoTime();
    BubbleSort(f);
    t2 = System.nanoTime();
    System.out.println("The time it took for 5,000,000 is: " + (t2 - t1));
    




   }
   
   public static void BubbleSort( int [ ] num )
   {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable
   
        while ( flag )
        {
               flag= false;    //set flag to false awaiting a possible swap
               for( j=0;  j < num.length -1;  j++ )
               {
                      if ( num[ j ] < num[j+1] )   // change to > for ascending sort
                      {
                              temp = num[ j ];                //swap elements
                              num[ j ] = num[ j+1 ];
                              num[ j+1 ] = temp;
                             flag = true;              //shows a swap occurred  
                     } 
               } 
         } 
   } 
}