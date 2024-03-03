public class AddingBigNumbers {
	
	
	//kata 4kyu AddingBigNumbers https://www.codewars.com/kata/525f4206b73515bffb000b21/java
	
  public static String add(String a, String b) {
    
    StringBuilder solution = new StringBuilder("");
    
    int maxRange = a.length() > b.length() ? a.length() : b.length();

    int nextExtra = 0;
    for (int i =  a.length()-1,  j = b.length()-1; maxRange > 0;i--, j--, maxRange--){
      int intA = 0;
      int intB = 0;
      try{
        intA = Character.getNumericValue(a.charAt(i));
      } catch(Exception e){
        
      }
      
      try{
        intB = Character.getNumericValue(b.charAt(j));      
      }catch(Exception e){
        
      }
      
      int nextInt = (intA+intB+nextExtra)%10;
      solution.append(nextInt);
      nextExtra =(intA+intB+nextExtra)/10;
      
    }
    if (nextExtra > 0){
      solution.append(nextExtra);
      
    }
    solution.reverse();
    while (solution.charAt(0)=='0'){
      solution.delete(0,1);
    }
    
    return solution.toString();
  }
}