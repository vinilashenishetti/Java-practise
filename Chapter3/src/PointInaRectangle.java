import java.util.*;
public class PointInaRectangle {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter a point with two coordinates: ");
	  int x = input.nextInt();
	  int y = input.nextInt();
	  
	  int rectangleWidth = 10;
	  int reactangleHeight = 5;
	  
	  if(x <= 10.0/2 && y <= 5.0/2) {
		  System.out.print("Point (" + x + ".0, " + y + ".0) is in the rectangle");
	  }
	  else {
		  System.out.print("Point (" + x + ".0, " + y + ".0) is not in the rectangle");
	  }
  }
}
