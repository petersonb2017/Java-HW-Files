import java.util.Scanner;
import java.util.Random;

 
public class Insertion_Sort
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
    System.out.println("----------Insertion Sort------------");

    t1 = System.nanoTime();
    InsertionSort(a);
    t2 = System.nanoTime();
    System.out.println("The time it took for 1,000 is: " + (t2 - t1));
    
    t1 = System.nanoTime();
    InsertionSort(b);
    t2 = System.nanoTime();
    System.out.println("The time it took for 5,000 is: " + (t2 - t1));
    
    t1 = System.nanoTime();
    InsertionSort(c);
    t2 = System.nanoTime();
    System.out.println("The time it took for 10,000 is: " + (t2 - t1));
    
    t1 = System.nanoTime();
    InsertionSort(d);
    t2 = System.nanoTime();
    System.out.println("The time it took for 500,000 is: " + (t2 - t1));
    
    t1 = System.nanoTime();
    InsertionSort(e);
    t2 = System.nanoTime();
    System.out.println("The time it took for 1,000,000 is: " + (t2 - t1));
    
    t1 = System.nanoTime();
    InsertionSort(f);
    t2 = System.nanoTime();
    System.out.println("The time it took for 5,000,000 is: " + (t2 - t1));
    




   }
   
   public static void InsertionSort( int [ ] num)
   {
        int j;                     // the number of items sorted so far
        int key;                // the item to be inserted
        int i;  
   
        for (j = 1; j < num.length; j++)    // Start with 1 (not 0)
       {
              key = num[ j ];
              for(i = j - 1; (i >= 0) && (num[ i ] < key); i--)   // Smaller values are moving up
             {
                    num[ i+1 ] = num[ i ];
             }
            num[ i+1 ] = key;    // Put the key in its proper location
        }
   } 
}