import java.util.Date;
import java.math.BigInteger;
import java.io.FileNotFoundException;
import java.lang.Thread.State;
import java.util.Scanner;
import java.sql.Timestamp;
import java.util.Date;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;

public class Lab_5_311
{
   public static void main(String [] args)
   {
      Random rand = new Random();
      Scanner keyboard = new Scanner(System.in);
      long t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
      for(int i = 1; i <= 10;i++)
      {
         int n = 5*i*i;
         System.out.println("n is : " + n);
      
         int[] A = new int[n];
         for(int j = 1; j < A.length-1; j++)
            A[j] = rand.nextInt(n);
         A[0] = 0;
         A[n-1] = n;
         t1 = System.nanoTime();
         mergeSort(A);
         t2 = System.nanoTime();
         //System.out.println("merge : " + (t2-t1));
         
         t3 = System.nanoTime();
         quickSort(A);
         t4 = System.nanoTime();
         System.out.println("quick : " + (t4-t3));
         
         t5 = System.nanoTime();
         //bubbleSort(A);
         t6 = System.nanoTime();
         //System.out.println("bubble : " + (t6-t5));
         
         t7 = System.nanoTime();
         selectionSort1(A);
         t8 = System.nanoTime();
         //System.out.println("selection : " + (t8-t7));
         
         t9 = System.nanoTime();
         InsertionSort(A);
         t10 = System.nanoTime();
         //System.out.println("insertion : " + (t10-t9));
         
         
         
      }
   
   }
   public static void mergeSort(int[] A) {
      if (A.length > 1) 
      {
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
   
   public static void quickSort(int array[]) 
   // pre: array is full, all elements are non-null integers
   // post: the array is sorted in ascending order
   {
      quickSort(array, 0, array.length - 1);              // quicksort all the elements in the array
   }


   public static void quickSort(int array[], int start, int end)
   {
      int i = start;                          // index of left-to-right scan
      int k = end;                            // index of right-to-left scan
   
      if (end - start >= 1)                   // check that there are at least two elements to sort
      {
         int pivot = array[start];       // set the pivot as the first element in the partition
      
         while (k > i)                   // while the scan indices from left and right have not met,
         {
            while (array[i] <= pivot && i <= end && k > i)  // from the left, look for the first
               i++;                                    // element greater than the pivot
            while (array[k] > pivot && k >= start && k >= i) // from the right, look for the first
               k--;                                        // element not greater than the pivot
            if (k > i)                                       // if the left seekindex is still smaller than
               qswap(array, i, k);                      // the right index, swap the corresponding elements
         }
         qswap(array, start, k);          // after the indices have crossed, swap the last element in
                                                // the left partition with the pivot 
         quickSort(array, start, k - 1); // quicksort the left partition
         quickSort(array, k + 1, end);   // quicksort the right partition
      }
      else    // if there is only one element in the partition, do not do any sorting
      {
         return;                     // the array is sorted, so exit
      }
   }

   public static void qswap(int array[], int index1, int index2) 
   // pre: array is full and index1, index2 < array.length
   // post: the values at indices 1 and 2 have been swapped
   {
      int temp = array[index1];           // store the first value in a temp
      array[index1] = array[index2];      // copy the value of the second into the first
      array[index2] = temp;               // copy the value of the temp into the second
   }
   public static void swap(int[] array, int from, int to){
      int temp = array[from];
      array[from] = array[to];
      array[to] = temp;
   }


   public static void selectionSort1(int[] x) {
      for (int i=0; i<x.length-1; i++) {
         for (int j=i+1; j<x.length; j++) {
            if (x[i] > x[j]) {
                //... Exchange elements
               int temp = x[i];
               x[i] = x[j];
               x[j] = temp;
            }
         }
      }
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