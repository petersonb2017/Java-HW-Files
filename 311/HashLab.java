import java.util.ArrayList;
import java.util.LinkedList;

public class HashLab
{
   //public static ArrayList<LinkedList> statelist;
   //public static LinkedList<LinkedList> statelistll;
   public static void main( String[] args )
   {
   SeparateChainingHashTable<State> stateTable = new SeparateChainingHashTable<>();
      State alaska = new State("Alaska", 663267);
      State texas = new State("Texas", 268580);
      State delaware = new State("Delaware", 2488);

   stateTable.insert(alaska);
   stateTable.insert(alaska);
   
   }
}