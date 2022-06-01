// 생성자(constructor)
// 생성자 -> 특수한 메서드
// 객체가 생성될 때 자동으로 딱 한번 호출
// new 를 사용하여 객체를 생성할 때 예) new Point(100, 200)
// 생성자의 형태
// 생성자의 이름은 클래스의 이름하고 동일하게 정의
// 반환타입 없음, 매개변수: 초기화역할을 수행하는 데이터
// 반드시 public 제어를 사용

class Point {
	public int x, y;
	
	public Point(int x, int y) { // 생성자
		System.out.println("나는 생성자");
		setPoint(x,y);
		//x = 10; // 초기값을 설정
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

// 계좌관리, 입출금 관리
class Account {
	private String name;
	private int balance; // 잔액
	
	public Account() {
		// TODO Auto-generated constructor stub
		System.out.println("이름과 금액을 먼저 지정해야 합니다");
	}
	
	
	public Account(String name, int balance) {
		// TODO Auto-generated constructor stub
		if(balance >= 1000) {	
		this.name = name;
		this.balance = balance;
		} else {
			System.out.println("금액이 모자랍니다");
			System.exit(1);
		}
	}
	
	// 입금
	public void deposit(int money) {
		balance += money;
	}
	// 출금
	public void withdraw(int money) {
		if(money <= balance)
		balance -= money;
		else {
			System.out.println("잔액이 모자랍니다");
			System.exit(1);
		}
	}
	
	public String getAccount() {
		return String.format("잔액: %d", balance);
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
		Account my = new Account("홍길동", 10000);
		my.deposit(15000);
		my.withdraw(3000);
		System.out.println(my.getAccount());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
