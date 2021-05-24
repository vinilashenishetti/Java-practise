import java.util.*;
public class Ascii {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
  System.out.println("enter the value of c");
  String c = input.next();
  char ch = c.charAt(0);
  int asciivalue = (int)ch;
  System.out.println("The ASCII value of " + ch + " is : " +asciivalue);
 }
}
