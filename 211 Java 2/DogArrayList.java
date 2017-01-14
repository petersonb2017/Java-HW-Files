import java.util.Scanner;    // Library for keyboard input
import java.util.ArrayList;
 
public class DogArrayList      // Class name
{
   public static void main( String[] args )   // Single method for this class: "main"
   {
      Scanner in = new Scanner(System.in);
      ArrayList<Dog> dogList = new ArrayList<Dog>();
      boolean moreDogs = true;
      String dogBreed = "";
      do {
         System.out.println("Next Dog...");
         System.out.print("     Enter Breed: ");
         dogBreed = getBreed();
         System.out.print("     Enter Neutered (true or false): ");
         boolean dogNeutered = in.nextBoolean();
         
         Dog newDog = new Dog(dogBreed, dogNeutered);
         dogList.add(newDog);
         
         System.out.println();
         System.out.printf("More Dogs to add??  true / false: ");
         moreDogs = in.nextBoolean();
         } while (moreDogs == true);
         
      int count = dogList.size();
      
      System.out.println("       Breed                  Neutered");
      System.out.println("--------------------------------------");
      for (int i = 0; i < count; i++)
         System.out.printf("%3d   %-20s    %-7s \n", i, 
                  dogList.get(i).getBreed(), dogList.get(i).getNeutered());
                  
      int neuteredCount = 0;
      for (Dog d : dogList)
         if (d.getNeutered())  neuteredCount++;
         
      System.out.println("%nThe number     of neutered dogs is %d%n", neuteredCount);
      System.out.printf("%nThe proportion of neutered dogs is %5.3f%n", 
                        (double) neuteredCount / dogList.size() );
      
   }
   
   public static String getBreed()
   {
       Scanner in2 = new Scanner(System.in);
       return in2.nextLine();
   }

}