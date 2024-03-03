import java.util.*;


//4 kyu Connect Four https://www.codewars.com/kata/56882731514ec3ec3d000009/java


public class ConnectFour {
    public static String whoIsWinner(List<String> piecesPositionList) {
      
      String columns = "ABCDEFG";
      String[] players = {"","Yellow", "Red"};
      int[][] board = new int[6][7];
      
      int numMoves = piecesPositionList.size();
      
      while (numMoves>0){
        String turn = piecesPositionList.get(0);
        String[] moves = turn.split("_");
        
        int column = columns.indexOf(moves[0]);
        int player = Arrays.asList(players).indexOf(moves[1]);
        
        boolean endTurn = false;
        int row = board.length-1;
        while(!endTurn){

          if(board[row][column]==1 || board[row][column]==2 ){

            row--;
          } else{

            board[row][column] = player;
            endTurn = true;
          }
        }
        
        if (endGame(board, row, column, player)){
          return moves[1];
        } 
        
        numMoves--;
        piecesPositionList.remove(0);
      }
        // retrun "Red" or "Yellow" or "Draw"
        return "Draw";
    }
  
    private static boolean endGame(int[][] board, int row, int column, int player){
      
   // System.out.println("estamos en endGame" + row +" "+column);

      int numbPieces =0;
      for (int indexC = 0; indexC<board[0].length;indexC++){
        if (board[row][indexC]==player){
          numbPieces++;
        } else {
          numbPieces = 0;
        }
        if (numbPieces==4) return true;
      }
      

      numbPieces = 0;
      for (int indexR = board.length-1; indexR>=0;indexR--){
        if (board[indexR][column]==player){
          numbPieces++;
        } else {
          numbPieces = 0;
        }

        if (numbPieces==4) return true;
      }

      numbPieces = 0;

      int diffR = board.length-1 - row;  
      int diffC = column;

      int diff = Math.min(diffR, diffC);

      for (int indexR = row + diff, indexC = column - diff ;indexC<board[0].length && indexR>=0; indexC++, indexR--){

        if (board[indexR][indexC]==player){
          numbPieces++;
        } else {
          numbPieces = 0;
        }

        if (numbPieces==4) return true;
        
      }

      
       numbPieces = 0;
      
       diffC = column;
       diffR = row;

       diff = Math.min(diffR, diffC);
      for (int indexC = column - diff, indexR = row - diff;indexR<board.length&&indexC<board[0].length; indexC++,indexR++){

        if (board[indexR][indexC]==player){
          numbPieces++;
        } else {
          numbPieces = 0;
        }

        if (numbPieces==4) return true;
        
      }
      return false;
    }
}