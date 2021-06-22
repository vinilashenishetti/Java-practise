import java.util.*;
public class Perfectnumber {
 public static void main(String[] args) {
  int sumOfDigits = 0;
  //int number = 10000;
  for(int i = 1; i < 10000; i++) {
	  for(int j = 1; j < i; j++) {
		  if(i%j == 0) {
			  sumOfDigits += j;
		  }
	  }	 
	 // System.out.print(sumOfDigits);
	  if(sumOfDigits == i) {
		 System.out.println(sumOfDigits + " is a perfect number"); 
	  }
	  sumOfDigits = 0;
  }
  //System.out.print("Perfect numbers between 1 and 10000");
 }
}
