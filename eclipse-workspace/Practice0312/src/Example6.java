import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		//test4();
		//test5();
		//test6();
		//test7();
		test8();
	}
	
	public static void test1() {
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int age = input.nextInt();
		
		// 19�� �̻� ����
		if(age >= 19) { //����(��: >, <, >=, <= ,== ������, != �ٸ���)
			System.out.println("�����Դϴ�");
			System.out.println("�����մϴ�");
		} 
		// ������ ���� ��� ������ �����Ѵ�.
		// �׷��� ������ ������ ��� : �����ϰ� ���� ���� ����
		
		else{System.out.println("�̼������Դϴ�");
		}
		
	}

	public static void test2() {
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int age = input.nextInt();
		
		// 19�� �̻� ����
		if(age >= 19) { //���� ���
			System.out.println("�����Դϴ�");
			System.out.println("�����մϴ�");
		} 
		// ������ ���� ��� ������ �����Ѵ�.
		// �׷��� ������ ������ ��� : �����ϰ� ���� ���� ����
		
		else{// ������ ���
			if(age >= 14) {
				System.out.println("û�ҳ��Դϴ�");		
			}else {
				if(age >= 8) {
					System.out.println("����Դϴ�");
				} else {
			System.out.println("�����Դϴ�");}
			}
		}
		
	}
	public static void test3() {
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int age = input.nextInt();
		
		if(age >= 19) {
			System.out.println("�����Դϴ�");
			System.out.println("�����մϴ�");
		} 
		else if (age >= 14){ 
			System.out.println("û�ҳ��Դϴ�");
			}
		else if(age >= 8){
			System.out.println("����Դϴ�");
			} 
		else {
			System.out.println("�����Դϴ�");
			}
	}
	public static void test4() {
		Scanner input = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int number = input.nextInt();
		
		if(number%2==0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}
	public static void test5() {
		// ��������(and: �׸���, or: �Ǵ�)
		// and: �Ѵ� ���̸� ��
		// or: ���� �ϳ��� ���̴��� ��
		// 10 ~ 30���� : ����
		
		int n = 15;
		
		if(n>=10 && n<=20){
			System.out.println("ok");
		}else {
				System.out.println("no");
			}
		if(n <10 || n>20){
			System.out.println("ok");
		}else {
				System.out.println("no");
			}
	}
	public static void test6() {
		// �������
		int score = 90;
		//�񱳿����ڰ� �������ں��� �켱 ������ ����.
		// &&�� �Ӥ� ���� ��������� ����. 
		if(score < 50 || score <= 90 && score <= 100) {
			System.out.println("ok");
		} else {
			System.out.println("no");
		}
	}
	public static void test7() {
		int number1 = 10;
		int number2 = 20;
		boolean result = number1 < 0 && ++number2 > 0; //number1 < 0 �� �����̶� �ڿ� ���� ��ü�� �����ʴ´�
		System.out.println(number1 + ", "+number2); // �׷��� number2 ���� 20���� ��µ�
		System.out.println(result);
	}
	public static void test8() {
		int number1 = 10;
		int number2 = 20;
		boolean result = number1 > 0 || ++number2 > 0; //number1 > 0 �� ���̶� �ڿ� ���� ��ü�� �����ʴ´�
		System.out.println(number1 + ", "+number2); // �׷��� number2 ���� 20���� ��µ�
		System.out.println(result);
		System.out.println(result);
		// &&�� ||�� ����� �� �̹� ����(����) ����� �����Ǹ� ������ ������ �������� �ʴ´�.
		}
}			
