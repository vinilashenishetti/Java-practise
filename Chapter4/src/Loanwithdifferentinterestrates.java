import java.util.*;
public class Loanwithdifferentinterestrates {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   
   System.out.print("Loan amount: ");
   double loanAmount = input.nextDouble();
   
   System.out.print("Number of Years: ");
   int numberOfYears = input.nextInt();
   
   System.out.printf("%2s%18s%18s\n", "Interest Rate", "Monthly Payment", "Total Payment");
   
   double annualInterestRate = 5.0;
   
   while(annualInterestRate <= 8.0) {
	 double monthlyInterestRate = annualInterestRate/1200;
	 
	 double monthlyPayment = loanAmount * monthlyInterestRate / 
			   (1 - 1/Math.pow(1 + monthlyInterestRate, numberOfYears*12));
	 
	 double totalPayment = monthlyPayment * numberOfYears * 12;
	 
	 System.out.printf("%-18.2f%-18.2f%-18.2f\n", annualInterestRate, monthlyPayment, totalPayment);
	 annualInterestRate = annualInterestRate + 1.0 / 8;
   }
  }
}
