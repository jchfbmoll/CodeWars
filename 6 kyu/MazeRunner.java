public class MazeRunner {
	
	//kata 6kyu Maze Runner https://www.codewars.com/kata/58663693b359c4a6560001d6/java
	
  public static String walk(int[][] maze, String[] directions) {
    // here be dragons
    int posX=-1,posY=-1;
    
    for(int i=0;i<maze.length;i++){
      for(int j=0;j<maze[0].length;j++){
      
        if (maze[i][j]==2){
          
          posX=i;
          posY=j;
        }
      }
    }
  
    
    for(int i=0;i<directions.length;i++){
      
      if (directions[i]=="N"){
        posX--;
      } else if (directions[i]=="E"){
        posY++;
      } else if (directions[i]=="S"){
        posX++;
      } else {
        posY--;
      }
      if (posX<0 || posY<0 || posX>=maze.length || posY>=maze[0].length || maze[posX][posY]==1){
        return "Dead";
      } else if (maze[posX][posY]==3){
        return "Finish";
      }
    }
    
    return "Lost";
      
      
    }
    
    
  
}