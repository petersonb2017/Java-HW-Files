import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.Writer;

public class GrainTester
{
   public static void main( String [] args) throws FileNotFoundException, IOException
   {
   Grain g1 = new Grain("TwoRow", 45.5, 5.00);
   g1.addGrain(g1);
   Grain g2 = new Grain("CrystalSixtey", 40.00, 10.00);
   g2.addGrain(g2);
   //g2.sortGrain();
   
   }
}