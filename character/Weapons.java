package character;
public class Weapons  {

	Character_Class weapon = new Character_Class();
	
	public int getRusty_Axe_Damage(){
		weapon.setDamage(20);
		return weapon.getDamage();
	}
	
	
	public String getRustyAxe_Name(){
		return "Rusty Axe";
	}
	
	public int getPunch_Damage(){
		weapon.setDamage(10);
		return weapon.getDamage();
	}
	
	public String getPunch_Name(){
		return "Punch";
	}
	public int getKick_Damage(){
		weapon.setDamage(10);
		return weapon.getDamage();
	}
		
	public String getKick_Name(){
		return "Kick";
}
	public int getSword_Damage(){
		weapon.setDamage(20);
		return weapon.getDamage();
	}
	
	
	public String getSword_Name(){
		return "Sword";
}
	
	
	public int getBattle_Axe(){
		weapon.setDamage(20);
		return weapon.getDamage();
		
		}
	
	
	
}
