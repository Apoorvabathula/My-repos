package lab00;

import java.util.Scanner;

public class Lab00PrintReceipt {
    
	// Declare constants to hold the Unit price (in dollars) of each type of item,
	// and set their values to be the given unit prices, per the assignment.
	static final double UP_TV  = 400.0;	// Unit Price for TV
	static final double UP_VCR = 220.0;	// Unit Price for VCR
	static final double UP_RC  = 35.20;	// Unit Price for Remote Controller
	static final double UP_CDP = 300.0;	// Unit Price for CD Player
	static final double UP_TR  = 150.0;	// Unit Price for Tape Recorder

	// Declare constants to hold the description of each type of item,
	// and set their values to the strings that represent their names.
	static final String TV  = "TV";
	static final String VCR = "VCR";
	static final String RC  = "Remote Controller";
	static final String CDP = "CD Player";
	static final String TR  = "Tape Recorder";

	// Declare constants to hold the decimal and percent values of the tax rate,
	// and set them to the tax rate specified in the assignment = 8.25%.
	static final double TAX_RATE = 0.0825F;					// tax rate in decimal
	static final double TAX_RATE_PERCENT = TAX_RATE * 100;	// tax rate in percent

	// Declare a variable of the Scanner class and invoke its constructor to create
	// an instance of the class; use it later to read input from the console.
	static Scanner scan1 = new Scanner(System.in);
	
	// the main program
	public static void main(String[] args) {
				
		// Declare int variables to track the quantity of various types of items
		// bought, and assign them the values that are read from the console.
		String enter = "Enter # of ";
		String sBought = "s bought: ";
		System.out.printf(enter + TV  + sBought);	// Prompt for TVs
		int qtyTV = scan1.nextInt();				// Read # of TVs bought
		System.out.printf(enter + VCR + sBought);	// Prompt for VCRs
		int qtyVCR = scan1.nextInt();				// Read # of VCRs bought
		System.out.printf(enter + RC  + sBought);	// Prompt for Remote Controllers
		int qtyRC = scan1.nextInt();				// Read # of Remote Controllers bought
		System.out.printf(enter + CDP + sBought);	// Prompt for # of CD Players
		int qtyCDP = scan1.nextInt();				// Read # of CD Players bought
		System.out.printf(enter + TR  + sBought);	// Prompt for Tape Recorders
		int qtyTR = scan1.nextInt();				// Read # of Tape Recorders bought

		System.out.printf("%n"); // Create some white space between the list of items and the totals.

		// Declare variables to hold the total price of each type of item, and set each of their
		// values to be the product of the quantity and unit price of that type of item.
		
		double tpTV	= qtyTV * UP_TV;	// Total price for TVs
		double tpVCR = qtyVCR * UP_VCR;	// Total price for VCRs
		double tpRC = qtyRC * UP_RC;	// Total price for Remote Controllers
		double tpCDP = qtyCDP * UP_CDP;	// Total price for CD Players
		double tpTR = qtyTR * UP_TR;	// Total price for Tape Recorders
	
		// Print the header, showing the quantity of items bought, description, unit price, and total price

		System.out.printf("\t#\tDescription\t\t\tUnit Price\t\tTotal Price%n");

		// Print a line below the header so that it contains "=" and " " (empty space) below each
		// character in the header line.

		System.out.printf("       ===\t===========\t\t\t==========\t\t===========%n");
		
		// Print the quantity, description, unit price, and total price for each type of item purchased

		System.out.printf("\t%2d \t%s\t\t\t\t%10.2f\t\t%,11.2f%n", qtyTV, TV, UP_TV, tpTV); // TVs
		System.out.printf("\t%2d \t%s\t\t\t\t%10.2f\t\t%,11.2f%n", qtyVCR, VCR, UP_VCR, tpVCR); // VCRs
		System.out.printf("\t%2d \t%s\t\t%10.2f\t\t%,11.2f%n", qtyRC, RC, UP_RC, tpRC); // Remote Controllers
		System.out.printf("\t%2d \t%s\t\t\t%10.2f\t\t%,11.2f%n", qtyCDP, CDP, UP_CDP, tpCDP); // CD Players
		System.out.printf("\t%2d \t%s\t\t\t%10.2f\t\t%,11.2f%n", qtyTR, TR, UP_TR, tpTR); // Tape Recorders

		//System.out.printf(); // Create some white space between the list of items and the totals.

		System.out.printf("%n");
		System.out.printf("%n");

		// Declare a variable to hold the sub total amount, and set its value to be
		// the sum of the total prices of all the items bought.

		double subTotal = tpTV + tpVCR + tpRC + tpCDP + tpTR;

		// Print the sub total.
	
		System.out.printf("\t\t\t\t\t\t SUBTOTAL:\t\t%,11.2f%n", subTotal);
	
		// Declare a variable to hold the tax incurred, and set its value to be
		// the product of the sub total and the tax rate (in decimal).
		
		double tax = subTotal * TAX_RATE;
		
		// Print the tax on the sub total (also inform the customer about the tax rate percent).
		
		System.out.printf("\t\t\t\t\t      TAX @ %.2f%%:\t\t%,11.2f%n", TAX_RATE_PERCENT, tax);

		// ALTERNATE PRINT STATEMENT WITHOUT SHOWING THE TAX RATE PERCENT -- commented out
		// System.out.printf();
		/*
		System.out.printf("\t\t\t\t\t\tTAX:\t\t\t%10.2f%n", tax);
		*/

		// Declare a variable to hold the total amount after tax,
		// and set its value to be the sum of the sub total and the tax.

		double total = subTotal + tax;
		
		// Print the total amount
		
		System.out.printf("\t\t\t\t\t\t    TOTAL:\t\t%,11.2f%n", total);
	
	}
}

/*

TEST RUN #1
===========
Enter # of TVs bought: 2
Enter # of VCRs bought: 1
Enter # of Remote Controllers bought: 3
Enter # of CD Players bought: 4
Enter # of Tape Recorders bought: 5

        #       Description                     Unit Price              Total Price
       ===      ===========                     ==========              ===========
         2      TV                                  400.00                   800.00
         1      VCR                                 220.00                   220.00
         3      Remote Controller                    35.20                   105.60
         4      CD Player                           300.00                 1,200.00
         5      Tape Recorder                       150.00                   750.00


                                                 SUBTOTAL:                 3,075.60
                                              TAX @ 8.25%:                   253.74
                                                    TOTAL:                 3,329.34
appu@Anils-MacBook-Pro lab00 % 


TEST RUN 2
==========
Enter # of TVs bought: 2
Enter # of VCRs bought: 3
Enter # of Remote Controllers bought: 6
Enter # of CD Players bought: 4
Enter # of Tape Recorders bought: 1

        #       Description                     Unit Price              Total Price
       ===      ===========                     ==========              ===========
         2      TV                                  400.00                   800.00
         3      VCR                                 220.00                   660.00
         6      Remote Controller                    35.20                   211.20
         4      CD Player                           300.00                 1,200.00
         1      Tape Recorder                       150.00                   150.00


                                                 SUBTOTAL:                 3,021.20
                                              TAX @ 8.25%:                   249.25
                                                    TOTAL:                 3,270.45
*/