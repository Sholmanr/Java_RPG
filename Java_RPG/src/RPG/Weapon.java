package RPG;

public class Weapon extends Item{
	
	private int power; 
	private String weaponName; 
	
	Weapon(int level, int type)
	{
		super(level);
		this.power = level * 2; // Sets the power of the item to the player's level * 5 
		
		// Determines the type of item based on the random number passed
		switch(type)
		{
			case 0: 
				this.weaponName = "Sword"; 
				break;
				
			case 1: 
				this.weaponName = "Gun";
				break;
			
			case 2: 
				this.weaponName = "Scythe";
				break;
			
			case 3: 
				this.weaponName = "Hammer";
				break;
		}
	}
	
	// Returns the weaponName
	public void getName()
	{
		System.out.print(this.weaponName + " (" + this.power + " power)");
	}
	
	public void getNameAtSlot(int slot)
	{
		System.out.print("Slot " + (slot + 1) + ": " + this.weaponName + " (" + this.power + " power)");
	}
	
}
