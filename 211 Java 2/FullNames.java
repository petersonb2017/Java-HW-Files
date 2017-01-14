   import java.util.Scanner;    // Scanner Library, to enter data from keyboard
   import java.lang.Math;       // Math Library
   import java.util.ArrayList;
	
   public class FullNames implements ComparisonInterface // 
   {
	   private String fullName;
	   private int socialSecurityNumber;
		
		public FullNames(String fn, int ssn)
		{
		   fullName = fn;
			socialSecurityNumber = ssn;
		}

	   public String getFullName()
		{
			return fullName;
		}
		
	   public int getSSN()
		{
			return socialSecurityNumber;
		}
		
	   public int compareAandBInt(int x)
		{
		   if (x > socialSecurityNumber)
			   return 1;
			else if (x < socialSecurityNumber)
			   return -1;
			else 
			   return 0;
		}
				 	
	   public int compareAandBString(String s)
		{
		   if (s.compareTo(fullName) > 0)
			   return 1;
			else if (s.compareTo(fullName) < 0)
			   return -1;
			else 
			   return 0;
		}		 	
   }
