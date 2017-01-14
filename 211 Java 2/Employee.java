public class Employee
{
   private String name;
   private String position;
   private double salary;
   private double hourPerWeek;
   
   public Employee (String n, String p, double s, double h)
   {
      name = n;
      position = p;
      salary = s;
      hourPerWeek = h;
   }
   
   String getName()
   {
      return name;
   }
   
   String getPosition()
   {
      return position;
   }
   
   double getSalary()
   {
      return salary;
   }
   
   double getHourPerWeek()
   {
      return hourPerWeek;
   }
   
   private void setName(String n)
   {
      name = n;
   }
   
   private void setPosition(String p)
   {
      position = p;
   }
   
   private void setSalary(double s)
   {
      salary = s;
   }
   
   private void setHourPerWeek(double h)
   {
      hourPerWeek = h;
   }

}