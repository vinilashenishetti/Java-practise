import java.util.*;
public class FutureTuition {
  public static void main(String[] args) {
	  int tuitionFee = 10000;
	  double tuitionFeeIncrement = 0.05;
	  int tuitionFeeAfterTenYears = 0;
	  for(int i=0; i<14; i++) {
		 tuitionFee += tuitionFee * tuitionFeeIncrement;
		 //System.out.println("Tuition fee in " +i+ " year is: " +tuitionFee);
		 if(i==9) {
			  System.out.println("Tuition fee in ten years is: "+tuitionFee);
		  }
		 if(i==10||i==11||i==12||i==13) {
			 tuitionFeeAfterTenYears += tuitionFee;
		}
	  }
	  System.out.println("Total cost of four years worth of tuition starting ten years from now is: " +tuitionFeeAfterTenYears);
  }
}
