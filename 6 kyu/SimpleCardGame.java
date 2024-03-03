
public class SimpleCardGame {

	//kata 6 kyu Simple card game https://www.codewars.com/kata/53417de006654f4171000587/java


  public String winner(String[] deckSteve, String[] deckJosh) {
    // TODO
    
    int x=0;
    int y=0;
    String punt = "23456789TJQKA";
    for(int i = 0; i< deckSteve.length;i++){
      
      if(punt.indexOf(deckSteve[i].charAt(0)) > punt.indexOf(deckJosh[i].charAt(0)) ) x++;
      else if (punt.indexOf(deckSteve[i].charAt(0)) < punt.indexOf(deckJosh[i].charAt(0)) ) y++;
      
      
    }
    
    if (x>y) return "Steve wins "+x+ " to "+y;                        
    else if (x<y) return "Josh wins "+y+ " to "+x;                        
    return "Tie";
  }
}