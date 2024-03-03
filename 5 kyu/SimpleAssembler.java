import java.util.HashMap;
import java.util.Map;

//kata 5kyu Simple assembler interpreter https://www.codewars.com/kata/58e24788e24ddee28e000053/java


public class SimpleAssembler {
  public static Map<String, Integer> interpret(String[] program){
    
    Map<String,Integer> res = new HashMap<>();
    
    
    String alph = "abcdefghijklmnopqrstuvwxyz";
    
    for(int i = 0; i<program.length;i++){
      try{
      String[] part = program[i].split("\\s+");
      switch(part[0]){
          
          case "mov":
            if (part[2].matches("-?\\d+")){
              res.put(part[1], Integer.valueOf(part[2]));
            } else {
              res.put(part[1], res.get(part[2]));
            }
            break;
          case "inc":
            int value = res.get(part[1]);
            value++;
            res.put(part[1], value);
            break;
          case "dec":
            
            res.put(part[1], res.get(part[1])-1);
            break;
          case "jnz":
              if (part[1].matches("-?\\d+")){
                part[1]= alph.charAt(Integer.valueOf(part[1]))+"";
              }
              if (res.get(part[1])!=0){
                i=i-1+Integer.valueOf(part[2]);
              }
              break;
      } 
      
      } catch (Exception e){
        
        break;
      }
      
      
    }
    return res;
  }
}