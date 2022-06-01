import java.util.Scanner;

class Adder {
	int number1,number2,result;
	
	void computeAdder() {
		result = number1 + number2;
	}
	
	int computeDisplay() {
		 return number1 + number2;
	}
	
	void displayAdder() {
		System.out.println("��� : " + result);
	}
}

class Human {
	String name;
	int age;
	double weight;
	char blood;
	
	void displayHuman() {
		System.out.println("�̸� : "+ name);
		System.out.println("���� : "+ age);
		System.out.println("������ : "+ weight);
		System.out.println("������ : "+ blood);
	
	}
}

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		test4();
	}
	public static void test1() {
		// Ű����� ǥ�� �Է� ���( �ܼ� �Է� : System.in)
		// �ܺηκ��� ���� �Է� �޴� ���
		// scanner Ŭ������ Ȱ��
		Scanner input = new Scanner(System.in);
		// �ַܼ� �Է� ���� �� �ִ� Scanner ��ü�� ����
		System.out.print("���� �Է� : ");
		int number = input.nextInt(); // ������ �Է�
		System.out.println("��� : " +(number+10));
		
		input.nextLine(); // ���� ����� ���Ͱ� ���� nextLine�� ���� �ȵǰ� �ϱ� ���� Ʈ������ 1�� �־�д�. (����Ű ���)
		
		System.out.print("����� �Է� : ");
		String hobby = input.nextLine(); // ���鵵 ����
		System.out.println("��� : "+ hobby);
		
		System.out.print("�̸��� �Է� : ");
		String name = input.next(); // ������ ó������ �ʴ´�.
		System.out.println("�̸� : "+name); 
	}
	public static void test2() {
		Adder my = new Adder();
		Scanner input = new Scanner(System.in);
		System.out.print("ù ��° �� : ");
		my.number1=input.nextInt();
		System.out.print("�� ��° �� : ");
		my.number2=input.nextInt();
		
		my.computeAdder();
		my.displayAdder();
		
		System.out.printf("�� : %d\n",my.computeDisplay());
	}
	public static void test3() {
		Human man = new Human();
		Scanner input = new Scanner(System.in);
		System.out.print("�̸� ? ");
		man.name=input.nextLine();
		System.out.print("���� ? ");
		man.age = input.nextInt();
		System.out.print("������ ? ");
		man.weight = input.nextDouble();
		System.out.print("������ ? ");
		man.blood= input.next().charAt(0);
		// ������ �Է��� ���ڿ����� ù��° ����(0)�� �����´�.
		// ���ڿ� �޼����� charAt()�� �̿�
		man.displayHuman();
		
	}
	
	public static void test4() {
		String message="Korea";
		System.out.println(message);
		System.out.println(message.charAt(0));
		System.out.println(message.length());
		System.out.println(message.toUpperCase());
		
		
	}
}

