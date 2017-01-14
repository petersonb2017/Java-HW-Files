import java.io.File;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.BorderLayout;


public class BrewingBuddy 
{
   public static JFrame frame;
   public static JPanel panel, leftPanel, rightPanel, centerPanel, recipePanel;
   public static File grainList = new File("GrainList.txt");
   public static File hopList = new File("HopList.txt");
   public static File recipeList = new File("RecipeList.txt");
   public static File yeastList = new File("YeastList.txt");
   
   public static String[] gStrings, hStrings, yStrings, rStrings;
   public static JPanel[][] panelArray;
   
   public static ArrayList<Grain> grainArray = new ArrayList<Grain>();
   public static ArrayList<Hop> hopArray = new ArrayList<Hop>();
   public static ArrayList<Yeast> yeastArray = new ArrayList<Yeast>();
   public static ArrayList<Recipe> recipeArray = new ArrayList<Recipe>();
   
   public static PrintWriter grainOut;// = new PrintWriter(grainList);
   public static PrintWriter hopOut;// = new PrintWriter(hopList);
   public static PrintWriter yeastOut;// = new PrintWriter(yeastList);
   public static PrintWriter recipeOut;// = new PrintWriter(otherList);
   
   public static JComboBox<String> grainComboBox = new JComboBox<String>(), hopComboBox = new JComboBox<String>(), 
   yeastComboBox = new JComboBox<String>(), recipeComboBox = new JComboBox<String>();
   
   public static JButton  addGrainButton, addHopButton, addYeastButton, compileRecipe, removeGrainButton, removeHopButton,
   removeYeastButton, removeRecipeButton;
   
   public static Grain grain1 = new Grain(null,0,0), grain2 = new Grain(null,0,0), grain3 = new Grain(null,0,0), 
   grain4 = new Grain(null,0,0), grain5 = new Grain(null,0,0);
   
   public static Hop hop1 = new Hop(null,0,true),hop2 = new Hop(null,0,true),hop3 = new Hop(null,0,true),hop4 = new Hop(null,0,true),
   hop5 = new Hop(null,0,true);
   
   public static Yeast yeast1 = new Yeast(null,0,0,0,0);
   
   public static Recipe recipeInp;
   
   public static double g1Weight, g2Weight, g3Weight, g4Weight, g5Weight, h1Weight, h2Weight, h3Weight, h4Weight, h5Weight;
   public static int hTime1, hTime2, hTime3, hTime4, hTime5;
   
