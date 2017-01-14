import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.Integer;
import java.util.Collections;

public class ItemTesterLab_8
{
   AvlTree<Item> atree = new AvlTree<Item>();
   //AvlNode<Item> anode = new AvlNode<>();
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner in = new Scanner(System.in);
      ArrayList<Integer> maxList1 = new ArrayList<Integer>();
      ArrayList<Integer> maxList2 = new ArrayList<Integer>();
      
      char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 
         'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
      
      //System.out.println("enter int n corosponding to n items: ");
      for(int p = 0; p < 25; p++)
      {
         int n = 20 + p*5*5*p;
         
         //maxList = new int[n];
         
         Random rand = new Random();
         ArrayList<Item> itemList = new ArrayList<Item>();
         ArrayList<Item> tempList = new ArrayList<Item>();
         AvlTree<Item> t1 = new AvlTree<>();
         int t1sum = 0;
         int t2sum = 0;
         AvlTree<Item> t2 = new AvlTree<>();
         long f1;
         long f2;
      
         for(int i = 0; i < n; i++)
         {
            char[] temp = new char[20];
            for(int j = 0; j < 20; j++)
            {
               temp[j] = alphabet[rand.nextInt(26)];
            }
            String tempName = new String(temp);
            int tempint = rand.nextInt((100*n)-1);
            Item it = new Item(tempName, tempint);
            itemList.add(it);
         }
         f1 = System.nanoTime();
         for(int i = 0; i < itemList.size(); i++)t1.insert(itemList.get(i));
      
      //System.out.println((t1.findMax()).getSerialNumber());
      //t1.printTree();
      
         File outFile = new File("AVLOutput.txt");
         PrintWriter writer = new PrintWriter(outFile);
      
         while(t1.findMin() != null)
         {
         //System.out.println(t1.findMin().getSerialNumber());
            writer.println(t1.findMin().getSerialNumber() + "   " + t1.findMin().getName());
            t1sum += t1.height(t1.getRoot());
            maxList1.add(t1.height(t1.getRoot()));
            tempList.add(t1.findMin());
            t1.remove(t1.findMin());
            if(t1.findMin()==null)
               break;
         }
         bubblesrt(itemList);
         for(int i = 0; i < itemList.size(); i++)
         {
         //System.out.println(itemList.get(i).getName());
            t2.insert(itemList.get(i));
         }
      
         while(t2.findMin() != null)
         {
            writer.println(t1.findMin().getSerialNumber() + "   " + t1.findMin().getName());
            t2sum += t2.height(t2.getRoot());
            maxList2.add(t2.height(t2.getRoot()));
            t2.remove(t2.findMin());
            if(t2.findMin()==null)
               break;
         }
         f2 = System.nanoTime();
         Collections.sort(maxList1);
         Collections.sort(maxList2);
      
      //System.out.println("The average node depth of the first tree with n = " + n + " is: " + (((double)t1sum)/n));
      //System.out.println("The average node depth of the second tree with n = " + n + " is: " + (((double)t2sum)/n));
         System.out.println("The max node depth of the first tree with n = " + n + " is: " + maxList1.get(maxList1.size()-1));
         System.out.println("The max node depth of the second tree with n = " + n + " is: " + maxList2.get(maxList2.size()-1));
         //System.out.println("The Time it took for n  = " + n + " is : " + (f2-f1));
      
         writer.close();
         //System.out.println(t.checkBalance(t));
         //System.out.println(t.height(t));
      }
   
   }
   public static void bubblesrt(ArrayList<Item> list)
   {
      Item temp;
      if (list.size()>1) // check if the number of orders is larger than 1
      {
         for (int x=0; x<list.size(); x++) // bubble sort outer loop
         {
            for (int i=0; i < list.size()-i; i++) {
               if (list.get(i).getName().compareTo(list.get(i+1).getName()) > 0)
               {
                  temp = list.get(i);
                  list.set(i,list.get(i+1) );
                  list.set(i+1, temp);
               }
            }
         }
      }
   
   }
}