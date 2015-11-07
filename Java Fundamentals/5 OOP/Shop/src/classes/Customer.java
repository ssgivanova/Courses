package classes;

public class Customer {
	
	private String name;
	private int age;
	private double balance; 
	
	public Customer(String name,int age, double balance){
		this.setName(name);
		this.setAge(age);
		this.setBalance(balance);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name==null){
			throw new IllegalArgumentException("The name can not be empty");
		}
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0){
			throw new IllegalArgumentException("The age can not be negative");
		}
		this.age = age;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if(balance < 0){
			throw new IllegalArgumentException("The balance can not be negative");
		}
		this.balance = balance;
	}
	
	

}
