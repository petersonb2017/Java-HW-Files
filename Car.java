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
      
      public void addGas(double g)
      {
         double updatedGas;
         System.out.println("***Adding " + g +   " Gallons of Gas***");
         updatedGas = g + gas;
         gas = updatedGas;
      }
      public void drive(double m)
      {
         double currentGas;
         System.out.println("***Driving  " + m + "  Miles***");
         currentGas = gas - (m / mpg);
         gas = currentGas;
      }
      public double getGasInTank()
      {
         return gas;
         
      }
   }