package tournament;
import java.util.Random;
import java.util.Scanner;

import character.Character_Class;

public class Tournament_Mode {
	Scanner input = new Scanner(System.in);	
	public void Gamble(Character_Class player)throws Exception{
		System.out.println("Welcome to Wager Mode");
		int stage = 1;
		int choice = 0;
		int withdraw;
		int prize;	
		int cycle = 0;
		Random rndm = new Random();		
		System.out.println("Welcome to coin toss!");
		Pause();
		System.out.println("Bet money and pick between head or tails.");
		Pause();
		System.out.println("If your right you can keep the money and more.");
		Pause();
		System.out.println("If your wrong you lose the money you bet");
		Pause();
		System.out.println("Good Luck");
		Pause();
		while(true){
		System.out.println("You have $" + player.getMoney());
		Pause();
		System.out.println("How much money do you want to bet?");
		withdraw = input.nextInt();
		while(true){
		if(player.getMoney() <  withdraw){
			System.out.println("Not enough money! Pick a different value.");
			Pause();
			withdraw = input.nextInt();
		}
			else
			break;
		}
		player.setMoney(player.getMoney() - withdraw);
		System.out.println("You now wagered: $" + withdraw);
		System.out.println("You now have $" + player.getMoney());
		Pause();		
			int output = 0;
			while(output > 2 || output < 1){				
				System.out.println("Pick: head (1)| tails (2)");
				Pause();
				output = input.nextInt(); 				
			}
						
		choice = rndm.nextInt(100);
		
		System.out.println("Coin flip......");
		Pause();
		if(choice >= Outcome(stage)){
			System.out.println("You win!");
			int wPrize = Prize(stage);
			prize = withdraw + wPrize; 
			System.out.println("You got an extra: $" + wPrize);
			System.out.println("You now have: $" + prize);
			player.setMoney(player.getMoney() + prize);
		}
		else{
			System.out.println("You lose");
			System.out.println("You have lost the wagered: $" + withdraw);
			System.out.println("You now have: $" + player.getMoney());
			}
		
		System.out.println("Do you want to continue? (y/n)");
		char c = input.next(".").charAt(0);
		if(c == 'n'){
			break;
		}				
		if (c == 'y')
		{
			if(stage < 5)
			{
				System.out.println("You are currently in stage: " + stage + "\n");
			}
			int times;				
			times = Levelup(stage, cycle);
			cycle++;
//			System.out.println("Cycle: " + cycle);
//			System.out.println("Times: " + times);
			if(times <= 0){
				stage++;
				System.out.println("Entering stage: " + stage + "\n");
				cycle = 0;
				}
			if(stage != 5){
			if(times > 0)
			{
				System.out.println("You can stay on this stage for " + times + " more turn(s) before you level up");
				System.out.println("Would you like to go up a stage? (y/n)");
				c = input.next(".").charAt(0);
				if (c == 'y')
				{
					stage++;
					System.out.println("Entering stage: " + stage + "\n");
					cycle = 0;
				}
				if(times < 0)
				{
					stage++;
					System.out.println("Entering stage: " + stage + "\n");
					cycle = 0;
				}					
			}}			
		}			
	}
		System.out.println("Now leaving Wager Mode\n");		
	}
	/**
	 * Method to enter player into tournament
	 * Currently has infinite loop on purpose until 
	 * reward and tournament battle system is implemented
	 * @param player - User character
	 * @throws Exception
	 */
	
	
	public void Pause()
	{
		try{
			Thread.sleep(1500);
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}
	public int Prize(int stage){
		Random rndm = new Random();
		if(stage == 1)
		{
			return rndm.nextInt(50) + 20;			
		}
		else if (stage == 2)
		{
			return rndm.nextInt(50) + 70;
		}
		else if (stage == 3)
		{
			return rndm.nextInt(50) + 120;
		}
		else if (stage == 4)
		{
			return rndm.nextInt(50) + 170;
		}
		else 
			return rndm.nextInt(50) + 220;		
	}
	public double Outcome(int stage)
	{
		
		if(stage == 1)
		{
			return 20;
		}
		else if (stage == 2)
		{
			return 35;
		}
		else if (stage == 3)
		{
			return 50;
		}
		else if (stage == 4)
		{
			return 65;
		}
		else 
			return 80;
	}	
	public int Levelup(int stage, int cycle)
	{
		if(stage == 1)
		{
			return 2 - cycle;
		}
		else if (stage == 2)
		{
			return 3 - cycle;
		}
		else if (stage == 3)
		{
			return 4 - cycle;
		}
		else if (stage == 4)
		{
			return 5 - cycle;
		}
		else 
			return 200;
	}
}

