public class FindMissingLetter

//kata 6kyu Find the missing letter https://www.codewars.com/kata/5839edaa6754d6fec10000a2/java

{
  public static char findMissingLetter(char[] array)
  {
    for(int i =1; i<array.length;i++){
      if ((int) array[i-1]!= (array[i]-1)){
        return (char) (array[i-1]+1);
      }
      
    }
    return ' ';
  }
}