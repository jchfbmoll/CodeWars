public class CountIPAddresses {

//kata 5kyu Count IP Addresses https://www.codewars.com/kata/526989a41034285187000de4/java

	public static long ipsBetween(String start, String end) {
    
    String[] ip1 =start.split("[.]");
    String[] ip2 =end.split("[.]");

    long ip1total = 1;
    long ip2total = 1;
    

    for(int i = 0; i <ip1.length; i++){
    
      ip1total +=(long) Math.pow(256, 3-i) * (Long.parseLong(ip1[i],10) +1);
      ip2total +=(long) Math.pow(256, 3-i) * (Long.parseLong(ip2[i],10) +1);

    }

    return Math.abs(ip1total-ip2total);
	}
}