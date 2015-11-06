import exceptions.OutOfEnergyException;

public class Battle {

	public static void main(String[] args) {

		GameCharacter mage = new Mage("The Big Mage");
		GameCharacter warrior = new Warrior("The little warrior");
		
		//simulate the fight
		int roundCount = 0;
		
		while(true){
			System.out.println("round " + roundCount);
			try {
				warrior.attack(mage);
				mage.attack(warrior);
			} catch (OutOfEnergyException e) {
				System.out.println(e.getMessage());
				//if the battle is over exit the loop 
				break;
			}			
			roundCount ++;
		}
		String winner = (warrior.getHealth() > mage.getHealth()) ? warrior.getName() : mage.getName();
		System.out.println("Winner : " + winner );
	}

}
