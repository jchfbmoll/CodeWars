import java.util.Arrays;

//kata 6kyu Length of missing array https://www.codewars.com/kata/57b6f5aadb5b3d0ae3000611/java


public class LengthOfMissingArray {

  public static int getLengthOfMissingArray(Object[][] arrayOfArrays)
  { 
    try {
          int[] arrayLength = new int[arrayOfArrays.length];

      for (int i = 0; i<arrayOfArrays.length; i++){
        if (arrayOfArrays[i].length==0) return 0;
        arrayLength[i]=arrayOfArrays[i].length;
      }
        Arrays.sort(arrayLength);


      for(int i = 1; i<arrayLength.length;i++){

        if(arrayLength[i]-1 != (arrayLength[i-1])){
          return arrayLength[i]-1;
        }

      }
    } catch(Exception e) {
      return 0;
    }
    
    
    return 0;
  }
}