
import java.util.ArrayList;
import java.util.List;

public class SortTheOdd {
	
	//kata 6kyu Sort the odd https://www.codewars.com/kata/578aa45ee9fd15ff4600090d/java
	
  public static int[] sortArray(int[] array) {
    
    List<Integer> oddList = new ArrayList<>();
    
    for(int i = 0; i<array.length; i++){
      
      if(array[i]%2!=0){
        oddList.add(array[i]);
      }
    }
    
   int[] oddArray = new int[oddList.size()];
    
    for(int i = 0; i<oddList.size(); i++){
      oddArray[i] = oddList.get(i);
      
    }
    
    for(int i = oddArray.length-1; i>=0;i--){
      for (int j = 1; j<=i; j++){
        if(oddArray[j]<oddArray[j-1]){
          int aux = oddArray[j];
          oddArray[j] = oddArray[j-1];
          oddArray[j-1] = aux;
        }
        
         
      }
    }
    int indexOddArray = 0;
    for (int i = 0; i<array.length;i++){
      if(array[i]%2!=0){
        array[i] = oddArray[indexOddArray];
        indexOddArray++;
      }
      
    } 

    return array;
  }
}