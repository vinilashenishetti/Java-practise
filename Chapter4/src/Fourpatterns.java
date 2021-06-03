import java.util.*;
public class Fourpatterns {
   public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter number of lines to display: ");
	 int n = input.nextInt();
	 System.out.println("\n Pattern A");
	 for(int i=1; i<=n; i++) {         // pattern A
		 for(int j=1; j<=i; j++) {
			 System.out.print(j+" ");
		 }
		 System.out.println();
	 }
	 System.out.println("\n\n Pattern B");
	 for(int i=0; i<=n; i++) {         // pattern B
		 for(int j=1; j<=n-i; j++) {
			 System.out.print(j+" ");
		 }
		 System.out.println();
	 }
	 
	 System.out.println("\n\n Pattern C");
	 for(int i=1; i<=n; i++) {         // pattern C
		 for(int k=1; k<=n-i; k++) {
			 System.out.print("  ");
		 }
		 for(int j=i; j>=1; j--) {
		 System.out.print(j+" ");
		 }
		 System.out.println();
	 }
	 
	 System.out.println("\n\n Pattern D");
	 for(int i=0; i<=n; i++) {      //pattern D
		 for(int k=i; k>0; k--) {
			 System.out.print("  ");
		 }
		  for(int j=1; j<=n-i; j++) 
		   System.out.print(j+ " ");
		   System.out.println();
	 }
}
}






