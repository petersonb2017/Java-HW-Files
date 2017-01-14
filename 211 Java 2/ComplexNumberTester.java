public class ComplexNumberTester
{
   public static void main(String[] args)      
   {
      double [] vv = {1, 2};
      double [] ww = {2, -5};
      ComplexNumber v = new ComplexNumber(vv);
      ComplexNumber w = new ComplexNumber(ww);
      v.print("v = ");
      w.print("w = ");
      
      ComplexNumber.mult(v,w).print("v X w = ");
      ComplexNumber.add(v,w).print("v + w = ");
      ComplexNumber.subtract(v,w).print("v - w = ");
      ComplexNumber.divide(w,v).print("v/w = ");
   }
   
}