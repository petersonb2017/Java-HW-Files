   import java.util.Scanner;    // Scanner Library, to enter data from keyboard
   import java.lang.Math;       // Math Library
   import java.util.ArrayList;
	
   public class WierdOperationsTester // 
   {		
      public static void main(String[] args)
      {
         nString s1 = new nString("Woof");
         nString s2 = new nString("Agent 007 was a GREAT agent!");
         nVector v1 = new nVector(new double []{1, 2, 3});
         
         WierdInterface w1 = s1;
         WierdInterface w2 = v1;
         System.out.println(s1.getType() + " " +  w1.getType());
         System.out.println(v1.getType() + " " +  w2.getType());
         System.out.println(v1.getSize() + " " +  w2.getSize());
         System.out.println(w1.getType() + " " +  w2.getType());
         w2 = s1;
         w1 = v1;
         System.out.println(w1.getType() + " " +  w2.getType());
         System.out.println(s2.encode());
         //System.out.println(w2.encode());      // Can't 
         //System.out.println(w1.getComponent(2));  // Can't
         
         nString s3 = new nString("I can't wait til summer");
         nVector v3 = new nVector(new double [] {3, 1, 4, 1, 5, 9, 2, 6, 5, 3});
         double dp = v3.dotProduct(v3);
         double comp = v3.getComponent(3);
         System.out.println(dp);
         System.out.println(comp);
         WierdInterface w3 = s3;
         WierdInterface w4 = v3;
         //System.out.println(w3.encode());
         System.out.println(((nString)w3).encode());
         
         
      
      }
   }
