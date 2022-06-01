// 상속의 정의 요건
// A is a B 가 성립이 될 경우 : B(상위), A(하위)
// Student is a Person

class Person {
	public String name;
	public int age;
	public void setPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void displayPerson() {
		System.out.printf("이름: %s\n",name);
		System.out.printf("나이: %d\n",age);
	}
}
class Student extends Person {
	public String major; // 전공
	public void setStudent(String name,int age,String major) {
		setPerson(name,age);
		this.major = major;
	}
	public void displayStudent() {
		displayPerson();
		System.out.printf("전공: %s\n", major);
	}
}

// A has a B 가 성립이 될 경우: B(상위), A(하위)
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
		System.out.printf("타이어: %d 인치\n", inch);
	}
	public String ShowWheel() {
		return String.format("타이어: %d 인치\n", inch);
	}
}
class Car extends Wheel {
	public String name;
	
	public void setCar(int inch,String name) {
		setWheel(inch);
		this.name = name;
	}
	public void displayCar() {
		System.out.printf("차이름: %s\n",name);
		displayWheel();
	}
}
// 소유의 개념으로 클래스를 정의
class Car2 {
	public String name;
	// 타이어를 소유하므로 객체를 속성으로 정의
	public Wheel wh;
	
	public void setCar(String name, Wheel wh) {
		this.name = name;
		this.wh = wh;
	}
	public void displayCar() {
		System.out.printf("차이름: %s\n", name);
		wh.displayWheel();
		System.out.print(wh.ShowWheel());
		System.out.printf("바퀴: %d 인치\n",wh.getInch() );
		
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
		man.setStudent("홍길동", 25, "Java");
		man.displayStudent();
	}
	public static void test2() {
		Car my = new Car();
		my.setCar(18, "소나타");
		my.displayCar();
	}
	public static void test3() {
		Wheel mywheel = new Wheel();
		mywheel.setWheel(18);
		Car2 mycar = new Car2();
		mycar.setCar("소나타", mywheel);
		mycar.displayCar();
	}
}
