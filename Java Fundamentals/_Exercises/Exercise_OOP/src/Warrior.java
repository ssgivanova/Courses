import exceptions.OutOfEnergyException;

public class Warrior extends GameCharacter
{
	private static final int BASE_HEALTH = 5000;
	private static final int BASE_POWER = 200;
	private static final int BASE_ENERGY = 1000;
	private static final int BASE_ATTACK_COST = 150;
	
	private static final double POWER_SURGE_TRESHOLD = 0.3;
	private static final double BLOCK_TRESHOLD = 0.6;
	
	public Warrior(int health,int power, int energy, int attackCost, String name) {
		super(health, power, energy, attackCost, name);
	}

	public Warrior(String name) {
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
	
	//in 30% of the time it will be power surge - no energy is taken for this attack
	boolean isPowerSurge = Math.random() < POWER_SURGE_TRESHOLD;
	if(isPowerSurge){
		System.out.println(this.getName() +" is lucky. Free attack.");
	}else{
		this.setEnergy(this.getEnergy() - this.getAttackCost());
	}
	
	other.respond(this.getPower());
		
	}

	@Override
	public void respond(int damage) {
	
	//in 60% of the time the warrior can block the attacks agains him
	//A successful block lowers the incoming attack damage by 50%.
	boolean hasBlocked = Math.random() < BLOCK_TRESHOLD;
	if(hasBlocked){
		System.out.println("Attack has been blocked");
		damage = damage / 2;
	}
	//take some health from the warrior
	this.setHealth(this.getHealth() - damage);
	System.out.println(damage + " damage dealt");
		
	}

}
