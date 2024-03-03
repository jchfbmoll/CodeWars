// TODO: create the User class/object
// it must support rank, progress, and the incProgress(int rank) method
import java.util.Arrays;
import java.util.ArrayList;


//kata 4kyu Codewars style ranking system https://www.codewars.com/kata/51fda2d95d6efda45e00004e/java



public class User{
  
  public static int rank;
  private static ArrayList<Integer> ranks = new ArrayList<>(Arrays.asList(-8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8));
  public static int progress;
  
  public User(){
    rank = -8;
    progress = 0;
  }
  
  public static void incProgress(int rankTask){
    
    if (rankTask < -8 || rankTask == 0 || rankTask > 8){
      throw new IllegalArgumentException("Error: Incorrect rankTask");    
    }
    int actProgress = 0;
    if (rankTask == rank){
      actProgress =3;
      
      
    } else {
      int diff = ranks.indexOf(rankTask) - ranks.indexOf(rank);
      if (diff == -1) {
        actProgress = 1;
      } else if (diff >= 1){
        actProgress = 10 * diff * diff;
      }
    }
    progress = rank<8 ? progress + actProgress : 0;
    if (progress >= 100){
        rankUp(progress/100);
        progress %=100;
      }
  }
  
  private static void rankUp( int rankInc){
    if (rank<8) rank+=rankInc;
    if (rank==0) rank= 1;
    if (rank>=8) {rank=8; progress=0;} 
  }
}