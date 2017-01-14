public class CarTester
{

   
   public static void main(String[] args)
   {
      Car a = new Car("Civic", 50.0, 0.0);
            
      System.out.println("Car Name:   " + a.getName());
      System.out.println("");
      a.addGas(20.0);
      System.out.println("");
      System.out.println("Gas In Tank:  " + a.getGasInTank());
      System.out.println("");
      a.drive(100.0);
      System.out.println("");
      System.out.println("Gas Left In Tank:  " + a.getGasInTank());
    
   }
}