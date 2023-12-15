package RPG;

import java.util.Random;

public abstract class Item {
	
	int rank; 
	
	Item(int level)
	{
		Random rand = new Random();
		// Sets the rank of the Item object to a random number between 1 and player's level
		rank = rand.nextInt(0, level);
	}
	
	public abstract void getName();
	
	public abstract void getNameAtSlot(int slot);
	
}
