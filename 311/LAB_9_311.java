import java.util.ArrayList;
import java.util.LinkedList;

public class LAB_9_311
{
   public static ArrayList<LinkedList<State>> statelist;
   public static ArrayList<LinkedList<State>> templist;
   public static void main( String[] args )
   {
      
      statelist = new ArrayList<LinkedList<State>>();
      templist = new ArrayList<LinkedList<State>>(60);
      for(int i = 0; i<100;i++)templist.add(i,null);
      int[] areaList = new int[60];
      for(int i = 0; i < 50; i++)statelist.add(new LinkedList<State>());
      //int j = 0;
   
      
      State alaska = new State("Alaska", 663267);
      statelist.get(0).add(alaska);
   
   
      State texas = new State("Texas", 268580);
      statelist.get(1).add(texas);
   
   
      State california = new State("California", 163695);
      statelist.get(2).add(california);
   
   
      State montana = new State("Montana", 147042);
      statelist.get(3).add(montana);
   
   
      State newmexico = new State("New Mexico", 121589);
      statelist.get(4).add(newmexico);
   
   
      State arizona = new State("Arizona", 113998);
      statelist.get(5).add(arizona);
   
   
      State nevada = new State("Nevada", 110560);
      statelist.get(6).add(nevada);
   
   
      State colorado = new State("Colorado", 104093);
      statelist.get(7).add(colorado);
   
   
      State oregon = new State("Oregon", 98380);
      statelist.get(8).add(oregon);
   
   
      State wyoming = new State("Wyoming", 97813);
      statelist.get(9).add(wyoming);
   
   
      State michigan  = new State("Michigan",96713);
      statelist.get(10).add(michigan);
   
   
      State minnesota = new State("Minnesota",86935 );
      statelist.get(11).add(minnesota);
   
   
      State utah = new State("Utah", 84896);
      statelist.get(12).add(utah);
   
   
      State idaho = new State("Idaho", 83568);
      statelist.get(13).add(idaho);
   
   
      State kansas = new State("Kansas", 82278);
      statelist.get(14).add(kansas);
   
   
      State nebraska = new State("Nebraska", 77347);
      statelist.get(15).add(nebraska);
   
   
      State southdakota = new State("South Dakota", 77115);
      statelist.get(16).add(southdakota);
   
   
      State washington = new State("Washington", 71297);
      statelist.get(17).add(washington);
   
   
      State northdakota = new State("North Dakota", 70698);
      statelist.get(18).add(northdakota);
   
   
      State oklahoma = new State("Oklahoma", 69898);
      statelist.get(19).add(oklahoma);
   
   
      State missouri = new State("Missouri", 69706);
      statelist.get(20).add(missouri);
   
   
      State florida = new State("Florida", 65757);
      statelist.get(21).add(florida);
   
   
      State wisconsin = new State("Wisconsin", 65496);
      statelist.get(22).add(wisconsin);
   
   
      State georgia = new State("Georgia", 59425);
      statelist.get(23).add(georgia);
   
   
      State illinois = new State("Illinois", 57913);
      statelist.get(24).add(illinois);
   
   
      State iowa = new State("Iowa", 56272);
      statelist.get(25).add(iowa);
   
   
      State newyork = new State("New York", 54554);
      statelist.get(26).add(newyork);
   
   
      State northcarolina = new State("North Carolina", 53819);
      statelist.get(27).add(northcarolina);
   
   
      State arkansas = new State("Arkansas", 53178);
      statelist.get(28).add(arkansas);
   
   
      State alabama = new State("Alabama", 52420);
      statelist.get(29).add(alabama);
   
   
      State louisiana = new State("Louisiana", 52378);
      statelist.get(30).add(louisiana);
   
   
      State mississippi = new State("Mississippi", 48431);
      statelist.get(31).add(mississippi);
   
   
      State pennsylvania = new State("Pennsylvania", 46054);
      statelist.get(32).add(pennsylvania);
   
   
      State ohio = new State("Ohio", 44825);
      statelist.get(33).add(ohio);
   
   
      State virginia = new State("Virginia", 42774);
      statelist.get(34).add(virginia);
   
   
      State tennessee = new State("Tennessee", 42144);
      statelist.get(35).add(tennessee);
   
   
      State kentucky = new State("Kentucky", 40407);
      statelist.get(36).add(kentucky);
   
   
      State indiana = new State("Indiana", 36419);
      statelist.get(37).add(indiana);
   
   
      State maine = new State("Maine", 35379);
      statelist.get(38).add(maine);
   
   
      State southcarolina = new State("South Carolina", 32020);
      statelist.get(39).add(southcarolina);
   
   
      State westvirginia = new State("West Virginia", 24230);
      statelist.get(40).add(westvirginia);
   
      State maryland = new State("Maryland", 12405);
      statelist.get(41).add(maryland);
   
      State hawaii = new State("Hawaii", 10931);
      statelist.get(42).add(hawaii);
   
   
      State massachusetts = new State("Massachusetts", 10554);
      statelist.get(43).add(massachusetts);
   
   
      State vermont = new State("Vermont", 9616);
      statelist.get(44).add(vermont);
   
   
      State newhampshire = new State("New Hampshire", 9349);
      statelist.get(45).add(newhampshire);
   
   
      State newjersey = new State("New Jersey", 8722);
      statelist.get(46).add(newjersey);
   
   
      State connecticut = new State("Connecticut", 5543);//5543
      statelist.get(47).add(connecticut);
      
   
      State delaware = new State("Delaware", 2488);//2488
      statelist.get(48).add(delaware);
   
      State rhodeisland = new State("Rhode Island", 1544);
      statelist.get(49).add(rhodeisland);
      
      System.out.println(statelist.size());
   
      System.out.println("        first Hash         ");
   
      System.out.println("adress    state name     area");
      System.out.println("-----------------------------");
      
      for(int i=0; i<statelist.size(); i++)
      {
         System.out.println(statelist.get(i).get(0).getName());
         int hashNum = firstHash(statelist.get(i).get(0).getArea());
         //System.out.println(hashNum);
         if(templist.get(hashNum) == null){
            templist.remove(hashNum);
            templist.add(hashNum, statelist.get(i));
         }
         else templist.get(hashNum).add(statelist.get(i).get(0));
      }
      
      for(int i=0; i<templist.size(); i++)
      {
         //System.out.print(i+"   ");
         if (templist.get(i) != null)
         {
            System.out.print(i+"   ");
            for(int k = 0; k < templist.get(i).size();k++)
               System.out.printf("%-15s %-8d %-4s",templist.get(i).get(k).getName(),templist.get(i).get(k).getArea(), "--->");
            System.out.println();
         }
         else;
      }
      
      
      
      
      
      templist.clear();
      for(int i = 0; i<100;i++)templist.add(i,null);
      
      
      System.out.println("        second Hash         ");
   
      System.out.println("adress    state name     area");
      System.out.println("-----------------------------");
      
      for(int i=0; i<statelist.size()-1; i++)
      {
         //System.out.println(i);
         int hashNum = secondHash(statelist.get(i).get(0).getArea() % 97);
         //if(templist.get(hashNum) == null){
         //   templist.add(hashNum, statelist.get(i));
         //}
         
         while(templist.get(hashNum) != null)hashNum = ((hashNum + 1) % 97);
         if(templist.get(hashNum) == null){
            templist.remove(hashNum);
            templist.add(hashNum, statelist.get(i));
         }
         
      }
      
      for(int i=0; i<templist.size(); i++)
      {
         //System.out.print(i+"   ");
         if (templist.get(i) != null)
         {
            System.out.print(i+"   ");
            //for(int k = 0; k < templist.get(i).size();k++)
            System.out.printf("%-15s %-8d %-4s",templist.get(i).get(0).getName(),templist.get(i).get(0).getArea(), "--->");
            System.out.println();
         }
         else;
      }
      
      
      templist.clear();
      for(int i = 0; i<100;i++)templist.add(i,null);
      
      
      System.out.println("        third Hash         ");
   
      System.out.println("adress    state name     area");
      System.out.println("-----------------------------");
      
      for(int i=0; i<statelist.size()-1; i++)
      {
         //System.out.println(i);
         int p = 0;
         int hashNum = thirdHash(statelist.get(i).get(0).getName());
         
         //if(templist.get(hashNum) == null){
         //   templist.add(hashNum, statelist.get(i));
         //}
         
         while(templist.get(hashNum) != null)hashNum = ((hashNum + (p++)*(p++)) % 97);
         if(templist.get(hashNum) == null){
            templist.remove(hashNum);
            templist.add(hashNum, statelist.get(i));
         }
         
      }
      
      for(int i=0; i<templist.size(); i++)
      {
         //System.out.print(i+"   ");
         if (templist.get(i) != null)
         {
            System.out.print(i+"   ");
            //for(int k = 0; k < templist.get(i).size();k++)
            System.out.printf("%-15s %-8d %-4s",templist.get(i).get(0).getName(),templist.get(i).get(0).getArea(), "--->");
            System.out.println();
         }
         else;
      }
      
      templist.clear();
      for(int i = 0; i<100;i++)templist.add(i,null);
      
      
      System.out.println("        fourth Hash         ");
   
      System.out.println("adress    state name     area");
      System.out.println("-----------------------------");
      
      for(int i=0; i<statelist.size()-1; i++)
      {
         //System.out.println(i);
         int p = 0;
         int hashNum = fourthHash(statelist.get(i).get(0).getName());

         templist.remove(hashNum);
         templist.add(hashNum, statelist.get(i));
         
         
      }
      int r=0;
      for(int i=0; i<templist.size(); i++)
      {
         //System.out.print(i+"   ");
         if (templist.get(i) != null)
         {
            System.out.print(i+"   ");
            //for(int k = 0; k < templist.get(i).size();k++)
            System.out.printf("%-15s %-8d %-4s",templist.get(i).get(0).getName(),templist.get(i).get(0).getArea(), "--->");
            System.out.println();
            //System.out.println(r++);
         }
         else;
      }
      //for(int i=0; i<50; i++)
      //State stemp = statelistll.get(0).get(0);
      //System.out.println(statelist.get(0).get(0).getArea());
      //System.out.println((statelistll.get(0).get(0).getArea()));
      //System.out.println((statelistll.get(0)));
   
      
      //firstHash();
   }
   public static int firstHash(int area)
   {
      int hashnum = area % 59;
      return hashnum;
   }
   public static int secondHash(int area)
   {
      return (area % 97);
   }
   public static int thirdHash(String name)
   {
      char[] chars = name.toCharArray();
      int v = 0;
      for (int i = 0; i < chars.length; i++) v += (int)chars[i];
      return (v % 93);
   }
   public static int fourthHash(String name)
   {
      if(name == "Alaska")
         return    0   ;
      if(name =="California")
         return    1   ;
   
      if(name == "Montana")
         return   2    ;
   
      if(name =="New Mexico")       
         return   3    ;
   
      if(name =="Arizona")
         return   4    ;
   
      if(name == "Nevada")
         return   5    ;
   
      if(name =="Colorado")
         return   6    ;
   
      if(name =="Oregon")
         return     7  ;
   
      if(name =="Wyoming")
         return   8    ;
   
      if(name == "Michigan")
         return    9   ;
   
      if(name == "Minnesota")
         return  10     ;
   
      if(name == "Utah")
         return   11    ;
   
      if(name == "Idaho")
         return   12    ;
   
      if(name == "Kansas")
         return   13    ;
   
      if(name == "Nebraska")
         return    14   ;
   
      if(name =="South Dakota")
         return 15      ;
   
      if(name == "Washington")
         return    16   ;
   
      if(name == "North Dakota")
         return   17    ;
   
      if(name == "Oklahoma")
         return   18    ;
   
      if(name == "Missouri")
         return   19    ;
   
      if(name == "Florida")
         return    20   ;
   
      if(name ==  "Wisconsin")
         return   21    ;
   
      if(name == "Georgia")
         return     22  ;
   
      if(name == "Illinois")
         return    23   ;
   
      if(name == "Iowa")
         return    24   ;
   
      if(name == "New York")
         return    25   ;
   
      if(name == "North Carolina")
         return   26    ;
   
      if(name == "Arkansas")
         return  27     ;
   
      if(name == "Alabama")
         return     28  ;
   
      if(name == "Louisiana")
         return      29 ;
   
      if(name == "Mississippi")
         return 30       ;
   
      if(name =="Pennsylvania")
         return   31    ;
   
      if(name == "Ohio")
         return       32;
   
      if(name == "Virginia")
         return      33 ;
   
      if(name == "Tennessee")
         return       34;
   
      if(name == "Kentucky")
         return       35;
   
      if(name == "Indiana")
         return       36;
   
      if(name == "Maine")
         return       37;
   
      if(name == "South Carolina")
         return 38      ;
   
      if(name == "West Virginia")
         return    39   ;
   
      if(name == "Maryland")
         return       40;
   
      if(name =="Hawaii")
         return       41;
   
      if(name == "Massachusetts")
         return 42      ;
   
      if(name == "Vermont")
         return       43;
   
      if(name =="New Hampshire")
         return   44    ;
   
      if(name == "New Jersey")
         return       45;
   
      if(name =="Connecticut")
         return       46;
   
      if(name == "Delaware")
         return       47;
   
      if(name == "Rhode Island")
         return     48  ;
   
      return 49;
   }
   /*public static void firstHash()
   {
   System.out.println("adress    state name     area");
   System.out.println("-----------------------------");
   ArrayList<LinkedList> temp = new ArrayList<LinkedList>();
   for(int i = 0; i < 60; i++)temp.add(i, null);
   for(int i = 0; i < 50; i++)
      {
      int k = 0;
      //System.out.print((statelist.get(i)).getName());
      if(temp.get(i)== null)
      temp.add((((statelistll.get(i)).get(0)).getArea() % 59), statelistll.get(i));
      
      
      }
   for(int i = 0; i < 60; i ++)
      {
      System.out.print(i+"    ");
      if(temp.get(i) == null);
      else System.out.print(temp.get(i).getName()+"    "+ temp.get(i).getArea());
      System.out.println();
      
      }
   
   }
   public void secondHash(ArrayList<State> st)
   {
   }
   public void thirdHash(ArrayList<State> st)
   {
   }
   public void fourthHash(ArrayList<State> st)
   {
   }*/
}