   public static JLabel gLabel1 = new JLabel(), gLabel2 = new JLabel(), gLabel3 = new JLabel(), gLabel4 = new JLabel(),
   gLabel5 = new JLabel(), hLabel1 = new JLabel(), hLabel2 = new JLabel(), hLabel3 = new JLabel(), hLabel4 = new JLabel(),
   hLabel5 = new JLabel(), yLabel1 = new JLabel(), gWLabel1 = new JLabel(), gWLabel2 = new JLabel(), gWLabel3 = new JLabel()
   , gWLabel4 = new JLabel(), gWLabel5 = new JLabel(), hWLabel1 = new JLabel(), hWLabel2 = new JLabel(), hWLabel3 = new JLabel()
   , hWLabel4 = new JLabel(), hWLabel5 = new JLabel(), heading00 = new JLabel(), heading01 = new JLabel(), heading02 = new JLabel(),
   yWLabel1 = new JLabel();
   
   
   public static void main( String[] args )   
   {
      
      
      frame = new JFrame();
      frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
      frame.setUndecorated(false);
      frame.setTitle("Beer Thing");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      panel = new JPanel(new BorderLayout(5,5));
      
      makeButtons();	
      frame.setVisible(true);
      
   }

   
   public static void makeButtons()
   {
      panel.removeAll();
      GrainSelectHandler gHandler = new GrainSelectHandler();
      HopSelectHandler hHandler = new HopSelectHandler();
      YeastSelectHandler yHandler = new YeastSelectHandler();
      RecipeCompileHandler rHandler = new RecipeCompileHandler();
      RecipeViewerHandler rVHandler = new RecipeViewerHandler();
      ButtonHandler handler = new ButtonHandler();
      
      System.out.println("Here?"+1);
      addGrainButton = new JButton("Add Grain");
      //removeGrainButton = new JButton("Remove Grain from Saved Grains");
      addHopButton = new JButton("Add Hops");
      //removeHopButton = new JButton("Remove Hops from Saved hops");
      addYeastButton = new JButton("Add Yeast");
      //removeYeastButton = new JButton("Remove Yeast from Saved Yeasts");
      compileRecipe = new JButton("Compile Recipe");
      //removeRecipeButton = new JButton("Remove Recipe from Saved Recipes");
      System.out.println("Here?"+2);
      //removeRecipeButton.addActionListener(removeRecipeHandler);
      
      leftPanel = new JPanel(new GridLayout(3,1,5,5));
      
      leftPanel.add(addGrainButton);
      //leftPanel.add(removeGrainButton);
      leftPanel.add(addHopButton);
      //leftPanel.add(removeHopButton);
      leftPanel.add(addYeastButton);
      //leftPanel.add(removeYeastButton);
      
      
      panel.add(leftPanel, BorderLayout.LINE_START);
      panel.add(compileRecipe, BorderLayout.PAGE_END);
            
      addGrainButton.addActionListener ( handler );
      addHopButton.addActionListener ( handler );
      addYeastButton.addActionListener( handler );
      compileRecipe.addActionListener( rHandler );
      
      populateGStrings();
      Arrays.sort(gStrings);
      grainComboBox = new JComboBox<String>(gStrings);
      
      populateHStrings();
      Arrays.sort(hStrings);
      hopComboBox = new JComboBox<String>(hStrings);
      
      populateYStrings();
      Arrays.sort(yStrings);
      yeastComboBox = new JComboBox<String>(yStrings);
      
      populateRStrings();
      Arrays.sort(rStrings);
      recipeComboBox = new JComboBox<String>(rStrings);
      
      System.out.println("Here?"+3);
      
      rightPanel = new JPanel(new GridLayout(6,1,5,5));
      
      grainComboBox.addActionListener(gHandler);
      hopComboBox.addActionListener(hHandler);
      yeastComboBox.addActionListener(yHandler);
      recipeComboBox.addActionListener(rVHandler);
      
      centerPanel = new JPanel(new GridLayout(12,3,0,0));
      panelArray = new JPanel[12][3];
      
      configCenterPanel(centerPanel);
            
      rightPanel.add(new JLabel("Name                  PPG   Lovi"));      
      rightPanel.add(grainComboBox);
      rightPanel.add(new JLabel("Name                    AA"));
      rightPanel.add(hopComboBox);
      rightPanel.add(new JLabel("Name                     TempLow TempHigh"));
      rightPanel.add(yeastComboBox);
      
      JPanel topPanel = new JPanel(new GridLayout(2,1,5,5));
      topPanel.add(recipeComboBox);
      //topPanel.add(removeRecipeButton);
      panel.add(topPanel, BorderLayout.PAGE_START);
      panel.add(rightPanel, BorderLayout.LINE_END);
      panel.add(centerPanel, BorderLayout.CENTER);
      frame.add(panel);
      frame.setVisible(true); 
   }
   
   
   public static void populateGStrings()
   {
      try
      {
         sortGrain();
      }
      catch(FileNotFoundException ex){}
      
      gStrings = new String[grainArray.size()];
      for(int i = 0; i < grainArray.size(); i++)
      {
         gStrings[i] = String.format("%s %-15s  %.2f %-2s %.2f",grainArray.get(i).getName(),",", grainArray.get(i).getPPG(),",", grainArray.get(i).getLovi());
      }
   }
   
   public static void populateHStrings()
   {
      try
      {
         sortHop();
      }
      catch(FileNotFoundException ex){}
      
      hStrings = new String[hopArray.size()];
      for(int i = 0; i < hopArray.size(); i++)
      {
         hStrings[i] = String.format("%s %-10s %3.1f",hopArray.get(i).getName(), ",", hopArray.get(i).getAA());
         System.out.println(hStrings[i]);
      }
   }
   
   public static void populateYStrings()
   {
      try
      {
         sortYeast();
      }
      catch(FileNotFoundException ex){}
      
      yStrings = new String[yeastArray.size()];
      for(int i = 0; i < yeastArray.size(); i++)
      {
         yStrings[i] = String.format("%s %-15s %2d %-2s %2d", yeastArray.get(i).getName(), ",", yeastArray.get(i).getFermTempLow(), ",", yeastArray.get(i).getFermTempHigh());
         System.out.println(yStrings[i]);
      }
   }
   
   public static void populateRStrings()
   {
      try
      {
         sortRecipe();
      }
      catch(FileNotFoundException ex){}
      
      rStrings = new String[recipeArray.size()];
      for(int i = 0; i < recipeArray.size(); i++)
      {
         Recipe tRec = recipeArray.get(i);
         rStrings[i] = String.format("%s %-5s %1.3f %-2s %1.3f %-2s %2.2f %-2s %3.2f %-2s %2.1f", tRec.getName(), ","
            , tRec.getOG(), ",", tRec.getFG(), ",", tRec.getSRM(), ",", tRec.getIBU(), ",", tRec.getABV());
         System.out.println(rStrings[i]);
      }
   }
   
