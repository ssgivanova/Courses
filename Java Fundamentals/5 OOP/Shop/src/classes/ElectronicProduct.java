package classes;

public abstract class ElectronicProduct extends Product {
	
	private int garanteePeriod;

	protected ElectronicProduct(String name, double price, int quantity, AgeRestriction ageRestriction,int garanteePeriod) {
		super(name, price, quantity, ageRestriction);
		this.garanteePeriod = garanteePeriod;
	}
	
	public int getGaranteePeriod(){
		return this.garanteePeriod;
	}
	
	public void setGaranteePeriod(int garanteePeriod){
		if(garanteePeriod < 0){
			throw new IllegalArgumentException("The garantee period can not be nagative");
		}
		this.garanteePeriod = garanteePeriod;
	}
	
	 @Override
	public String toString() {
		 return String.format("%s ,garantee : %d months ", super.toString(),this.getGaranteePeriod());
	}

}
