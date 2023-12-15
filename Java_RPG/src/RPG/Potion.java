package RPG;

public class Potion extends Item{
	
	private int heals; 

	Potion(int level)
	{
		super(level);
		this.heals = Math.max(1, level - 2);
		
	}
	
	public void getName()
	{
		System.out.print(this.heals +"hp potion");
	}

	public void getNameAtSlot(int slot) 
	{
		System.out.print("Slot " + (slot + 1) + ": " + this.heals +"hp potion" );
	}
	
}
