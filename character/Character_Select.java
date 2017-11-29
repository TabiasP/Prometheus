package character;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Character_Select {
	static int response = 0;
	static Scanner input = new Scanner(System.in);

	public static Character_Class character_Select(){
		while (true) {
			try{
				System.out.println("Which character would you like to play as for this session?:"
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
				displayCharacter(character);
				if(confirmCharacter()){
					return character;
				}
				
			}
			else if(response == 2) {
				Character_Orc character = new Character_Orc();
				displayCharacter(character);
				if(confirmCharacter()){
					return character;
				}
			}
			else if(response == 3) {
				Character_Wizard character = new Character_Wizard();
				displayCharacter(character);
				if(confirmCharacter()){
					return character;
				}
			}
			else if(response == 4) {
				Character_Elf character = new Character_Elf();
				displayCharacter(character);
				if(confirmCharacter()){
					return character;
				}
			}
			else if(response == 5) {
				Character_Dwarf character = new Character_Dwarf();
				displayCharacter(character);
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

		public static void displayCharacter (Character_Class player){			
		
		    System.out.println("You have chosen to be " + player.getName());
		    if (player != null){	
		    System.out.println ("You start out at Level " + player.getLevel() + " and you have $" + player.getMoney() + " in your backpack.");
		    System.out.println ("\n-----------------------------");
		    System.out.println ("Character Traits");
		    System.out.println ("-------------------------------");
		    System.out.format("%10s%15s%15s", "Speed", "Strength", "Health");
		    System.out.println ("");		    		   
		    System.out.format ("%10s%15s%15s", "" + player.getSpeed(), player.getStrength(), ""+ player.getHealth());
		    System.out.println ("");
		    System.out.format("%10s%15s%15s", "Armor", "Resistance", "Magic");
		    System.out.println ("");		       
		    System.out.format ("%10s%15s%15s", "" + player.getArmor(), player.getResistance(), player.getMagic());
		    System.out.println ("");	
		    System.out.println ("\n-----------------------------");
		    System.out.println ("Weapons");
		    System.out.println ("-----------------------------");
		    System.out.format("Primary weapon: " + player.getPrimaryWeapon() + "\n Damage: " + player.getPrimaryWeaponDamage());
		    System.out.println ("");		       
		    System.out.format ("Secondary weapon: " + player.getSecondaryWeapon() + "\n Damage " + player.getSecondaryWeaponDamage());
		    System.out.println ("");		    System.out.println ("");
		    }
	      }
		}
