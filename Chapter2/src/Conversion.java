//2.3,2.4  page no: 75
import java.util.*;
public class Conversion {
 public static void main(String[] args) {
	 Scanner input1 = new Scanner(System.in);
	 System.out.print("Enter the value for feet: ");
	 float feet = input1.nextFloat();
	 float feettometer = (float) (feet * 0.305);
	 System.out.println(feet + " feet is " + feettometer + " meters");
	 
	 Scanner input2 = new Scanner(System.in);
	 System.out.print("Enter a number in pounds: ");
	 float pounds = input2.nextFloat();
	 System.out.println(pounds + " pounds is " + poundToKilograms(pounds) + " kilograms");
 }
 public static float poundToKilograms(float pounds1) {
	 float poundtokg = (float) (pounds1 * 0.454);
	 return poundtokg;
 }
}
