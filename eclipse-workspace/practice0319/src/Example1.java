import java.util.Scanner;

class Calculater {
	int number1; // ��ü ������ �ʱⰪ�� 0���� ����
	int number2;
	int result;
	
	
	public int inputNumber() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("1.����, 2.����, 3.����, 4.������");
		System.out.print("���� : ");
		int menu = input.nextInt();
		
		
		if(menu >= 1 && menu <=4) {
			System.out.print("ù�� ° ��: ");
			number1 = input.nextInt();
			System.out.print("�ι� ° ��: ");
			number2 = input.nextInt();
		}
		
		return menu;
		
	}
	public boolean compute() {
		int menu = inputNumber();
		boolean tf = true;
		
		if(menu == 1) {
			result = number1 + number2;
	}   else if (menu == 2) {
		result = number1 - number2;
	}   else if(menu == 3) {
		result = number1 * number2;
	}   else if(menu == 4) {
		result = number1 / number2;
	}   else {
		System.out.print("�޴� ����");
		tf = false;
	}
		return tf;
	}
	
	public void display(int menu) {
		if(menu >= 1 && menu <=4) {
			System.out.print("���:  " + result);
			}
	}
} 

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
		//test3();
	}
	public static void test1(){
		// �ð�(0 ~ 24)�� �Է� �޾� �λ��ϱ�
		Scanner input = new Scanner(System.in);
		System.out.print("�ð��� �Է� : ");
		int hour = input.nextInt();
		if(hour >= 0 && hour < 12) { // 0 �̻� 12�̸� (����)
			System.out.println("Morning");
		} else if(hour >= 12 && hour <18) {
			System.out.println("Afternoon");
		} else if(hour >= 18 && hour < 24) {
			System.out.println("Evening");
		} else {
			System.out.println("�Է� ����");
		}
	}
	
	public static void test2(){
		// ��Ģ�����
		Scanner input = new Scanner(System.in);
		System.out.println("1.����, 2.����, 3.����, 4.������");
		System.out.print("���� : ");
		int menu = input.nextInt();
		
		int number1 = 0, number2 = 0, result = 0;
		
		if(menu >= 1 && menu <=4) {
			System.out.print("ù�� ° ��: ");
			number1 = input.nextInt();
			System.out.print("�ι� ° ��: ");
			number2 = input.nextInt();
		}
		
		if(menu == 1) {
			result = number1 + number2;
	}   else if (menu == 2) {
		result = number1 - number2;
	}   else if(menu == 3) {
		result = number1 * number2;
	}   else if(menu == 4) {
		result = number1 / number2;
	}   else {
		System.out.print("�޴� ����");
	}
		if(menu >= 1 && menu <=4) {
		System.out.print("���:  " + result);
		}
}
	public static void test3() {
		Calculater mycal = new Calculater();
		if(mycal.compute()) {
			System.out.println("���: "+ mycal.result);
		}
				
	}
}



