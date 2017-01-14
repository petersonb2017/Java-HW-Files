public class Balloon
{
   private double volume;
   private double radius;
   private double surfaceArea;
   
   public Balloon(double air)
   {
      volume = air;
      radius = Math.pow(volume * (0.75) / Math.PI,(1.0/3.0));
      surfaceArea = 4.0*Math.PI*Math.pow(radius,2.0);
   }
   
   public double getRadius()
   {
      return radius;
   }
   
   public double getVolume()
   {
      return volume;
   }
   
   public double  getSurfaceArea()
   {
      return surfaceArea;
   }
   
   public void addAir(double amount)
   {
      volume += amount;
      radius = Math.pow(volume * (0.75) / Math.PI,(1.0/3.0));
      surfaceArea = 4.0*Math.PI*Math.pow(radius,2.0);

      System.out.println("After adding " + amount + " cubic centimeters of air...");
      
   }
}
      