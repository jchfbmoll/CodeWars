import java.util.List;
import java.util.ArrayList;

public class RectangleIntoSquares {
	
	//kata 6kyu Rectangle into Squares https://www.codewars.com/kata/55466989aeecab5aac00003e/java
	
	public static List<Integer> sqInRect(int lng, int wdth) {
    if (lng==wdth) { return null;}
    
    
    List<Integer> sol = new ArrayList<Integer>();
    
    int size = lng * wdth;
   
    int major = lng > wdth ? lng : wdth;
    int menor = lng < wdth ? lng : wdth;
     int aux;
       
    
    while (size > 0 ){
      
      sol.add(menor);
      size = size - (menor*menor);
      
      major = major - menor;
      
      if (menor>major){
        aux = major;
        major = menor;
        menor = aux;
        
        
      }
      
        
    }
      
    return sol;
	}
}