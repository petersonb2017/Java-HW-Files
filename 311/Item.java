import java.util.Scanner;


public class Item implements Comparable<Item>
{
   private String name;
   private int serialNumber;
   
   public Item(String n, int s)
   {
      name = n;
      serialNumber = s;
   }
   
   String getName()
   {
      return name;
   }
   
   int getSerialNumber()
   {
      return serialNumber;
   }

   public int compareTo(Item ite)
   {
   if(this.getSerialNumber()==ite.getSerialNumber())return 0;
   else if(this.getSerialNumber()>ite.getSerialNumber())return 1;
   else return -1;
   }

   /*private void setNeutered(boolean n)
   {
      neutered = n;
   }
   
   private void setSpecies(String s)
   {
      species = s;
   }
   
   private void setBreed(String b)
   {
      breed = b;
   }
   
   private void setCost(double c)
   {
      cost = c;
   }
   
   private void setPrice(double p)
   {
      price = p;
   }
   */

}