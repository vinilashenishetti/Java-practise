import java.util.*;
public class Rockpaperscissor {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int userWin = 0;
		 int computerWin = 0;
		 final int scissor = 0;
		 final int rock = 1;
		 final int paper = 2;
		 
		 System.out.print("scissor(0), rock(1), paper(2): ");
		 int userNumber = input.nextInt();
		 
		 while(userWin <= 2 || computerWin <= 2) {
		 Random random = new Random();
		 int computerNumber = random.nextInt(3);
		 System.out.println(computerNumber);
		 
		 switch(userNumber) {
		 case 0:
			 if(computerNumber == scissor)
				 System.out.println("The computer is scissor. You are scissor. It's a draw");
			 else if(computerNumber == rock) //{
				 System.out.println("The computer is rock. You are scissor. Computer won");
			     //computerWin++;
			 //}
			 else if(computerNumber == paper) //{
				 System.out.println("The computer is paper. You are scissor. You won");
				 //userWin++;
			 //}
			 break;
		 case 1:
			 if(computerNumber == scissor) //{
				 System.out.println("The computer is scissor. You are rock. You won");
				 //userWin++;
			 //}
			 else if(computerNumber == rock)
				 System.out.println("The computer is rock. You are rock. It's a draw");
			 else if(computerNumber == paper) //{
				 System.out.println("The computer is paper. You are rock. Computer won");
				 //computerWin++;
			 //}
			 break;
		 case 2:
			 if(computerNumber == scissor) //{
				 System.out.println("The computer is scissor. You are paper. Computer won");
				 //computerWin++;
			 //}
			 else if(computerNumber == rock) //{
				 System.out.println("The computer is rock. You are paper. You won");
				 //userWin++;
			 //}
			 else if(computerNumber == paper)
				 System.out.println("The computer is paper. You are paper. It's a draw");
		 }
	   }
	 }
}
