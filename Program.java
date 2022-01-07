import java.util.Scanner;


public class Program {	
	
	public static boolean fighting(Monster monster1, Monster monster2)
	
	{
		
		int shieldCd = 1;
		int shield2Cd = 1;
		int offensiveCd = 0;
		int defensiveCd = 0;
		boolean monster1isAlive = true;
		boolean monster2isAlive = true;
		
		System.out.println("NEW FIGHT");
		while(monster1.getHealthPoints() > 0 && monster2.getHealthPoints() > 0 ) 
		{
			if(offensiveCd % 4 == 0) 
			{
				
			}
			if(defensiveCd % 4 == 0) 
			{
				
			}
			int monster1NewHp = monster1.getHealthPoints() - monster2.getAttackPoints();
			int monster2NewHp = monster2.getHealthPoints() - monster1.getAttackPoints();
			
			monster1.setHealthPoints(monster1NewHp);
			monster2.setHealthPoints(monster2NewHp);
			
			
			System.out.println("NEW ROUND");
			
			if(monster1.getSpeed() < monster2.getSpeed())
			{
				if(monster1.getHealthPoints() <= 0)
				{
				System.out.println(monster1.getName() + " hat verloren!");
				monster1isAlive = false;break;
				}
				if(monster2.getHealthPoints() <= 0)
				{
				System.out.println(monster2.getName() + " hat verloren!");
				monster2isAlive = false;break;
				}	
			}
			if(monster1.getSpeed() > monster2.getSpeed())
			{
				if(monster2.getHealthPoints() <= 0)
				{
				System.out.println(monster2.getName() + " hat verloren!");
				monster2isAlive = false;break;
				}	
				if(monster1.getHealthPoints() <= 0)
				{
				System.out.println(monster1.getName() + " hat verloren!");
				monster1isAlive = false;break;
				}
			}
			
			if(monster1.getHealthPoints() < 50 && shieldCd < 2)
			{
				monster1.setHealthPoints(monster1.getHealthPoints() + 100);
				shieldCd++;
				System.out.println(monster1.getName() + " hat sein Shield aktiviert!");
			}
			
			if(monster2.getHealthPoints() < 50 && shield2Cd < 2) 
			{
				monster2.setHealthPoints(monster2.getHealthPoints() + 100);
				shield2Cd++;
				System.out.println(monster2.getName() + " hat sein Shield aktiviert!");
			}
			
			System.out.println(monster1.getName() + " hat noch " + monster1.getHealthPoints() + " HP");
			System.out.println(monster2.getName() + " hat noch " + monster2.getHealthPoints() + " HP");
			
		}
		
		return monster1isAlive;
	}
	
	
	
	
	public int offensiveSpecial(int attack) 
	{
		int offensiveSpecial = attack * 2;
		return offensiveSpecial;
	}
	
	public int defensiveSpecial(int enemyAttack) 
	{
		int defensiveSpecial = enemyAttack / 2;
		return defensiveSpecial;
	}
	
	

	public static void main(String[] args) 
	{
		
		
		System.out.println("1 Yeti  2 Walross  3 Ghul  4 Orc  5 Goblin  6 Lion");
		
		Scanner scan = new Scanner(System.in);
		int eingabe1 = scan.nextInt();
		int eingabe2 = scan.nextInt();
		
		Monster monster1 = new Monster();
		Monster monster2 = new Monster();	
			
		switch(eingabe1) // MONSTER 1
		{
			case 1:  monster1.setStats(600, 140, "Yeti", 4);break;
					
			case 2: monster1.setStats(850, 80, "Walross", 2);break;
				
			case 3: monster1.setStats(450, 160, "Ghul", 3);break;
				
			case 4: monster1.setStats(650, 110, "Orc", 5);break;
				
			case 5: monster1.setStats(380, 210, "Goblin", 6);break;
				
			case 6: monster1.setStats(520, 130, "Lion", 7);break;
		}
				
		switch(eingabe2)  // MONSTER 2
				
		{
			case 1: monster2.setStats(600, 140 , "Yeti", 4);break;
					
			case 2: monster2.setStats(850, 80, "Walross", 2);break;
					
			case 3: monster2.setStats(450, 160, "Ghul", 3);break;
					
			case 4: monster2.setStats(650, 110, "Orc", 5);break;
					
			case 5: monster2.setStats(380, 210, "Goblin", 6);break;
					
			case 6: monster2.setStats(520, 130, "Lion", 7);break;
					
		}
			
		//WINSCENARIO
		
		
		if(fighting(monster1,monster2) == true)  
		{
			System.out.println(monster1.getName() + " hat gewonnen!");
		}
				
		else 
		{
			System.out.println(monster2.getName() + " hat gewonnen!");
		}
				
	
	}
		
	

}
