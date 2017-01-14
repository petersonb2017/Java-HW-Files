import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
 
public class Store
{

   private ArrayList<Pet> petList;
   private ArrayList<Supply> supplyList;
   private ArrayList<Employee> employeeList;
   private double balance = 0;

   public  void addNewPet(ArrayList<Pet> pl, Pet pe)
   {
      pl.add(pe);
            System.out.println("Added new pet: " + pe);

   }
   
   private void purchasePet(Pet pe)
   {
      balance = balance - pe.getCost();
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
   }
   
   
   private void hireEmployee(ArrayList<Employee> em, Employee e)
   {
      em.add(e);
   }
   
   private void terminateEmployee(ArrayList<Employee> em, Employee e)
   {
      em.remove(e);
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

   public static void main( String[] args )
   {
      Store o = new Store();
   
      ArrayList<Pet> petList = new ArrayList<Pet>();
      ArrayList<Supply> supplyList = new ArrayList<Supply>();
      ArrayList<Employee> employeeList = new ArrayList<Employee>();
      double balance = 0;
   
      Pet pet1 = new Pet ("Dog", "Poodle", true, 400.00, 500.00);
      Pet pet2 = new Pet ("Fish", "Betta", false, 2.00, 10.00);
      Pet pet3 = new Pet ("Cat", "Tabby", true, 40.00, 50.00);
      Pet pet4 = new Pet ("Hamster", "TeddyBear", false, 0.50, 20.00);
      Pet pet5 = new Pet ("Lizard", "Iguanas", false, 30.00, 125.00);
      Pet pet6 = new Pet ("Mointy", "Sheltie", true, 500.00, 2000000.00);
   
      Supply sup1 = new Supply ("Dog Food", 20, 5.00, 15.00);
      Supply sup2 = new Supply ("Cat Food", 20, 5.00, 15.00);
      Supply sup3 = new Supply ("Fish Food", 15, 3.00, 6.00);
      Supply sup4 = new Supply ("Leash", 12, 4.00, 12.00);
      Supply sup5 = new Supply ("Wood Chips", 5, 2.00, 5.00);
   
      Employee emp1 = new Employee ("Franklin", "Clerk", 9.50, 20);
      Employee emp2 = new Employee ("Jen", "Manager", 15.50, 35);
      Employee emp3 = new Employee ("Jeff", "Janitor", 11.00, 30);
      Employee emp4 = new Employee ("Iris", "Manager", 15.50, 35);
      Employee emp5 = new Employee ("Sam", "Clerk", 9.50, 20);
      
      o.addNewPet(petList, pet1);
      o.addNewPet(petList, pet2);
      o.addNewPet(petList, pet3);
      o.addNewPet(petList, pet4);
      o.addNewPet(petList, pet5);
      o.addNewPet(petList, pet6);
   
      o.addNewSupply(supplyList, sup1);
      o.addNewSupply(supplyList, sup2);
      o.addNewSupply(supplyList, sup3);
      o.addNewSupply(supplyList, sup4);
      o.addNewSupply(supplyList, sup5);
   
      o.hireEmployee(employeeList, emp1);
      o.hireEmployee(employeeList, emp2);
      o.hireEmployee(employeeList, emp3);
      o.hireEmployee(employeeList, emp4);
      o.hireEmployee(employeeList, emp5);
   
      o.listPets(petList);
      o.listSupply(supplyList);
      o.listEmployee(employeeList);
   
      o.computePayroll(employeeList);
      o.computeSupplyValue(supplyList);
      o.computePetStockValue(petList);
   
      o.sellPet(petList, pet1);
      o.terminateEmployee(employeeList, emp2);
   
      o.addNewPet(petList, pet1);
   
      o.listPets(petList);
      o.listSupply(supplyList);
      o.listEmployee(employeeList);
   
      o.couputePorportionNeutered(petList);
   
      System.out.println(balance);
   
   }
}