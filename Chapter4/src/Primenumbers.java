import java.util.*;
public class Primenumbers {
   public static void main(String[] args) {
	 int prime_numbers_per_line = 8;
	 int low_prime = 2;
	 int high_prime = 1000;
	 int count = 0;
	 while(low_prime<=high_prime) {
	   boolean isPrime = true;
	 for(int number = 2; number <= low_prime/2; number++) {
	   if(low_prime%number == 0) {
		 isPrime = false;
		 break;
		}
	  }
	  if(isPrime) {
		count++;
	  if(count%prime_numbers_per_line == 0) {
	    System.out.println(low_prime);
	  }
	  else 
		System.out.print(low_prime + " ");
	 }
	  low_prime++; //check if the next number is prime
	}
  }
}

