import java.util.HashMap;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;

//kata 6kyu PascalsTriangle https://www.codewars.com/kata/5226eb40316b56c8d500030f/java

public class PascalsTriangle {
    public static long[] generate(int level) {
      ArrayList<Long> longList = new ArrayList<>();
      ArrayList<Long> levelList = new ArrayList<>();
      ArrayList<Long> prevLevelList = new ArrayList<>();

      longList.add(1L);
      levelList.add(1L);
      long varAux = 1L;
      for (int i = 1; i<level; i++){
        for (int j = 0; j<=i;j++){
          if(j==0 || j == i) {
             longList.add(1L);
             if (j==0) levelList.set(0, 1L);
             else levelList.add(1L);
          } else {

             longList.add(levelList.get(j)+varAux);
             varAux = levelList.get(j);
             levelList.set(j, longList.get(longList.size()-1) );
          }
        }    
      }
      long[] longArr = new long[longList.size()];
      for (int index= 0; index < longList.size(); index++){
          longArr[index]=longList.get(index);        
      }
      
      return longArr;
    }
}