   public static Grain getGrainInput() 
   {
      JTextField nameField = new JTextField(5);
      JTextField PPGField = new JTextField(5);
      JTextField loviField = new JTextField(5);
      
      JPanel myPanel = new JPanel();
      myPanel.add(new JLabel("Enter Grain Name"));
      myPanel.add(nameField);
      //myPanel.add(Box.createHorizontalStrut(15)); // a spacer
      myPanel.add(new JLabel("Enter Grain PPG"));
      myPanel.add(PPGField);
      myPanel.add(new JLabel("Enter Grain Lovi"));
      myPanel.add(loviField);
   
      int result = JOptionPane.showConfirmDialog(null, myPanel, 
               "Please Enter Grain", JOptionPane.OK_CANCEL_OPTION);
      if (result == JOptionPane.CANCEL_OPTION) 
      {
         //Grain nullGrain = new Grain ("  ", 0.0, 0.0);
         return null;
      }
      if (result == JOptionPane.OK_OPTION && nameField.getText() != "" &&  PPGField.getText() != null &&  loviField.getText() != null) 
      {
         System.out.println("name value: " + nameField.getText());
         System.out.println("PPG value: " + PPGField.getText());
         System.out.println("Lovi value: " + loviField.getText());
      
         Grain tempGrain = new Grain(nameField.getText(), Double.parseDouble(PPGField.getText()), 
            Double.parseDouble(loviField.getText()));
         return tempGrain;
      }
      else 
         return null;
      //String gName = JOptionPane.showInputDialog(null, "Input a Grain");
      //return gName;
   }
   
   public static Hop getHopInput() 
   {
      JTextField nameField = new JTextField(5);
      JTextField AAField = new JTextField(5);
      JTextField pelletField = new JTextField(5);
   ////      
      JPanel myPanel = new JPanel(new GridLayout(3,2));
      myPanel.add(new JLabel("Enter Hop Name"));
      myPanel.add(nameField);
      myPanel.add(new JLabel("Enter Hop AA%"));
      myPanel.add(AAField);
      myPanel.add(new JLabel("Hop Pellet? true or false"));
      myPanel.add(pelletField);
   
      int result = JOptionPane.showConfirmDialog(null, myPanel, 
               "Please Enter Grain", JOptionPane.OK_CANCEL_OPTION);
      if (result == JOptionPane.CANCEL_OPTION) 
      {
         Hop nullHop = new Hop ("  ", 0.0, true);
         return nullHop;
      }
      if (result == JOptionPane.OK_OPTION && nameField.getText() != "" &&  AAField.getText() != null &&  pelletField.getText() != null) 
      {
      }
      
      
      Hop tempHop = new Hop(nameField.getText(), Double.parseDouble(AAField.getText()), 
         parseBoolean(pelletField.getText()));
      return tempHop;
      //String gName = JOptionPane.showInputDialog(null, "Input a Grain");
      //return gName;
   }
   
   public static Yeast getYeastInput() 
   {
      JTextField nameField = new JTextField(6);
      JTextField attenLowField = new JTextField(3);
      JTextField attenHighField = new JTextField(3);
      JTextField fermTempLowField = new JTextField(3);
      JTextField fermTempHighField = new JTextField(3);
      
      JPanel plceHldr = new JPanel();
      
      JPanel myPanel = new JPanel( new GridLayout(3,3,5,5));
      myPanel.add(new JLabel("Enter Yeast Name"));
      myPanel.add(nameField);
      myPanel.add(plceHldr);
      //myPanel.add(Box.createHorizontalStrut(15)); // a spacer
      myPanel.add(new JLabel("Enter Yeast Attenuation Range"));
      myPanel.add(attenLowField);
      myPanel.add(attenHighField);
      myPanel.add(new JLabel("Enter Yeast Temp Range"));
      myPanel.add(fermTempLowField);
      myPanel.add(fermTempHighField);
   
      int result = JOptionPane.showConfirmDialog(null, myPanel, 
               "Please Enter Yeast", JOptionPane.OK_CANCEL_OPTION);
      if (result == JOptionPane.CANCEL_OPTION) 
      {
         Yeast nullYeast = new Yeast ("  ", 0, 0, 0, 0);
         return nullYeast;
      }
      if (result == JOptionPane.OK_OPTION && nameField.getText() != "" &&  attenLowField.getText() != null &&  attenHighField.getText() != null
      &&  fermTempLowField.getText() != null &&  fermTempHighField.getText() != null) 
      {
         System.out.println("name value: " + nameField.getText());
         System.out.println("AttenLow value: " + attenLowField.getText());
         System.out.println("AttenHigh value: " + attenHighField.getText());
         System.out.println("FermTempLow value: " + fermTempLowField.getText());
         System.out.println("FermTempHigh value: " + fermTempHighField.getText());
      }
      
      
      Yeast tempYeast = new Yeast(nameField.getText(), Integer.parseInt(attenLowField.getText()), 
         Integer.parseInt(attenHighField.getText()), Integer.parseInt(fermTempLowField.getText()),
         Integer.parseInt(fermTempHighField.getText()));
      return tempYeast;
   }
      
   
   public static void addGrain(Grain g) throws FileNotFoundException, IOException
   {
      
      Scanner sc = new Scanner(grainList);
      grainOut = new PrintWriter(new BufferedWriter(new FileWriter("GrainList.txt", true)));
      //grainOut.printf("%5s %3.2f %s %3.2f\n", g.getName() + "," ,g.getPPG(),",", g.getLovi());
      String gInp = g.getName() + "," +g.getPPG()+","+g.getLovi();
      grainOut.printf("%s\n", gInp);
      grainOut.close();
         
      System.out.println("You've wrote grain to the GrainList File");
   
      sortGrain();
      
   }
   
   
   public static void addHop(Hop h) throws FileNotFoundException, IOException
   {
      
      Scanner sc = new Scanner(hopList);
      hopOut = new PrintWriter(new BufferedWriter(new FileWriter("HopList.txt", true)));
      String hInp = h.getName()+","+h.getAA()+","+h.getPellet();
      hopOut.printf("%s\n", hInp);
      hopOut.close();
         
      System.out.println("You've wrote a Hop to the HopList File");
   
      sortHop();
      
   }
   
   
   public static void addYeast(Yeast y) throws FileNotFoundException, IOException
   {
      
      Scanner sc = new Scanner(yeastList);
      yeastOut = new PrintWriter(new BufferedWriter(new FileWriter("YeastList.txt", true)));
      String yInp = y.getName()+","+y.getAttenLow()+","+y.getAttenHigh()+","+y.getFermTempLow()+","+y.getFermTempHigh();
      yeastOut.printf("%s\n", yInp);
      yeastOut.close();
      sortYeast();
   }
   
