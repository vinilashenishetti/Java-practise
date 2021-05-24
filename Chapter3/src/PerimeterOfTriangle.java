import java.util.*;
public class PerimeterOfTriangle {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  
	  System.out.println("Enter three edges for a traingle: ");
	  int edge1 = input.nextInt();
	  int edge2 = input.nextInt();
	  int edge3 = input.nextInt();
	  
	  int perimeter = edge1+edge2+edge3;
	  if((edge2+edge3)>edge1 && (edge1+edge3)>edge2 && (edge1+edge2)>edge3) {
	      System.out.println("Input is valid. The perimeter of triangle is: " + perimeter);
	  }
	  else {
		  System.out.println("Input is invalid");
	  }
  }
}
