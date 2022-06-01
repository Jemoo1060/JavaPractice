// ��Ƽ�׽�ŷ(Multi_tasking) : ���μ��� ����
// ��Ƽ������(Multi_Threading) : ������ ����( �淮 )
// �ڿ� ���� : ����, DB, �޸�, .....
// ������ Ŭ������ ��� �޾� �����带 ����
// �ڹٿ����� ���� ����� �������� �����Ƿ� �� ���� Ŭ������ ��� ���� �� ����.
// ���� ���ó�� ���̱����� Runnable �̶�� �������̽� ���


// ������� ����
class MyTest extends Thread{
	public String name;
	
	public MyTest(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	// ������� ������ Ŭ������ �ݵ�� run() �޼��带 �������̵� �ؾߵȴ�.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// ������ �ڵ�� ������� ����
		for(int count = 1; count <= 10; count++) {
			System.out.print(name + count);
		}
		System.out.println();
	}
}

class Parent{
	
}
// Runnable �̶�� �������̽��� ����ϸ� �����带 ���� �� �� ����.
// ���������� run �������̵� �ʼ�
class MyRun extends Parent implements Runnable{
	public String name;
	
	public MyRun(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int count = 1; count <= 10; count++) {
			System.out.print(name + count);
		}
		System.out.println();
	}
	
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	public static void test1() {
		
		// �Ϲ� ���� �ڵ��� ���� �����
		// A1A2A3A4A5A6A7A8A9A10 
		// B1B2B3B4B5B6B7B8B9B10
		MyTest th1 = new MyTest("A");
		th1.run();
		
		MyTest th2 = new MyTest("B");
		th2.run();
	}
	public static void test2() {
		
		MyTest th1 = new MyTest("A");
		// ������� ���� : ������ run()�ڵ带
		// ó�� ���� ���� ���� �� ������ ���ӿ��� ���� ���Ѻ��� ������� ��� �޶���.
		th1.start(); // ������� ���� , start�� �������� run()�� ������� �����.
		
		MyTest th2 = new MyTest("B");
		th2.start(); 
	}
	public static void test3() {
		MyRun r1 = new MyRun("C");
		//r1.start(); // �׳� start ���� ��������.
		// runnable ��ü�� ������ ��ü�� �μ��� ���Ǿ� �����带 ������ �� �ִ�.
		Thread th1 = new Thread(r1); // ����ȯ ����ߵ�
		th1.start();
		
		MyRun r2 = new MyRun("D");
		Thread th2 = new Thread(r2);
		th2.start();
	}
}






























