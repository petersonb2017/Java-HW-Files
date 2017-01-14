   import java.util.Scanner;            
 
   public class Car    
   {
      private String name;
      private double mpg;
      private double gas;
            
      
      public Car(String carName, double fuelEfficiency, double gasInTank)
      {
         name = carName;
         mpg = fuelEfficiency;
         gas = gasInTank;
      }
      public String getName()
      {
         return name;
      }
      public double drive(int m)
      {
         return mpg * m;
      }
      public double addGas(int g)
      {
         return gas + g;
      }
   }