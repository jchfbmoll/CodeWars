public class HumanReadableTime {
	
	// kata 5kyu Human Readable Time https://www.codewars.com/kata/52685f7382004e774f0001f7/java
	
  public static String makeReadable(int seconds) {
    // Do something
    int h = seconds/3600;
    
    String sol ="";
    
    if (h<10) {
      sol+= "0"+h;
      
    } else {
      sol +=h;
    }
    sol+=":";
    seconds %= 3600;
    int m = seconds/60;
    if (m<10) {
      sol+= "0"+m;
      
    } else {
      sol +=m;
    }
    sol+=":";
    seconds %=60;
    
    if (seconds<10) {
      sol+= "0"+seconds;
      
    } else {
      sol +=seconds;
    }
    return sol;
  }
}