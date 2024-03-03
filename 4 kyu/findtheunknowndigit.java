public class findtheunknowndigit {

	//kata 4kyu Find the unknown digit https://www.codewars.com/kata/546d15cebed2e10334000ed9/java

	public static int solveExpression( final String expression ) {
		
    
    //Write code to determine the missing digit or unknown rune
    //Expression will always be in the form
    //(number)[opperator](number)=(number)
    //Unknown digit will not be the same as any other digits used in expression
    String daw = expression;
    int firstMinus=0;
    if(expression.charAt(0)=='-'){firstMinus++;}
    int indexOperator = expression.indexOf("+")+expression.indexOf("*")+1;
    if (indexOperator==-1){
      indexOperator = expression.indexOf("-",firstMinus);
    }
    String firstInt = expression.substring(0, indexOperator);
    
    String secondInt = expression.substring(indexOperator+1,expression.indexOf("=")); 
    String result = expression.substring(expression.indexOf("=")+1);
    
    int res = resultado(firstInt, secondInt, result, expression.charAt(indexOperator), daw);
     
		return res;
	}
  
   private static int resultado(String firstInt, String secondInt, String result, char operator, String daw){

     
     int i = 0;
     if ((firstInt.charAt(0)=='?' && firstInt.length()!=1) || (secondInt.charAt(0)=='?'&& secondInt.length()!=1)  || (result.charAt(0)=='?' && result.length()!=1) ||(firstInt.charAt(0)=='-' && firstInt.charAt(1)=='?') ||(secondInt.charAt(0)=='-' && secondInt.charAt(1)=='?') || (result.charAt(0)=='-'&& result.charAt(1)=='?') ) i++;
     for (; i<10  ; i++){
       if (!daw.contains(i+"")){
        
         String first = firstInt.replaceAll("\\?",i+"");
         String second = secondInt.replaceAll("\\?",i+"");
         String resString = result.replaceAll("\\?",i+"");


         if (operator=='+'){


           int res = Integer.valueOf(first) + Integer.valueOf(second);

           if (res==Integer.valueOf(resString)) return i;
         } else if (operator=='-'){


           int res = Integer.valueOf(first) - Integer.valueOf(second);
           if (res==Integer.valueOf(resString)) return i;
         } else if (operator=='*'){
           int res = Integer.valueOf(first) * Integer.valueOf(second);
           if (res==Integer.valueOf(resString)) return i;
           } 
         }
       }
     return -1;
   }
}