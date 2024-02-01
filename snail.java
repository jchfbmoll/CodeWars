public class Snail {

    public static int[] snail(int[][] array) {
     // enjoy
      
      int[] sol = new int[array.length * array[0].length];
      int indexSol = 0;
      int indexX = 0;
      int indexY = 0;
      int direccio = 0; //0 Dreta, 1 Abaig, 2 Esquerra, 3 Adalt 
      
      while (indexSol < array.length * array[0].length){
        
        if (array[indexX][indexY]!=-1){
          sol[indexSol] = array[indexX][indexY];
          array[indexX][indexY]=-1;
          indexSol++; 
        }
        
        switch(direccio){
            
          case 0:
            indexY++;
            if (indexY >= array[0].length || array[indexX][indexY]==-1){
              indexY--;
              direccio = 1;
            } 
            break;
            
          case 1:
            indexX++;
            if (indexX >= array.length || array[indexX][indexY]==-1){
              indexX--;
              direccio = 2;
            }    
            break;
            
          case 2:
            indexY--;
            if (indexY < 0 || array[indexX][indexY]==-1){
              indexY++;
              direccio = 3;
            }        
            break;
            
          case 3:
            indexX--;
            if (indexX < 0 || array[indexX][indexY]==-1){
              indexX++;
              direccio = 0;
            }
            break;  
        }
      }  
      return sol;
   } 
}