public class Lab_5
{
   public static void main(String[] args)
   {
      
      int p = 0xA2C5;
      int q = 2134123;
      
      System.out.println("The value of p is: " + Integer.toBinaryString(p));
      System.out.println("The value of q is: " + Integer.toBinaryString(q));
      System.out.println("The result of p<<2: " + Integer.toBinaryString(p << 2));
      System.out.println("The result of q>>3: " + Integer.toBinaryString(q>>3));
      System.out.println("The result of p&q: " + Integer.toBinaryString(p&q));
      System.out.println("The result of p|q: " + Integer.toBinaryString(p|q));
      System.out.println("The result of p^q: " + Integer.toBinaryString(p^q));
      
   }
}