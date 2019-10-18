package discountcards;

// Silver card that inherit discount card class
public class SilverCard extends DiscountCard {


	// Overridden method for counting discount rate that depends from silver card's turnover
	@Override
	public double discountRate() {
		double discountRate = 0;	//initialization of local variable
		if (getTurnover() <= 300) {
			discountRate = 0.02;
			setDiscountRate(discountRate);	//usage of local variable for adjustment setter
		} else if (getTurnover() > 300) {
			discountRate = 0.035;
			setDiscountRate(discountRate);

		}
		return discountRate;
	}

	//* toString method 
	@Override
	public String toString() {
		return super.toString();
	}

}
