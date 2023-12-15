package RPG;

import java.util.Random;
import java.util.ArrayList;

public class Player {
	
	private String name;
	
	private int attack; // Base amount of damage that a player does 
	private int defense; // Defense reduces the amount of damage taken 
	private int health; // How many hit points the player has 
	private int playerLevel = 1; // Initializes the player's level to 1 
	private int itemNumber = 0;
	
	private ArrayList<Item> inventory = new ArrayList<Item>(); // Creates an ArrayList that stores item objects
	
	// Constructs a player object and sets the name to the passed argument
	public Player(String name)
	{
		this.attack = 2;
		this.defense = 1;
		this.health = 10; 
	}
	
	// Returns the player's current attack stat
	public int getAttack()
	{
		return this.attack; 
	}
	
	// Returns the player's current defense stat
	public int getDefense()
	{
		return this.defense; 
	}
	
	// Returns the player's current health stat
	public int getHealth()
	{
		return this.health; 
	}
	
	// Sets the player's attack stat
	public void setAttack(int attack)
	{
		this.attack = attack; 
	}
	
	// Returns the player's defense stat
	public void setDefense(int defense)
	{
		this.defense = defense; 
	}
	
	// Returns the player's health stat
	public void setHealth(int health)
	{
		this.health = health; 
	}
	
	// Adds a new item to the player's inventory
	public void obtainWeapon()
	{
		Random rand = new Random();
		Item item = new Weapon(playerLevel, rand.nextInt(3));
		inventory.add(item);
	}
	
	public Item getItem(int index)
	{
		return inventory.get(index);
	}
	
	public void levelUp()
	{
		playerLevel++;
	}
}
