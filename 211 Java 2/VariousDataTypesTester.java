   import java.util.Scanner;    // Scanner Library, to enter data from keyboard
   import java.lang.Math;       // Math Library
   import java.util.ArrayList;
	
   public class VariousDataTypesTester // 
   {		
      public static void main(String[] args)
      {
         int count;
         ArrayList<HomesData> homesList = new ArrayList<HomesData>();
         ArrayList<FullNames> namesList = new ArrayList<FullNames>();
         ArrayList<HomesData> homesListSorted = new ArrayList<HomesData>();
         ArrayList<FullNames> namesListSorted = new ArrayList<FullNames>();
      	
      	// Set up the "fake data" for this demo
         HomesData h1 = new HomesData("13 Cherry Ave.", 4, 403000);
         homesList.add(h1);
         HomesData h2 = new HomesData("9121 Apple Dr.", 2, 293000);
         homesList.add(h2);
         HomesData h3 = new HomesData("825 Peach Way", 3, 735600);
         homesList.add(h3);
         HomesData h4 = new HomesData("3847 Lime St.", 4, 678400);
         homesList.add(h4);
         HomesData h5 = new HomesData("638 Cantaloupe Ct.", 3, 398600);
         homesList.add(h5);
      
         FullNames n1 = new FullNames("Biff Martinson", 837112943);
         namesList.add(n1);				
         FullNames n2 = new FullNames("Shemp Ashley", 726493844);
         namesList.add(n2);
         FullNames n3 = new FullNames("Zelda Goatsman", 446948375);
         namesList.add(n3);
         FullNames n4 = new FullNames("Fred Flinstone", 954336784);
         namesList.add(n4);
         FullNames n5 = new FullNames("George H.W. Bush", 685049487);
         namesList.add(n5);
      		
      	// Here we add two items of each type of data: Homes, Names
      	// Except that rather than declare each new record directly,
      	// using only the class definitions HomesData and FullNames,
      	// we declare this new data using the Interface definition.
         ComparisonInterface ci1, ci2, ci3, ci4;
         ci1 = new HomesData("314 Pi Circle", 5, 314159);
         ci2 = new FullNames("Issac Newton", 123456789);
         ci3 = new HomesData("278 E. Street", 4, 278182);
         ci4 = new FullNames("Johannes Kepler", 987654321);
         HomesData h101 = (HomesData)ci1;
         FullNames n102 = (FullNames)ci2;
         HomesData h103 = (HomesData)ci3;
         FullNames n104 = (FullNames)ci4;
         homesList.add(h101);
         homesList.add(h103);
         namesList.add(n102);
         namesList.add(n104);
      
         // Print the UNsorted data of each type
         count = homesList.size();
         System.out.println("Printing Out Unsorted Data...");
         for (int i = 0; i < count; i++)
         {
            HomesData h = homesList.get(i);
            System.out.println(i + " " + h.getAddress() + " " + h.getNumberOfRooms() + " " + h.getValue());
         }
         for (int i = 0; i < count; i++)
         {
            FullNames n = namesList.get(i);
            System.out.println(i + "   " + n.getFullName() + " " + n.getSSN());
         }
         System.out.println();
      
      /////// Sort homes according to value				
         for (int i = 0; i < count; i++)
         {
            HomesData h = homesList.get(i);
         	// Insert FIRST sorted element
            if (homesListSorted.size() == 0)
               homesListSorted.add(h);
            else
            {
            	// new item is LESS THAN list(0) ... 
               if (h.compareAandBInt(homesListSorted.get(0).getValue()) == 1) 
                  homesListSorted.add(0, h);
               // new item is NOT LESS THAN list(0) ... 
               else 
               {
                  int N = homesListSorted.size();
                  int index = 0;
                  for (index = 0; index < N; index++)
                  {
                     // Check the list one by one intil new item is LESS than current list position
                     if (h.compareAandBInt(homesListSorted.get(index).getValue()) == 1)
                        break;
                  }
                  homesListSorted.add(index, h);
               }
            }
         }
      	// Print out sorted list								
         System.out.println("Printing Out Homes Sorted by Value...");
         for (int i = 0; i < count; i++)
         {
            HomesData h = homesListSorted.get(i);
            System.out.printf("%-20s   %2d rooms,    $%,8d\n", h.getAddress(), h.getNumberOfRooms(), h.getValue());
         }
         System.out.println();
      
      
      /////// Sort homes according to Address
         homesListSorted.clear();
         for (int i = 0; i < count; i++)
         {
            HomesData h = homesList.get(i);
         		// Insert FIRST sorted element
            if (homesListSorted.size() == 0)
               homesListSorted.add(h);
            else
            {
            		// new item is LESS THAN list(0) ... 
               if (h.compareAandBString(homesListSorted.get(0).getAddress()) == 1) 
                  homesListSorted.add(0, h);
               	// new item is NOT LESS THAN list(0) ... 
               else 
               {
                  int N = homesListSorted.size();
                  int index = 0;
                  for (index = 0; index < N; index++)
                  {
                  	   // Check the list one by one intil new item is LESS than current list position
                     if (h.compareAandBString(homesListSorted.get(index).getAddress()) == 1)
                        break;
                  }
                  homesListSorted.add(index, h);
               }
            }
         }
      		
      		// Print out sorted list								
         System.out.println("Printing Out Homes Sorted by Address ...");
         for (int i = 0; i < count; i++)
         {
            HomesData h = homesListSorted.get(i);
            System.out.printf("%-20s   %2d rooms,    $%,8d\n", h.getAddress(), h.getNumberOfRooms(), h.getValue());
         }
         System.out.println();
      
      /////// Sort names according to SSN				
         for (int i = 0; i < count; i++)
         {
            FullNames n = namesList.get(i);
         		// Insert FIRST sorted element
            if (namesListSorted.size() == 0)
               namesListSorted.add(n);
            else
            {
            		// new item is LESS THAN list(0) ... 
               if (n.compareAandBInt(namesListSorted.get(0).getSSN()) == 1) 
                  namesListSorted.add(0, n);
               	// new item is NOT LESS THAN list(0) ... 
               else 
               {
                  int N = namesListSorted.size();
                  int index = 0;
                  for (index = 0; index < N; index++)
                  {
                  	   // Check the list one by one intil new item is LESS than current list position
                     if (n.compareAandBInt(namesListSorted.get(index).getSSN()) == 1)
                        break;
                  }
                  namesListSorted.add(index, n);
               }
            }
         }	
      	// Print out sorted list								
         System.out.println("Printing Out Names Sorted by SSN...");
         for (int i = 0; i < count; i++)
         {
            FullNames n = namesListSorted.get(i);
            System.out.printf("%-20s   %9d\n", n.getFullName(), n.getSSN());
         }
         System.out.println();
      
      /////// Sort names according to Name
         namesListSorted.clear();
         for (int i = 0; i < count; i++)
         {
            FullNames n = namesList.get(i);
         		// Insert FIRST sorted element
            if (namesListSorted.size() == 0)
               namesListSorted.add(n);
            else
            {
            		// new item is LESS THAN list(0) ... 
               if (n.compareAandBString(namesListSorted.get(0).getFullName()) == 1) 
                  namesListSorted.add(0, n);
               	// new item is NOT LESS THAN list(0) ... 
               else 
               {
                  int N = namesListSorted.size();
                  int index = 0;
                  for (index = 0; index < N; index++)
                  {
                  	   // Check the list one by one intil new item is LESS than current list position
                     if (n.compareAandBString(namesListSorted.get(index).getFullName()) == 1)
                        break;
                  }
                  namesListSorted.add(index, n);
               }
            }
         }
      	// Print out sorted list								
         System.out.println("Printing Out Names Sorted by Names...");
         for (int i = 0; i < count; i++)
         {
            FullNames n = namesListSorted.get(i);
            System.out.printf("%-20s   %9d\n", n.getFullName(), n.getSSN());
         }
         System.out.println();
      }		 	
   }
