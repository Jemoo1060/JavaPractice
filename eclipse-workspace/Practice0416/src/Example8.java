class Sample{
	private static int number;
	
	public Sample() { // 객체가 만들어 질 때 마다 number 값 추가
		// TODO Auto-generated constructor stub
		number++;
	}
	
	public static int getNumber() {
		return number;
	}
	
	// 객체가 소멸될 때 자동을 소멸
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

// 상속을 받음
class Dog extends Animal{
	//int eye;
	//int leg; // 생략해도 상속을 통해서 이미 적용이 되어 있다.
	int tail = 30;
	
	@Override // @Override 문자 밑에는 무조건 오버라이드가 나와야됨. 
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
		//System.out.println(ob.tail); // 부모는 자식껄 사용 못함.
		Dog happy = new Dog();
		System.out.println(happy.eye); // 상속 받음.
		happy.eat();
	}

}
