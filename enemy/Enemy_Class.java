package enemy;
/*This class hold all of the enemies stats. I am setting and getting methods. The battle_System
 * class calls on this one in order to grab the information of each method. */
import character.Character_Class;
public class Enemy_Class {
    Character_Class enemy = new Character_Class();
	
	public int getGruntHealth(){  //The get and setter method for my Grunt. 
		enemy.setHealth(70);
		return enemy.getHealth();	
	}
	
	public int getGoblinHealth(){ 	//The get and setter method for my Goblin. 
		enemy.setHealth(80);
		return enemy.getHealth();
		
	}
	
	public int getHalflingHealth(){ 	        //The get and setter method for my Halfling. 
		enemy.setHealth(90);
		return enemy.getHealth();
		
	}
	
	public int getSirenHealth(){	      	//Siren getter and setter method.
		enemy.setHealth(90);
		return enemy.getHealth();
	}
	
	public int getTrollHealth(){	   //The get and setter method for my Troll. 
		enemy.setHealth(100);
		return enemy.getHealth();
	}
	
	public int getScorpionHealth(){ 	     //The get and setter method for my Scorpion. 
		enemy.setHealth(110);
		return enemy.getHealth();
	}
	
	public int getShapeshifterHealth(){    //Shapeshifter getter and setter method.
		enemy.setHealth(120);
		return enemy.getHealth();
	}
	
	public int getGiantHealth(){			 //Giant getter and setter method.
		enemy.setHealth(150);
		return enemy.getHealth();
	}
	
	public int getNecromancerHealth(){    //Necromancer getter and setter method.
		enemy.setHealth(200);
		return enemy.getHealth();
	}
	
	
	/*End of each get and setter method for health of each enemy. */
	
	/*Everything below is the get and setter methods for each enemy name. */
	
	public String getGoblinName(){  
		enemy.setName("Goblin");
		return enemy.getName();
	}
	
	public String getScorpionName(){
		enemy.setName("Scorpion");
		return enemy.getName();
	}
	
	public String getTrollsName(){
		enemy.setName("Troll");
		return enemy.getName();
	}
	
	public String getHalflingName(){
		enemy.setName("Halfling");
		return enemy.getName();
	}
	
	public String getGruntName(){
		enemy.setName("Grunt");
		return enemy.getName();
	}
	
	
}