import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Kata {

	public static List<Point> closestPair(List<Point> points) {
    
    
    double distance = Double.MAX_VALUE;// first one to check distance, second for knowing which node is closest one   
    Point pointA = new Point();
    Point pointB = new Point();
    
    for (int i = 0; i<points.size()-1;i++){
      for (int j =i+1; j<points.size();j++){
     
        double dist = Math.sqrt(Math.pow(points.get(i).x-points.get(j).x,2)+ Math.pow(points.get(i).y-points.get(j).y,2));
        
        
          if (dist< distance){
            distance = dist;
            pointA = (Point) points.get(i);
            pointB = (Point) points.get(j);
          }
        }
      }  
  
    List<Point> listPoint = new ArrayList<>();
    listPoint.add(pointA);
		listPoint.add(pointB);
    return listPoint;
	}
  

}