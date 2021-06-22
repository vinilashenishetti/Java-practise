import java.util.*;
public class Lottery4 {
 public static void main(String[] args) {
	 int lotteryDigit1;
	 int lotteryDigit2;
	 int lottery = (int) (Math.random()*100);
	   
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter a two digit lottery guess number: ");
	   int guessLottery = input.nextInt();
	   
	   do {
	   lotteryDigit1 = lottery / 10;
	   lotteryDigit2 = lottery % 10;
	   } while(lotteryDigit1 == lotteryDigit2);
	   
	   int guessDigit1 = guessLottery / 10;
	   int guessDigit2 = guessLottery % 10;
	   
	   System.out.println("Lottery number is: " + lottery);
	   
	   if(guessLottery == lottery) {
		   System.out.println("Exact match and award is $10,000");
	   }
	   else if(guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1) {
		   System.out.println("Match all digits and award is $3,000");
	   }
	   else if(guessDigit1 == lotteryDigit1 
			   || guessDigit1 == lotteryDigit2 
			   || guessDigit2 == lotteryDigit1 
			   || guessDigit2 == lotteryDigit2) {
		   System.out.println("Match one digit and award is $1,000");
	   }
	   else
		   System.out.println("Sorry, no match");
   
 }
}
