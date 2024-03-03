public class MatrixMultiplier {
	
	//kata 6 kyu Matrix Multiplier https://www.codewars.com/kata/573248f48e531896770001f9/java
	
  public static double[][] getMatrixProduct(double[][] a, double[][] b) {
    if (a[0].length != b.length)return null;
    
    double[][] sol = new double[a.length][b[0].length];
    
    for (int i = 0; i < a.length;i++){
     
      for (int j=0; j<b[0].length;j++){
        double res = 0;
         for (int k=0;k<a[0].length;k++){
          
           res+=a[i][k]*b[k][j];
           
         
         }
        sol[i][j]= res;
      
      }
      
    }
    return sol;
    
	}
}