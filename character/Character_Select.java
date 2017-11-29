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
				System.out.println("You have chosen to be an Orc");
				if(confirmCharacter()){
					return character;
				}
			}
			else if(response == 3) {
				Character_Wizard character = new Character_Wizard();
				System.out.println("You have chosen to be a Wizard");
				if(confirmCharacter()){
					return character;
				}
			}
			else if(response == 4) {
				Character_Elf character = new Character_Elf();
				System.out.println("You have chosen to be an Elf");
				if(confirmCharacter()){
					return character;
				}
			}
			else if(response == 5) {
				Character_Dwarf character = new Character_Dwarf();
				System.out.println("You have chosen to be a Dwarf");
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
			    	System.out.println("Please enter a valid inputY/N");
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
		}
