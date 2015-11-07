package classes;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import exceptions.OutOfStockException;
import interfaces.Expirable;

public class FoodProduct extends Product implements Expirable, Comparable<FoodProduct> {
	
	private static final int START_PROMOTION_DATE = 15;
	private static final double PRICE_REDUCTION = 0.7;
	
	private Date expirationDate;
	

	public FoodProduct(String name, double price, int quantity, AgeRestriction ageRestriction,Date exprirationDate) {
		super(name, price, quantity, ageRestriction);
		this.setExpirationDate(exprirationDate);		
	}
	
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	@Override
	public Date getExpirationDate() {
		return this.expirationDate;
	}
	
	@Override
	public double getPrice() {
		if (calculateDaysUntilExpiration(this.getExpirationDate())>= START_PROMOTION_DATE){
			return super.getPrice()*PRICE_REDUCTION;
		}
		return super.getPrice();
	}
	
	public int calculateDaysUntilExpiration(Date expirationDate){
		Calendar calendar = new GregorianCalendar();
		Date currentDate = calendar.getTime();
		int expirationDays =(int)(currentDate.getTime() - expirationDate.getTime())/(1000*60*60*24);
		return expirationDays; 
	}

	// the expirable products will be stored by their expiration date - the product which expires sooner is the first
	@Override
	public int compareTo(FoodProduct other) {
		int result = (int)(this.getExpirationDate().getTime() - other.getExpirationDate().getTime());
		return result;
	}
	
	@Override
	public String toString() {
		return String.format("%$1s - expired on : %$2td %$2tm %$2tY %n", super.toString(),this.getExpirationDate());
	}
	
	
}
