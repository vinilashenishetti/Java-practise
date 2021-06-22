
public class Pivalues {
 public static void main(String[] args) {
  double pi = 0;
  
  for(int i = 1; i <= 100000; i++) {
	  pi += Math.pow(-1,(i+1))/((2*i) - 1); 
	  
   if(i == 10000) {
	   System.out.println("pi value at 10000: " + pi*4);
   }
   
   else if(i == 20000) {
	   System.out.println("pi value at 20000: " + pi*4);
   }
   
   else if(i == 100000) {
	   System.out.println("pi value at 100000: " + pi*4);
   }
  }
 }
}
