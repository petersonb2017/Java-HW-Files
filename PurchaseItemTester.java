   import java.util.Scanner;

/**
  Dice class
*/

   public class PurchaseItemTester
   {
         public static void main(String[] args)
      {
          PurchaseItem i1 = new PurchaseItem("Folger's Coffee", 8.49, 2, 0, 1, "Red");
          PurchaseItem i2 = new PurchaseItem("Kitty Litter", 3.26, 4, 0.0925, 20, "Brown");
          PurchaseItem i3 = new PurchaseItem("Mug", 4.00, 4, 0.0925, 0.25, "Blue");
          PurchaseItem i4 = new PurchaseItem("Salt", 2.50, 4, 0.0925, 2, "White");
          PurchaseItem i5 = new PurchaseItem("Honey Bunches of Oats", 3.49, 4, 0.0925, 1.25, "Yellow");
         

          
         System.out.println(i1.getName() + "  " + i1.getPrice() + "  " + i1.getQuality() +"  "+ i1.getTax() +"  "+ i1.getWeight() +"  "+ i1.getColor());
         
         System.out.println(i2.getName() + "  " + i2.getPrice() + "  " + i2.getQuality() +"  "+ i2.getTax() +"  "+ i2.getWeight() +"  "+ i2.getColor());
         
         System.out.println(i3.getName() + "  " + i3.getPrice() + "  " + i3.getQuality() +"  "+ i3.getTax() +"  "+ i3.getWeight() +"  "+ i3.getColor());
         
         System.out.println(i4.getName() + "  " + i4.getPrice() + "  " + i4.getQuality() +"  "+ i4.getTax() +"  "+ i4.getWeight() +"  "+ i4.getColor());
         
         System.out.println(i5.getName() + "  " + i5.getPrice() + "  " + i5.getQuality() +"  "+ i5.getTax() +"  "+ i5.getWeight() +"  "+ i5.getColor());
     




      }
   }
		  
