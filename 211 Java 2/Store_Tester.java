import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
 
public class Store_Tester
{

   private ArrayList<Pet> petList;
   private ArrayList<Supply> supplyList;
   private ArrayList<Employee> employeeList;
   private double balance = 0;

   private void addNewPet(ArrayList<Pet> pl, Pet pe)
   {
      pl.add(pe);
      System.out.println("Added new pet: " + pe);
   }
   
   private void purchasePet(ArrayList<Pet> pl, Pet pe)
   {
      pl.add(pe);
      balance = balance - pe.getCost();
      System.out.println("Purchase pet: " + pe);

   }
   
   private void sellPet(ArrayList<Pet> pl, Pet pe)
   {
      System.out.println("-------------------------------------------------------");
      System.out.println("Pet " + pe.getBreed() + " Removed");
      pl.remove(pe);
      balance = balance + pe.getPrice();
      System.out.println("-------------------------------------------------------");
   }
   
   private void addNewSupply(ArrayList<Supply> sl, Supply su)
   {
      sl.add(su);
      System.out.println("Added new supply: " + su);

   }
   
   
   private void hireEmployee(ArrayList<Employee> em, Employee e)
   {
      em.add(e);
      System.out.println("Hired new Employee: " + e);

   }
   
   private void terminateEmployee(ArrayList<Employee> em, Employee e)
   {
      em.remove(e);
      System.out.println("Fired Employee: " + e);

   }
   
   private void listPets(ArrayList<Pet> pl)
   {
      
      System.out.println("Species     Breed       Neutered  Cost      Price");
      System.out.println("--------------------------------------------------");
      for(int i = 0; i < (int)pl.size(); i++){
         System.out.printf("%-10s %-10s %-5s %10.2f %10.2f\n", pl.get(i).getSpecies(), pl.get(i).getBreed(), pl.get(i).getNeutered(), (double)pl.get(i).getCost(), (double)pl.get(i).getPrice());
      }
      System.out.println("-------------------------------------------------------");
   }
   
   private void listSupply(ArrayList<Supply> sl)
   {
      System.out.println("Name      Quantity       Purchase Cost        Sale Cost");
      System.out.println("-------------------------------------------------------");
      for(int i = 0; i < (int)sl.size(); i++){
         System.out.printf("%-10s %-10s %15.2f %13.2f\n", sl.get(i).getItemName(), sl.get(i).getQuantity(), (double)sl.get(i).getOrderCost(), (double)sl.get(i).getSaleCost());
      }
      System.out.println("-------------------------------------------------------");
   }
   
   private void listEmployee(ArrayList<Employee> em)
   {
      System.out.println("Name      Position        Salary              Hour per Week");
      System.out.println("-------------------------------------------------------");
      for(int i = 0; i < (int)em.size(); i++){
         System.out.printf("%-10s %-10s %15.2f %13.2f\n", em.get(i).getName(), em.get(i).getPosition(), (double)em.get(i).getSalary(), (double)em.get(i).getHourPerWeek());
      }
      System.out.println("-------------------------------------------------------");
   }
   
   private void computePayroll(ArrayList<Employee> em)
   {
      double sum = 0;
      System.out.println("-------------------------------------------------------");
      for(int i = 0; i < (int)em.size(); i++){
         sum += em.get(i).getSalary()*em.get(i).getHourPerWeek();
      }
      System.out.println("The Payroll Cost Per Week: " + sum);
      System.out.println("-------------------------------------------------------");
   }
   
   private void computeSupplyValue(ArrayList<Supply> sl)
   {
      double sum = 0;
      System.out.println("-------------------------------------------------------");
      for(int i = 0; i < (int)sl.size(); i++){
         sum += sl.get(i).getSaleCost();
      }
      System.out.println("The Supply Value: " + sum);
      System.out.println("-------------------------------------------------------");
   }
   
   private void computePetStockValue(ArrayList<Pet> pl)
   {
      double sum = 0;
      System.out.println("-------------------------------------------------------");
         for(int i = 0; i < (int)pl.size(); i++){
            sum += pl.get(i).getPrice();
         }
      System.out.println("The Pet Stock Value: " + sum);
      System.out.println("-------------------------------------------------------");
   }
   
   private void couputePorportionNeutered(ArrayList<Pet> pl)
   {
      System.out.println("-------------------------------------------------------");
      int neu = 0;
      int not = 0;
      for(int i = 0; i < (int)pl.size(); i++){
         if(pl.get(i).getNeutered() == true){
            neu++;
            not++;
         }
         else{
            not++;
         }
      }
      System.out.println("The Porportion of Neutered Pets: " + (double)neu/(double)not);
      System.out.println("-------------------------------------------------------");
   }

