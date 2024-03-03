public class CarMileage {

// kata 4kyu Catching Car Mileage Numbers https://www.codewars.com/kata/52c4dd683bfd3b434c000292/java

  public static int isInteresting(int number, int[] awesomePhrases) {
    //Go to town
    if (number < 98) return 0;
    else if(number == 98 || number==99) return 1;
    
    for(int num: awesomePhrases){
      if (number==num) return 2;
      else if(number==num-1|| number == num-2) { return 1;}
    }
   
    if (Integer.toString(number).matches("[1-9]0+")) return 2;
    if (incNumb(number)) return 2;

    if (decNumb(number)) return 2;

    if (palindrome(number)) return 2;

    if (Integer.toString(number+1).matches("[1-9]0+")||Integer.toString(number+2).matches("[1-9]0+")) return 1;
    
    
    else if (incNumb(number+1)||incNumb(number+2)||incNumb(number-1)||incNumb(number-2)) return 1;
    
   
    else if (decNumb(number-1)||decNumb(number-2)||decNumb(number+1)||decNumb(number+2)) return 1;

    
    else if (palindrome(number+1)||palindrome(number+2)) return 1;
    
    return 0;
  }
  private static boolean incNumb(int number){
    int prevNumb = number%10;
    
    while(number>0){
      number/=10;
      if(prevNumb-1==number%10 || (number%10==9 && prevNumb==0)|| number==0) prevNumb = number%10;
      else return false;
      
    }
    return true;
  }
  private static boolean decNumb(int number){
    int prevNumb = number%10;
    
    while(number>0){

      number/=10;

      if(prevNumb+1==number%10 || (number%10==9 && prevNumb==0) || number==0 ) prevNumb = number%10;
      else return false;
      
    }
    return true;
  }
  private static boolean palindrome(int number){
    String numb = Integer.toString(number);
    int length = numb.length();
    for (int i = 0; i<length/2; i++){
      if (numb.charAt(i)!=numb.charAt(numb.length()-1-i)) return false;
    }
    return true;
  }
}