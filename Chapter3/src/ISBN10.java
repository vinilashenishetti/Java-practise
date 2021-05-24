import java.util.*;
public class ISBN10 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter the first 9 digits of an ISBN as integer: ");
	  //String isbn = input.next();
	  //System.out.println(isbn);
//	  String isbnNumberString = input.next();
	  int isbnNumber = 12345678;//Integer.parseInt(isbnNumberString);
//	  System.out.println("num" + isbnNumber + "string" + isbnNumberString);
	  Scanner in = new Scanner(System.in);
	    String number = in.next();
	    int numDigits = number.length();
	    System.out.println(numDigits);
	  int sum = 0;
	  long temp = isbnNumber; 
	  long d10 = 0;
	 // isbnNumber = reverseISBN(isbnNumber);
	 for(int i=1; i<=9; i++) {
		 int tempisbnNumber = (int) (temp%10);
		  System.out.println("d" + (10 - i) + "=" +tempisbnNumber);
		  System.out.println("d" + (10 - i) + "*" + (10 - i) + " -> " + tempisbnNumber + "*" + (10 - i) + "=" +(tempisbnNumber*(10-i)));
		  sum = sum + (tempisbnNumber*(10 - i));
		  System.out.println("sum =" +sum);
		  temp /= 10;
		  System.out.println("temp =" +temp);
	  }
	  d10 = sum%11;
	  System.out.println("The ISBN-10 number is: " + isbnNumber + d10);
  }
 /* public static int reverseISBN(int isbnNumber1) {
	  int reverse = 0;
	  while (isbnNumber1!=0) {
		  int digit = isbnNumber1%10;
		  System.out.println(digit);
		  reverse = reverse * 10 + digit;
		  System.out.println(reverse);
		  isbnNumber1 /= 10;
		  System.out.println(isbnNumber1);
	  }
	  return isbnNumber1;
  }*/
}