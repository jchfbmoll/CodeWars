import java.util.regex.Matcher;
import java.util.regex.Pattern;

// kata 5kyu String incrementer https://www.codewars.com/kata/54a91a4883a7de5d7800009c/java

public class StringIncrementer {
  public static String incrementString(String str) {
    
    
    Pattern pattern = Pattern.compile("\\d$");
    Matcher matcher = pattern.matcher(str);
    
    if (matcher.find()){
      
      StringBuilder strbld = new StringBuilder(str);
      StringBuilder strblddigits = new StringBuilder();
      for (int index= strbld.length()-1; index>=0 && Character.isDigit(strbld.charAt(index));index--){
        
        strblddigits.insert(0, strbld.charAt(index));
        strbld.deleteCharAt(index);
      }
      boolean next = true;
      System.out.println(strblddigits);
      
      for (int i = strblddigits.length()-1; i>=0 && next;i--){
        
        int numb = Character.getNumericValue(strblddigits.charAt(i));

        numb++;
        if (numb == 10){
          
          strblddigits.replace(i,i+1,"0");
          if (i==0){
            strblddigits.insert(0,'1');
          }
          
        } else {
          
          strblddigits.replace(i, i+1, String.valueOf(numb));
          next= false;

        }
        
      }
      str = strbld.toString() + strblddigits.toString();
      
    } else {
      
      str+="1";
      
    }
    
    return str; // you code here
  }
}