//2.7  page no: 76
import java.util.*;
public class Numberofyears {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter the number of minutes: ");
	 int minutes = input.nextInt();
	 int years = minutes/525600;
	 int days = (minutes%525600)/1440;//(minutes - (years*525600))/1440;
	 System.out.println(minutes +" minutes is approximately " +years+ " years and "+days+ " days");
  }
}
