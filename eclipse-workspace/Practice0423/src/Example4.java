// �������̵�(overriding)
// ����� ���� ��� �θ��� �޼���� �ڽĿ� ����
// �ڽ��� ����� ���� �θ��� �޼���� ������ �޼��带 ������ �� �ִ�.
// �θ��� �޼��带 �״�� ����ϸ鼭 �ڽ��� �߰��� ������ �Ͽ� ����

class Superex {
	protected int number;
	
	public void setnumber(int number) {
		this.number = number;
	}
	public void displaySuper() {
		System.out.println(number);
	}
	public void displayMessage() {
		System.out.println("Super Hello");
	}
	public void display() { 
		System.out.println(number);
	}
	// ���� �������̵� �ϰ� ���� ���� �޼���� final�� ���δ�. �߿� 
	/*public final void display() { 
		System.out.println(number);
	}*/
}
class Subex extends Superex {
	// �θ� ����� �޼���� �Ȱ��� �޼��带 ����
	protected int value;
	public void setValue(int number, int values) {
		super.setnumber(number);
		this.value = value;
	}
	
	@Override // ������̼�: �������̵��� �޼������� �˷���. �������̵��� �ƴϸ� ��������.
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println(super.number+value);
	}
	
	public void displayMessage() { // �������̵�
		super.displayMessage();
		System.out.println("Sub Hello");
	}
	public void displayMessage(String s) { // �����ε�
		System.out.println("Sub "+ s);
	}  
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	public static void test1() {
		Subex ob = new Subex();
		// �����ε� �޼���� �ڽ��� �޼��带 ȣ��
		ob.displayMessage(); // �������̵�
		ob.displayMessage("World"); // �������̵�
		ob.setValue(10,20);
		ob.display();
	}
}
