class Magazine {
	protected int art;
	protected int sports;
	protected int test;
	// private 제어는 상속의 경우라도 하위에서는 접근 금지
	// protected : private 특성을 가지면서 같은 패키지의 클래스에서만 접근 가능, 자식 가능
	
	public void displayMagazine() {
		System.out.printf("art: %d 권, sports: %d 권\n", art, sports);
	}

}
class Book extends Magazine {
	public int poem;
	public int comic;
	private String test;
	
	// super : 상속을 한 부모의 객체 
	public Book(int art, int sports, int poem, int comic) {
		// TODO Auto-generated constructor stub
		// 생성자를 통해 상위 클래스의 속성을 초기화
		super.art = art; // 자식이라도 private는 접근 불가
		// this.art = art 라고 해도 상관 없긴함. private면 오류.
		super.sports = sports;
		this.poem = poem;
		this.comic = comic; 
		super.test = 100; // 부모 자식 같은 변수명을 사용해도 된다.
		this.test = "toeic";
	}
	public void displayBook() {
		System.out.printf("poem: %d 권, comic: %d 권\n", poem, comic);
		displayMagazine();
	}
}

class Account{
	private String name;
	protected int balance;
	
	protected void setAccount(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	protected String getName() {
		return name;
	}
	protected int getBalance() {
		return balance;
	}
	protected void deposit(int money) {
		balance += money;
	}
	private void withdraw(int money) {
		balance -= money;
	}
}
class Checkcard extends Account{
	private int cardNumber;
	
	public Checkcard(int cardNumber, String name, int balance) {
		// TODO Auto-generated constructor stub
		this.cardNumber = cardNumber;
		super.setAccount(name,balance);
	}
	public void checkDeposit(int money) {
		balance += money;	
	}
	public void checkWithdraw(int cardNumber, int money) {
		if((this.cardNumber != cardNumber) || (balance < money))
			System.out.println("출금할 수 없습니다.");
		else
			balance -= (money + 500);
	}
	public void displayAccount() {
		System.out.printf("이름: %s\n", getName());
		System.out.printf("잔액: %s\n", getBalance());
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	public static void test1() {
		Book mybook = new Book(2, 3, 1, 4);
		mybook.displayBook();
		Magazine a = new Magazine();
		a.art = 10;
	}
	public static void test2() {
		Checkcard mycard = new Checkcard(100, "홍길동", 10000);
		mycard.checkDeposit(1000);
		mycard.checkWithdraw(100,3000);
		mycard.displayAccount();
	}	
}

