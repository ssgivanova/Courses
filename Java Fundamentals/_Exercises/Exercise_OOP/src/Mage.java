import exceptions.OutOfEnergyException;

public class Mage extends GameCharacter {
	
	private static final int BASE_HEALTH = 5000;
	private static final int BASE_POWER = 150;
	private static final int BASE_ENERGY = 2500;
	private static final int BASE_ATTACK_COST = 250;
	
	//in 50% of the time the mage will attack critically
	//if the actuall hit is critical or not will be randomly decided
	private static final double CRITICAL_HIT_TRESHOLD = 0.5;
	
    public Mage(int health,int power, int energy, int attackCost, String name){
		super(health, power, energy, attackCost, name);
	}
	
	public Mage(String name){
		super(BASE_HEALTH, BASE_POWER, BASE_ENERGY, BASE_ATTACK_COST, name);
		
	}

	@Override
	public void attack(GameCharacter other) throws OutOfEnergyException {
		
		//check if attack itself
		if(this == other){
			throw new IllegalStateException("Cannot attack itself!");
		}
		//check if out of energy
		if(this.getEnergy() < this.getAttackCost()){
			throw new OutOfEnergyException(this.getName() + " is out of energy. Battle over!");
		}
		
		//calculate critical hit
		//If the attack is critical, we will double our damage;
		boolean isCritical = Math.random() < CRITICAL_HIT_TRESHOLD;
		int damage = this.getPower();
			if(isCritical){
			System.out.println("Critical hit by the mage");
			damage = damage * 2;
		}
			
		//reduce energy
		this.setEnergy(this.getEnergy() - this.getAttackCost());
		
		//make the other character to respond
		other.respond(damage);
	}

	@Override
	public void respond(int damage) {
		// he is teleported in 50% of the time
		boolean isTeleported = Math.random() < CRITICAL_HIT_TRESHOLD;
		
		if(isTeleported){
			System.out.println("The mage has teleported and avaded the attack.");
		}else{
			//take some health from the mage
			this.setHealth(this.getHealth() - damage);
			System.out.println("Succesful attack. " + damage + "  damage has dealt");
		}
		
	}

}
