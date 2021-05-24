
public class AverageSpeedkm {
 public static void main(String[] args) {
	 double totaldistance = 24*1.6; //convert miles to kilometers. 1mile=1.6km.
	 double hrs= 1;
	 double mins = 40;
	 double secs= 35;
	 double converttomin = hrs*60 + mins + secs/60;// convert to minutes
	 double timetaken = converttomin/60; //convert min to hrs
	 double averagespeed = totaldistance/timetaken;
	 System.out.println(averagespeed);
 }
}
