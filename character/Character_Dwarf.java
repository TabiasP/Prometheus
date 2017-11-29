package character;
/*This is the sub class for the Dwarf_Class. 
 * This is where I add some return statements. */
public class Character_Dwarf extends Character_Class {
	
	// NEW CONSTRUCTOR:
	
	public Character_Dwarf() {   
		super.name = "Dwarf";
		super.health = 100;
		super.magic = 30;
		super.armor = 50;
		super.speed = 50 ;
		super.strength = 60;
		super.resistance = 50;
	}
	
	// END NEW CONSTRUCTOR.
	
	public String user,speak;	//This variable controls what the users name is, which in this case is "Dwarf". 
	
	
	public String getSpeak(){
		return "I am a Dwarf";
	}
	
	public String getSpeak2(){
		return "I do: ";
	}
	
	public String getSpeak3(){
		return "I have: ";
	}
	
}
