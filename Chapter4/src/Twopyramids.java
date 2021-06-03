//4.17 and 4.19
import java.util.*;
public class Twopyramids {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the number of lines to display: ");
	int n = input.nextInt();
	System.out.println("Solution for Chapter 4.17 Pyramid pattern");
	 for(int i=1; i<=n; i++) {         //4.17 pattern solution
		 for(int k=1; k<=n-i; k++) {
			 System.out.print("  ");
		 }
		 for(int j=i; j>=1; j--) {
		 System.out.print(j+" ");
		 }
		 for(int j=2; j<=i; j++) {
			 System.out.print(j+" ");
		 }
		 System.out.println();
	 }
	 System.out.println("\n\n Solution for Chapter 4.19 Pyramid pattern");        
	 for(int i=1; i<=n; i++) {         //4.17 pattern solution
		 for(int k=1; k<=n-i; k++) {
			 System.out.print("  ");
		 }
		for(int j=i; j>=1; j--) {
		 System.out.print((int)Math.pow(2, j)+ " ");
		 }
		 for(int j=1; j<=i+2; j++) {
			 System.out.print(j+" ");
		 }
		 System.out.println();
	 } 
 }
}
