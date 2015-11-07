package classes;

public class Computer extends ElectronicProduct {
	
	private static final int GARANTEE_IN_MONTH = 24;
	private static final double PRICE_REDUCTION = 0.95;
	private static final int MIN_QUANTITY_FOR_REDUCTION = 1000;

	public Computer(String name, double price, int quantity, AgeRestriction ageRestriction) {
		super(name, price, quantity, ageRestriction,GARANTEE_IN_MONTH);
		
	}
	
	@Override
	public double getPrice() {
		if (this.getQuantity() > MIN_QUANTITY_FOR_REDUCTION){
			return super.getPrice()* PRICE_REDUCTION;
		}
		return super.getPrice();
	}

}
