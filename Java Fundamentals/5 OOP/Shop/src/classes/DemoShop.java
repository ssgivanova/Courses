package classes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import exceptions.ExpiredProductException;
import exceptions.OutOfStockException;
import exceptions.PurchaseNotPermittedException;
import interfaces.Expirable;

public class DemoShop {

	public static void main(String[] args) {

		
//		Calendar cal = Calendar.getInstance();
//		Date creationDate = cal.getTime();
//		cal.add(Calendar.DAY_OF_MONTH, 30);
//		Date expirationDate = cal.getTime();
//		
//		//System.out.println("creation "+ creationDate);
//		System.out.printf("expiration : %tB %<te, %<tY%n",expirationDate);
//		
//		Calendar calendar = new GregorianCalendar(2015,11,24);
//		Date currentDate = calendar.getTime();
//		System.out.printf("current : %tB %<te, %<tY%n",currentDate);
//		
//		//int expirationDays =(int) ((currentDate.getTime() - expirationDate.getTime())/(1000 * 60 * 60 * 24));
//		int expirationDays =(int)(currentDate.getTime() - expirationDate.getTime())/(1000*60*60*24);
//		
//		if(expirationDays >=15){
//			System.out.println("promotion");
//		}
//		System.out.println("expires after :" + expirationDays);
		
		FoodProduct cigars = new FoodProduct("420 Blaze it fgt", 6.90, 1400, AgeRestriction.ADULT,new Date(2018,5,15));
		
		Customer pecata = new Customer("Pecata", 17, 30.00);
		Customer gopeto = new Customer("Gopeto", 18, 0.44);
		try {
			PurchaseManager.processPurchase(cigars,pecata);
		}catch (ExpiredProductException | PurchaseNotPermittedException e) {
			System.out.println(e.getMessage());
		}catch (OutOfStockException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			PurchaseManager.processPurchase(cigars,gopeto);
		}catch (ExpiredProductException | PurchaseNotPermittedException e) {
			System.out.println(e.getMessage());
		}catch (OutOfStockException e) {
			System.out.println(e.getMessage());
		}
		
//		Create several products of different types and add them to a list. Filter the list using lambda expressions by:
//		- Expirable products and get the name of the first product with the soonest date of expiration
//		- All products with adult age restriction and sort them by price in ascending order
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2015,11,13);
		Date dt1 = calendar.getTime();
		calendar.set(2017,12,30);
		Date dt2 = calendar.getTime();
		calendar.set(2018,5,15);
		Date dt3 = calendar.getTime();
		calendar.set(2015,12,1);
		Date dt4 = calendar.getTime();
		
		//FoodProduct bread = new FoodProduct("White bread", 1.00, 1, AgeRestriction.NONE,new Date(2015,11,30));
		FoodProduct bread = new FoodProduct("White bread", 1.00, 1, AgeRestriction.NONE,dt1);
		FoodProduct milk = new FoodProduct("Milk", 3.00, 1, AgeRestriction.NONE,dt4);
		FoodProduct alkohol = new FoodProduct("Vodka", 10.00, 1, AgeRestriction.ADULT,dt3);
		FoodProduct cigari = new FoodProduct("Karelia", 5.00, 1, AgeRestriction.ADULT,dt3);
		
		ElectronicProduct hp = new Computer("laptop HP", 1000.00, 1, AgeRestriction.NONE);
		ElectronicProduct asus = new Computer("laptop Asus", 500.00, 1, AgeRestriction.NONE);
		
		ElectronicProduct refrigerator = new Appliance("Refrigerator Samsung", 1000.00, 1, AgeRestriction.NONE);
				
		List<Product> products = new ArrayList<Product>();
		products.add(bread);
		products.add(milk);
		products.add(alkohol);
		products.add(cigari);
		products.add(hp);
		products.add(asus);
		products.add(refrigerator);
		
		List<FoodProduct> foods = new ArrayList<FoodProduct>();
		System.out.println("\nExpirable products :");
		System.out.println("--------------------");
		for (Product product : products) {
			if(product instanceof FoodProduct){
				FoodProduct prod = (FoodProduct) product;
				foods.add(prod);
			}
		}
		
		Collections.sort(foods);
		for (FoodProduct prod : foods) {
			System.out.print(prod.getName() +" -> ");	
			System.out.printf("%tB %<te, %<tY %n",((Expirable)prod).getExpirationDate());
		}
		
		System.out.print("\nProduct with the soonest expiration date : ");
		System.out.println(foods.get(0).getName());
		
		
//      lambda expressions
//		products.stream()
//				.filter(e->e instanceof (FoodProduct))
//				.map(e->(FoodProduct)e)
//				.sorted((e1,e2)->e1.compareTo(e2))
//				.findFirst();
				
		System.out.println("\nProducts with adult age restriction,sorted by price ");
		System.out.println("----------------------------------------------------");
		
		List<Product> adultOnly = new ArrayList<Product>();
		for (Product pr : products) {
			if(pr.getAgeRestriction() == AgeRestriction.ADULT){
				adultOnly.add(pr);
			}
		}
		
		Collections.sort(adultOnly,new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				return (int)(p1.getPrice()-p2.getPrice());
			}
		});
		
		for (Product p : adultOnly) {
			System.out.printf("%s , %.2f lv%n",p.getName(),p.getPrice());
		}
		
//		lambda expressions
//		products.stream()
//				.filter(e->e.getAgeRestriction() == AgeRestriction.ADULT)
//				.sorted((e1,e2)->e1.compareTo(e2))
//				.map(e->e)
//				.forEach(e->System.out.println(e));
		
	}
}
