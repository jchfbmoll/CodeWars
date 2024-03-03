public class NumberUtils {

	//kata 6kyu Does my number look big in this? https://www.codewars.com/kata/5287e858c6b5a9678200083c/java

    public static boolean isNarcissistic(int number) {
        // TODO replace with your code
      
        int pot = String.valueOf(number).length();
        
        int numnarc = 0;
        int numberaux = number;
          
          
        for (int i = 0; i< pot; i++){
          
          numnarc+= Math.pow((numberaux% 10), pot) ;
          numberaux /=10;
        }
      
        if (number==numnarc){
          
          return true;
          
        }
      
        return false;
    }

}