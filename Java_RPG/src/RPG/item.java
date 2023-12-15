package RPG;

public class item {
	
	private int power; 
	private String itemName; 
	
	item(int level, int type)
	{
		this.power = level * 5; // Sets the power of the item to the player's level * 5 
		
		// Determines the type of item based on the random number passed
		switch(type)
		{
			case 0: 
				this.itemName = "sword"; 
				break;
				
			case 1: 
				this.itemName = "gun";
				break;
			
			case 2: 
				this.itemName = "scythe";
				break;
			
			case 3: 
				this.itemName = "hammer";
				break;
		}
	}
	
	// Returns the itemName
	public String getItemName()
	{
		return this.itemName;
	}
	
}
