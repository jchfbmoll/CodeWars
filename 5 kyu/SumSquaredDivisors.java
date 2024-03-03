public class SumSquaredDivisors {
	
	//kata 5 kyu Integers: Recreation One https://www.codewars.com/kata/55aa075506463dac6600010d/java
	
	public static String listSquared(long m, long n) {
		 // your code
    String sol = "[";
    for (long i = m; i <= n; i++){
      int tempSump = 0;
      for(long j = 1; j<=i; j++){
        if (i%j == 0){
          tempSump += j*j;
          
        }
       
      }
      if (exactSR(tempSump)){
        sol+="["+i+", "+ tempSump +"], ";
      }
    }
    if (sol.length()>1){
      sol=sol.substring(0, sol.length()-2);
    }
    sol+="]";
    return sol;
	}
  
  private static boolean exactSR(int tempSump){
    double sqrt = Math.sqrt(tempSump);
    boolean isInteger = sqrt == (int) sqrt;
    return isInteger;
  }
}