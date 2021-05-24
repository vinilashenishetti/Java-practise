//2.5  page no: 75
import java.util.*;
public class Tips {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter the subtotal and a gratuity rate: ");
	 double subtotal = input.nextDouble();
	 double gratuityrate = input.nextDouble();
	 double gratuity = subtotal * (gratuityrate/100);
	 double total = subtotal + gratuity;
	 System.out.println("The gratuity is $"+ gratuity + " and total is $" + total);
 }
}
