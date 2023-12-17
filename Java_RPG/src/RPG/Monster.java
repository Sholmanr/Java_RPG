package RPG;

public abstract class Monster {
	
	public int health, attack; 
	 
	public Monster(int health, int attack)
	{
		this.health = health; 
		this.attack = attack; 
	}
	
	public int getHealth() 
	{
		return this.health; 
	}
	
	public int getAttack() 
	{
		return this.health; 
	}
	
	public void setAttack(int attack)
	{
		this.attack = attack; 
	}
	
	public void setHealth(int health)
	{
		this.health = health; 
	}
	
}
