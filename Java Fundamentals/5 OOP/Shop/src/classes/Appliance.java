package classes;

public class Appliance extends ElectronicProduct{
	
	private static final int GARANTEE_IN_MONTH = 6;
	private static final double PRICE_REDUCTION = 1.05;
	private static final int MAX_QUANTITY_FOR_REDUCTION = 50;

	public Appliance(String name, double price, int quantity, AgeRestriction ageRestriction) {
		super(name, price, quantity, ageRestriction, GARANTEE_IN_MONTH);
	}
	
	@Override
	public double getPrice() {
		if (this.getQuantity() < MAX_QUANTITY_FOR_REDUCTION){
			return super.getPrice()* PRICE_REDUCTION;
		}
		return super.getPrice();
	}

}
