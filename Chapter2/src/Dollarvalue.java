//2.24  page no: 78
import java.util.*;
public class Dollarvalue {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
     System.out.print("Enter dollar amount as an integer whose last two digits represent the cents, for example 1156 for $11.56: ");
	 int amount = input.nextInt();
     int remainingamount =0;
	 int dollars = amount/100;          // finding dollars from the amount
	 remainingamount = amount%100;
	 int quarters = remainingamount/25;        //finding quarters from remaining amount
	 remainingamount = remainingamount%25;
     int dimes = remainingamount/10;
     remainingamount = remainingamount%10;
     int nickels = remainingamount/5;
     remainingamount = remainingamount%5;
     int pennies = remainingamount;
		System.out.println("Your integer amount " + amount + " consists of " + "\n" + dollars + " dollars" + "\n"
				+ quarters + " quarters " + "\n" + dimes + " dimes" + "\n" + nickels + " nickels" + "\n" + pennies
				+ " pennies");
	   int quarter = 25;
	   int nickel = 5;
	   int dime = 10;
	   int penny =1;
	   int cents = (quarters*quarter)+ (nickels*nickel) + (dimes*dimes) + (pennies*penny);
	   System.out.println("Total amount is $" + dollars + "." + cents);
	   System.out.println("Total amount is " + dollars + "dollars and " + cents + "cents");
	}
}
