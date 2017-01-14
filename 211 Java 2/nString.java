   import java.util.Scanner;    // Scanner Library, to enter data from keyboard
   import java.lang.Math;       // Math Library
   import java.util.ArrayList;
	
   public class nString implements WierdInterface // 
   {
	   private String s;
      private int size;
      private double value;
		
		public nString(String ss)
		{
		   s = ss;
		}

	   public int getSize()
		{
		   return s.length();
		}
	   public double getValue()
		{
		   return 3.14;
		}
      public String getType()
      {
         return("String");
      }		 	
      public String encode()
      {
         int n = s.length();
         char [] c = new char[n];
         for (int i = 0; i < n; i++)
         {
            if (s.charAt(i) >= 65 & s.charAt(i) <= 90)
               c[i] = (char)((((s.charAt(i) - 65) + 7) % 26)  + 65);
            else if (s.charAt(i) >= 97 & s.charAt(i) <= 122)
               c[i] = (char)((((s.charAt(i) - 97) + 7) % 26)  + 97);
            else if (s.charAt(i) >= 48 & s.charAt(i) <= 57)
               c[i] = (char)((((s.charAt(i) - 48) + 7) % 10)  + 48);
            else
               c[i] = s.charAt(i);
         }   
         return(String.valueOf(c));
      }		 	
   }
