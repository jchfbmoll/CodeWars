public class int32toIPv4 {

// kata 5kyu int32 to IPv4 https://www.codewars.com/kata/52e88b39ffb6ac53a400022e/java

	public static String longToIP(long ip) {
    // Java doesn't have uint32, so here we use long to represent int32
    
    StringBuilder ipbin = new StringBuilder("");

    while (ip>0){

      ipbin.append(ip%2);
      ip/=2;
    }
    ipbin.reverse();

    int[] ipv4 = {0, 0, 0, 0};
    int indexarr = 4;
    for (int i = 0; i<ipbin.length(); i++){

      if (i%8==0){
       
        
        indexarr--;
        
      }
      int temp =(int) (Math.pow(2, i%8) * Character.getNumericValue(ipbin.charAt(ipbin.length()-1-i)));
        ipv4[indexarr]+=temp;
    
    }   

		return ""+ipv4[0]+"."+ipv4[1]+"."+ipv4[2]+"."+ipv4[3];
	}
}