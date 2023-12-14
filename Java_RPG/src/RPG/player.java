package RPG;

public class player {
	
	private String name;
	private int attack; // base amount of damage that a player does 
	private int defense; // defense reduces the amount of damgge taken 
	private int health; // how many hit points the player has 
	
	public player(String name)
	{
		this.attack = 2;
		this.defense = 1;
		this.health = 10; 
	}
	
	public int getAttack()
	{
		return this.attack; 
	}
	
	public int getDefense()
	{
		return this.defense; 
	}
	
	public int getHealth()
	{
		return this.health; 
	}
	
	public void setAttack(int attack)
	{
		this.attack = attack; 
	}
	
	public void setDefense(int defense)
	{
		this.defense = defense; 
	}
	
	public void setHealth(int health)
	{
		this.health = health; 
	}
}
