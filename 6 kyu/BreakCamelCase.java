class BreakCamelCase {
	
	// kata 6 kyu Break camelCase https://www.codewars.com/kata/5208f99aee097e6552000148/java
	
  public static String camelCase(String input) {
    
    String sol="";
    
    for (int i=0; i<input.length();i++){
      
      if (String.valueOf(input.charAt(i)).matches("[A-Z]")){
        sol+=" "+input.charAt(i);
      } else {
        
        sol+=input.charAt(i);
      }
      
    }
    
    return sol;
  }
}