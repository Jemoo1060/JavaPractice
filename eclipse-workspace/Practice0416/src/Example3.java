// ������(constructor)
// ������ -> Ư���� �޼���
// ��ü�� ������ �� �ڵ����� �� �ѹ� ȣ��
// new �� ����Ͽ� ��ü�� ������ �� ��) new Point(100, 200)
// �������� ����
// �������� �̸��� Ŭ������ �̸��ϰ� �����ϰ� ����
// ��ȯŸ�� ����, �Ű�����: �ʱ�ȭ������ �����ϴ� ������
// �ݵ�� public ��� ���

class Point {
	public int x, y;
	
	public Point(int x, int y) { // ������
		System.out.println("���� ������");
		setPoint(x,y);
		//x = 10; // �ʱⰪ�� ����
		//y = 10;
	}
	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String getPoint() {
		return String.format("(%d,%d)", x,y);
	}
}

// ���°���, ����� ����
class Account {
	private String name;
	private int balance; // �ܾ�
	
	public Account() {
		// TODO Auto-generated constructor stub
		System.out.println("�̸��� �ݾ��� ���� �����ؾ� �մϴ�");
	}
	
	
	public Account(String name, int balance) {
		// TODO Auto-generated constructor stub
		if(balance >= 1000) {	
		this.name = name;
		this.balance = balance;
		} else {
			System.out.println("�ݾ��� ���ڶ��ϴ�");
			System.exit(1);
		}
	}
	
	// �Ա�
	public void deposit(int money) {
		balance += money;
	}
	// ���
	public void withdraw(int money) {
		if(money <= balance)
		balance -= money;
		else {
			System.out.println("�ܾ��� ���ڶ��ϴ�");
			System.exit(1);
		}
	}
	
	public String getAccount() {
		return String.format("�ܾ�: %d", balance);
	}
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	public static void test1() {
		Point pt = new Point(100,200);
		System.out.println(pt.getPoint());
	}
	public static void test2() {
		Account my = new Account("ȫ�浿", 10000);
		my.deposit(15000);
		my.withdraw(3000);
		System.out.println(my.getAccount());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
