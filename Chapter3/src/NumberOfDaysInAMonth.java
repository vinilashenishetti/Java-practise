import java.util.*;
public class NumberOfDaysInAMonth {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	String monthOfName = null;
    	int daysInMonth = 0;
    	System.out.println("Enter the month number between 1 and 12 (1: Jan .... 12:Dec): ");
    	int month = input.nextInt();
    	System.out.println("Enter the year: ");
    	int year = input.nextInt();
    	//if(month == 1 || month ==3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
    	//	System.out.println(" had 31 days");
    	//}
    	switch(month) {
    	case 1:
    		monthOfName = "January";
    		daysInMonth = 31;
    		break;
    	case 2:
    		monthOfName = "February";
    		if(year%4==0) {
    		    daysInMonth = 29;
    		}
    		else
    		{
    			daysInMonth = 28;
    		}
    		break;
    	case 3:
    		monthOfName = "March";
    		daysInMonth = 31;
    		break;
    	case 4:
    		monthOfName = "April";
    		daysInMonth = 30;
    		break;
    	case 5:
    		monthOfName = "May";
    		daysInMonth = 31;
    		break;
    	case 6:
    		monthOfName = "June";
    		daysInMonth = 30;
    		break;
    	case 7:
    		monthOfName = "July";
    		daysInMonth = 31;
    		break;
    	case 8:
    		monthOfName = "August";
    		daysInMonth = 31;
    		break;
    	case 9:
    		monthOfName = "September";
    		daysInMonth = 31;
    		break;
    	case 10:
    		monthOfName = "October";
    		daysInMonth = 31;
    		break;
    	case 11:
    		monthOfName = "November";
    		daysInMonth = 31;
    		break;
    	case 12:
    		monthOfName = "December";
    		daysInMonth = 31;
    		break;
    	}
    	System.out.print(monthOfName + " " + year + " had " + daysInMonth + " days\n");
    }
}
