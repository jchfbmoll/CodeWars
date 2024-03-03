public class Dinglemouse {

//kata 6kyu Clocky Mc Clock-Face https://www.codewars.com/kata/59752e1f064d1261cb0000ec/java


  public static String whatTimeIsIt(final double angle) {
    // Your code here
    double ang =  angle;
    while (ang> 360){
      ang-=360;
    }
    int hour = (int) ang/30;
    if (hour == 0) hour+=12; 
    
    int minute = (int) Math.floor((ang % 30) *200)/100 ;
    return String.format("%02d", hour)+":"+String.format("%02d", minute);
  }

}