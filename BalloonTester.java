public class BalloonTester
{
   public static void main( String [] args)
   {
      Balloon b1 = new Balloon(100);
      System.out.println("The Balloon's volume is: " + b1.getVolume() + " cubic centimeters");
      System.out.printf("The Balloon's radius is: %1.2f centimeters",b1.getRadius());
      System.out.println();
      System.out.printf("The Balloon's surface area is: %1.2f square centimeters \n",b1.getSurfaceArea());
      System.out.println();
      b1.addAir(100);
      System.out.println();
      System.out.println("The Balloon's volume is: " + b1.getVolume() + " cubic centimeters");
      System.out.printf("The Balloon's radius is: %1.2f centimeters",b1.getRadius());
      System.out.println();
      System.out.printf("The Balloon's surface area is: %1.2f square centimeters",b1.getSurfaceArea());
   }
}