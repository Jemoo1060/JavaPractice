class Scope{
	int number;
	
	public void range() {
		int number = 200; // �޼��� �Ȱ� �ۿ��� ���� �̸����� �����ص� ��
		// ���� ������ ���� �̸��� ������ �������� ������ ���
		// ������ �켱���� ���� 
		System.out.println("in range number = " + ++ number);
	}
}
class Number {
	static int number = 10;
	int value = 100;
	public static void increment() {
		number++;
		// value++; ��������. static�� ���� ����â�� number�� ����â�� value�� ���� ���ϼ� ����.
		// static �޼���� static �Ӽ��� ���ٰ���
		increment2();
		// static �޼���� static �޼��常 ȣ�� ����
	}
	
	public static void increment2() {
		number = number +2;
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	public static void test1() {
		int number1 = 10; // ����(local) ����
		{
			// int number1 = 100; // ���� ���� ��ø ���� x
			int number2 = 20; // ����
		}
		System.out.println("number1 = "+ number1);
		for(int count = 0; count < 3; count++) {
			int number3 = 30;
			System.out.println("number3 = "+ ++number3);
		}
		Scope ob = new Scope();
		System.out.println("number = "+ob.number); 
		// Ŭ������ �Ӽ��� �ʱ�ȭ���� ���� ��� 0���� �ʱ�ȭ
	}
	public static void test2() {
		Scope ob = new Scope();
		ob.range();
	}
	public static void test3() {
		int number1 = 20;
		int number2 = number1;
		System.out.println("number2 = "+ number2); // 20
		Number ob1 = new Number();
		System.out.println("ob1 number = "+ob1.number);
		
		Number ob2 = ob1; // ob2�� ob1�� ������(�ּҰ�?)�� ����
		ob2.number++;
		System.out.println("ob2 number = "+ob2.number); // 11
		System.out.println("ob1 number = "+ob1.number); // 11, 10���� �˾Ҵµ� 11��
		System.out.println(ob1); 
		System.out.println(ob2);
		
		Number ob3 = new Number();
		ob3.increment();
		System.out.println("ob3 number = "+ob3.number);
		
		Number.increment();
		System.out.println("ob number = "+Number.number);
		// Ŭ���� ����
		// Ŭ�������� static �Ӽ��� ���� ���� ��� ��ü�� ����
		// Ŭ���� �̸��� ��ü�� �Ͽ� �Ӽ��� ����� �� �ִ�.
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
