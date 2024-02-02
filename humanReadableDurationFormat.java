public class TimeFormatter {
    
    public static String formatDuration(int seconds) {
        // your code goes here
      if (seconds == 0) return "now";
      String[] format = {"second", "minute", "hour", "day", "year"};
      int[] time = {0,0,0,0,0};
      
      int indexTime = 0;
      while (seconds > 0 && indexTime <5) {
        if (indexTime < 2) {time[indexTime] = seconds % 60; seconds /=60;}
        else if (indexTime==2) {time[indexTime] = seconds % 24; seconds /=24;}
        else if (indexTime==3) {time[indexTime] = seconds % 365; seconds /=365;}
        else time[indexTime] = seconds;
        indexTime++;
      }
      
      String sol = "";
      
      for (int i = format.length - 1; i >= 0; i--){
        
        if (time[i]!=0){
          sol+= time[i]+" "+format[i];
          if (time[i]>1){
            sol+="s";
          }
          sol+=", ";        
        }
      }
     
      sol = sol.substring(0, sol.length()-2);
      int last = sol.lastIndexOf(",");
      if (last!=-1){
        sol = sol.substring(0, last)+ " and"+sol.substring(last+1);
      }
      return sol;
    }
}