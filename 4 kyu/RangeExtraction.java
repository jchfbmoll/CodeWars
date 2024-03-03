class RangeExtraction {
	
	//kata 4 kyu Range Extraction https://www.codewars.com/kata/51ba717bb08c1cd60f00002f/java
	
		public static String rangeExtraction(int[] arr) {
        
        String sol ="";
        
        int range = 1;
        
        for (int i = 1;i<arr.length; i++){
          
           if (arr[i]==arr[i-1]+1){
             
             range++;
           } else{
             
             if (range<3){
               
               for (int j = 0; j < range;j++){
                 
                 sol+=arr[i-range+j]+",";
                 
               }
             } else{
               sol+= arr[i-range]+"-"+arr[i-1]+",";
               
             }
             range = 1;
           }
          
        }
        if (range<3){
               
               for (int j = 0; j < range;j++){
                 
                 sol+=arr[arr.length-range+j]+",";
                 
               }
             } else{
               sol+= arr[arr.length-range]+"-"+arr[arr.length-1];
               
             }
        StringBuilder sol1 = new StringBuilder(sol);
        
        if (sol1.charAt(sol1.length()-1)==',') sol1.deleteCharAt(sol1.length()-1);
    		return sol1.toString();
    }
}