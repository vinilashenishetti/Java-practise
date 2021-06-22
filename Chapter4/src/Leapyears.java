
public class Leapyears {
 public static void main(String[] args) {
	int leapYearsPerLine = 10;
	int noOfLeapYear = 0;
	for(int year = 2001; year <= 2100; year++) {
	boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	
	if(isLeapYear) {
	  noOfLeapYear++;
	  System.out.print(year + " ");
	if(noOfLeapYear%leapYearsPerLine == 0) {
	  System.out.println();
    }
   }
  }
	System.out.println("\nThe number of leap year between 2001 and 2100 is "
		    + noOfLeapYear);
 }
}


   

