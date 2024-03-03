import java.util.regex.Matcher;
import java.util.regex.Pattern;


//kata 4kyu Strip Comments https://www.codewars.com/kata/51c8e37cee245da6b40000bd/java

public class StripComments {

	public static String stripComments(String text, String[] commentSymbols) {
    String[] sentence = text.split("\n");
    String sol="";
    for(String sent : sentence){
    
      for(String symb: commentSymbols){
        if (sent.contains(symb)){
          int index=sent.indexOf(symb);
          sent = sent.substring(0, index);
        }
        
      }
      sol+=removeWhites(sent)+"\n";
    }
    sol = sol.substring(0, sol.length()-1);

    return sol;
	}
	private static String removeWhites(String string){
    
    int indexLastWhite = string.length() - 1;
    while (indexLastWhite>= 0 && Character.isWhitespace(string.charAt(indexLastWhite))) {
            indexLastWhite--;
    }
    return string.substring(0, indexLastWhite+1);
  }
}