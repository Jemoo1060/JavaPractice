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
		/*System.out.print("�̸�: ");
		name = input.nextLine();
		System.out.print("����: ");
		age = input.nextInt();
		System.out.print("������: ");
		weight = input.nextDouble(); */ // �̷��� �ص� �������. 
		System.out.print("�̸�: ");
		String name = input.nextLine();
		System.out.print("����: ");
		int age = input.nextInt();
		System.out.print("������: ");
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
		message += String.format("�̸�: %s\n", name);
		message += String.format("����: %d\n", age);
		message += String.format("������: %.1f",weight);
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
		//ob.setPerson("ȫ�浿", 25, 67.8); // �ʱ�ȭ �ڵ�
		ob.inputPerson();
		System.out.println(ob.displayPerson());
	}
}
