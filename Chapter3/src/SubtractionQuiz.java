import java.util.*;
public class SubtractionQuiz {
 public static void main(String[] args) {
	 int number1 = (int)(Math.random()*10);
	 int number2 = (int)(Math.random()*10);
	 
	 if(number1<number2) {
		 int temp = number1;
		 number1 = number2;
		 number2 = temp;
	 }
	 Scanner input = new Scanner(System.in);
	 System.out.print("What is " + number1 + "-" + number2 + "?");
	 int answer = input.nextInt();
	 
	 if(number1-number2 == answer) 
	   System.out.println("Answer is correct");
	 else
		 System.out.println("Your answer is wrong \n" + number1 + " - " + number2 + " is " + (number1-number2));
 }
}
