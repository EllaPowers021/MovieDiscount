/*
 * Programmer:Ella Powers
 * Date:September 25, 2020
 * Purpose:To find the users total for the movie theater when discounts have been added
 */

import java.util.Scanner;

public class MovieDiscount {
	
    public static void main (String [] args) {
    	
        // Create the input scanner
        Scanner input = new Scanner(System.in);

        // Ask the user for their age
        System.err.print("How old are you? ");
        int age = input.nextInt();

        // Ask the user if they have a coupon
        System.err.print("Do you have a coupon? [true/false] ");
        boolean isCoupon = input.nextBoolean();
      
        // Read in a true/false value
        if (age < 13 || age > 65) {
        	if (isCoupon) { 
        		// Total price when customer fits the age restriction and has coupon
        		System.out.println("Your ticket costs $9.50.");
        	}
        	else { 
        		//Total price when customer only fits the age restriction
        		System.out.println("Your ticket costs $11.50.");
        	}
        }
        else { 
        	if (isCoupon) {
        		//Total price when customer only has the coupon
            	System.out.println("Your ticket costs $12.50.");
                }
        	else {
        	//Total price when customer doesn't fit in age restriction or have coupon
        	System.out.println("Your ticket costs $14.50.");

        }
    }

               

    }
}
