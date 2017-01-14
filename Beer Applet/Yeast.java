import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;


public class Yeast
{
   private String name;
   private int attenLow;
   private int attenHigh;
   private int fermTempLow;
   private int fermTempHigh;
   
   public Yeast(String yeastName, int aLow, int aHigh, int fTempLow, int fTempHigh)
   {
      name = yeastName;
      attenLow = aLow;
   attenHigh = aHigh;
   fermTempLow = fTempLow;
   fermTempHigh = fTempHigh;
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getAttenLow()
   {
      return attenLow;
   }
   
   public int getAttenHigh()
   {
      return attenHigh;
   }
   public int getFermTempLow()
   {
      return fermTempLow;
   }
   public int getFermTempHigh()
   {
      return fermTempHigh;
   }
}