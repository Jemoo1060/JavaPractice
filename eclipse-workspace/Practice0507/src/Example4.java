abstract class PlayerLevel {
	abstract void run();
	abstract void jump();
	abstract void turn();
	
	final public void go(int count) {
		run();
		for(int i=0; i < count; i++) 
			jump();
		turn();
		
		System.out.println();
	}
}
class Beginner extends PlayerLevel{
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("천천히 달립니다");
	}
	@Override
	void jump() {
		// TODO Auto-generated method stub
		System.out.println("점프를 할 수 없습니다");
	}
	@Override
	void turn() {
		// TODO Auto-generated method stub
		System.out.println("턴을 할 수 없습니다");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "초보자레벨입니다";
	}
}

class Advance extends PlayerLevel{
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("빨리 달립니다");
	}
	@Override
	void jump() {
		// TODO Auto-generated method stub
		System.out.println("점프를 할 수 있습니다");
	}
	@Override
	void turn() {
		// TODO Auto-generated method stub
		System.out.println("턴을 할 수 없습니다");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "중급자레벨입니다";
	}
}
class Special extends PlayerLevel {
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("엄청 빨리 달립니다");
	}
	@Override
	void jump() {
		// TODO Auto-generated method stub
		System.out.println("점프를 할 수 있습니다");
	}
	@Override
	void turn() {
		// TODO Auto-generated method stub
		System.out.println("턴을 할 수 있습니다");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "고급자레벨입니다";
	}
}
class Player{
	private PlayerLevel level;
	
	public Player() {
		// TODO Auto-generated constructor stub
		level = new Beginner();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
	}
	
	public void play(int count) {
		level.go(count);
	}
}


public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p = new Player();
		System.out.println(p.getLevel());
		p.play(2);
		
		Advance alevel = new Advance();
		p.upgradeLevel(alevel);
		System.out.println(p.getLevel());
		p.play(2);
		
		Special slevel = new Special();
		p.upgradeLevel(slevel);
		System.out.println(p.getLevel());
		p.play(2);
	}
	
}








































