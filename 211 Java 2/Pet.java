public class Pet
{
   private String species;
   private String breed;
   private boolean neutered;
   private double cost;
   public double price;
   
   public Pet (String sp, String b, boolean n, double c, double p)
   {
      species = sp;
      breed = b;
      neutered = n;
      cost = c;
      price = p;
   }
   
   String getSpecies()
   {
      return species;
   }
   
   String getBreed()
   {
      return breed;
   }
   
   boolean getNeutered()
   {
      return neutered;
   }
   
   double getCost()
   {
      return cost;
   }
   
   double getPrice()
   {
      return price;
   }
   
   public void setNeutered(boolean n)
   {
      neutered = n;
   }
   
   public void setSpecies(String sp)
   {
      species = sp;
   }
   
   public void setBreed(String b)
   {
      breed = b;
   }
   
   public void setCost(double c)
   {
      cost = c;
   }
   
   private void setPrice(double p)
   {
      price = p;
   }

}