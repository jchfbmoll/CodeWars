public class Tic-Tac-ToeChecker {

//kata 5kyu Tic-Tac-Toe Checker  https://www.codewars.com/kata/525caa5c1bf619d28c000335/java

    public static int isSolved(int[][] board) {
      
      boolean tie = true;
      for (int i = 0; i < 3; i++){
           if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0]!=0){
              return board[i][0];
            
           }
           for (int j=0; j<3; j++){
             
             if (board[i][j]==0){
               
               
               tie = false;
             }
           }
      }
      
      for (int i = 0; i < 3; i++){
           if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i]!=0){
            return board[0][i];
           }   
      }
      
      if (board[0][0] == board[1][1] && board[2][2] == board[1][1] && board[0][0]!=0)  return board[0][0];
      if (board[0][2] == board[1][1] && board[2][0] == board[1][1] && board[0][2]!=0) return board[0][2];
      
      
  
      if (tie==true){
        return 0;
      }
      

      
      return -1;
    }

}