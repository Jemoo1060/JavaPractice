class Sample{
	private static int number;
	
	public Sample() { // ��ü�� ����� �� �� ���� number �� �߰�
		// TODO Auto-generated constructor stub
		number++;
	}
	
	public static int getNumber() {
		return number;
	}
	
	// ��ü�� �Ҹ�� �� �ڵ��� �Ҹ�
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		number--;
		super.finalize();
	}
}
class Animal{
	int eye = 10;
	int leg = 20;
	void eat() {
		System.out.println("Animal Eating");
	}
}

// ����� ����
class Dog extends Animal{
	//int eye;
	//int leg; // �����ص� ����� ���ؼ� �̹� ������ �Ǿ� �ִ�.
	int tail = 30;
	
	@Override // @Override ���� �ؿ��� ������ �������̵尡 ���;ߵ�. 
	void eat() {
		super.eat();
		System.out.println("Dog Eating");
	}
}
public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	public static void test1() {
		Sample ob1 = new Sample();
		System.out.println(ob1.getNumber());
		System.out.println(Sample.getNumber());
		Sample ob2 = new Sample();
		System.out.println(ob2.getNumber());
		Sample ob3 = new Sample();
		System.out.println(Sample.getNumber());
	}
	public static void test2() {
		Animal ob = new Animal();
		System.out.println(ob.eye);
		//System.out.println(ob.tail); // �θ�� �ڽĲ� ��� ����.
		Dog happy = new Dog();
		System.out.println(happy.eye); // ��� ����.
		happy.eat();
	}

}
