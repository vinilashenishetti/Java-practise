import java.util.*;
public class BMIChapter3 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
      final double METERS_PER_INCH = 0.0254; // Constant
      
		 System.out.println("Enter weight in pounds: ");
		 double weightInPounds = input.nextDouble();
		 
		 System.out.println("Enter height in feet and inches: ");
		 double heightInFeet = input.nextDouble();
		 double heightInInches = input.nextDouble();
		 
		 double weightInKilograms = weightInPounds*KILOGRAMS_PER_POUND;
		 
		 double heightInMeters = (heightInFeet * 0.3048) + (heightInInches * 0.0254);//5ft × 0.3048 + 2in × 0.0254 = 1.5748m
		 
		 double bodyMassIndex = weightInKilograms/Math.pow(heightInMeters,2);
		 
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