   public static void addRecipe(Recipe r) throws FileNotFoundException, IOException
   {
      
      Scanner sc = new Scanner(recipeList);
      recipeOut = new PrintWriter(new BufferedWriter(new FileWriter("RecipeList.txt", true)));
      //grainOut.printf("%5s %3.2f %s %3.2f\n", g.getName() + "," ,g.getPPG(),",", g.getLovi());
      String rInp = r.getName() + "," +r.getOG()+","+r.getFG()+","+r.getSRM()+","+r.getIBU()+","+r.getABV()+","+r.getInfo();
      recipeOut.printf("%s\n", rInp);
      recipeOut.close();
         
      System.out.println("You've wrote RECIPE to the RecipeList File");
   
      sortRecipe();
      
   }
   
   public static void sortGrain() throws FileNotFoundException//, IOException
   {
      Scanner sc = new Scanner(grainList);
      sc.useDelimiter(",|\n");
      int counter = 0;
      //sc.nextLine();
      grainArray.clear();
      while(sc.hasNextLine() && sc.hasNext())
      {
         String tempName = sc.next();
         double tempPPG = sc.nextDouble();
         double tempLovi = sc.nextDouble();
         Grain tempGrain = new Grain(tempName, tempPPG, tempLovi);
         grainArray.add(tempGrain);
         counter++;
      }
      
      int listSize = grainArray.size();
      for(int i = 1; i < listSize; i++)
      {
         Grain tempGrain1 = new Grain(grainArray.get(i).getName(), grainArray.get(i).getPPG(), 
            grainArray.get(i).getLovi());
         System.out.println(i);
         for(int j = 1; j < listSize ; j++)
         {
            Grain tempGrain2 = new Grain(grainArray.get((i+j)%(listSize)).getName(),
               grainArray.get((i+j)%(listSize)).getPPG(), grainArray.get((i+j)%(listSize)).getLovi());
            if(tempGrain1.getName() == tempGrain2.getName() && tempGrain1.getPPG() == tempGrain2.getPPG() 
               && tempGrain1.getLovi() == tempGrain2.getLovi())
            {
               grainArray.remove((i+j)%(listSize));
            }
         }
      }
   }
   
   
   
   public static void sortHop() throws FileNotFoundException//, IOException
   {
      Scanner sc = new Scanner(hopList);
      sc.useDelimiter(",|\n");
      int counter = 0;
      hopArray.clear();
      while(sc.hasNextLine() && sc.hasNext())
      {
         String tempName = sc.next();
         double tempAA = sc.nextDouble();
         boolean tempPellet = sc.nextBoolean();
         Hop tempHop = new Hop(tempName, tempAA, tempPellet);
         hopArray.add(tempHop);
         counter++;
      }
      int listSize = hopArray.size();
      for(int i = 1; i < listSize; i++)
      {
         Hop tempHop1 = new Hop(hopArray.get(i).getName(), hopArray.get(i).getAA(), 
            hopArray.get(i).getPellet());
         for(int j = 1; j < listSize ; j++)
         {
            Hop tempHop2 = new Hop(hopArray.get((i+j)%(listSize)).getName(),
               hopArray.get((i+j)%(listSize)).getAA(), hopArray.get((i+j)%(listSize)).getPellet());
            if(tempHop1.getName() == tempHop2.getName() && tempHop1.getAA() == tempHop2.getAA() 
               && tempHop1.getPellet() == tempHop2.getPellet())
            {
               hopArray.remove((i+j)%(listSize));
            }
         }
      }
   }
   
   
   public static void sortYeast() throws FileNotFoundException//, IOException
   {
      Scanner sc = new Scanner(yeastList);
      sc.useDelimiter(",|\n");
      int counter = 0;
      yeastArray.clear();
      while(sc.hasNextLine() && sc.hasNext())
      {
         String tempName = sc.next();
         int tempALow = sc.nextInt();
         int tempAHigh = sc.nextInt();
         int tempFLow = sc.nextInt();
         int tempFHigh = sc.nextInt();
         Yeast tempYeast = new Yeast(tempName, tempALow, tempAHigh, tempFLow, tempFHigh);
         yeastArray.add(tempYeast);
         counter++;
      }
      int listSize = yeastArray.size();
      for(int i = 1; i < listSize; i++)
      {
         Yeast tempYeast1 = yeastArray.get(i);
         for(int j = 1; j < listSize ; j++)
         {
            Yeast tempYeast2 = yeastArray.get((i+j)%(listSize));
            if(tempYeast1.getName() == tempYeast2.getName())
            {
               yeastArray.remove((i+j)%(listSize));
            }
         }
      }
   }
   
