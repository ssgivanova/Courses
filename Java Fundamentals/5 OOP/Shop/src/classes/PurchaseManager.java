package classes;

import java.util.Calendar;
import java.util.Date;

import exceptions.ExpiredProductException;
import exceptions.OutOfStockException;
import exceptions.PurchaseNotPermittedException;
import interfaces.Expirable;

public final class PurchaseManager {
	
	public static void processPurchase(Product product, Customer customer) throws ExpiredProductException, 
									PurchaseNotPermittedException, OutOfStockException {
		
//		handles purchases (takes money from customer, reduces product quantity by 1).The
//		PurchaseManager should throw exceptions with descriptive messages in the following situations:
//		If the product is out of stock (i.e. no quantity)
//		If the product has expired
//		If the buyer does not have enough money
//		If the buyer does not have permission to purchase the given product
		
		double purchasePrice = product.getPrice();
		customer.setBalance(customer.getBalance() - purchasePrice);
		product.setQuantity(product.getQuantity() - 1);
		
		if(product.getQuantity()<= 0){
			throw new OutOfStockException("The product is out of stock");
		}
		if(customer.getBalance()-product.getPrice() <= 0){
			throw new PurchaseNotPermittedException("The cusomer does not have enough money");
		}
		if(product.getAgeRestriction()!= AgeRestriction.NONE){
			if(product.getAgeRestriction()==AgeRestriction.ADULT && customer.getAge() < 18){
				throw new PurchaseNotPermittedException("The customer does not have permission to purchase this product - ADULT ONLY");
			}else if(product.getAgeRestriction()==AgeRestriction.TEENAGE && customer.getAge() < 14){
				throw new PurchaseNotPermittedException("The customer does not have permission to purchase this product - YOU'RE TOO LITTLE ");
			}
		}
		//for expirable products only
		if(product instanceof Expirable){
			Expirable expProduct = (Expirable)product;
			Date expirationDate = expProduct.getExpirationDate();
			Date currentDate = Calendar.getInstance().getTime();
			if(currentDate.compareTo(expirationDate)<=0){
				throw new ExpiredProductException("The product has expired");
			}
		}
	}
}
