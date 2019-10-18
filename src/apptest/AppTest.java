package apptest;


import java.util.Scanner;

import discountcards.BronzeCard;
import discountcards.DiscountCard;
import discountcards.GoldCard;
import discountcards.SilverCard;
import paydesk.PayDesk;

/**
 * Three different discounts for three different cards type.
 * 
 **/
public class AppTest {

	public static void main(String[] args) {

		// Instantiating discount cards
		DiscountCard bronze = new BronzeCard();
		DiscountCard silver = new SilverCard();
		DiscountCard gold = new GoldCard();


// -----BRONZE CARD DISCOUNT-----------------------------------------------------------------------------------------		

		// Setting values for bronze card attributes for owner, and turnover

		bronze.setOwner("Lana");
		
		System.out.println("---BRONZE CARD DISCOUNT--- OWNER: " + bronze.getOwner());

		System.out.println("Enter value for bronze card turnover: ");
		Scanner input = new Scanner(System.in);
		double bT = input.nextDouble();
		bronze.setTurnover(bT);
		bronze.discountRate();

		// Setting purchase values for bronze cards
		System.out.println("Enter value for bronze card purchase value: ");
		double bronzePurchase = input.nextDouble();

		// Printing out results for all three cards
		System.out.println("Example output for bronze discount card: -----------------------------------------");
		PayDesk.discount(bronze, bronzePurchase);
		System.out.println("----------------------------------------------------------------------------------");

		
// -----SILVER CARD DISCOUNT-----------------------------------------------------------------------------------------		

		// Setting values for silver card attributes for owner, and turnover
		silver.setOwner("Sofia");

		System.out.println("---SILVER CARD DISCOUNT--- OWNER: " + silver.getOwner());
		
		System.out.println("Enter value for silver card turnover: ");
		double sT = input.nextDouble();
		silver.setTurnover(sT);
		silver.discountRate();

		// Setting purchase values for silver cards
		System.out.println("Enter value for silver card purchase value: ");
		double silverPurchase = input.nextDouble();

		System.out.println("Example output for silver discount card: -----------------------------------------");
		System.out.println("Turnover: " + silver.getTurnover() + "   " + "Purchase value: " + silverPurchase + "\n");
		PayDesk.discount(silver, silverPurchase);
		System.out.println("----------------------------------------------------------------------------------");

		
// -----GOLD CARD DISCOUNT-------------------------------------------------------------------------------------------			

		// Setting values for gold card attributes for owner, and turnover
		gold.setOwner("John");

		System.out.println("---GOLD CARD DISCOUNT--- OWNER: " + gold.getOwner());
		
		System.out.println("Enter value for gold card turnover: ");
		double gT = input.nextDouble();
		gold.setTurnover(gT);
		gold.discountRate();

		// Setting purchase values for gold cards
		System.out.println("Enter value for gold card purchase value: ");
		Scanner inputGP = new Scanner(System.in);
		double goldPurchase = inputGP.nextDouble();

		System.out.println("Example output for gold discount card: -------------------------------------------");
		System.out.println("Turnover: " + gold.getTurnover() + "   " + "Purchase value: " + goldPurchase + "\n");
		PayDesk.discount(gold, goldPurchase);
		System.out.println("----------------------------------------------------------------------------------");
		
		
		//Closing inputs to avoid memory leaking
		input.close();
		
	}
}