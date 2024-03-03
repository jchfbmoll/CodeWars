public class RemoveTheParentheses {

	//kata 6 kyu Remove the parentheses https://www.codewars.com/kata/5f7c38eb54307c002a2b8cc8/java

    public static String removeParentheses(final String str) {

    String sol = "";
    int panthcount=0;
      
      for (int i =0; i<str.length();i++){
        
        if (str.charAt(i)=='('){
          panthcount++;
        } else if ( str.charAt(i)==')' ){
          panthcount--;
        } else if (panthcount==0){
          
          sol+=str.charAt(i);
        }
        
      }
      
      return sol;
      
    
    }
}