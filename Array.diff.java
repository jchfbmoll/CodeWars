import java.util.ArrayList;

public class Kata {

  public static int[] arrayDiff(int[] a, int[] b) {
    // Your code here
    ArrayList<Integer> solList = new ArrayList<>();
    for (int i = 0; i<a.length;i++){
      boolean repeated = false;
      for (int j = 0; j < b.length; j++){
        if (a[i]==b[j] ){
          
          repeated = true;
          break;
        } 
        
      }
      if (!repeated){
        solList.add(a[i]);
      }
    }

    
    return solList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
  }

}