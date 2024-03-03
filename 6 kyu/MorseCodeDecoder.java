public class MorseCodeDecoder {
	
	//kata 6kyu Decode the Morse code  https://www.codewars.com/kata/54b724efac3d5402db00065e/java
	
    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)

        String[] morsearray = morseCode.split(" ");
        String solucio="";
        for (String code: morsearray){
            System.out.println(code);
            if (code!=""){
              solucio += MorseCode.get(code);
            }else {
              solucio +=" ";
            }
        }
        
        return solucio.replaceAll("\\s+"," ").trim();
    }
}