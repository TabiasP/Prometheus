package character;
import shopping.Inventory;
public class Character_Class  {
	protected int level,exp,health,magic,armor,primary_weapon_damage, secondary_weapon_damage;
	protected int speed,strength,resistance,money,tournyRounds,MAX_EXP = 100;
	protected String name,speak,primaryWeapon,secondaryWeapon;
	public Inventory backpack;
	public Character_Class(){   //These are the defaults stats, just in case I didn't set one up 
		level = 1; //Character begins at level 1 by default
		health = 100;        // in the main_Class.
		magic = 0;
		armor = 0;
		speed = 0;
		strength = 0;
		resistance = 0;
		speak = "";
		money = 200;
		tournyRounds = 0;
		backpack = new Inventory();
		primary_weapon_damage = 10;
		secondary_weapon_damage = 5;
		primaryWeapon = "Rusty Axe";
		secondaryWeapon = "Punch";
	}
	public void levelUp(int exp1) {
		this.exp = exp1;
	}
	public void setPrimaryWeapon(String weap){
		this.primaryWeapon = weap;
	}
	public void setPrimaryWeaponDamage(int dmg) {
		this.primary_weapon_damage = dmg;
	}
	public void setSecondaryWeaponDamage(int dmg) {
		this.secondary_weapon_damage = dmg;
	}
	public void setSecondaryWeapon(String weap){
		this.secondaryWeapon = weap;
	}
	public void setTournyRounds(int a){
		this.tournyRounds = a;
	}
	public void setArmor(int a){
		this.armor = a;
	}
	public void setMoney(int c) {
		this.money = c;
	}
	public void setLevel(int lvl){
		this.level = lvl;
	}
	public void setHealth(int h){
		this.health = h;
	}
	public void setMagic(int m) {
		this.magic = m;
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
	public String getPrimaryWeapon(){
		return primaryWeapon;
	}
	public String getSecondaryWeapon(){
		return secondaryWeapon;
	}
	public String getSpeak(){
		return speak;
	}
	public int getTournyRounds(){
		return tournyRounds;
	}
	public String getName(){
		return name;
	}
	public int getMoney(){
		return money;
	}
	public int getLevel(){
		return level;
	}
	public int getHealth(){
		return health;
	}
	public int getArmor(){
		return armor;
	}
	public int getMagic(){
		return magic;
	}
	public int getStrength(){
		return strength;
	}
	public int getResistance() {
		return resistance;
	}
	public int getSpeed(){
		return speed;
	}
	public int getPrimaryWeaponDamage() {
		return primary_weapon_damage;
	}
	public int getSecondaryWeaponDamage() {
		return secondary_weapon_damage;
	}
	public void displayStats(){
		System.out.println("Character: "+name
				+ "\nLevel: " + level
				+ "\nHealth: " + health
				+ "\nArmor: " + armor
				+ "\nSpeed: " + speed
				+ "\nStrength: " + strength
				+ "\nResistance: " + resistance
				);
	}
}
