public class MexicanWave {

	//kata 6kyu Mexican Wave https://www.codewars.com/kata/58f5c63f1e26ecda7e000029/java

    public static String[] wave(String str) {
        // Your code here
        
        int whites = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                whites++;
            }
        }
      
        String[] sol = new String[str.length() - whites];
        for(int i = 0,j=0; i<str.length() && j<str.length() - whites;i++,j++){
          
          while (Character.isWhitespace(str.charAt(i))){
            if(i+1<str.length()) i++;
            else break;
          } 
          
          sol[j] =str.substring(0,i)+Character.toUpperCase(str.charAt(i))+ str.substring(i+1);
        }
      
        return sol;
    }
    
}