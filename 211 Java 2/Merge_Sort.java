import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

 
public class Merge_Sort
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

        System.out.println("----------Merge Sort------------");

    t1 = System.nanoTime();
    mergeSort(a);
    t2 = System.nanoTime();
    System.out.println("The time it took for 1,000 is: " + (t2 - t1));
    
    t1 = System.nanoTime();
    mergeSort(b);
    t2 = System.nanoTime();
    System.out.println("The time it took for 5,000 is: " + (t2 - t1));
    
    t1 = System.nanoTime();
    mergeSort(c);
    t2 = System.nanoTime();
    System.out.println("The time it took for 10,000 is: " + (t2 - t1));
    
    t1 = System.nanoTime();
    mergeSort(d);
    t2 = System.nanoTime();
    System.out.println("The time it took for 500,000 is: " + (t2 - t1));
    
    t1 = System.nanoTime();
    mergeSort(e);
    t2 = System.nanoTime();
    System.out.println("The time it took for 1,000,000 is: " + (t2 - t1));
    
    t1 = System.nanoTime();
    mergeSort(f);
    t2 = System.nanoTime();
    System.out.println("The time it took for 5,000,000 is: " + (t2 - t1));
    




   }
   
    static void mergeSort(int[] A) {
        if (A.length > 1) {
            int q = A.length/2;

            int[] leftArray = Arrays.copyOfRange(A, 0, q);
            int[] rightArray = Arrays.copyOfRange(A,q,A.length);

            mergeSort(leftArray);
            mergeSort(rightArray);

            merge(A,leftArray,rightArray);
        }
    }

    static void merge(int[] a, int[] l, int[] r) {
        int totElem = l.length + r.length;
        //int[] a = new int[totElem];
        int i,li,ri;
        i = li = ri = 0;
        while ( i < totElem) {
            if ((li < l.length) && (ri<r.length)) {
                if (l[li] < r[ri]) {
                    a[i] = l[li];
                    i++;
                    li++;
                }
                else {
                    a[i] = r[ri];
                    i++;
                    ri++;
                }
            }
            else {
                if (li >= l.length) {
                    while (ri < r.length) {
                        a[i] = r[ri];
                        i++;
                        ri++;
                    }
                }
                if (ri >= r.length) {
                    while (li < l.length) {
                        a[i] = l[li];
                        li++;
                        i++;
                    }
                }
            }
        }
        //return a;

    }
}