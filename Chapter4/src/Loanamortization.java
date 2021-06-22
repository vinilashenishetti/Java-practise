import java.util.*;
public class Loanamortization {
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Loan amount: ");
	double loanAmount = input.nextDouble();
	   
	System.out.print("Number of Years: ");
	int numberOfYears = input.nextInt();
	
	System.out.print("Annual Interest Rate:");
	double annualInterestRate = input.nextDouble();
	
	double monthlyInterestRate = annualInterestRate/1200;
	 
	double monthlyPayment = loanAmount * monthlyInterestRate / 
			   (1 - 1/Math.pow(1 + monthlyInterestRate, numberOfYears*12));
	
	System.out.print("Monthly Payment: ");
	System.out.printf("%.2f", monthlyPayment);
	 
	double totalPayment = monthlyPayment * numberOfYears * 12;
	
	System.out.println();
	System.out.print( "Total Payment: ");
	System.out.printf("%.2f",totalPayment);
	
	double balance = loanAmount;
	
	System.out.println();
	System.out.printf("%2s%18s%18s%18s\n", "Payment#", "Monthly Interest", "Principal", "Balance");
	
	for(int i = 1; i <= numberOfYears * 12; i++) {
	 double monthlyInterest = monthlyInterestRate * balance;
	 double principal = monthlyPayment - monthlyInterest;
	 balance = balance - principal;
	 System.out.printf("%-18d%-18.2f%-18.2f%-18.2f\n", i, monthlyInterest, principal, balance);
	}
 }
}
