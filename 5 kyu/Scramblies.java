import java.util.Map;
import java.util.HashMap;


//kata 5kyu Scramblies https://www.codewars.com/kata/55c04b4cc56a697bb0000048/java

public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {
      
      Map<Character, Integer> mapStr = new HashMap<>();
      
      for (int i = 0; i<str2.length();i++){
        
        if(mapStr.containsKey(str2.charAt(i))){
                    mapStr.put(str2.charAt(i), mapStr.get(str2.charAt(i))+1);

        } else{
                    mapStr.put(str2.charAt(i), 1);

        } 
      
      }
      for (int i = 0; i < str1.length();i++){
        if(mapStr.containsKey(str1.charAt(i))){
          
          mapStr.put(str1.charAt(i), mapStr.get(str1.charAt(i))-1);
        }       
      }
      
      for (Map.Entry<Character, Integer> valors : mapStr.entrySet()) {
        
        if( valors.getValue() >0){
          return false;
          
        }      
      }

      return true;
    }
}