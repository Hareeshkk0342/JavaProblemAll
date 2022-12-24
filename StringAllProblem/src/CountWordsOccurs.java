import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountWordsOccurs {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the String");
   String s=sc.nextLine();
   String words[]=s.split(" ");
   Map<String,Integer>map=new HashMap<String,Integer>();
   for(String word:words) {
	   if(map.containsKey(word)) {
		   map.put(word, map.get(word)+1);
			   
		    }
	   else {
		   map.put(word, 1);
	   }
   }
       Set<String>set=map.keySet();
       for(String word:set) {
    	   if(map.get(word)>=1) {
    		   System.out.println(word+" :"+map.get(word));
    	   }
       }

	}

}
