package classes;

import interfaces.Buyable;

public abstract class Product implements Buyable{
	
	private String name;
	private double price;
	private int quantity;
	private AgeRestriction ageRestriction;
	
	protected Product(String name,double price,int quantity, AgeRestriction ageRestriction) {
		this.setName(name);
		this.setPrice(price);
		this.setQuantity(quantity);
		this.setAgeRestriction(ageRestriction);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name==null){
			throw new IllegalArgumentException("The product name can not be empty");
		}
		this.name = name;
	}
	public void setPrice(double price) {
		if(price < 0 ){
			throw new IllegalArgumentException("The price can not be negative");
		}
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity < 0){
			throw new IllegalArgumentException("The product is out of stock");
		}
		this.quantity = quantity;
	}
	public AgeRestriction getAgeRestriction() {
		return ageRestriction;
	}
	public void setAgeRestriction(AgeRestriction ageRestriction) {
		this.ageRestriction = ageRestriction;
	}

	@Override
	public double getPrice() {
		return this.price;
	}
	
	@Override
	public String toString() {
		return String.format("%s %f.2lv %d (%s)", name,price,quantity,ageRestriction);
	}

}
