package battle_system;
import java.util.Random;

public class Formulas {
	int pdd,weapon_variable,weapon_proficiency,strength,weapon_damage;
	// BEGIN NEW DAMAGE FORMULAS.
	private Random rand = new Random();
	
	public int getPunchDamage (int playerStrength, int enemyArmor)	// Method to be used for punches specifically.
	{
		int damage = 5 + (playerStrength/10) - (enemyArmor/10);
		int r = rand.nextInt(10);
		if (r >= 7)
			damage *= 2;
		return damage;
	}
	
	public int getDamage (int attackDamage, int enemyDefense)	// Method for calculating other damage (weapon/magic).
	{
		int damage = 10 + (attackDamage/10) - (enemyDefense/10);
		int r = rand.nextInt(10);
		if (r >= 7)
			damage *= 1.5;
		return damage;
	}
	
	// END NEW DAMAGE FORMULAS.
	
	public int getWeapon_variable(){
		return weapon_variable;
	}
	
	public int getWeapon_Proficiency(){
		return weapon_proficiency;
	}
	
	
	public int getStrength(){
		return strength;
	}
	
	public int getWeapon_Damage(){
		return weapon_damage;
	}
	
	public int getPhysicalDamageDealt(){
		 pdd = weapon_variable * (weapon_proficiency*(strength+weapon_damage));
		 return pdd;
			 
	}

}
