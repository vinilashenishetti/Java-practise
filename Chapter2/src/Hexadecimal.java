import java.util.Scanner;
public class Hexadecimal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
  System.out.println("enter the value of c");
  String c = input.next();
  int hexadecimalvalue = Integer.parseInt(c, 16);
  System.out.println("The hexadecimal value of " + c + " is : " +hexadecimalvalue);
 }
}
