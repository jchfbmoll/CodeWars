public class Multiplesof3or5 {

// kata 6 kyu Multiples of 3 or 5 https://www.codewars.com/kata/514b92a657cdc65150000006/java

  public int solution(int number) {
   int suma=0;
   for(int i = 3; i<number;i++){
       if(i%3==0 || i%5==0)
       suma+=i;
   }
   return suma;
  }
}