import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//kata 6kyu Count the smiley faces! https://www.codewars.com/kata/583203e6eb35d7980400002a/java

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
      // Just Smile :)
     String smileyRegEx = "^[:;][-~]?[)D]$";
      Pattern pattern = Pattern.compile(smileyRegEx);
      
      int count=0;
      for (int i = 0; i<arr.size();i++){
        Matcher matcher = pattern.matcher(arr.get(i));
        if (matcher.find()){
          count++;
        }
        
      }
      
    
      return count;
  }
}