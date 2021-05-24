import java.util.*;
public class Quadratic {
	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        System.out.println("Enter values for a, b, and c now: ");
	        double a = input.nextDouble();
	        double b = input.nextDouble();
	        double c = input.nextDouble();
            double discriminant = Math.pow(b, 2) - 4 * a * c;

	        if (discriminant < 0) {
	            System.out.println("The discriminate is negative, the equation has no real roots.");
	        } else if (discriminant == 0) {

	            double oneRoot = ((-b) + (Math.pow(discriminant, 0.5))) / (2 * a);

	            System.out.print("One real root: " + oneRoot);

	        } else {

	            double root, twoRoot;
	            root = ((-b) + (Math.pow(discriminant, 0.5))) / (2 * a);
	            twoRoot = ((-b) - (Math.pow(discriminant, 0.5))) / (2 * a);

	            System.out.print("Two real roots: " + root + " " + twoRoot);
	        }
	        input.close();
	    }

	}
