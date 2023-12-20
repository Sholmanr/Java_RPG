package RPG;
import java.util.Random;

public class Battle {
	
	private Player player;
	private Monster monster; 
	
	public Battle(Player player1, Monster monster) 
	{
		this.player = player1;
		this.monster = monster; 
	}
	
	public boolean fight() 
	{
		while(player.getHealth() != 0 && monster.getHealth() != 0)
		{
			Random playerAttack = new Random(); 
			Random monsterAttack = new Random(); 
			monster.setHealth(monster.getHealth() - playerAttack.nextInt(1,player.getAttack() + 3));
			if(monster.getHealth() > 0) 
			{
				player.setHealth(monster.getHealth() - monsterAttack.nextInt(1,monster.getAttack() + 1));
			}
		}
		
		if(monster.getHealth() == 0)
		{
			return true; 
		}
		
		return false; 
	}

}
