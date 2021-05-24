import java.util.*;
public class PickACard {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 
	 Random random = new Random();
	 int cardRank = random.nextInt(13);
	 int cardSuit = random.nextInt(4);
	 
	 String rank[] = {"Ace" , "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "king"};
	 String suit[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
	 
	 System.out.print("The card you picked is: " +rank[cardRank] + " of: " + suit[cardSuit]);
 }
}
