//2.11  page no: 76
import java.util.*;
public class Population {
	//static int birth = 7;
	//static int death = 13;
	//static int immigrants = 45;
	//static int currentPopulation = 312032486;
	 
	public static void main(String[] args) {
		int birth = 7;
		int death = 13;
		int immigrants = 45;
		int currentPopulation = 312032486;
		var populationThisYear = currentPopulation;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of years: ");
		int numberOfYears = input.nextInt();
	 for (int i=1; i<=numberOfYears; i++) {
		 populationThisYear += convertToYears(birth, death, immigrants); 
	 }
	 System.out.println("population in " + numberOfYears + " years is " + populationThisYear);
	}

	public static int convertToYears(int birth, int death, int immigrants) {
		int seconds = 365*60*60*24; //((24hrs/day)*(60secs/hr)*(60mins/hr))*365days
		int birthsPerYear = seconds/birth;
		int deathsPerYear = seconds/death;
		int immigrantsPerYear = seconds/immigrants;
		int deltaPopulation = birthsPerYear - deathsPerYear + immigrantsPerYear;
		return deltaPopulation;
	}
}
