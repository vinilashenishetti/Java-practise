import java.util.*;
public class Fourpatterns {
   public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter number of lines to display: ");
	 int n = input.nextInt();
	 for(int i=1; i<=n; i++) {
		 for(int j=1; j<=i; j++) {
			 System.out.print(j+" ");
		 }
	 }
}
}
