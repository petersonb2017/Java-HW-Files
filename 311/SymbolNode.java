   public class SymbolNode
   {
      String symbol;
		double probability;
      String code;
      int codeLength;
         
      public SymbolNode(String s, double p, String c, int l)
      {
         symbol = s;
			probability = p;
         code = c;
         codeLength = c.length();
      }
      
      String getSymbol()
      {
         return symbol;
      } 
       
      double getProbability()
      {
         return probability;
      }  
      
      String getCode()
      {
         return code;
      }  
      
      int getCodeLength()
      {
         return codeLength;
      }  
   }
