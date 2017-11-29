package character;

public class Character_Elf extends Character_Class {
	
	// NEW CONSTRUCTOR:
	
	public Character_Elf() {
			super.name = "Elf";
			super.health = 100;
			super.magic = 60;
			super.armor = 70;
			super.speed = 80;
			super.strength = 60;
			super.resistance = 40;
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
				health += 7;
				health = getHealth();
				armor += 6;
				magic += 7;
				speed += 12;
				strength += 6;
				resistance += 9;
				System.out.println("You have leveled up!");
			}
		}
	}
	
	public String getSpeak(){
		return "I am an Elf";
	}
	
	public String getSpeak2(){
		return "I do: ";
	}
	
	public String getSpeak3(){
		return "I have: ";
	}
	
}
