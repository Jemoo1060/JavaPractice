class Area{
	public void computeArea() {
		System.out.println("������ ���� ������ ����");
	}
	public void computeArea(int width) {
		System.out.printf("���簢��: %d\n", width * width);
	}
	public void computeArea(int width, int height) {
		System.out.printf("���簢��: %d\n",width * height);
	}
	public void computeArea(int width,int height, int depth) {
		System.out.printf("������ü: %d\n",width * height * depth);
	}
}
class Counter{
	static int number;
	public static void increment() {
		number++;
	}
	public static void increment(int n) {
		number += n;
	}
}
public class Example5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	public static void computeAdd() {
		System.out.println("test1");
	}
	public static void computeAdd(int a) {
		System.out.println("test2");
	}
	public static void computeAdd(int a, int b) {
		System.out.println("test3");
	}
	public static void computeAdd(double a, double b) {
		System.out.println("test4");
	}
	//���ϰ��� �޶����� �����ε��� �������� �ʴ´�. ��������
	// ��ȯŸ�԰��� ������
	/*public static int computeAdd(int a, int b) {
		System.out.println("test5");
		return a+b; 
	} */
	public static void test1() {
		// �����ε� (Overloading)
		computeAdd();
		// Ŭ������ �⺻������ ���� �̸��� �޼��� ���Ǵ� �Ұ�
		// �� �Ű������� ������ �ٸ��ų� �ڷ����� �ٸ��� ���
		computeAdd(10);
		computeAdd(10,20);
		computeAdd(10.0,20);
	}
	public static void test2() {
		Area ob = new Area();
		ob.computeArea();
		ob.computeArea(10);
		ob.computeArea(10,20);
		ob.computeArea(10,20,30);
	}
	public static void test3() {
		Counter.increment();
		Counter.increment();
		Counter.increment(3);
		System.out.println(Counter.number);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
