public class State
{
   private int area;
   private String name;
   
   State(String n, int a)
   {
   name = n;
   area = a;
   }
   public int getArea()
   {
   return area;
   }
   
   String getName() 
   {
   return name;
   }
}