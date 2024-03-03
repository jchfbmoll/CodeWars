import java.util.ArrayList;

//kata 6kyu Dominant primes https://www.codewars.com/kata/59ce11ea9f0cbc8a390000ed/java

class DominantPrimes{
    public static int solve(int a, int b){
        //..
        int suma = 0;
        ArrayList<Integer> primeList = new ArrayList<Integer>();
        primeList.add(2);
        primeList.add(3);
        if (3>=a && 3<=b){
          
          suma+=3;         
        }
      
        for(int i=5; i<=b;i=i+2){
          if(primo(i)){
            primeList.add(i);
            if (i>=a && primeList.contains(primeList.size()) && primeList.size()%2!=0) {

              suma+=i;
            }
          }
        }

        return suma;
    }
    static boolean primo(int num){
      
      if (num==1) return false;
      if (num==2) return true;
      for(int index=3;index<=(int) Math.sqrt(num);index= index+2){
        
        if (num%index==0 ){
          return false;
        }
        
      }
      return true;
    }
  
  
   
}