public class DRoot {
	
	//kata 6kyu Sum of Digits / Digital Root https://www.codewars.com/kata/541c8630095125aba6000c00/java
	
  public static int digital_root(int n) {
    
    int auxnumber;
    int auxnumber1;
    while (n>9){
      auxnumber = 0;
      auxnumber1 = n;
      while(auxnumber1 >0){
        
        auxnumber += auxnumber1 %10;
        auxnumber1 /= 10;
        
      }
      
      n = auxnumber;
    }
    
    return n;
    
  }
}