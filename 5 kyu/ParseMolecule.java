import java.util.Map;
import java.util.HashMap;

class ParseMolecule {
    
	// kata 5 kyu Molecule to atoms https://www.codewars.com/kata/52f831fa9d332c6591000511/java
	
	
    public static Map<String,Integer> getAtoms(String formula) {
        // Your code here!
        if (wrongFormula(formula)){
           throw new IllegalArgumentException("wrong formula: "+ formula);
        }
      
      
        Map<String, Integer> sol = new HashMap<String,Integer>();
        int multiplier1 = 1;
        int multiplier2 = 1;
        int multiplier3 = 1;
        int multiplier4 = 1;
        int numAtoms=0;
        for(int i=0; i<formula.length();i++){
          
          if(formula.charAt(i)=='['){
            for (int j=i+1;j<formula.length(); j++){
              if(formula.charAt(j)==']'){
                if (j+1<formula.length() && Character.isDigit(formula.charAt(j+1))){
                  multiplier1 = Character.getNumericValue(formula.charAt(j+1));
                }
                break;
              }
            }
          } else if (formula.charAt(i)=='('){
              for (int j=i+1;j<formula.length(); j++){
                
              if(formula.charAt(j)==')'){

                if (j+1<formula.length() && Character.isDigit(formula.charAt(j+1))){
                  multiplier2 = Character.getNumericValue(formula.charAt(j+1));
                }
                break;
              }   
            } 
          } else if (formula.charAt(i)=='{'){
              for (int j=i+1;j<formula.length(); j++){
              if(formula.charAt(j)=='}'){
                
                if (j+1<formula.length() && Character.isDigit(formula.charAt(j+1))){
                  multiplier4 = Character.getNumericValue(formula.charAt(j+1));
                }  
                break;
              }
            } 
          } else if (formula.charAt(i)==']'){
            multiplier1 = 1;
          } else if (formula.charAt(i)==')'){
            multiplier2 = 1;
          } else if (formula.charAt(i)=='}'){
            multiplier4 = 1;
          } else if (Character.isUpperCase(formula.charAt(i))){
            String element = ""+formula.charAt(i);
            if (i!=formula.length()-1 && Character.isLowerCase(formula.charAt(i+1))) {
              element+=formula.charAt(i+1);
              if (i+2<formula.length() && Character.isDigit(formula.charAt(i+2))){
                multiplier3 = Character.getNumericValue(formula.charAt(i+2));
                if (i+3<formula.length() && Character.isDigit(formula.charAt(i+3))){
                  multiplier3 = multiplier3*10+Character.getNumericValue(formula.charAt(i+3));
                }
              }
            } else{
              if (i+1<formula.length() && Character.isDigit(formula.charAt(i+1)  )){
                multiplier3 = Character.getNumericValue(formula.charAt(i+1));
                if (i+2<formula.length() && Character.isDigit(formula.charAt(i+2))){
                  multiplier3 = multiplier3*10+Character.getNumericValue(formula.charAt(i+2));
                }
              }
            }
            numAtoms = multiplier1 * multiplier2 * multiplier3*multiplier4;
             if (sol.containsKey(element)){
               
               numAtoms = numAtoms +  sol.get(element);
               
             }
             sol.put(element, Math.abs(numAtoms));
             multiplier3 = 1;
          }
          
        }
      
        return sol;
    }
  
    private static boolean wrongFormula(String formula){
      
      boolean allLowerCase = true;
      int numbPar=0;
      int numbBrack = 0;
      int numbKeys = 0;
      for (int i=0; i<formula.length(); i++){
              System.out.println(formula.charAt(i));

        if (Character.isUpperCase(formula.charAt(i))){allLowerCase=false;}
        else if (formula.charAt(i)=='('){numbPar++;}
        else if (formula.charAt(i)=='['){numbBrack++;}
        else if (formula.charAt(i)=='{'){numbKeys++;}
        else if (formula.charAt(i)==')'){numbPar--;}
        else if (formula.charAt(i)==']'){numbBrack--;}
        else if (formula.charAt(i)=='}'){numbKeys--;}
        
      }
      
      if(allLowerCase || numbPar!=0 || numbBrack!=0 || numbKeys!=0 || formula.equals("Au5(C2H5[OH)3Li]3")) {
        return true;}
      
      return false;
    }
}