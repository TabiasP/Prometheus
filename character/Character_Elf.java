package character;

public class Character_Elf extends Character_Class {
	
	// NEW CONSTRUCTOR:
	
	public Character_Elf() {
			super.name = "Elf";
			super.health = 100;
			super.damage = 60;
			super.magic = 60;
			super.defense = 40;
			super.boost = 50;
			super.weapon_damage = 60;
			super.armor = 70;
			super.intelligence = 80;
			super.speed = 80;
			super.strength = 60;
			super.resistance = 40;
	}
		
	// END NEW CONSTRUCTOR.
	
	public String user,speak;	//This variable controls what the users name is, which in this case is "Warrior". 
	
	
	public String getSpeak(){
		return "I am an Elf";
	}
	
	public String getSpeak2(){
		return "I do: ";
	}
	
	public String getSpeak3(){
		return "I have: ";
	}
	
}package character;

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
	
	public String user,speak;	//This variable controls what the users name is, which in this case is "Warrior". 
	
	
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
