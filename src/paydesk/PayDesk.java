package paydesk;

import java.text.DecimalFormat;

import discountcards.DiscountCard;

// Paydesk class containing methods that output the discount and total purchase value
public class PayDesk {

	// Empty constructor
	public PayDesk() {
	}

	// Method for calculating total purchase value,discount and getting discount
	// rate for the card
	public static void discount(DiscountCard discountCard, double purchaseValue) {

		//Throwing an IllegalArgument Exception if purchase value is negative number
		if (purchaseValue < 0) {
			throw new IllegalArgumentException("Purchase value cannot be negative number!!!");
		} else {
			double discount = purchaseValue * discountCard.getDiscountRate();
			double totalPurchaseValue = purchaseValue - purchaseValue * discountCard.getDiscountRate();

			// Formating double result, trimming it to two decimal
			DecimalFormat df = new DecimalFormat("#.##");

			// Printing results
			System.out.println("Purchase value is : " + df.format(purchaseValue) 
			+ "\nDiscount rate is : " + df.format(discountCard.discountRate() * 100) + "%" 
			+ "\nPurchase discount is : " + df.format(discount) 
			+ "\nTotal purchase value is : " + df.format(totalPurchaseValue));
		}
	}

}