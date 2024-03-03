import java.util.SortedSet;
import java.util.TreeSet;


//kata 4kyu Twice Linear https://www.codewars.com/kata/5672682212c8ecf83e000050/java


class DoubleLinear {
    
    public static int dblLinear (int n) {
      System.out.println(n);
      SortedSet<Integer> sortedList = new TreeSet<>();;
      
      sortedList.add(1);
      int indexLista = 1;
      
      while (indexLista <= n){
        int x = sortedList.first();
        int y = 2 * x +1;
        int z = 3 * x +1;
        sortedList.add(y);
        sortedList.add(z);
        sortedList.remove(x);
        indexLista++;

      }
 
      return sortedList.first();
    }
}