//2.2 page no: 75
import java.util.*;
public class Volume {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.println("enter the value of radius and length of a cylinder: ");
	 float radius = input.nextFloat();
	 float length = input.nextFloat();
	 float area = (float) (radius * radius * Math.PI);
	 float volume = area * length;
	 System.out.printf("The area is : %.4f \n", area);
	 System.out.printf("The volume is : %.2f ", volume);
 }
}