   public static void sortRecipe() throws FileNotFoundException//, IOException
   {
      Scanner sc = new Scanner(recipeList);
      sc.useDelimiter(",|\n");
      int counter = 0;
      //sc.nextLine();
      recipeArray.clear();
      while(sc.hasNextLine() && sc.hasNext())
      {
         String tempName = sc.next();
         double tempOG = sc.nextDouble();
         double tempFG = sc.nextDouble();
         double tempSRM = sc.nextDouble();
         double tempIBU = sc.nextDouble();
         double tempABV = sc.nextDouble();
         String tempInfo = sc.next();
         
         Recipe tempRecipe = new Recipe(tempName, tempOG, tempFG, tempSRM, tempIBU, tempABV, tempInfo);
         recipeArray.add(tempRecipe);
         counter++;
      }
      
      int listSize = recipeArray.size();
      if(listSize != 0 )
      {
         for(int i = 1; i < listSize; i++)
         {
            Recipe tempRecipe1 = new Recipe(recipeArray.get(i).getName(), recipeArray.get(i).getOG(), 
               recipeArray.get(i).getFG(), recipeArray.get(i).getSRM(), recipeArray.get(i).getIBU()
               , recipeArray.get(i).getABV(), recipeArray.get(i).getInfo());
            for(int j = 1; j < listSize ; j++)
            {
               Recipe tempRecipe2 = new Recipe(recipeArray.get((i+j)%(listSize)).getName(), recipeArray.get((i+j)%(listSize)).getOG(), 
                  recipeArray.get((i+j)%(listSize)).getFG(), recipeArray.get((i+j)%(listSize)).getSRM(), recipeArray.get((i+j)%(listSize)).getIBU()
                  , recipeArray.get((i+j)%(listSize)).getABV(), recipeArray.get((i+j)%(listSize)).getInfo());
            
               if(tempRecipe1.getName().equals(tempRecipe2.getName()) && tempRecipe1.getOG() == tempRecipe2.getOG() 
               && tempRecipe1.getFG() == tempRecipe2.getFG() && tempRecipe1.getSRM() == tempRecipe2.getSRM()
               && tempRecipe1.getIBU() == tempRecipe2.getIBU() && tempRecipe1.getABV() == tempRecipe2.getABV()
               && tempRecipe1.getInfo().equals(tempRecipe2.getInfo()))
               {
                  recipeArray.remove((i+j)%(listSize));
               }
            }
         }
      }
   }
   
