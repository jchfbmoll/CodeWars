public class EmotionalSort {

// kata 6kyu Emotional Sort ( ︶︿︶) https://www.codewars.com/kata/5a86073fb17101e453000258/java

    public static String[] sortEmotions(boolean order,String[] emotions) {
        // (ง •̀_•́)ง
        
     
        String emoteOrder = order ? ":D:):|:(T_T" :"T_T:(:|:):D" ;
      
        
        for (int i =emotions.length-1; i>=0;i--){
          for (int j = 1; j<=i;j++){
            if(emoteOrder.indexOf(emotions[j])<emoteOrder.indexOf(emotions[j-1])){
              String temp = emotions[j];
              emotions[j]=emotions[j-1];
              emotions[j-1] = temp;
            }
          }
        }
      
        return emotions;
    }

}