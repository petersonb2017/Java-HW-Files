public class ComplexNumber
{
   private int n;
   private double [] v;
      
   public ComplexNumber (double [] data)
   {
      n = data.length;
      v = new double [n];
      for (int i=0; i<n; i++)
         v[i] = data[i];
         
   }
   
   private int getSize()
   {
      return n;
   }
   
   private double getComponent(int i)
   {
      return v[i];
   }
   
   public void print(String s)
   {
      System.out.println(s + this.getComponent(0) + " + "  + this.getComponent(1)+ "i");
   }
   
   public static ComplexNumber add(ComplexNumber x, ComplexNumber y)
   {
      double sum = 0.0;
      int xsize = x.getSize();
     
      double [] v = new double[2];
      
         for (int i = 0; i < xsize; i++)
            v[i] = y.getComponent(i) + x.getComponent(i);
      
      
      ComplexNumber Result = new ComplexNumber(v);
      return Result;
   }

   public static ComplexNumber subtract(ComplexNumber x, ComplexNumber y)
   {
      double sum = 0.0;
      int xsize = x.getSize();
      
      double [] v = new double[2];
      
         for (int i = 0; i < xsize; i++)
            v[i] = x.getComponent(i) - y.getComponent(i);
   
      ComplexNumber Result = new ComplexNumber(v);
      return Result;
      
   }

   public static ComplexNumber mult(ComplexNumber x, ComplexNumber y)
   {
      double sum = 0.0;
      int xsize = x.getSize();
      
      double [] v = new double[2];
      
      
        v[0] = x.getComponent(0)*y.getComponent(0) - x.getComponent(1)*y.getComponent(1);
        v[1] = x.getComponent(0)*y.getComponent(1) + x.getComponent(1)*y.getComponent(1);
      
      
      ComplexNumber Result = new ComplexNumber(v);
      return Result;
   }

   public static ComplexNumber divide(ComplexNumber x, ComplexNumber y)
   {
      double sum = 0.0;
      int xsize = x.getSize();
      
      double [] v = new double[2];
      
      
      v[0] = (x.getComponent(0)*y.getComponent(0) + x.getComponent(1)*y.getComponent(1)/(y.getComponent(0)*y.getComponent(0)) + y.getComponent(1)*y.getComponent(1));
      v[1] = (x.getComponent(0)*y.getComponent(1) + x.getComponent(1)*y.getComponent(0))/(y.getComponent(0)*y.getComponent(0) + y.getComponent(1)*y.getComponent(1));      
      
      ComplexNumber Result = new ComplexNumber(v);
      return Result;
   }

}