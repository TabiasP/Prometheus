package character;

public class Character_Wizard extends Character_Class {
	
	// NEW CONSTRUCTOR:
	
		public Character_Wizard() {
			super.name = "Wizard";
			super.health = 100;
			super.magic = 100;
			super.armor = 20;
			super.speed = 50;
			super.strength = 40;
			super.resistance = 60;
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
					armor += 4;
					magic += 12;
					speed += 7;
					strength += 4;
					resistance += 10;
					System.out.println("You have leveled up!");
				}
			}
		}
	public String getSpeak(){
		return "I am a Wizard";
	}
	
	public String getSpeak2(){
		return "I do: ";
	}
	
	public String getSpeak3(){
		return "I have: ";
	}
	
}