   public static void configCenterPanel(JPanel k)
   {
      panelArray = new JPanel[12][3];
      for(int i = 0; i < 12; i++)
      {
         for(int j = 0; j < 3; j++)
         {
            panelArray[i][j] = new JPanel();
         }
      }
      heading00 = new JLabel();
      heading01 = new JLabel("Selected");
      heading02 = new JLabel("Weight and Time (for Hops)");
      panelArray[0][0].add(heading00);
      panelArray[0][1].add(heading01);
      panelArray[0][2].add(heading02);
      for(int i = 1; i < 6; i++)
      {
         panelArray[i][0].add(new JLabel("Grain " + (i) + ": "));
         panelArray[5+i][0].add(new JLabel("Hop " + (i) + ": "));
      }
      panelArray[11][0].add(new JLabel("Yeast: "));
      
      panelArray[1][1].add(gLabel1);
      panelArray[2][1].add(gLabel2);
      panelArray[3][1].add(gLabel3);
      panelArray[4][1].add(gLabel4);
      panelArray[5][1].add(gLabel5);
      panelArray[6][1].add(hLabel1);
      panelArray[7][1].add(hLabel2);
      panelArray[8][1].add(hLabel3);
      panelArray[9][1].add(hLabel4);
      panelArray[10][1].add(hLabel5);
      panelArray[11][1].add(yLabel1);
      
      panelArray[1][2].add(gWLabel1);
      panelArray[2][2].add(gWLabel2);
      panelArray[3][2].add(gWLabel3);
      panelArray[4][2].add(gWLabel4);
      panelArray[5][2].add(gWLabel5);
      panelArray[6][2].add(hWLabel1);
      panelArray[7][2].add(hWLabel2);
      panelArray[8][2].add(hWLabel3);
      panelArray[9][2].add(hWLabel4);
      panelArray[10][2].add(hWLabel5);
      panelArray[11][2].add(yWLabel1);
      
      
      for(int i = 0; i < 12; i++)
      {
         for(int j = 0; j < 3; j++)
         {
            k.add(panelArray[i][j]);
         }
      }
   }
   
   
   private static class ButtonHandler implements ActionListener              //This it the listener for a Right button click.
   {
      public void actionPerformed(ActionEvent e)
      {
         System.out.println(e.getActionCommand());
         
         if(e.getActionCommand() == "Add Grain")
         {
            System.out.println("Clicked add grain");
            Grain tempGrain = getGrainInput();
            if(tempGrain != null)
            {
               //Grain tempGrain = getGrainInput();
            
               System.out.println("Recieved input of Grain:" + tempGrain);
               try
               {
                  addGrain(tempGrain);
               }
               catch(FileNotFoundException ex){}
               catch(IOException io){}
               System.out.println("You have added the grain");
               makeButtons();  
            }
         }
         else if(e.getActionCommand() == "Add Hops")
         {
            System.out.println("Clicked add hop");
            Hop tempHop = getHopInput();
            System.out.println("Recieved input of Hop:" + tempHop);
            try
            {
               addHop(tempHop);
            }
            catch(FileNotFoundException ex){}
            catch(IOException io){}
            System.out.println("You have added the Hop");
         
            makeButtons();  
         }
         else if(e.getActionCommand() == "Add Yeast")
         {
            System.out.println("Clicked add Yeast");
            Yeast tempYeast = getYeastInput();
            System.out.println("Recieved input of Yeast:" + tempYeast);
            try
            {
               addYeast(tempYeast);
            }
            catch(FileNotFoundException ex){}
            catch(IOException io){}
            System.out.println("You have added the Yeast");
         
            makeButtons();  
         }
            
      }
   }
   
   private static class GrainSelectHandler implements ActionListener              //This it the listener for a Right button click.
   {
      public void actionPerformed(ActionEvent e)
      {
         String tempName = grainComboBox.getItemAt(grainComboBox.getSelectedIndex());
         tempName = tempName.substring(0, tempName.indexOf(",")-1); 
         
         if(gLabel1.getText() == "")
         {
            gLabel1.setText(tempName);
            for(int i = 0; i < grainArray.size(); i++)
            {
               System.out.println("$$"+grainArray.get(i).getName()+"$$");
               System.out.println("$$"+tempName+"$$");
               if(grainArray.get(i).getName().equals(tempName))
               {
                  System.out.println("got one!");
                  grain1 = grainArray.get(i);
                  g1Weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Weight"));
                  gWLabel1.setText(Double.toString(g1Weight)+" lbs");
                  break;
               }
            }
         }
         else if(gLabel2.getText() == "")
         {
            gLabel2.setText(tempName);
            for(int i = 0; i < grainArray.size(); i++)
            {
               if(grainArray.get(i).getName().equals(tempName))
               {
                  grain2 = grainArray.get(i);
                  g2Weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Weight"));
                  gWLabel2.setText(Double.toString(g2Weight)+" lbs");
                  break;
               }
            }
         }
         else if(gLabel3.getText() == "")
         {
            gLabel3.setText(tempName);
            for(int i = 0; i < grainArray.size(); i++)
            {
               if(grainArray.get(i).getName().equals(tempName))
               {
                  grain3 = grainArray.get(i);
                  g3Weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Weight"));
                  gWLabel3.setText(Double.toString(g3Weight)+" lbs");
                  break;
               }
            }
         }
         else if(gLabel4.getText() == "")
         {
            gLabel4.setText(tempName);
            for(int i = 0; i < grainArray.size(); i++)
            {
               if(grainArray.get(i).getName().equals(tempName))
               {
                  grain4 = grainArray.get(i);
                  g4Weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Weight"));
                  gWLabel4.setText(Double.toString(g4Weight)+" lbs");
                  break;
               }
            }
         }
         else if(gLabel5.getText() == "")
         {
            gLabel5.setText(tempName);
            for(int i = 0; i < grainArray.size(); i++)
            {
               if(grainArray.get(i).getName().equals(tempName))
               {
                  grain5 = grainArray.get(i);
                  g5Weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Weight"));
                  gWLabel5.setText(Double.toString(g5Weight)+" lbs");
                  break;
               }
            }
         }
         else System.out.println("No More Grains!");
      }
   }
   
