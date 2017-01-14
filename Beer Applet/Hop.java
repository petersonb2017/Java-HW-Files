import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;


public class Hop
{
   private String name;
   private double AA;
   private boolean pellet;
   
   public Hop(String hopName, double alpha, boolean form)
   {
      name = hopName;
      AA = alpha;
      pellet = form;
   }
   
   public String getName()
   {
      return name;
   }
   
   public double getAA()
   {
      return AA;
   }
   
   public boolean getPellet()
   {
      return pellet;
   }
}