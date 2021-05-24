import java.util.*;
public class PointInaCircle {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter a point with two coordinates: ");
	  int x2 = input.nextInt();
	  int y2 = input.nextInt();
	  
	  int x1 = 0;
	  int y1 = 0;
	  
	  double distanceToZero = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
	  
	  if(distanceToZero <= 10) {
		  System.out.print("Point (" + x2 + ".0, " + y2 + ".0) is in the circle");
	  }
	  else{
		  System.out.print("Point (" + x2 + ".0, " + y2 + ".0) is not in the circle");
	  }
  }
}
