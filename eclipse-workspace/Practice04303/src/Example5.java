// ������ �޹��� �� �߻�ȭ Ŭ����

abstract class  Numbers1{   // �߻�޼��带 �������� abstract
	protected int number1, number2;
	
	public Numbers1(int number1, int number2) {
		// TODO Auto-generated constructor stub
		this.number1 = number1;
		this.number2 = number2;
	}
	
	//�������̵��� �뵵
	/*
	public int compute() {
		return -999999999; // �������̵��� ������ ���� ���� ���¸� ���߾����
	}*/
	
	abstract public int compute(); 
	// �߻�޼���(�������̵��� ������ �ϱ����� �����⸦ ����� �ۿ� ���µ� �����ϰ� ����� ���� ����) 
}

class AddNumber1 extends Numbers1 {
	
	public AddNumber1(int number1, int number2){
		super(number1,number2);
	}
	@Override
	public int compute() {
		// TODO Auto-generated method stub
		return number1 + number2;
	}

}
class MulNumber1 extends Numbers1{
	
	public MulNumber1(int number1, int number2) {
		// TODO Auto-generated constructor stub
		super(number1, number2);
	}
	@Override
	public int compute() {
		// TODO Auto-generated method stub
		return number1 * number2;
	}
}

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	public static void test1() {
		AddNumber1 ob1 = new AddNumber1(10,20);
		System.out.println("��: "+ob1.compute());
		MulNumber1 ob2 = new MulNumber1(10, 20);
		System.out.println("��: "+ob2.compute());
	}
	public static void test2() {
		Numbers1 ob;
		ob = new AddNumber1(10,20);
		System.out.println("��: "+ob.compute());
		ob = new MulNumber1(10,20);
		System.out.println("��: "+ob.compute());
	}
}
