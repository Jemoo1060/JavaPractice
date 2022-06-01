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
		System.out.println("õõ�� �޸��ϴ�");
	}
	@Override
	void jump() {
		// TODO Auto-generated method stub
		System.out.println("������ �� �� �����ϴ�");
	}
	@Override
	void turn() {
		// TODO Auto-generated method stub
		System.out.println("���� �� �� �����ϴ�");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�ʺ��ڷ����Դϴ�";
	}
}

class Advance extends PlayerLevel{
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("���� �޸��ϴ�");
	}
	@Override
	void jump() {
		// TODO Auto-generated method stub
		System.out.println("������ �� �� �ֽ��ϴ�");
	}
	@Override
	void turn() {
		// TODO Auto-generated method stub
		System.out.println("���� �� �� �����ϴ�");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�߱��ڷ����Դϴ�";
	}
}
class Special extends PlayerLevel {
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("��û ���� �޸��ϴ�");
	}
	@Override
	void jump() {
		// TODO Auto-generated method stub
		System.out.println("������ �� �� �ֽ��ϴ�");
	}
	@Override
	void turn() {
		// TODO Auto-generated method stub
		System.out.println("���� �� �� �ֽ��ϴ�");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "����ڷ����Դϴ�";
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








































