public class TransformToPrime
{

// kata 6kyu Transform To Prime https://www.codewars.com/kata/5a946d9fba1bb5135100007c/java

    public static int minimumNumber(int[] numbers)
    {
        int sum= 0;
        for (int i = 0; i<numbers.length;i++){
          sum+= numbers[i];
        }
        int prim=0;
        boolean primo = false;
        while (!primo){
          for (prim = sum; !primo;prim++){
            primo = isPrimo(prim);
          }
          prim--;
        }    
        
        return prim - sum; // Do your magic!
    }
  
  static boolean isPrimo(int num){
      
      for(int index=num-1;index>1;index--){
        
        if (num%index==0 ){
          return false;
        }
        
      }
      
      return true;
    }
}