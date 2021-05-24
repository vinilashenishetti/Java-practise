import java.util.*;
public class LearnAddition {
 public static void main(String[] args) {
	 int number1 = (int)(Math.random()*100);
	 int number2 = (int)(Math.random()*100);
	 Scanner input = new Scanner(System.in);
	 System.out.print("What is " + number1 + "+" + number2 + "?");
	 int answer = input.nextInt();
	 
	 if(number1+number2 == answer) 
	   System.out.println("true");
	 else
		 System.out.println("false");
 }
}
