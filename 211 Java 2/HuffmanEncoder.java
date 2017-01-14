import java.util.Rand5om;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class HuffmanEncoder
{
   private static double entropy;
   private static double averageCodeLength;
   private static int radix;
   
   public static void main(String[] args) throws FileNotFoundException
   {  
      ArrayList<HuffmanNode> uncoded = new ArrayList<HuffmanNode>();
      ArrayList<SymbolNode>  symbolTable = new ArrayList<SymbolNode>();
         //HuffmanTree hTree = new HuffmanTree();
      Scanner keyboard = new Scanner(System.in);
   		
         //System.out.print("Input File name: ");
      String inputFileName = "ea.txt"; // get NAME of input file
         //System.out.print("Output File name: ");
         //String outputFileName = keyboard.next();// get NAME of output file
      
      File inputFile = new File(inputFileName); // pointer to  input FILE      
      Scanner inFile = new Scanner(inputFile);  // Scanner for input FILE
      inFile.useDelimiter("[^A-za-z0-9 ']+");    // 
         
      System.out.println("Enter symbol length: ");
      int symbolLength = keyboard.nextInt();
      System.out.println("Enter r: ");
      radix = keyboard.nextInt();
      entropy = 0.0;
      averageCodeLength = 0.0;
   
   // Part 1:  Get symbols and their probabilities from the screen, then 
   //          insert them, in increasing order or probabilties, into the uncoded list.         
      while (inFile.hasNextLine())
      {
         String nextLine = inFile.nextLine();
         Scanner SandPScanner = new Scanner(nextLine);
         System.out.println(nextLine);
         SandPScanner.useDelimiter(",");
         String s = SandPScanner.next();
         String pString = SandPScanner.next();
         double p = Double.parseDouble(pString);
         System.out.println("   " + s + "   " + p);
         HuffmanNode hn = new HuffmanNode(s,p, null, null, null, null, null, null, null, null, null);
         if (uncoded.size() == 0)
            uncoded.add(hn);
         else
         {
            int length = uncoded.size();
            if (p > uncoded.get(length-1).getProbability())
               uncoded.add(hn);
            else
            {
               int i = length - 1;
               while (p < uncoded.get(i).getProbability() && i > 0)     i--;
               if (i == 0 && p < uncoded.get(i).getProbability())
                  uncoded.add(0,hn);
               else if (i == 0 && p >= uncoded.get(i).getProbability())
                  uncoded.add(1,hn);
               else 
                  uncoded.add(i+1,hn);
            }
         } 
      }
      inFile.close();
         //outputFile.close();         
         
      if(radix == 2){
         while (uncoded.size() > radix - 1)
         {
            HuffmanNode hn = new HuffmanNode("", 0, uncoded.get(0), uncoded.get(1), null, null, null,
                 null, null, null, null);
            uncoded.remove(0);
            uncoded.remove(0);
            double probabilitySum = hn.left.getProbability() + hn.right.getProbability();
            hn.setProbability(probabilitySum);
                
            if (uncoded.size() == 0) 
               uncoded.add(hn);
            else
            {
               int length = uncoded.size();
               double p = probabilitySum;
               if (p > uncoded.get(length-1).getProbability())
                  uncoded.add(hn);
               else
               {
                  int i = length - 1;
                  while (p < uncoded.get(i).getProbability() && i > 0)     i--;
                  if (i == 0 && p < uncoded.get(i).getProbability())
                     uncoded.add(0,hn);
                  else if (i == 0 && p >= uncoded.get(i).getProbability())
                     uncoded.add(1,hn);
                  else 
                     uncoded.add(i+1,hn);
               }
            }            
         }
      }
         
      if(radix == 3){
         HuffmanNode hn1 = new HuffmanNode("", 0, uncoded.get(0), uncoded.get(1), null, null, null,
                 null, null, null, null);
         uncoded.remove(0);
         uncoded.remove(0);
                
         double probabilitySum1 = hn1.left.getProbability() + hn1.right.getProbability();
         hn1.setProbability(probabilitySum1);
                
         if (uncoded.size() == 0) 
            uncoded.add(hn1);
         else
         {
            int length = uncoded.size();
            double p = probabilitySum1;
            if (p > uncoded.get(length-1).getProbability())
               uncoded.add(hn1);
            else
            {
               int i = length - 1;
               while (p < uncoded.get(i).getProbability() && i > 0)     i--;
               if (i == 0 && p < uncoded.get(i).getProbability())
                  uncoded.add(0,hn1);
               else if (i == 0 && p >= uncoded.get(i).getProbability())
                  uncoded.add(1,hn1);
               else 
                  uncoded.add(i+1,hn1);
            }
         }
            
      
         while (uncoded.size() > radix - 1)
         {
            HuffmanNode hn = new HuffmanNode("", 0, uncoded.get(0), uncoded.get(1), uncoded.get(2), null, null, null,
                 null, null, null);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            double probabilitySum = hn.left.getProbability() + hn.right.getProbability() + hn.right1.getProbability();
            hn.setProbability(probabilitySum);
                
            if (uncoded.size() == 0) 
               uncoded.add(hn);
            else
            {
               int length = uncoded.size();
               double p = probabilitySum;
               if (p > uncoded.get(length-1).getProbability())
                  uncoded.add(hn);
               else
               {
                  int i = length - 1;
                  while (p < uncoded.get(i).getProbability() && i > 0)     i--;
                  if (i == 0 && p < uncoded.get(i).getProbability())
                     uncoded.add(0,hn);
                  else if (i == 0 && p >= uncoded.get(i).getProbability())
                     uncoded.add(1,hn);
                  else 
                     uncoded.add(i+1,hn);
               }
            }            
         }
      }
        
      if(radix == 4){
         HuffmanNode hn1 = new HuffmanNode("", 0, uncoded.get(0), uncoded.get(1), null, null, null,
                 null, null, null, null);
         uncoded.remove(0);
         uncoded.remove(0);
         double probabilitySum = hn1.left.getProbability() + hn1.right.getProbability();
         hn1.setProbability(probabilitySum);
                
         if (uncoded.size() == 0) 
            uncoded.add(hn1);
         else
         {
            int length = uncoded.size();
            double p = probabilitySum;
            if (p > uncoded.get(length-1).getProbability())
               uncoded.add(hn1);
            else
            {
               int i = length - 1;
               while (p < uncoded.get(i).getProbability() && i > 0)     i--;
               if (i == 0 && p < uncoded.get(i).getProbability())
                  uncoded.add(0,hn1);
               else if (i == 0 && p >= uncoded.get(i).getProbability())
                  uncoded.add(1,hn1);
               else 
                  uncoded.add(i+1,hn1);
            }
         }
            
         while (uncoded.size() > radix - 1)
         {
            HuffmanNode hn = new HuffmanNode("", 0, uncoded.get(0), uncoded.get(1), uncoded.get(2), uncoded.get(3),
                 null, null, null, null, null);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            double probabilitySum1 = hn.left.getProbability() + hn.right.getProbability() + hn.right1.getProbability()
                + hn.right2.getProbability();
            hn.setProbability(probabilitySum1);
                
            if (uncoded.size() == 0) 
               uncoded.add(hn);
            else
            {
               int length = uncoded.size();
               double p = probabilitySum1;
               if (p > uncoded.get(length-1).getProbability())
                  uncoded.add(hn);
               else
               {
                  int i = length - 1;
                  while (p < uncoded.get(i).getProbability() && i > 0)     i--;
                  if (i == 0 && p < uncoded.get(i).getProbability())
                     uncoded.add(0,hn);
                  else if (i == 0 && p >= uncoded.get(i).getProbability())
                     uncoded.add(1,hn);
                  else 
                     uncoded.add(i+1,hn);
               }
            }            
         }
      }
        
      if(radix == 5){
         HuffmanNode hn1 = new HuffmanNode("", 0, uncoded.get(0), uncoded.get(1), null, null, null,
                 null, null, null, null);
         uncoded.remove(0);
         uncoded.remove(0);
         double probabilitySum = hn1.left.getProbability() + hn1.right.getProbability();
         hn1.setProbability(probabilitySum);
                
         if (uncoded.size() == 0) 
            uncoded.add(hn1);
         else
         {
            int length = uncoded.size();
            double p = probabilitySum;
            if (p > uncoded.get(length-1).getProbability())
               uncoded.add(hn1);
            else
            {
               int i = length - 1;
               while (p < uncoded.get(i).getProbability() && i > 0)     i--;
               if (i == 0 && p < uncoded.get(i).getProbability())
                  uncoded.add(0,hn1);
               else if (i == 0 && p >= uncoded.get(i).getProbability())
                  uncoded.add(1,hn1);
               else 
                  uncoded.add(i+1,hn1);
            }
         }
            
         while (uncoded.size() > radix - 1)
         {
            HuffmanNode hn = new HuffmanNode("", 0, uncoded.get(0), uncoded.get(1), uncoded.get(2), 
                uncoded.get(3), uncoded.get(4), null, null, null, null);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            double probabilitySum1 = hn.left.getProbability() + hn.right.getProbability() + hn.right1.getProbability()
                + hn.right2.getProbability() + hn.right3.getProbability();
            hn.setProbability(probabilitySum1);
                
            if (uncoded.size() == 0) 
               uncoded.add(hn);
            else
            {
               int length = uncoded.size();
               double p = probabilitySum1;
               if (p > uncoded.get(length-1).getProbability())
                  uncoded.add(hn);
               else
               {
                  int i = length - 1;
                  while (p < uncoded.get(i).getProbability() && i > 0)     i--;
                  if (i == 0 && p < uncoded.get(i).getProbability())
                     uncoded.add(0,hn);
                  else if (i == 0 && p >= uncoded.get(i).getProbability())
                     uncoded.add(1,hn);
                  else 
                     uncoded.add(i+1,hn);
               }
            }            
         }
      }
        
      if(radix == 6){
         HuffmanNode hn1 = new HuffmanNode("", 0, uncoded.get(0), null, null, null, null,
                 null, null, null, null);
         uncoded.remove(0);
         double probabilitySum = hn1.left.getProbability();
         hn1.setProbability(probabilitySum);
                
         if (uncoded.size() == 0) 
            uncoded.add(hn1);
         else
         {
            int length = uncoded.size();
            double p = probabilitySum;
            if (p > uncoded.get(length-1).getProbability())
               uncoded.add(hn1);
            else
            {
               int i = length - 1;
               while (p < uncoded.get(i).getProbability() && i > 0)     i--;
               if (i == 0 && p < uncoded.get(i).getProbability())
                  uncoded.add(0,hn1);
               else if (i == 0 && p >= uncoded.get(i).getProbability())
                  uncoded.add(1,hn1);
               else 
                  uncoded.add(i+1,hn1);
            }
         }
            
         while (uncoded.size() > radix - 1)
         {
            HuffmanNode hn = new HuffmanNode("", 0, uncoded.get(0), uncoded.get(1), uncoded.get(2), 
                uncoded.get(3), uncoded.get(4), uncoded.get(5), null, null, null);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            double probabilitySum1 = hn.left.getProbability() + hn.right.getProbability() + hn.right1.getProbability()
                + hn.right2.getProbability() + hn.right3.getProbability() + hn.right4.getProbability();
            hn.setProbability(probabilitySum1);
                
            if (uncoded.size() == 0) 
               uncoded.add(hn);
            else
            {
               int length = uncoded.size();
               double p = probabilitySum1;
               if (p > uncoded.get(length-1).getProbability())
                  uncoded.add(hn);
               else
               {
                  int i = length - 1;
                  while (p < uncoded.get(i).getProbability() && i > 0)     i--;
                  if (i == 0 && p < uncoded.get(i).getProbability())
                     uncoded.add(0,hn);
                  else if (i == 0 && p >= uncoded.get(i).getProbability())
                     uncoded.add(1,hn);
                  else 
                     uncoded.add(i+1,hn);
               }
            }            
         }
      }
        
      if(radix == 7){
         HuffmanNode hn1 = new HuffmanNode("", 0, uncoded.get(0), uncoded.get(1), null, null, null,
                 null, null, null, null);
         uncoded.remove(0);
         uncoded.remove(0);
         double probabilitySum = hn1.left.getProbability() + hn1.right.getProbability();
         hn1.setProbability(probabilitySum);
                
         if (uncoded.size() == 0) 
            uncoded.add(hn1);
         else
         {
            int length = uncoded.size();
            double p = probabilitySum;
            if (p > uncoded.get(length-1).getProbability())
               uncoded.add(hn1);
            else
            {
               int i = length - 1;
               while (p < uncoded.get(i).getProbability() && i > 0)     i--;
               if (i == 0 && p < uncoded.get(i).getProbability())
                  uncoded.add(0,hn1);
               else if (i == 0 && p >= uncoded.get(i).getProbability())
                  uncoded.add(1,hn1);
               else 
                  uncoded.add(i+1,hn1);
            }
         }
            
         while (uncoded.size() > radix - 1)
         {
            HuffmanNode hn = new HuffmanNode("", 0, uncoded.get(0), uncoded.get(1), uncoded.get(2), 
                uncoded.get(3), uncoded.get(4), uncoded.get(5), uncoded.get(6), null, null);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            double probabilitySum1 = hn.left.getProbability() + hn.right.getProbability() + hn.right1.getProbability()
                + hn.right2.getProbability() + hn.right3.getProbability() + hn.right4.getProbability()
                + hn.right5.getProbability();
            hn.setProbability(probabilitySum1);
                
            if (uncoded.size() == 0) 
               uncoded.add(hn);
            else
            {
               int length = uncoded.size();
               double p = probabilitySum1;
               if (p > uncoded.get(length-1).getProbability())
                  uncoded.add(hn);
               else
               {
                  int i = length - 1;
                  while (p < uncoded.get(i).getProbability() && i > 0)     i--;
                  if (i == 0 && p < uncoded.get(i).getProbability())
                     uncoded.add(0,hn);
                  else if (i == 0 && p >= uncoded.get(i).getProbability())
                     uncoded.add(1,hn);
                  else 
                     uncoded.add(i+1,hn);
               }
            }            
         }
      }
        
      if(radix == 8){
         HuffmanNode hn1 = new HuffmanNode("", 0, uncoded.get(0), uncoded.get(1), uncoded.get(2), uncoded.get(3),
            uncoded.get(4), null, null, null, null);
         uncoded.remove(0);
         uncoded.remove(0);
         uncoded.remove(0);
         uncoded.remove(0);
         uncoded.remove(0);
         double probabilitySum = hn1.left.getProbability() + hn1.right.getProbability() +
                hn1.right1.getProbability() + hn1.right2.getProbability() + hn1.right3.getProbability();
         hn1.setProbability(probabilitySum);
                
         if (uncoded.size() == 0) 
            uncoded.add(hn1);
         else
         {
            int length = uncoded.size();
            double p = probabilitySum;
            if (p > uncoded.get(length-1).getProbability())
               uncoded.add(hn1);
            else
            {
               int i = length - 1;
               while (p < uncoded.get(i).getProbability() && i > 0)     i--;
               if (i == 0 && p < uncoded.get(i).getProbability())
                  uncoded.add(0,hn1);
               else if (i == 0 && p >= uncoded.get(i).getProbability())
                  uncoded.add(1,hn1);
               else 
                  uncoded.add(i+1,hn1);
            }
         }
            
         while (uncoded.size() > radix - 1)
         {
            HuffmanNode hn = new HuffmanNode("", 0, uncoded.get(0), uncoded.get(1), uncoded.get(2), 
                uncoded.get(3), uncoded.get(4), uncoded.get(5), uncoded.get(6), uncoded.get(7), null);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            double probabilitySum1 = hn.left.getProbability() + hn.right.getProbability() + hn.right1.getProbability()
                + hn.right2.getProbability() + hn.right3.getProbability() + hn.right4.getProbability()
                + hn.right5.getProbability() + hn.right6.getProbability();
            hn.setProbability(probabilitySum1);
                
            if (uncoded.size() == 0) 
               uncoded.add(hn);
            else
            {
               int length = uncoded.size();
               double p = probabilitySum1;
               if (p > uncoded.get(length-1).getProbability())
                  uncoded.add(hn);
               else
               {
                  int i = length - 1;
                  while (p < uncoded.get(i).getProbability() && i > 0)     i--;
                  if (i == 0 && p < uncoded.get(i).getProbability())
                     uncoded.add(0,hn);
                  else if (i == 0 && p >= uncoded.get(i).getProbability())
                     uncoded.add(1,hn);
                  else 
                     uncoded.add(i+1,hn);
               }
            }            
         }
      }
        
      if(radix == 9){
         HuffmanNode hn1 = new HuffmanNode("", 0, uncoded.get(0), uncoded.get(1), null, null, null,
                 null, null, null, null);
         uncoded.remove(0);
         uncoded.remove(0);
         double probabilitySum = hn1.left.getProbability() + hn1.right.getProbability();
         hn1.setProbability(probabilitySum);
                
         if (uncoded.size() == 0) 
            uncoded.add(hn1);
         else
         {
            int length = uncoded.size();
            double p = probabilitySum;
            if (p > uncoded.get(length-1).getProbability())
               uncoded.add(hn1);
            else
            {
               int i = length - 1;
               while (p < uncoded.get(i).getProbability() && i > 0)     i--;
               if (i == 0 && p < uncoded.get(i).getProbability())
                  uncoded.add(0,hn1);
               else if (i == 0 && p >= uncoded.get(i).getProbability())
                  uncoded.add(1,hn1);
               else 
                  uncoded.add(i+1,hn1);
            }
         }
            
         while (uncoded.size() > radix - 1)
         {
            HuffmanNode hn = new HuffmanNode("", 0, uncoded.get(0), uncoded.get(1), uncoded.get(2), 
                uncoded.get(3), uncoded.get(4), uncoded.get(5), uncoded.get(6), uncoded.get(7), uncoded.get(8));
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            uncoded.remove(0);
            double probabilitySum1 = hn.left.getProbability() + hn.right.getProbability() + hn.right1.getProbability()
                + hn.right2.getProbability() + hn.right3.getProbability() + hn.right4.getProbability()
                + hn.right5.getProbability() + hn.right6.getProbability() + hn.right7.getProbability();
            hn.setProbability(probabilitySum1);
                
            if (uncoded.size() == 0) 
               uncoded.add(hn);
            else
            {
               int length = uncoded.size();
               double p = probabilitySum1;
               if (p > uncoded.get(length-1).getProbability())
                  uncoded.add(hn);
               else
               {
                  int i = length - 1;
                  while (p < uncoded.get(i).getProbability() && i > 0)     i--;
                  if (i == 0 && p < uncoded.get(i).getProbability())
                     uncoded.add(0,hn);
                  else if (i == 0 && p >= uncoded.get(i).getProbability())
                     uncoded.add(1,hn);
                  else 
                     uncoded.add(i+1,hn);
               }
            }            
         }
      }
   
   
        
      addCodes(uncoded.get(0), "");
      displayTree(uncoded.get(0));
      System.out.println();
      System.out.println("Entropy:               " + entropy);
      System.out.println("AvgCodeLen:            " + averageCodeLength);
      System.out.println("AvgCodeLen / symbol:   " + averageCodeLength / symbolLength);
   }

   public static void addCodes(HuffmanNode t, String s)
   {
      if (t != null && radix == 2)
      {
         addCodes(t.left, s.concat("0"));
         t.setCode(s);
         addCodes(t.right, s.concat("1"));
      }
      if (t != null && radix == 3)
      {
         addCodes(t.left, s.concat("0"));
         t.setCode(s);
         addCodes(t.right, s.concat("1"));
         t.setCode(s);
         addCodes(t.right1, s.concat("2"));
            //t.setCodes(s);
      }
      if (t != null && radix == 4)
      {
         addCodes(t.left, s.concat("0"));
         t.setCode(s);
         addCodes(t.right, s.concat("1"));
         t.setCode(s);
         addCodes(t.right1, s.concat("2"));
         t.setCode(s);
         addCodes(t.right2, s.concat("3"));
      }
      if (t != null && radix == 5)
      {
         addCodes(t.left, s.concat("0"));
         t.setCode(s);
         addCodes(t.right, s.concat("1"));
         t.setCode(s);
         addCodes(t.right1, s.concat("2"));
         t.setCode(s);
         addCodes(t.right2, s.concat("3"));
         t.setCode(s);
         addCodes(t.right3, s.concat("4"));
      }
      if (t != null && radix == 6)
      {
         addCodes(t.left, s.concat("0"));
         t.setCode(s);
         addCodes(t.right, s.concat("1"));
         t.setCode(s);
         addCodes(t.right1, s.concat("2"));
         t.setCode(s);
         addCodes(t.right2, s.concat("3"));
         t.setCode(s);
         addCodes(t.right3, s.concat("4"));
         t.setCode(s);
         addCodes(t.right4, s.concat("5"));
      }
      if (t != null && radix == 7)
      {
         addCodes(t.left, s.concat("0"));
         t.setCode(s);
         addCodes(t.right, s.concat("1"));
         t.setCode(s);
         addCodes(t.right1, s.concat("2"));
         t.setCode(s);
         addCodes(t.right2, s.concat("3"));
         t.setCode(s);
         addCodes(t.right3, s.concat("4"));
         t.setCode(s);
         addCodes(t.right4, s.concat("5"));
         t.setCode(s);
         addCodes(t.right5, s.concat("6"));
      }
      if (t != null && radix == 8)
      {
         addCodes(t.left, s.concat("0"));
         t.setCode(s);
         addCodes(t.right, s.concat("1"));
         t.setCode(s);
         addCodes(t.right1, s.concat("2"));
         t.setCode(s);
         addCodes(t.right2, s.concat("3"));
         t.setCode(s);
         addCodes(t.right3, s.concat("4"));
         t.setCode(s);
         addCodes(t.right4, s.concat("5"));
         t.setCode(s);
         addCodes(t.right5, s.concat("6"));
         t.setCode(s);
         addCodes(t.right6, s.concat("7"));
      }
      if (t != null && radix == 9)
      {
         addCodes(t.left, s.concat("0"));
         t.setCode(s);
         addCodes(t.right, s.concat("1"));
         t.setCode(s);
         addCodes(t.right1, s.concat("2"));
         t.setCode(s);
         addCodes(t.right2, s.concat("3"));
         t.setCode(s);
         addCodes(t.right3, s.concat("4"));
         t.setCode(s);
         addCodes(t.right4, s.concat("5"));
         t.setCode(s);
         addCodes(t.right5, s.concat("6"));
         t.setCode(s);
         addCodes(t.right6, s.concat("7"));
         t.setCode(s);
         addCodes(t.right7, s.concat("8"));
      }
   
   }
      // Recursively display the tree
   public static void displayTree(HuffmanNode t)
   {
      if (t != null && radix == 3)
      {
         displayTree(t.left);
         if (t.getSymbol().length() != 0)
         {
            System.out.printf("%2s  %-12s  %10.5f%n", t.symbol, t.code, t.probability);
            entropy -= t.probability * Math.log(t.probability)/Math.log(2.0);
            averageCodeLength += t.probability * t.code.length();
         }
         displayTree(t.right);
         displayTree(t.right1);
            //displayTree(t.right2);
            //displayTree(t.right3);
            //displayTree(t.right4);
            //displayTree(t.right5);
            //displayTree(t.right6);
            //displayTree(t.right7);
      }
      if (t != null && radix == 4)
      {
         displayTree(t.left);
         if (t.getSymbol().length() != 0)
         {
            System.out.printf("%2s  %-12s  %10.5f%n", t.symbol, t.code, t.probability);
            entropy -= t.probability * Math.log(t.probability)/Math.log(2.0);
            averageCodeLength += t.probability * t.code.length();
         }
         displayTree(t.right);
         displayTree(t.right1);
         displayTree(t.right2);
            //displayTree(t.right3);
            //displayTree(t.right4);
            //displayTree(t.right5);
            //displayTree(t.right6);
            //displayTree(t.right7);
      }
      if (t != null && radix == 5)
      {
         displayTree(t.left);
         if (t.getSymbol().length() != 0)
         {
            System.out.printf("%2s  %-12s  %10.5f%n", t.symbol, t.code, t.probability);
            entropy -= t.probability * Math.log(t.probability)/Math.log(2.0);
            averageCodeLength += t.probability * t.code.length();
         }
         displayTree(t.right);
         displayTree(t.right1);
         displayTree(t.right2);
         displayTree(t.right3);
            //displayTree(t.right4);
            //displayTree(t.right5);
            //displayTree(t.right6);
            //displayTree(t.right7);
      }
      if (t != null && radix == 6)
      {
         displayTree(t.left);
         if (t.getSymbol().length() != 0)
         {
            System.out.printf("%2s  %-12s  %10.5f%n", t.symbol, t.code, t.probability);
            entropy -= t.probability * Math.log(t.probability)/Math.log(2.0);
            averageCodeLength += t.probability * t.code.length();
         }
         displayTree(t.right);
         displayTree(t.right1);
         displayTree(t.right2);
         displayTree(t.right3);
         displayTree(t.right4);
            //displayTree(t.right5);
            //displayTree(t.right6);
            //displayTree(t.right7);
      }
      if (t != null && radix == 7)
      {
         displayTree(t.left);
         if (t.getSymbol().length() != 0)
         {
            System.out.printf("%2s  %-12s  %10.5f%n",  t.symbol, t.code, t.probability);
            entropy -= t.probability * Math.log(t.probability)/Math.log(2.0);
            averageCodeLength += t.probability * t.code.length();
         }
         displayTree(t.right);
         displayTree(t.right1);
         displayTree(t.right2);
         displayTree(t.right3);
         displayTree(t.right4);
         displayTree(t.right5);
            //displayTree(t.right6);
            //displayTree(t.right7);
      }
      if (t != null && radix == 8)
      {
         displayTree(t.left);
         if (t.getSymbol().length() != 0)
         {
            System.out.printf("%2s  %-12s  %10.5f%n", t.symbol, t.code, t.probability);
            entropy -= t.probability * Math.log(t.probability)/Math.log(2.0);
            averageCodeLength += t.probability * t.code.length();
         }
         displayTree(t.right);
         displayTree(t.right1);
         displayTree(t.right2);
         displayTree(t.right3);
         displayTree(t.right4);
         displayTree(t.right5);
         displayTree(t.right6);
            //displayTree(t.right7);
      }
      if (t != null && radix == 9)
      {
         displayTree(t.left);
         if (t.getSymbol().length() != 0)
         {
            System.out.printf("%2s  %-12s  %10.5f%n", t.symbol, t.code, t.probability);
            entropy -= t.probability * Math.log(t.probability)/Math.log(2.0);
            averageCodeLength += t.probability * t.code.length();
         }
         displayTree(t.right);
         displayTree(t.right1);
         displayTree(t.right2);
         displayTree(t.right3);
         displayTree(t.right4);
         displayTree(t.right5);
         displayTree(t.right6);
         displayTree(t.right7);
      }
   
         
      if (t != null && radix == 2)
      {
         displayTree(t.left);
         if (t.getSymbol().length() != 0)
         {
            System.out.printf("%2s  %-12s  %10.5f%n", t.symbol, t.code, t.probability);
            entropy -= t.probability * Math.log(t.probability)/Math.log(2.0);
            averageCodeLength += t.probability * t.code.length();
         }
         displayTree(t.right);
            //displayTree(t.right2);
            //displayTree(t.right3);
            //displayTree(t.right4);
            //displayTree(t.right5);
            //displayTree(t.right6);
            //displayTree(t.right7);
      }
   }

}

