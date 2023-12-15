package RPG;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TEST = 0;
		int slot = 0;
		Scanner scnr = new Scanner(System.in);
		
		String answer, name;
		
		// Flag for if the player has died
		boolean alive = true; 
		
		// Sets the room to 1 for when the player starts out
		int room = 1;
		 
		
		// Creates a new Random object
		Random rand = new Random();  
		
		// Asks player if they want to start the game
		System.out.print("Are you ready to start your adventure? y/n\n");
		answer = scnr.next().toLowerCase();
		
		if(answer.equals("y")) 
		{	
			// Gets the player's name and sets it to a new player object
			System.out.print("Enter your name: ");
			name = scnr.next();
			Player player1 = new Player(name); 
			
			// Game loop begins
			while(alive == true)
			{
				switch(TEST)//FIXME
				{
				// Player finds a treasure and calls the treasure method in the player class
				case 0:
					System.out.print("You found a treasure!\n");
					System.out.print("You got a ");
					player1.obtainWeapon();
					player1.getItem(0).getNameAtSlot(0);//FIXME
					alive = false;//FIXME
					break;
					
				case 1:
					System.out.print("You've encountered a monster!");
					player1.levelUp();
					System.out.print("Monster defeated!");
				}
				
				room++; 
				
			}
			
		}
		else 
		{
			System.exit(0);
			scnr.close();
		}
	}
	

}


