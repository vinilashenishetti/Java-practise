import java.util.*;
public class Maxnumberandoccurences {
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int number = -1, max = 0, count = 0;
	System.out.print("Enter numbers: ");
	while(number != 0) {
		number = input.nextInt();
		if(number > max) {
			max = number;
			count = 1;
		}
		else if(number == max) {
		count++;
	  }
	}
	System.out.println("The largest number is " + max);
	System.out.println("The occurence count of the largest number is " + count);
 }
}
