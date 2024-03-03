public class GoodVsEvil {

	//kata 6 kyu Good vs Evil https://www.codewars.com/kata/52761ee4cffbc69732000738/java

  public static String battle(String goodAmounts, String evilAmounts) {
    String[] goodArmy = goodAmounts.split("\\s+");
    String[] evilArmy = evilAmounts.split("\\s+");
    
    int goodPoints = 0;
    int evilPoints = 0;
    
    for (int i = 0; i <goodArmy.length; i++){
      int multiplier = 1;
      switch (i){
          case 0:
            multiplier = 1;
            break;
          case 1:
            multiplier = 2;
            break;
          case 2,3:
            multiplier = 3;
            break;
          case 4:
            multiplier = 4;
            break;
          case 5:
            multiplier = 10;
            break;
          
            
      }
      
      goodPoints+=multiplier* Integer.valueOf(goodArmy[i]);
    }
    
    
    for (int i = 0; i <evilArmy.length; i++){
      int multiplier = 1;
      switch (i){
          case 0:
            multiplier = 1;
            break;
          case 1,2,3:
            multiplier = 2;
            break;
          case 4:
            multiplier = 3;
            break;
          case 5:
            multiplier = 5;
            break;
          case 6:
            multiplier = 10;
            break;
          
            
      }
      
      evilPoints+=multiplier* Integer.valueOf(evilArmy[i]);
    }
    
    if (goodPoints > evilPoints){
      return "Battle Result: Good triumphs over Evil";
    } else if (evilPoints > goodPoints){
      return "Battle Result: Evil eradicates all trace of Good";
    }
    
    return "Battle Result: No victor on this battle field";
  }
}