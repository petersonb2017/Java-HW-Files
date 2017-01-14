public class Pet
{
   private String breed;
   private boolean neutered;
   
   public Pet (String s, String b, boolean n, double c, double p)
   {
      species = s;
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
   
   private void setNeutered(boolean n)
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

}