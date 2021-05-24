//2.6  page no: 75
import java.util.*;
public class Sumthedigits {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter a number between 0 and 1000");
		 int number = input.nextInt();
		 int sum = 0;
		while (number>0) {
         sum += (number % 10);
         number /= 10;
		 }
	    System.out.print(sum);

 }
}
