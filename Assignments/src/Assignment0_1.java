import java.util.*;
public class Assignment0_1 {
 public static void main(String[] args) {
	 final float tvPrice = (float) 400.00;
	 final float vcrPrice = (float) 220;
	 final float remoteControllerPrice = (float) 35.20;
	 final float cdPlayerPrice = (float) 300.00;
	 final float tapeRecorderPrice = (float) 150.00;
	 final float taxes = (float) 8.25;
	 Scanner input = new Scanner(System.in);
	 System.out.print("How many TV's were sold? ");
	 int tvs = input.nextInt();
	 System.out.print("How many VCR's were sold? ");
	 int vcrs = input.nextInt();
	 System.out.print("How many remote Controller's were sold? ");
	 int remoteControllers = input.nextInt();
	 System.out.print("How many CD's were sold? ");
	 int cds = input.nextInt();
	 System.out.print("How many Tape Recorder's were sold? ");
	 int tapeRecorders = input.nextInt();
	 float tvTotal = tvs*tvPrice;
	 float vcrTotal = vcrs*vcrPrice;
	 float remoteControllerTotal = remoteControllerPrice*remoteControllers;
	 float cdPlayerTotal = cds*cdPlayerPrice;
	 float tapeRecorderTotal = tapeRecorders*tapeRecorderPrice;
	 System.out.printf("QTY\tDESCRIPTION\t\tUNIT PRICE\t\tTOTAL PRICE\n" 
		      + tvs + "\tTV" + "\t\t\t" + tvPrice + "\t\t\t" +tvTotal+ "\n" 
		      + vcrs + "\tVCR" + "\t\t\t" + vcrPrice + "\t\t\t" + vcrTotal+ "\n" 
		      + remoteControllers + "\tREMOTE CONTROLLER" + "\t" + remoteControllerPrice + "\t\t\t" + remoteControllerTotal+ "\n" 
		      + cds + "\tCDPLAYER" + "\t\t" + cdPlayerPrice + "\t\t\t" + cdPlayerTotal+ "\n" 
		      + tapeRecorders + "\tTAPE RECORDER" + "\t\t" + tapeRecorderPrice + "\t\t\t" + tapeRecorderTotal);
	 float subtotal = tvTotal + vcrTotal + remoteControllerTotal + cdPlayerTotal + tapeRecorderTotal;
	 float taxTotal = (float) (subtotal * 0.0825);
	 float total = subtotal + taxTotal;
	 System.out.println("\n\t\t SUBTOTAL " +subtotal);
	 System.out.println("\t\tTAX " +taxes + "%");
	 System.out.println("\t\tTOTAL " +total);
 }
}
      
/*Write a program to create a customer's bill for a company. The company sells only five different products: 
TV, VCR, Remote Controller, CD Player and Tape Recorder. 
The unit prices are $400.00, $220, $35.20, $300.00 and $150.00 respectively. 
The program must read the quantity of each piece of equipment purchased from the keyboard.
It then, calculates the cost of each item, the subtotal and the total cost after an 8.25% sales tax. 
The input data consists of a set of integers representing the quantities of each item sold. 
These integers must be input into the program in a user- friendly way; 
that is, the program must prompt the user for each quantity as shown below - 

How many TV's were sold? 3 
How many VCR's were sold? 5 
How many remote controller's were sold? 1 
How many CD's were sold? 2 
How many Tape Recorder's were sold? 4 
 
The output of the program should print the following data properly formatted: 
QTY  DESCRIPTION  UNIT PRICE  TOTAL PRICE 

...

				 SUBTOTAL 
				      TAX 
                  TOTAL 

Define constants for the unit prices and the tax rate. 
Use integer variables to store the quantities for each item.
Use floating-point variables to store the total price of each item, the bill subtotal, the tax amount and and the total amount of the bill. 
 Run your program two times with the following data: 


Set 1 -> 2 1 4 1 2 
Set 2 -> 3 0 2 0 21 
Format the output adequately showing the 4 columns 
(QTY, DESCRIPTION, UNIT PRICE, TOTAL PRICE) in a single row. Use System.out.printf for output. */
