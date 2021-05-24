import java.util.*;
public class FutureDates {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	  System.out.println("Enter today's day: ");
	  int dayToday = input.nextInt();
	  System.out.println("Enter the number of days elapsed since today: ");
	  int futureDay = input.nextInt();
	  futureDay = (dayToday + futureDay)%7;
	  System.out.println("Today is " + daysOfWeek[dayToday] + " and the future day is " + daysOfWeek[futureDay]);
  }
}