   private static class HopSelectHandler implements ActionListener              //This it the listener for a Right button click.
   {
      public void actionPerformed(ActionEvent e)
      {
         String tempName = hopComboBox.getItemAt(hopComboBox.getSelectedIndex());
         tempName = tempName.substring(0, tempName.indexOf(",")-1); 
         if(hLabel1.getText() == "")
         {
            hLabel1.setText(tempName);
            for(int i = 0; i < hopArray.size(); i++)
            {
               if(hopArray.get(i).getName().equals(tempName))
               {
                  hop1 = hopArray.get(i);
                  h1Weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Weight in Ounces"));
                  hTime1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Time of Addition"));
                  hWLabel1.setText(Double.toString(h1Weight)+" oz at "+Integer.toString(hTime1)+" min");
                  break;
               }
            }
         }
         else if(hLabel2.getText() == "")
         {
            hLabel2.setText(tempName);
            for(int i = 0; i < hopArray.size(); i++)
            {
               if(hopArray.get(i).getName().equals(tempName))
               {
                  hop2 = hopArray.get(i);
                  h2Weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Weight in Ounces"));
                  hTime2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Time of Addition"));
                  hWLabel2.setText(Double.toString(h2Weight)+" oz at "+Integer.toString(hTime2)+" min");
                  break;
               }
            }
         }
         else if(hLabel3.getText() == "")
         {
            hLabel3.setText(tempName);
            for(int i = 0; i < hopArray.size(); i++)
            {
               if(hopArray.get(i).getName().equals(tempName))
               {
                  hop3 = hopArray.get(i);
                  h3Weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Weight in Ounces"));
                  hTime3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Time of Addition"));
                  hWLabel3.setText(Double.toString(h3Weight)+" oz at "+Integer.toString(hTime3)+" min");
                  break;
               }
            }
         }
         else if(hLabel4.getText() == "")
         {
            hLabel4.setText(tempName);
            for(int i = 0; i < hopArray.size(); i++)
            {
               if(hopArray.get(i).getName().equals(tempName))
               {
                  hop4 = hopArray.get(i);
                  h4Weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Weight in Ounces"));
                  hTime4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Time of Addition"));
                  hWLabel4.setText(Double.toString(h4Weight)+" oz at "+Integer.toString(hTime4)+" min");
                  break;
               }
            }
         }
         else if(hLabel5.getText() == "")
         {
            hLabel5.setText(tempName);
            for(int i = 0; i < hopArray.size(); i++)
            {
               if(hopArray.get(i).getName().equals(tempName))
               {
                  hop5 = hopArray.get(i);
                  h5Weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Weight in Ounces"));
                  hTime5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Time of Addition"));
                  hWLabel5.setText(Double.toString(h5Weight)+" oz at "+Integer.toString(hTime5)+" min");
                  break;
               }
            }
         }
         else System.out.println("No More Hops!");
      }
   }
   
   private static class YeastSelectHandler implements ActionListener              //This it the listener for a Right button click.
   {
      public void actionPerformed(ActionEvent e)
      {
         String tempName = yeastComboBox.getItemAt(yeastComboBox.getSelectedIndex());
         tempName = tempName.substring(0, tempName.indexOf(",")-1);
         yLabel1.setText(tempName);
         for(int i = 0; i < yeastArray.size(); i++)
         {
            if(yeastArray.get(i).getName().equals(tempName))
            {
               yeast1 = yeastArray.get(i);
            }
         }
      }
   }
   
