public class BasicEncryption {
	
	//kata 6kyu BasicEncryption https://www.codewars.com/kata/5862fb364f7ab46270000078/java

    public String encrypt(String text, int rule) {
       
      String sol = ""; 
      
      for(int i=0; i<text.length();i++){
        int letra = (text.charAt(i)+rule) % 256;
        sol+= (char) letra; 
        
        
      }
      return sol;
    }
}