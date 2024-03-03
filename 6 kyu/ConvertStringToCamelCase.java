import java.lang.StringBuilder;

// kata 6kyu Convert string to camel case https://www.codewars.com/kata/517abf86da9663f1d2000003/java


class ConvertStringToCamelCase{

  static String toCamelCase(String s){
    
    
    String[] patro= s.split("_|-");
    
    String sol="";
    
    for (int i=0; i < patro.length; i++){
      
      if (i==0){
        sol+=patro[i];
      }else{
        sol+=Character.toUpperCase(patro[i].charAt(0))+patro[i].substring(1,patro[i].length());
      }
      
    }
    
    return sol;
  }
}