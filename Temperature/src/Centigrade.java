import java.util.Scanner;
public class Centigrade {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	 System.out.println("enter a temperature in Centigrade");
	 double c = sc.nextDouble();
     double f= 32.0 + (c*(180.0/100.0));
     System.out.print("temperature in farhenheit is" + " " +f); 
		 
 }
 }