   public static void main( String[] args ) throws FileNotFoundException
   {
      Store_Tester o = new Store_Tester();
   
      ArrayList<Pet> petList = new ArrayList<Pet>();
      ArrayList<Supply> supplyList = new ArrayList<Supply>();
      ArrayList<Employee> employeeList = new ArrayList<Employee>();
      double balance = 0;
      
      Scanner keyboard = new Scanner(System.in);
			

      String inputFileName = "PetStoreInput.txt"; // get NAME of input file

      String outputFileName = "PetStoreOutput.txt";    // get NAME of output file
      
      File inputFile = new File(inputFileName); // pointer to  input FILE
      
      File outputFile = new File(outputFileName);
      
      Scanner inFile = new Scanner(inputFile);  // Scanner for input FILE
      
      inFile.useDelimiter("[^A-za-z0-9 ']+");
            
      PrintWriter out = new PrintWriter(outputFileName); // pointer to output FILE
      
		   int lineNumber = 1;
         int petCount = 0;
         while (inFile.hasNextLine())
         {
            
            String command = inFile.next();
            
            if (command.equals("one")){
               System.out.println("**************adding new pet**********");
               
               out.println("**************adding new pet**********");
               
               String species = inFile.next();
               
               String breed = inFile.next();
               
               boolean neutered;
                  if(inFile.next().equals("true"))
                     neutered = true;
                  else neutered = false;
                 
               double price = inFile.nextDouble();
               
               double cost = inFile.nextDouble();
                
               Pet petnum = new Pet (species, breed, neutered, price, cost);
               o.addNewPet(petList, petnum);
               //System.out.println(petList.get(1));
               
            }else if (command.equals("two")){
               System.out.println("**************Adding New Item**********");
               out.println("**************adding new Item**********");
               String itemName = inFile.next();
               
               int quantity = inFile.nextInt();
                 
               double price = inFile.nextDouble();
               
               double cost = inFile.nextDouble();
               
               Supply itemnum = new Supply (itemName, quantity, price, cost);
               
               o.addNewSupply(supplyList, itemnum);
               
            }else if (command.equals("three")){
               System.out.println("**************Hiring new Employee**********");
               out.println("**************Hiring new Employee**********");
               String name = inFile.next();
               
               String position = inFile.next();
                 
               double salaryPerHour = inFile.nextDouble();
               
               double hrPerWeek = inFile.nextDouble();
               
               Employee empnum = new Employee (name, position, salaryPerHour, hrPerWeek);
               o.hireEmployee(employeeList, empnum);
               
            }else if (command.equals("four")){
               System.out.println("**************Terminate**********");
               out.println("**************Terminate Employee**********");
               String name = inFile.next();
               
               for(int i = 0; i < employeeList.size(); i++){
                  if((employeeList.get(i).getName()).equals(name) ){
                  o.terminateEmployee(employeeList, employeeList.get(i));
                  System.out.println(name);
                  }else;
               }

               
            }else if (command.equals("five")){
               System.out.println("**************Puchasing new pet**********");
               out.println("**************Purchasing new Pet**********");
               String species = inFile.next();
               
               String breed = inFile.next();
               
               boolean neutered;
                  if(inFile.next().equals("true"))
                     neutered = true;
                  else neutered = false;
                 
               double price = inFile.nextDouble();
               double cost = inFile.nextDouble();
               
               Pet pet1 = new Pet (species, breed, neutered, price, cost);
               o.purchasePet(petList, pet1);
               
            }else if (command.equals("six")){
               System.out.println("**************sell  pet**********");
               out.println("**************Sell Pet**********");
               String species = inFile.next();
               
               String breed = inFile.next();
               
               boolean neutered;
                  if(inFile.next().equals("true"))
                     neutered = true;
                  else neutered = false;
                 
               double price = inFile.nextDouble();
               double cost = inFile.nextDouble();
               
               for(int i = 0; i < petList.size(); i++)
               {
                  if((petList.get(i).getSpecies()).equals(species) && (petList.get(i).getBreed()).equals(breed) && 
                  petList.get(i).getNeutered() == neutered && petList.get(i).getPrice() == cost && petList.get(i).getCost() == price)
                  {
                  o.sellPet(petList, petList.get(i));
                  System.out.println(breed);
                  }else;
               }

               
            }else if (command.equals("seven")){
               System.out.println("**************Compute Payroll**********");
               out.println("**************Compute Payroll**********");

               o.computePayroll(employeeList);
               
            }else if (command.equals("eight")){
               System.out.println("**************Compute Supply Value**********");
               out.println("**************Compute Supply Value**********");
               o.computeSupplyValue(supplyList);
               double sum = 0;
               out.println("-------------------------------------------------------");
               for(int i = 0; i < (int)supplyList.size(); i++){
                  sum += supplyList.get(i).getSaleCost();
                  }
               out.println("The Supply Value: " + sum);
               out.println("-------------------------------------------------------");

                              
            }else if (command.equals("nine")){
               System.out.println("**************Compute Pet Stock Value**********");
               out.println("**************Compute Pet Stock Value**********");
               o.computePetStockValue(petList);
            
            }else if (command.equals("ten")){
               System.out.println("**************List Employee**********");
               out.println("**************List Employee**********");
               o.listEmployee(employeeList);
               
            }else if (command.equals("eleven")){
               System.out.println("**************List Pets**********");
               out.println("**************List Pets**********");
               o.listPets(petList);
               out.close();
                  
            }else if (command.equals("twelve")){
               System.out.println("**************List Supply**********");
               out.println("**************List Supply**********");
               o.listSupply(supplyList);
                  
            }else System.out.println("nothing");
            
         }
			
         // Close both input and output files
         
         out.close();

   }
}