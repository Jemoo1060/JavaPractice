interface AccountRate {
   int BALANCE = 0;
   int BOOKBANK_RATE = 100; 
   int CHECKECARD_RATE = 500;
}
interface Account{
   void deposit(int money);
   void withdraw(int money);
   void displayAccount();
}
class BasicAccount implements AccountRate {
	private String name;
	private static int balance = BALANCE;
	
	public BasicAccount(String name, int balance) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.balance = balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	public void displayAccount() {
		System.out.printf("�̸�: %s\n", getName());
		System.out.printf("�ܾ�: %d\n", getBalance());	
	}
}
class BankBook extends BasicAccount implements Account, AccountRate{
	private int bankID;
	
	public BankBook(String name, int balance, int bankID) {
		// TODO Auto-generated constructor stub
		super(name, balance);
		this.bankID = bankID;
	}
   public int getBankID() {
	   return bankID;
   }
   @Override
   public void deposit(int money) {	
	   // TODO Auto-generated method stub
	   setBalance(getBalance() + money);
   }
   @Override
   public void withdraw(int money) {
	   // TODO Auto-generated method stub
	   setBalance(getBalance() - (money + BOOKBANK_RATE));
   }
   // displayAccount��  ��ӹް� �ֱ⿡ �ݵ�� �������̵� �� �ʿ�� ����.
   @Override
   public void displayAccount() {
	   // TODO Auto-generated method stub
	   System.out.printf("�����ȣ: %d\n", getBankID());
	   super.displayAccount();
   }
}
class CheckCard extends BasicAccount implements Account{
	private int cardID;
	
	public CheckCard(String name, int balance, int cardID) {
		// TODO Auto-generated constructor stub
		super(name, balance);
		this.cardID = cardID;
	}
	public int getCardID() {
		return cardID;
	}
	@Override
	public void deposit(int money) {
		// TODO Auto-generated method stub
		setBalance(getBalance() + money);
	}
	@Override
	public void withdraw(int money) {
		// TODO Auto-generated method stub
		setBalance(getBalance() - (money + CHECKECARD_RATE));
	}
	@Override
	public void displayAccount() {
		// TODO Auto-generated method stub
		System.out.printf("ī���ȣ: %d\n", getCardID());
		super.displayAccount();
	}
	
}
public class Example1 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
	   Account my;
	   my = new BankBook("ȫ�浿",1000, 100);
	   my.deposit(10000);
	   my.withdraw(5000);
	   my.displayAccount();
   }
}
























