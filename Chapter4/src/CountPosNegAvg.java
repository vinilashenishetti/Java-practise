import java.util.*;
public class CountPosNegAvg {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  int number = -1;
	  int positive = 0;
	  int negative = 0;
	  int total = 0;
	  int count = 0;
	  System.out.println("Enter an integer, the input ends if it is 0: ");
	  while(number!=0) {
		  number = input.nextInt();
		  count++;
		  total += number;
		  if(number == 0) {
			  System.out.print("No numbers are entered except 0"); 
			  System.exit(0);
		  }
	  if(number>0) {
		  positive++;  
	  }
	  if(number<0) {
		  negative++;
	  }
	}
	  float average = total/count;
	  System.out.print("The number of positive numbers are " +positive);
	  System.out.print("\nThe number of negative numbers are " +negative);
	  System.out.print("\nThe total is " +total);
	  System.out.print("\nThe average is " + average);
  }
}
