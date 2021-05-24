//2.13  page no: 77
import java.util.*;
public class Compoundvalue {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter the monthly saving amount: ");
	  double monthlySavingAmount = input.nextDouble();
	  double monthlyInterestRate =  (double) (0.05/12);
	  double accountValueThisMonth = 0;
	  for(int i=0; i<=5; i++) {
	  accountValueThisMonth = (monthlySavingAmount + accountValueThisMonth)*(1+monthlyInterestRate);
	  }
	  System.out.printf("After the sixth month, the account value is: %.3f \n", accountValueThisMonth);
  }
}