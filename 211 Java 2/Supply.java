public class Supply
{
   private String itemName;
   private int quantity;
   private double orderCost;
   private double saleCost;
   
   public Supply (String i, int q, double o, double p)
   {
      itemName = i;
      quantity = q;
      orderCost = o;
      saleCost = p;
   }
   
   String getItemName()
   {
      return itemName;
   }
   
   int getQuantity()
   {
      return quantity;
   }
   
   double getOrderCost()
   {
      return orderCost;
   }
   
   double getSaleCost()
   {
      return saleCost;
   }
   
   private void setItemName(String i)
   {
      itemName = i;
   }
   
   private void setQuantity(int q)
   {
      quantity = q;
   }
   
   private void setOrderCost(double o)
   {
      orderCost = o;
   }
   
   private void setSaleCost(double p)
   {
      saleCost = p;
   }

}