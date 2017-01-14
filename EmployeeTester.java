import java.util.Scanner;

public class EmployeeTester
{
   
   public static void main(String[] args)
   {
   
      Employee a = new Employee("Bailey Peterson", 1000000000);
      
      System.out.println("Employee Name:   " + a.getName());
      System.out.println("Employee Salary:   " + a.getSalary());
      System.out.println("");
      System.out.println("");
      a.raiseSalary(100);
      System.out.println("If Bailey gets a 100% raise his slary will be:   " + a.getSalary());
      System.out.println();
      System.out.println();  
   
   
   

   }

}