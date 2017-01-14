import java.util.Scanner;
import java.util.Random;

 
public class Selection_Sort
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
    System.out.println("----------------Selection Sort------------");
    t1 = System.nanoTime();
    SelectionSort(a);
    t2 = System.nanoTime();
    System.out.println("The time it took for 1,000 is: " + (t2 - t1));
    
    t1 = System.nanoTime();
    SelectionSort(b);
    t2 = System.nanoTime();
    System.out.println("The time it took for 5,000 is: " + (t2 - t1));
    
    t1 = System.nanoTime();
    SelectionSort(c);
    t2 = System.nanoTime();
    System.out.println("The time it took for 10,000 is: " + (t2 - t1));
    
    t1 = System.nanoTime();
    SelectionSort(d);
    t2 = System.nanoTime();
    System.out.println("The time it took for 500,000 is: " + (t2 - t1));
    
    t1 = System.nanoTime();
    SelectionSort(e);
    t2 = System.nanoTime();
    System.out.println("The time it took for 1,000,000 is: " + (t2 - t1));
    
    t1 = System.nanoTime();
    SelectionSort(f);
    t2 = System.nanoTime();
    System.out.println("The time it took for 5,000,000 is: " + (t2 - t1));
    




   }
   
   public static void SelectionSort ( int [ ] num )
   {
        int i, j, first, temp;  
        for ( i = num.length - 1; i > 0; i--)  
        {
             first = 0;   //initialize to subscript of first element
             for(j = 1; j <= i; j ++)   //locate smallest element between positions 1 and i.
             {
                  if( num[ j ] < num[ first ] )         
                    first = j;
             }
             temp = num[ first ];   //swap smallest found with element in position i.
             num[ first ] = num[ i ];
             num[ i ] = temp; 
         }           
   }
}