class Car {
	
	String Name;
	String Color;
	int Engine;
	
	void displayCar() {
		System.out.println("차이름: "+ Name);
		System.out.println("색상 "+ Color);
		System.out.printf("엔진: %dCC\n", Engine);
	}
}
class Person{
	String Name;
	int Age;
	char Blood;
	double Weight;
	
	void myInformation() {
		System.out.println("Name : "+ Name);
		System.out.printf("Age : %d세\n",Age);
		System.out.printf("Blood: %c형\n", Blood);
		System.out.printf("몸무게 : %.2fkg\n", Weight);
	}
}
class Student{
	int kor;
	int eng;
	int math;
	int total;// 합계
	double average;
	
	void computeTotal(){
		total = kor + eng + math;
	}
	void computeAverage() {
		average= (double)total/3;
	}
	void displayStudent() {
		System.out.printf("total : %d점\n",total);
		System.out.printf("평균 : %.1f점\n",average);
	}
}
class Test{
	int theory;
	int practice;
	
	double computeAverage() {
		return (theory + practice)/2.0;
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		test3();
		test4();
	}
	public static void test1() {
		
		System.out.println("내 차 정보");
		Car mycar = new Car();
		mycar.Name = "hundae";
		mycar.Color = "black";
		mycar.Engine = 20000;
		mycar.displayCar();
		
		System.out.println();
		System.out.println("내 차 정보2");
		Car mycar2 = new Car();
		mycar2.Name = "hundae";
		mycar2.Color = "white";
		mycar2.Engine = 10000;
		mycar2.displayCar();
	}
	public static void test2() {
		
		Person myI = new Person();
		System.out.println("");
		System.out.println("내 정보");
		myI.Name = "최강민";
		myI.Age = 100;
		myI.Blood = 'A';
		myI.Weight = 123.45;
		myI.myInformation();
	}
	public static void test3() {
		Student my = new Student();
		System.out.println("");
		my.kor = 98;
		my.eng = 85;
		my.math = 88;
		my.computeTotal();
		my.computeAverage();
		my.displayStudent();
		System.out.printf("[%d:%.1f]\n",my.total,my.average);
	}
	public static void test4() {
		Test mytest = new Test();
		System.out.println("");
		mytest.theory = 100;
		mytest.practice = 50;
		System.out.printf("평균 : %.1f\n", mytest.computeAverage());
		double average = mytest.computeAverage();
		System.out.printf("평균 : %.1f\n", average);
	}
}