   private static class RecipeCompileHandler implements ActionListener              //This it the listener for a Right button click.
   {
      public void actionPerformed(ActionEvent e)
      {
      
         recipePanel = new JPanel(new GridLayout(8,1,25,25));
         JButton saveRecipe = new JButton("Save Recipe");
         saveRecipe.addActionListener(new SaveRecipeHandler());
         String recipeName = JOptionPane.showInputDialog(null, "Input Name of Recipe including style: ");
         JTextArea infoArea = new JTextArea(10, 100);
         JPanel infoInpPanel = new JPanel();
         infoInpPanel.add(infoArea);
         JOptionPane.showConfirmDialog(null, infoInpPanel, "Enter Additional Recipe Info", JOptionPane.OK_CANCEL_OPTION);
         String recipeInfo = infoArea.getText();
      
         
      //////         
         double OG = 1;
         double FG = 0;
         double IBU = 0;
         double MCU = 0;
         if(grain1.getName() == null)
         {
            JOptionPane.showMessageDialog(null,"No Grain Inputed");
         }
         else 
         {
            OG += 0.001*(((grain1.getPPG()*g1Weight))/5.5);
            MCU += (grain1.getLovi()*g1Weight)/5.5;
         }
         if(grain2.getName() != null)
         {
            OG = OG + (0.001*((grain2.getPPG()*g2Weight))/5.5);
            MCU += (grain2.getLovi()*g2Weight)/5.5;
         }
         if(grain3.getName() != null)
         {
            OG = OG + 0.001*(grain3.getPPG()*g3Weight)/5.5;
            MCU += (grain3.getLovi()*g3Weight)/5.5;
         }
         if(grain4.getName() != null)
         {
            OG = OG + 0.001*(grain4.getPPG()*g4Weight)/5.5;
            MCU += (grain4.getLovi()*g4Weight)/5.5;
         }
         if(grain5.getName() != null)
         {
            OG = OG + 0.001*(grain5.getPPG()*g5Weight)/5.5;
            MCU += (grain5.getLovi()*g5Weight)/5.5;
         }
         
         OG = 1 + (OG - 1)*.8; //brewhouse efficiency
         double SRM = 1.49*(MCU*0.69);
         
         if(hop1.getName() != null)
         {
            IBU = ((hop1.getAA()*h1Weight)*74.89*((1.65*Math.pow(0.000125,(OG - 1)*(5.5/6.5)))*((1 - Math.pow(Math.E,(-0.04*hTime1)))/4.15)))/5.5;
         }
         if(hop2.getName() != null)
         {
            IBU += ((hop2.getAA()*h2Weight)*74.89*((1.65*Math.pow(0.000125,(OG - 1)*(5.5/6.5)))*((1 - Math.pow(Math.E,(-0.04*hTime2)))/4.15)))/5.5;
         }
         if(hop3.getName() != null)
         {
            IBU += ((hop3.getAA()*h3Weight)*74.89*((1.65*Math.pow(0.000125,(OG - 1)*(5.5/6.5)))*((1 - Math.pow(Math.E,(-0.04*hTime3)))/4.15)))/5.5;
         }
         if(hop4.getName() != null)
         {
            IBU += ((hop4.getAA()*h4Weight)*74.89*((1.65*Math.pow(0.000125,(OG - 1)*(5.5/6.5)))*((1 - Math.pow(Math.E,(-0.04*hTime4)))/4.15)))/5.5;
         }
         if(hop5.getName() != null)
         {
            IBU += ((hop5.getAA()*h5Weight)*74.89*((1.65*Math.pow(0.000125,(OG - 1)*(5.5/6.5)))*((1 - Math.pow(Math.E,(-0.04*hTime5)))/4.15)))/5.5;
         }
         
         FG = 1 + (OG - 1)*(1-((double)((yeast1.getAttenLow() + yeast1.getAttenHigh())/2)/100));
         double ABV = (OG - FG)*131.25;
         System.out.println("Recipe OG = "+OG+", IBUs = "+IBU+", FG = "+FG+" Yeah");
         
         recipeInp = new Recipe(recipeName, OG, FG, SRM, IBU, ABV, recipeInfo);
         
         recipePanel.add(new JLabel(recipeName));
         String recipe1 = String.format("%s %2.3f", "The Original Gravity is:", OG);
         recipePanel.add(new JLabel(recipe1));
         String recipe2 = String.format("%s %2.3f","The Final Gravity Will be:", FG);
         recipePanel.add(new JLabel(recipe2));
         String recipe3 = String.format("%s %2.3f","The IBU's will be:", IBU);
         recipePanel.add(new JLabel(recipe3));
         String recipe4 = String.format("%s %2.3f","The SRM will be:", SRM);
         recipePanel.add(new JLabel(recipe4));
         String recipe5 = String.format("%s %2.3f", "The ABV is:", ABV);
         recipePanel.add(new JLabel(recipe5));
         recipePanel.add(new JLabel(recipeInfo));
         recipePanel.add(saveRecipe);
         JOptionPane.showMessageDialog(null,recipePanel);
      }
   }
   
   private static class SaveRecipeHandler implements ActionListener              //This it the listener for a Right button click.
   {
      public void actionPerformed(ActionEvent e)
      {
         System.out.println("clicked save");
         Recipe tempRecipe = recipeInp;
         try
         {
            addRecipe(tempRecipe);
         }
         catch(FileNotFoundException ex){System.out.println("no file");}
         catch(IOException io){System.out.println("no io i guess");}
         populateRStrings();
         makeButtons();
      }
   }
   
   private static class RecipeViewerHandler implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         Recipe tempRecipe;
         JPanel recipePanel = new JPanel(new GridLayout(7,1,25,25));
         String tempName = recipeComboBox.getItemAt(recipeComboBox.getSelectedIndex());
         tempName = tempName.substring(0, tempName.indexOf(",")-1);
         
         for(int i = 0; i < recipeArray.size(); i++)
         {
            if(tempName.equals(recipeArray.get(i).getName()))
            {
               tempRecipe = recipeArray.get(i);
               recipePanel.add(new JLabel(tempName));
               String recipe1 = String.format("%s %2.3f", "The Original Gravity is:", tempRecipe.getOG());
               recipePanel.add(new JLabel(recipe1));
               String recipe2 = String.format("%s %2.3f","The Final Gravity Will be:", tempRecipe.getFG());
               recipePanel.add(new JLabel(recipe2));
               String recipe3 = String.format("%s %2.3f","The IBU's will be:", tempRecipe.getIBU());
               recipePanel.add(new JLabel(recipe3));
               String recipe4 = String.format("%s %2.3f","The SRM will be:", tempRecipe.getSRM());
               recipePanel.add(new JLabel(recipe4));
               String recipe5 = String.format("%s %2.3f", "The ABV is:", tempRecipe.getABV());
               recipePanel.add(new JLabel(recipe5));
               recipePanel.add(new JLabel(tempRecipe.getInfo()));
               JOptionPane.showMessageDialog(null,recipePanel);
            }
         }
         
         
      
      
      }
   }
   
   public static boolean parseBoolean(String s)
   {
      if(s == "true")
         return true;
      else 
         return false;
   }
}