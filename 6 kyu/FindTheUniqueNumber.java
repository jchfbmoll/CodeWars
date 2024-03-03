// Make sure your class is public
 public class FindTheUniqueNumber {
	 
	// kata 6kyu  Find the unique number https://www.codewars.com/kata/585d7d5adb20cf33cb000235/java
	 
    public static double findUniq(double arr[]) {
      // Do the magic
      
      for (int i = 0; i<arr.length; i++){
        int count=0;
        if (arr[i]!= -1){
          for(int j = i+1; j<arr.length;j++){
            if(arr[i]==arr[j] && j!= arr.length){
              count++;
              arr[j]=-1;
            }
            
          }
          if (count==0){
            return arr[i];
          }
        }  
        
        
      }
      
      return arr[arr.length-1];
    }
}