package character;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Character_Select {
	static int response = 0;
	static Scanner input = new Scanner(System.in);

	public static Character_Class character_Select(){
		
		/*Here I am asking you which character you would like to be. */
		while (true) {
			try{
				System.out.println("Which character class would you like to play as for this session?:"
					+ "\n\t1.) Warrior"
					+ "\n\t2.) Orc"
					+ "\n\t3.) Wizard"
					+ "\n\t4.) Elf"
					+ "\n\t5.) Dwarf");
			    response = input.nextInt();	
			    if (response >=1 && response <=5){
			    	break;
			    }
			    else{
			    	System.out.println("Please enter a number between 1-5");
			    }
				}catch(InputMismatchException e){
					System.out.println("Please enter a valid response");
					}input.nextLine();
			}
			if(response == 1) {
				
				Character_Warrior character = new Character_Warrior();
				displayWarriorChars(character);
				if(confirmCharacter()){
					return character;
				}
				
			}
			else if(response == 2) {
				Character_Orc character = new Character_Orc();
				displayOrcChars(character);
				if(confirmCharacter()){
					return character;
				}
			}
			else if(response == 3) {
				Character_Wizard character = new Character_Wizard();
				displayWizardChars(character);
				if(confirmCharacter()){
					return character;
				}
			}
			else if(response == 4) {
				Character_Elf character = new Character_Elf();
				displayElfChars(character);
				if(confirmCharacter()){
					return character;
				}
			}
			else if(response == 5) {
				Character_Dwarf character = new Character_Dwarf();
				displayDwarfChars(character);
				if(confirmCharacter()){
					return character;
				}
			}
			else {
				System.out.println("Invalid Response. Please enter a number from the list above.");
				response = input.nextInt();
				}
			return null;
			}
	
	       private static boolean confirmCharacter() {
	    	   boolean character = false;
	    		System.out.println("Would you like to continue with the character?Y/N");
			    String confirm_flag = input.next();	
			    if(confirm_flag.equalsIgnoreCase("Y")){				    	
			    	character= true;
			    }else  if(confirm_flag.equalsIgnoreCase("N")){				    	
			    	character_Select();
			    }else{
			    	System.out.println("Please enter valid input?Y/N");
			    	   confirm_flag = input.next();	
			    	   if(confirm_flag.equalsIgnoreCase("Y")){				    	
			    		   character= true;
					    }else  if(confirm_flag.equalsIgnoreCase("N")){				    	
					    	character_Select();
					    }
			    }
				
				return character;
		
		
	}

		public static void displayWarriorChars (Character_Warrior warrior){			
		
		    System.out.println("You have chosen to be a Warrior");
		    if (warrior != null){	
		    System.out.println ("\n-----------------------------");
		    System.out.println ("Charecter-Traits");
		    System.out.println ("-----------------------------");
		    System.out.format("%10s%15s%15s%15s%20s", "Speak", "Speed", "Strength", "Health", "Intelligence");
		    System.out.println ("");		    		   
		    System.out.format ("%10s%15s%15s%15s%20s", ""+warrior.speak, warrior.speed, warrior.strength, ""+warrior.health, warrior.intelligence);
		    System.out.println ("");
		    System.out.println ("\n-----------------------------");
		    System.out.println ("Defense");
		    System.out.println ("-----------------------------");
		    System.out.format("%10s%15s%15s%15s%20s", "Armor", "Boost", "Damage", "Defense", "Resistance");
		    System.out.println ("");		       
		    System.out.format ("%10s%15s%15s%15s%20s", ""+warrior.armor, warrior.boost, warrior.damage, ""+warrior.defense, warrior.resistance);
		    System.out.println ("");	
		
		    System.out.println ("\n-----------------------------");
		    System.out.println ("Weapons");
		    System.out.println ("-----------------------------");
		    System.out.format("%10s%15s%15s%15s%20s", "Primary weapon damage", "  Primary weapon", " Weapon damage", " Secondary weapon damage", "Secondary weapon");
		    System.out.println ("");		       
		    System.out.format ("%10s%25s%10s%20s%20s", ""+warrior.primary_weapon_damage, warrior.primaryWeapon, warrior.weapon_damage, ""+warrior.secondary_weapon_damage, warrior.secondaryWeapon);
		    System.out.println ("");
		    
		    System.out.println ("\n-----------------------------");
		    System.out.println ("Miscellaneous");
		    System.out.println ("-----------------------------");
		    System.out.format("%10s%15s", "Magic","Money");
		    System.out.println ("");		       
		    System.out.format ("%10s%15s", warrior.magic, warrior.money);
		    System.out.println ("");
		    }
		    }
		    public static void displayOrcChars (Character_Orc orc){			
				
			    System.out.println("You have chosen to be an Orc");
			    if (orc != null){	
			    System.out.println ("\n-----------------------------");
			    System.out.println ("Charecter-Traits");
			    System.out.println ("-----------------------------");
			    System.out.format("%10s%15s%15s%15s%20s", "Speak", "Speed", "Strength", "Health", "Intelligence");
			    System.out.println ("");		    		   
			    System.out.format ("%10s%15s%15s%15s%20s", ""+orc.speak, orc.speed, orc.strength, ""+orc.health, orc.intelligence);
			    System.out.println ("");
			    System.out.println ("\n-----------------------------");
			    System.out.println ("Defense");
			    System.out.println ("-----------------------------");
			    System.out.format("%10s%15s%15s%15s%20s", "Armor", "Boost", "Damage", "Defense", "Resistance");
			    System.out.println ("");		       
			    System.out.format ("%10s%15s%15s%15s%20s", ""+orc.armor, orc.boost, orc.damage, ""+orc.defense, orc.resistance);
			    System.out.println ("");	
			
			    System.out.println ("\n-----------------------------");
			    System.out.println ("Weapons");
			    System.out.println ("-----------------------------");
			    System.out.format("%10s%15s%15s%15s%20s", "Primary weapon damage", "  Primary weapon", " Weapon damage", " Secondary weapon damage", "Secondary weapon");
			    System.out.println ("");		       
			    System.out.format ("%10s%25s%10s%20s%20s", ""+orc.primary_weapon_damage, orc.primaryWeapon, orc.weapon_damage, ""+orc.secondary_weapon_damage, orc.secondaryWeapon);
			    System.out.println ("");
			    
			    System.out.println ("\n-----------------------------");
			    System.out.println ("Miscellaneous");
			    System.out.println ("-----------------------------");
			    System.out.format("%10s%15s", "Magic","Money");
			    System.out.println ("");		       
			    System.out.format ("%10s%15s", orc.magic, orc.money);
			    System.out.println ("");
			    }
	      }
public static void displayWizardChars (Character_Wizard wizard){			
				
			    System.out.println("You have chosen to be an Wizard");
			    if (wizard != null){	
			    System.out.println ("\n-----------------------------");
			    System.out.println ("Charecter-Traits");
			    System.out.println ("-----------------------------");
			    System.out.format("%10s%15s%15s%15s%20s", "Speak", "Speed", "Strength", "Health", "Intelligence");
			    System.out.println ("");		    		   
			    System.out.format ("%10s%15s%15s%15s%20s", ""+wizard.speak, wizard.speed, wizard.strength, ""+wizard.health, wizard.intelligence);
			    System.out.println ("");
			    System.out.println ("\n-----------------------------");
			    System.out.println ("Defense");
			    System.out.println ("-----------------------------");
			    System.out.format("%10s%15s%15s%15s%20s", "Armor", "Boost", "Damage", "Defense", "Resistance");
			    System.out.println ("");		       
			    System.out.format ("%10s%15s%15s%15s%20s", ""+wizard.armor, wizard.boost, wizard.damage, ""+wizard.defense, wizard.resistance);
			    System.out.println ("");	
			
			    System.out.println ("\n-----------------------------");
			    System.out.println ("Weapons");
			    System.out.println ("-----------------------------");
			    System.out.format("%10s%15s%15s%15s%20s", "Primary weapon damage", "  Primary weapon", " Weapon damage", " Secondary weapon damage", "Secondary weapon");
			    System.out.println ("");		       
			    System.out.format ("%10s%25s%10s%20s%20s", ""+wizard.primary_weapon_damage, wizard.primaryWeapon, wizard.weapon_damage, ""+wizard.secondary_weapon_damage, wizard.secondaryWeapon);
			    System.out.println ("");
			    
			    System.out.println ("\n-----------------------------");
			    System.out.println ("Miscellaneous");
			    System.out.println ("-----------------------------");
			    System.out.format("%10s%15s", "Magic","Money");
			    System.out.println ("");		       
			    System.out.format ("%10s%15s", wizard.magic, wizard.money);
			    System.out.println ("");
			    }
	      }

public static void displayElfChars (Character_Elf elf){			
	
    System.out.println("You have chosen to be an Elf");
    if (elf != null){	
    System.out.println ("\n-----------------------------");
    System.out.println ("Charecter-Traits");
    System.out.println ("-----------------------------");
    System.out.format("%10s%15s%15s%15s%20s", "Speak", "Speed", "Strength", "Health", "Intelligence");
    System.out.println ("");		    		   
    System.out.format ("%10s%15s%15s%15s%20s", ""+elf.speak, elf.speed, elf.strength, ""+elf.health, elf.intelligence);
    System.out.println ("");
    System.out.println ("\n-----------------------------");
    System.out.println ("Defense");
    System.out.println ("-----------------------------");
    System.out.format("%10s%15s%15s%15s%20s", "Armor", "Boost", "Damage", "Defense", "Resistance");
    System.out.println ("");		       
    System.out.format ("%10s%15s%15s%15s%20s", ""+elf.armor, elf.boost, elf.damage, ""+elf.defense, elf.resistance);
    System.out.println ("");	

    System.out.println ("\n-----------------------------");
    System.out.println ("Weapons");
    System.out.println ("-----------------------------");
    System.out.format("%10s%15s%15s%15s%20s", "Primary weapon damage", "  Primary weapon", " Weapon damage", " Secondary weapon damage", "Secondary weapon");
    System.out.println ("");		       
    System.out.format ("%10s%25s%10s%20s%20s", ""+elf.primary_weapon_damage, elf.primaryWeapon, elf.weapon_damage, ""+elf.secondary_weapon_damage, elf.secondaryWeapon);
    System.out.println ("");
    
    System.out.println ("\n-----------------------------");
    System.out.println ("Miscellaneous");
    System.out.println ("-----------------------------");
    System.out.format("%10s%15s", "Magic","Money");
    System.out.println ("");		       
    System.out.format ("%10s%15s", elf.magic, elf.money);
    System.out.println ("");
    }
}
public static void displayDwarfChars (Character_Dwarf dwarf){			
	
    System.out.println("You have chosen to be a Dwarf");
    if (dwarf != null){	
    System.out.println ("\n-----------------------------");
    System.out.println ("Charecter-Traits");
    System.out.println ("-----------------------------");
    System.out.format("%10s%15s%15s%15s%20s", "Speak", "Speed", "Strength", "Health", "Intelligence");
    System.out.println ("");		    		   
    System.out.format ("%10s%15s%15s%15s%20s", ""+dwarf.speak, dwarf.speed, dwarf.strength, ""+dwarf.health, dwarf.intelligence);
    System.out.println ("");
    System.out.println ("\n-----------------------------");
    System.out.println ("Defense");
    System.out.println ("-----------------------------");
    System.out.format("%10s%15s%15s%15s%20s", "Armor", "Boost", "Damage", "Defense", "Resistance");
    System.out.println ("");		       
    System.out.format ("%10s%15s%15s%15s%20s", ""+dwarf.armor, dwarf.boost, dwarf.damage, ""+dwarf.defense, dwarf.resistance);
    System.out.println ("");	

    System.out.println ("\n-----------------------------");
    System.out.println ("Weapons");
    System.out.println ("-----------------------------");
    System.out.format("%10s%15s%15s%15s%20s", "Primary weapon damage", "  Primary weapon", " Weapon damage", " Secondary weapon damage", "Secondary weapon");
    System.out.println ("");		       
    System.out.format ("%10s%25s%10s%20s%20s", ""+dwarf.primary_weapon_damage, dwarf.primaryWeapon, dwarf.weapon_damage, ""+dwarf.secondary_weapon_damage, dwarf.secondaryWeapon);
    System.out.println ("");
    
    System.out.println ("\n-----------------------------");
    System.out.println ("Miscellaneous");
    System.out.println ("-----------------------------");
    System.out.format("%10s%15s", "Magic","Money");
    System.out.println ("");		       
    System.out.format ("%10s%15s", dwarf.magic, dwarf.money);
    System.out.println ("");
    }
}
		}
