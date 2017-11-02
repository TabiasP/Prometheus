package character;
public class Character_Class  {
	private int health,damage,magic,defense,boost, weapon_damage,armor;
	private int intelligence,speed,strength, resistance;
	private String name,speak;
	public Character_Class(){   //These are the defaults stats, just in case I didn't set one up 
		health = 100;        // in the main_Class.
		damage = 0;
		magic = 0;
		defense = 0;
		boost = 0;
		weapon_damage = 0;
		armor = 0;
		intelligence = 0;
		speed = 0;
		strength = 0;
		resistance = 0;
		speak = "";
	}
	
	
	
	public void setWeapon_Damage(int wd){
		this.weapon_damage = wd;
	}
	
	public void setArmor(int a){
		this.armor = a;
	}
	
	public void setIntelligence(int i){
		this.intelligence = i;
	}
	
	public void setHealth(int h){
		this.health = h;
	}
	public void setDamage(int d){
		this.damage = d;
	}
	public void setMagic(int m){
		this.magic = m;
	}
	public void setDefense(int def){
		this.defense = def;
	}
	public void setBoost(int boo){
		this.boost = boo;
	}
	
	public void setName(String usr){
		this.name = usr;
	}
	
	public void setSpeed(int spd){
		this.speed = spd;
	}
	
	public void setStrength(int strnth){
		this.strength = strnth;
	}
	
	public void setResistance(int resist){
		this.resistance = resist;
	}
	
	public void setSpeak(String s){
		this.speak = s;
	}
	
	public String getSpeak(){
		return speak;
	}
	
	public String getName(){
		return name;
	}
	public int getBoost(){
		return boost;
	}
	
	public int getHealth(){
		return health;
	}
	
	public int getDamage(){
		return damage;
	}
	public int getMagic(){
		return magic;
	}
	public int getDefense(){
		return defense;
	}
	
	
	public int getArmor(){
		return armor;
	}
	
	public int getWeapon_Damage(){
		return weapon_damage;
	}
	
	public int getStrength(){
		return strength;
	}
	
	public int getResistance() {
		return resistance;
	}
	
	public int getIntelligence(){
		return intelligence;
	}
	
	
	public int getSpeed(){
		return speed;
	}
	
}