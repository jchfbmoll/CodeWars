import java.math.BigInteger;

//kata 4kyu Large Factorials https://www.codewars.com/kata/557f6437bf8dcdd135000010/java


public class LargeFactorials
{

  public static String Factorial(int n) {
    BigInteger result = BigInteger.ONE;
    for(int i=1; i<=n; i++){
      result = result.multiply(BigInteger.valueOf(i));
    }
    return result.toString();
  }

}