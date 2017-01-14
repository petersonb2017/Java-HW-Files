   import java.util.Scanner;    // Scanner Library, to enter data from keyboard
   import java.lang.Math;       // Math Library
   import java.util.ArrayList;
	
   public class HomesData implements ComparisonInterface // 
   {
	   private String address;
	   private int numberOfRooms;
	   private int value;
		
		public HomesData(String a, int n, int v)
		{
		   address = a;
			numberOfRooms = n;
			value = v;
		}

	   public String getAddress()
		{
			return address;
		}
		
	   public int getNumberOfRooms()
		{
			return numberOfRooms;
		}
		
	   public int getValue()
		{
			return value;
		}
		
	   public int compareAandBInt(int x)
		{
		   if (x > value)
			   return 1;
			else if (x < value)
			   return -1;
			else 
			   return 0;
		}
				 	
	   public int compareAandBString(String s)
		{
		   if (s.compareTo(address) > 0)
			   return 1;
			else if (s.compareTo(address) < 0)
			   return -1;
			else 
			   return 0;
		}		 	
   }
