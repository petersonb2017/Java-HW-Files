   public class HuffmanNode
   {
      //SymbolNode sNode;
      String symbol;
		double probability;
      String code;
      int codeLength;
      HuffmanNode left;
      HuffmanNode right;
      HuffmanNode right1;
      HuffmanNode right2;
      HuffmanNode right3;
      HuffmanNode right4;
      HuffmanNode right5;
      HuffmanNode right6;
      HuffmanNode right7;

   
      // HuffmanNode(SymbolNode sN, HuffmanNode lt,  HuffmanNode rt)
      //HuffmanNode(String s, double p, HuffmanNode lt,  HuffmanNode rt)
      //{
         //sNode = sN;
      //   symbol = s;
      //   probability = p;
      //   left = lt;
      //   right = rt; 
      //}
      
      HuffmanNode(String s, double p, HuffmanNode lt,  HuffmanNode rt, HuffmanNode rt1,
      HuffmanNode rt2,  HuffmanNode rt3, HuffmanNode rt4, HuffmanNode rt5,  HuffmanNode rt6, HuffmanNode rt7)
      {
         //sNode = sN;
         symbol = s;
         probability = p;
         left = lt;
         right = rt;
         right1 = rt1;
         right2 = rt2;
         right3 = rt3;
         right4 = rt4;
         right5 = rt5;
         right6 = rt6;
         right7 = rt7; 
      }
   
      HuffmanNode()
      {
      }
            
      void setCode(String c)
      {
         code = c;
         codeLength = c.length();
      }
      
      void setProbability(double p)
      {
         probability = p;
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
