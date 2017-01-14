   import java.util.Scanner;

   public class PurchaseItem
   {
      private String name;
      private double price;
      private int quality;
      private double tax;
      private double weight;
      private String color;
   
      public PurchaseItem (String n, double p, int q, double t, double w, String c)
      {
          name = n;
          price = p;
          quality = q;
          tax = t;
          weight = w;
          color = c;
        }
     public String getName()
            {
            return name;
            }
     public double getPrice()
     {
            return price;
            }
     public void setPrice(double p)
     {
            price = p;
            }
     public double getTax()
     {
            return tax;
            }
     public void setTax(double t)
     {
            tax = t;
            }

     public int getQuality()
     {
            return quality;
            }
     public void setQuality(int q)
     {
            quality = q;
            }

     public double getWeight()
     {
            return weight;
            }
     public void setWeight(double w)
     {
            weight = w;
            }

     public String getColor()
     {
            return color;
            }
     public void setColor(String c)
     {
            color = c;
            }

   }