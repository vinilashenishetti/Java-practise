import java.util.Scanner;
public class BMI {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter weight in pounds: ");
	 double weight = input.nextDouble();
	 System.out.println("Enter height in inches: ");
	 double height = input.nextDouble();
	 weight = weight*0.45459237;
	 height = height*0.0254;
	 double bodyMassIndex = weight/Math.pow(height,2);
	 System.out.println("BMI is:" +bodyMassIndex);
	 
	 if(bodyMassIndex < 18.5)
		 System.out.println("Underweight");
	 else if(bodyMassIndex < 25)
		 System.out.println("Normal");
	 else if(bodyMassIndex < 30)
		 System.out.println("Overweight");
	 else
	    System.out.println("Obese");
 }
}