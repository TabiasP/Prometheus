package character;
/*This is the sub class for the orc_Class. 
 * This is where I add some return statements. */
public class Character_Orc extends Character_Class {
	
	// NEW CONSTRUCTOR:
	
	public Character_Orc() {
			super.name = "Orc";
			super.health = 100;
			super.magic = 30;
			super.armor = 70;
			super.speed = 10;
			super.strength = 90;
			super.resistance = 30;
	}
		
		// END NEW CONSTRUCTOR.
	
	public void levelUp(int exp1) {
		exp = exp1;
		while(true) {
			if(getLevel() >= 10) {
				break;
			}
			else{
				if(exp >= MAX_EXP) {
					exp -= MAX_EXP;
				}
				if(exp < 0) {
					exp = 0;
				}
				level++;
				MAX_EXP += 50;
				health += 19;
				health = getHealth();
				armor += 7;
				magic += 7;
				speed += 3;
				strength += 11;
				resistance += 9;
				System.out.println("You have leveled up!");
			}
		}
	}
	
	public String getSpeak(){
		return "I am an Orc";
	}
	
	public String getSpeak2(){
		return "I do: ";
	}
	
	public String getSpeak3(){
		return "I have: ";
	}
	
}
