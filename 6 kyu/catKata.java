public class catKata {
    public static boolean peacefulYard(String[] yard, int minDistance) {
  // kata 6kyu Cat Kata, Part 1 https://www.codewars.com/kata/5869848f2d52095be20001d1/java
      
      int[] L = {0,0};
      int[] M = {0,0};
      int[] R = {0,0};
      boolean isL = false, isM=false, isR = false;
      
      for (int i = 0; i < yard.length ; i++){
        
        if (yard[i].indexOf('L')!=-1){
          L[0]=i;
          L[1]=yard[i].indexOf('L');
          isL=true;          
        }
        if (yard[i].indexOf('M')!=-1){
          M[0]=i;
          M[1]=yard[i].indexOf('M');
          isM=true;
          
        }
        if (yard[i].indexOf('R')!=-1){
          R[0]=i;
          R[1]=yard[i].indexOf('R');
          isR=true;
          
        }
        
      }
      int distx;
      int disty;
      if (isL && isM){
        distx = L[0] - M[0];
        disty = L[1] - M[1];
        
        if(Math.sqrt(distx*distx + disty*disty)< minDistance){
          return false;
        }
      }
      
      if (isL && isR){
        distx = L[0] - R[0];
        disty = L[1] - R[1];
        
        if(Math.sqrt(distx*distx + disty*disty)< minDistance){
          return false;
        }
      }
      if (isR && isM){
        distx = R[0] - M[0];
        disty = R[1] - M[1];
        
        if(Math.sqrt(distx*distx + disty*disty)< minDistance){
          return false;
        }
      }
      return true;
      
      
      
      
    }
}