import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;


public class Grain
{
   private String name;
   private double ppg;
   private double lovi;
   
   public Grain(String grainName, double gravity, double color)
   {
      name = grainName;
      ppg = gravity;
      lovi = color;
   }
   
   public String getName()
   {
      return name;
   }
   
   public double getPPG()
   {
      return ppg;
   }
   
   public double getLovi()
   {
      return lovi;
   }
}