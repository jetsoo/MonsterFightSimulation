
public class Monster {
	
	private int healthPoints;
	private int attackPoints;
	private boolean alive = true;
	private String name;
	private int speed;
	
	
	public void setStats(int hp, int atp, String monsterName, int s)
	{
		healthPoints = hp;
		attackPoints = atp;
		name = monsterName;
		speed = s;
	}
	
	public int getHealthPoints() {
		return healthPoints;
	}
	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
	public int getAttackPoints() {
		return attackPoints;
	}
	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

	
		
	



	
	
	
	

}
