class Magazine {
	protected int art;
	protected int sports;
	protected int test;
	// private ����� ����� ���� ���������� ���� ����
	// protected : private Ư���� �����鼭 ���� ��Ű���� Ŭ���������� ���� ����, �ڽ� ����
	
	public void displayMagazine() {
		System.out.printf("art: %d ��, sports: %d ��\n", art, sports);
	}

}
class Book extends Magazine {
	public int poem;
	public int comic;
	private String test;
	
	// super : ����� �� �θ��� ��ü 
	public Book(int art, int sports, int poem, int comic) {
		// TODO Auto-generated constructor stub
		// �����ڸ� ���� ���� Ŭ������ �Ӽ��� �ʱ�ȭ
		super.art = art; // �ڽ��̶� private�� ���� �Ұ�
		// this.art = art ��� �ص� ��� ������. private�� ����.
		super.sports = sports;
		this.poem = poem;
		this.comic = comic; 
		super.test = 100; // �θ� �ڽ� ���� �������� ����ص� �ȴ�.
		this.test = "toeic";
	}
	public void displayBook() {
		System.out.printf("poem: %d ��, comic: %d ��\n", poem, comic);
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
			System.out.println("����� �� �����ϴ�.");
		else
			balance -= (money + 500);
	}
	public void displayAccount() {
		System.out.printf("�̸�: %s\n", getName());
		System.out.printf("�ܾ�: %s\n", getBalance());
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
		Checkcard mycard = new Checkcard(100, "ȫ�浿", 10000);
		mycard.checkDeposit(1000);
		mycard.checkWithdraw(100,3000);
		mycard.displayAccount();
	}	
}

