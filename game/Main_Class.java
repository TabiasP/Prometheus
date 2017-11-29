package game;
import story.Story_Mode;
import tournament.Tournament_Mode;
import character.Character_Class;
import character.Character_Select;
import shopping.Shopping;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_Class  {
	public static void main(String [] args) throws Exception{
		Scanner input = new Scanner(System.in);
		int response = 0;
		
		System.out.println("Welcome to Prometheus!");
		
		/*
		 * There are 3 modes (Story Mode, Tournament and Shopping)
		 * Have the user select which mode he/she would like to enter
		 * 
		 * */
		
		Story_Mode story = new Story_Mode();
		Tournament_Mode tournament = new Tournament_Mode();
		Shopping shopping = new Shopping();
		
		/* The character has been chosen and will remain the same throughout the game.
		 * Reference to the character object may need to be passed to each mode in order to save progress from each mode.
		 */
		Character_Class player = Character_Select.character_Select();
	    while(true){
			try{
			System.out.println("Please select a mode: Story Mode(1) | Shopping(2) | Wager(3) | Exit(4)");
			response = input.nextInt();
			if (response >=1 && response <= 4){	
				if(response == 1){
				    story.tutorial(player);
			}
				else if(response == 2){
				    shopping.store(player);
			    }
			    else if(response == 3){
				    tournament.Gamble(player);
			    }
			    else if(response == 4){
				    System.out.println("Thanks for playing");
				    System.exit(1);
				    break;
			    }
			}
			else{
				System.out.println("Please enter a number between 1-4");
			}
			
			}catch(InputMismatchException e){
				System.out.println("Please enter a valid response");
				}
			input.nextLine();	
			}   
		input.close();	
		}
	}
