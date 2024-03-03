public class PangramChecker {
	
	//kata 6kyu Detect Pangram https://www.codewars.com/kata/545cedaa9943f7fe7b000048/java
	
  public boolean check(String sentence){

  sentence = sentence.toLowerCase();
    
	String dic = "abcdefghijklmnopqrstuvwxyz";
    
	for (int i = 0; i<dic.length();i++){
		if (sentence.indexOf(dic.charAt(i))==-1){
			return false;
		}	 
	}
    
	return true;
  }
}
