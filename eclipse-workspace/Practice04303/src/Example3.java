interface  Numbers{   // �߻�޼��带 �������� abstract
	
	int NUMBER = 100; // ��� ������ ���� ��. implements  �Ǵ� ��� ������ ��� ����.
	
	//�������̵��� �뵵
	/*
	public int compute() {
		return -999999999; // �������̵��� ������ ���� ���� ���¸� ���߾����
	}*/
	
	public int compute(); 
	// �߻�޼���(�������̵��� ������ �ϱ����� �����⸦ ����� �ۿ� ���µ� �����ϰ� ����� ���� ����) 
}

class AddNumber implements Numbers {
	private int number1, number2;
		
	public AddNumber(int number1, int number2){
		this.number1 = number1;
		this.number2 = number2;
	}
	
	@Override
	public int compute() {
		// TODO Auto-generated method stub
		return number1 + number2;
	}

}
class MulNumber implements Numbers{
	private int number1, number2;
	
	public MulNumber(int number1, int number2){
		this.number1 = number1;
		this.number2 = number2;
	}
	@Override
	public int compute() {
		// TODO Auto-generated method stub
		return number1 * number2;
	}
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	public static void test1() {
		AddNumber ob1 = new AddNumber(10,20);
		System.out.println("��: "+ob1.compute());
		MulNumber ob2 = new MulNumber(10, 20);
		System.out.println("��: "+ob2.compute());
	}
	public static void test2() {
		Numbers ob;
		ob = new AddNumber(10,20);
		System.out.println("��: "+ob.compute());
		ob = new MulNumber(10,20);
		System.out.println("��: "+ob.compute());
		System.out.println(Numbers.NUMBER);
	}
}























