class Fruit{
	public int apple;
	int banana; // �⺻�� package�� ���� package ���� ������
	private int strawberry;
	private int total;
	
	// ������(setter)
	public void setStrawberry(int s) {
		strawberry = s;		
	}
	// ������(getter)
	public int getTotal() {
		return total;
	}
	private void totalFruit() {
		total = apple + strawberry + banana;
	}
	public String displayFruit() {
		totalFruit();
		String message = String.format("����: %d\n", total);
		return message;
	}
}
class Student{
	private String name;
	private int kor, eng, math;
	private int total;
	
	public void Setscore(String n,int k, int e, int m){
		name = n;
		kor = k;
		eng = e;
		math = m;
	}
	private void computeTotal() {
		total = kor + eng + math;
	}
	public String displayStudent() {
		String message = "";
		// �̸�, �հ�
		computeTotal();
		message += String.format("�̸�: %s\n", name);
		message += String.format("�հ�: %d\n", total);
		return message;
	}
}
public class Example6 {
	int number;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	public static void test1() {
		// ��������: Ŭ���� ������ ������ �ִ��� ������ 
		// ĸ��ȭ: ���������� ���� �� ���� ( ������ �Ͱ� ������� ���� ������)
		// �������� : public, package, private, protected
		Fruit my = new Fruit();
		my.apple = 5;
		my.banana = 3;
		// my.strawberry = 10; //������, private ����
		my.setStrawberry(10); // private ������ ���� ���Ƽ� ��
		System.out.print(my.displayFruit());
		System.out.println(my.getTotal() + 10);
	}
	public static void test2() {
		Student man = new Student();
		man.Setscore("ȫ�浿", 90, 86, 79);
		System.out.print(man.displayStudent());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
