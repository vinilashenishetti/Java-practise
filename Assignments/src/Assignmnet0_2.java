import java.util.Scanner;
public class Assignmnet0_2 {
	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in); 
			 System.out.println("enter a temperature in Centigrade");
			 double c = sc.nextDouble();
		     double f= 32.0 + (c*(180.0/100.0));
		     System.out.print("temperature in farhenheit is" + " " +f); 
				 
		 }
}
 /*public static void main(String[] args) {
	 takeInputFromUser();
	  
 }
public static void takeInputFromUser() {
	Scanner sc = new Scanner(System.in); 
	 System.out.println("enter a temperature in Centigrade");
	 try {
		 double c = sc.nextDouble();
		 System.out.print("temperature in farhenheit is" + " " +fahrenheittocentigrade(c)); 
	 }
	 catch(Exception e) {
		 System.out.println("invalid entry, try again");
		 takeInputFromUser();
	 }
}

private static double fahrenheittocentigrade(double c) {
	
	return 32.0 + (c*(180.0/100.0));
}
}*/

