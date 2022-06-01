// ����� ���� ���
// A is a B �� ������ �� ��� : B(����), A(����)
// Student is a Person

class Person {
	public String name;
	public int age;
	public void setPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void displayPerson() {
		System.out.printf("�̸�: %s\n",name);
		System.out.printf("����: %d\n",age);
	}
}
class Student extends Person {
	public String major; // ����
	public void setStudent(String name,int age,String major) {
		setPerson(name,age);
		this.major = major;
	}
	public void displayStudent() {
		displayPerson();
		System.out.printf("����: %s\n", major);
	}
}

// A has a B �� ������ �� ���: B(����), A(����)
// Car has a Wheel

class Wheel {
	public int inch;
	
	public void setWheel(int inch) {
		this.inch = inch;
	}
	public int getInch() {
		return inch;
	}
	public void displayWheel() {
		System.out.printf("Ÿ�̾�: %d ��ġ\n", inch);
	}
	public String ShowWheel() {
		return String.format("Ÿ�̾�: %d ��ġ\n", inch);
	}
}
class Car extends Wheel {
	public String name;
	
	public void setCar(int inch,String name) {
		setWheel(inch);
		this.name = name;
	}
	public void displayCar() {
		System.out.printf("���̸�: %s\n",name);
		displayWheel();
	}
}
// ������ �������� Ŭ������ ����
class Car2 {
	public String name;
	// Ÿ�̾ �����ϹǷ� ��ü�� �Ӽ����� ����
	public Wheel wh;
	
	public void setCar(String name, Wheel wh) {
		this.name = name;
		this.wh = wh;
	}
	public void displayCar() {
		System.out.printf("���̸�: %s\n", name);
		wh.displayWheel();
		System.out.print(wh.ShowWheel());
		System.out.printf("����: %d ��ġ\n",wh.getInch() );
		
	}
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	public static void test1() {
		Student man = new Student();
		man.setStudent("ȫ�浿", 25, "Java");
		man.displayStudent();
	}
	public static void test2() {
		Car my = new Car();
		my.setCar(18, "�ҳ�Ÿ");
		my.displayCar();
	}
	public static void test3() {
		Wheel mywheel = new Wheel();
		mywheel.setWheel(18);
		Car2 mycar = new Car2();
		mycar.setCar("�ҳ�Ÿ", mywheel);
		mycar.displayCar();
	}
}
