import java.util.*;
public class Sort3Integers {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter 3 integers");
	  int number1 = input.nextInt();
	  int number2 = input.nextInt();
	  int number3 = input.nextInt();
	  if(number1 > number2) {
         int temp1 = number1; //temp1 = 41
         number1 = number2;   // number1 = 21
         number2 = temp1;     // number2 = 41
	  }
	  if(number2 > number3) {
		  int temp2 = number2;  //temp2 = 41 
		  number2 = number3;    //number2 = 10
		  number3 = temp2;     //number 3 = 41
	  }
	  if(number1 > number2){
	         int temp3 = number1; //temp3 = 21
	         number1 = number2;   // number1 = 10
	         number2 = temp3;     // number2 = 21
		  }
	  System.out.println(number1 + " " + number2 + " " + number3);
  }
}
