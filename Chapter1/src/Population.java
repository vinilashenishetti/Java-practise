
public class Population {
	static int birth = 7;
	static int death = 13;
	static int immigrants = 45;
	static int currentPopulation = 312032486;
	 
	public static void main(String[] args) {
		int birth = 7;
		int death = 13;
		int immigrants = 45;
		int currentPopulation = 312032486;
		var populationThisYear = currentPopulation;
	 for (int i=1; i<=5; i++) {
		 populationThisYear += convertToYears(); 
		 System.out.println("population in " + i + " year is " + populationThisYear);
	 }
	 
	 populationThisYear = currentPopulation;
	 for (int i=1; i<=5; i++) {
		 populationThisYear += convertToYearsPerType(birth) - convertToYearsPerType(death) + convertToYearsPerType(immigrants); 
		 System.out.println("population in " + i + " year is " + populationThisYear);
	 }
	}
	public static int convertToYears() {
		int seconds = 365*60*60*24; //((24hrs/day)*(60secs/hr)*(60mins/hr))*365days
		int birthsPerYear = seconds/birth;
		int deathsPerYear = seconds/death;
		int immigrantsPerYear = seconds/immigrants;
		int deltaPopulation = birthsPerYear - deathsPerYear + immigrantsPerYear;
		return deltaPopulation;
	}
	
	public static int convertToYearsPerType(int seconds) {
		int secondsInYear = 365*60*60*24;   // ((24hrs/day)*(60secs/hr)*(60mins/hr))*365days
		return secondsInYear/seconds;
	}	
}
