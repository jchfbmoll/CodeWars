public class Order {
	
	//kata 6kyu Your order, please https://www.codewars.com/kata/55c45be3b2079eccff00010f/java
	
  public static String order(String words) {

    String[] wordsSplitted = words.split("\\s+");
    String sol="";
    for (int i = 1; i <= wordsSplitted.length ; i++){
      for (String word: wordsSplitted){
        if (word.contains(""+i)){
          sol+=word+" ";
        }        
      }
      
    }
    return sol.trim();
  }
}