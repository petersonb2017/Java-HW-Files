import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;


public class Recipe
{
   private String name;
   private double OG;
   private double FG;
   private double SRM;
   private double IBU;
   private double ABV;
   private String info;
   
   public Recipe(String recName, double grav, double fGrav, double color, double bitter, double alch, String words)
   {
      name = recName;
      OG = grav;
      FG = fGrav;
      SRM = color;
      IBU = bitter;
      ABV = alch;
      info = words;
   }
   
   public String getName()
   {
      return name;
   }
   
   public double getFG()
   {
      return FG;
   }
   
   public double getOG()
   {
      return OG;
   }
   
   public double getSRM()
   {
      return SRM;
   }
   
   public double getIBU()
   {
      return IBU;
   }
   
   public double getABV()
   {
      return ABV;
   }
   
   public String getInfo()
   {
      return info;
   }
}