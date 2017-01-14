   import java.util.Scanner;    // Scanner Library, to enter data from keyboard
   import java.lang.Math;       // Math Library
   import java.util.ArrayList;
	
   public class nVector implements WierdInterface // 
   {
	   private double []v;
	   private int numberOfRooms;
	   private int value;
		
		public nVector(double [] vv)
		{
         int n = vv.length;
         v = new double[n];
         for (int i = 0; i < n; i++)
            v[i] = vv[i];
		}
      public double getComponent(int i)
      {
         return v[i];
      }
      public double getLength()
      {
         return v.length;
      }
      public double dotProduct(nVector nv)
      {
         if (v.length != nv.getLength())
         {
            System.out.println("*** ERROR *** Size Mismatch!");
            return 0.0;
         }
         
         double sum = 0.0;
         for (int i = 0; i < v.length; i++)
            sum += v[i]*nv.getComponent(i);
         return sum;
      }
      
	   public int getSize()
		{
		   return v.length;
		}
	   public double getValue()
		{
		   double val = 0.0;
         for (int i = 0; i<v.length; i++)
            val += v[i]*v[i];
         return Math.sqrt(val);
		}
      public String getType()
      {
         return("Vector");
      }		 	
   }
