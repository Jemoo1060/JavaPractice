import java.util.Scanner;

class Person {
	private String name;
	private int age;
	private double weight;
	
	public void setPerson(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		//weight = _weight;
	}
	public void inputPerson() {
		Scanner input = new Scanner(System.in);
		/*System.out.print("이름: ");
		name = input.nextLine();
		System.out.print("나이: ");
		age = input.nextInt();
		System.out.print("몸무게: ");
		weight = input.nextDouble(); */ // 이렇게 해도 상관없음. 
		System.out.print("이름: ");
		String name = input.nextLine();
		System.out.print("나이: ");
		int age = input.nextInt();
		System.out.print("몸무게: ");
		double weight = input.nextDouble();
		setPerson(name,age,weight);
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getWeight() {
		return weight;
	}
	public String displayPerson() {
		String message= "";
		message += String.format("이름: %s\n", name);
		message += String.format("나이: %d\n", age);
		message += String.format("몸무게: %.1f",weight);
		return message;
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	public static void test1() {
		Person ob = new Person();
		//ob.setPerson("홍길동", 25, 67.8); // 초기화 코드
		ob.inputPerson();
		System.out.println(ob.displayPerson());
	}
}
