import java.util.*;
public class Patterns {
   public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number of lines to display: ");
	int n = input.nextInt();
	for(int i=1; i<=n; i++) {      //pattern A
		for(int j=1; j<=i; j++) {
			System.out.print(i+ " ");
	  }
	    System.out.println();
	}
	
	for(int i=1; i<=n; i++) {      //pattern B
		for(int j=1; j<=i; j++) {
			System.out.print(j+ " ");
	  }
	    System.out.println();
	}
	
	int count = 1;               //pattern C
	 for(int i=1; i<=n; i++) {
		 for(int j=1; j<=i; j++) {
			 System.out.print(count+ " ");
			 count++;
		 }
		 System.out.println();
	 }
	 
	 for(int i=1; i<=n; i++) {      //pattern D
		 for(int j=n; j>=i; j--) {
			 System.out.print(" ");
		 }
		  for(int k=1; k<=i; k++) 
		   System.out.print(i+ " ");
		   System.out.println();
	 }
   
   for(int i=1; i<=n; i++) {      //pattern E
		 for(int j=n; j>=i; j--) {
			 System.out.print(" ");
		 }
		  for(int k=1; k<=i; k++) 
		   System.out.print(k+ " ");
		   System.out.println();
	 }
   
   int number = 1; //instead of count variable
   for(int i=1; i<=n; i++) {      //pattern F
		 for(int j=n; j>=i; j--) {
			 System.out.print(" ");
		 }
		  for(int k=1; k<=i; k++,number++) 
		   System.out.print(number+ " ");
		   System.out.println();
	 }
   
   }
 }
