import java.util.*;
public class Example {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter a number: ");
	 int number = input.nextInt();
	 /*if(number%2 == 0) {
		 System.out.println(number + "is even");
	 if(number%5 == 0)
		 System.out.println(number + "is multiple of 5");
	 }*/
	 if(number % 2 == 0) 
		 System.out.println(number + "is even");
	if(number % 5 == 0)
		 System.out.println(number + "is multiple of 5");
 }
}
