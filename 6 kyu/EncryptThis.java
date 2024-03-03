public class EncryptThis {

	//kata 6kyu Encrypt this! https://www.codewars.com/kata/5848565e273af816fb000449/java

    public static String encryptThis(String text) {
        // Implement me! :)
      if (text.length()==0) return "";

      String[] words = text.split("\\s+");
      String result ="";
      for(String word: words){
        result += (int) word.charAt(0);
        if (word.length()>1){
          result+=word.charAt(word.length()-1);
           if (word.length()>2){
              result+=word.substring(2,word.length()-1);
              result+= word.charAt(1);
           }
        }
        result+=" ";
                
      }
      
      return result.trim();
    }
}