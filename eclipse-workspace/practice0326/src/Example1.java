import java.util.Scanner;
// �Ҽ� (Prime) : 1�� �ڱ��ڽ��� �����ϰ� ������ �������� �ʴ� �� 
class Prime{
	int number;
	boolean isPrime; // true, false
	
	public void determinePrime() {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("���� �Է�(0:����): ");
			number = input.nextInt();
			if(number == 0 ) 
				break;
			if(number == 1 )
				System.out.println("���� �ٽ� �Է�");
			else // �Ҽ�üũ
				checkPrime();
				displayPrime();
		}  
	}
	
	public void checkPrime() {
		isPrime = true;
		for(int count = 2; count < number; count++) {
			if(number % count == 0) {
				isPrime = false;
				break;
			}
		}
		
	}
	public void displayPrime() {
		if(isPrime) // isPrime == true
			System.out.println("�Ҽ��Դϴ�");
		else
			System.out.println("�Ҽ��� �ƴմϴ�");
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		//test4();
		test5();
	}
	public static void test1() {
		int a = 100;
		for(int count =0; count <10; count++, a+=10) {
			System.out.println(count+" "+a);
		}
	}
	public static void test2() {
		// ������
		int dan = 2;
		while(dan <= 9) { // �� : 2 ~ 9
			int su =1;
			while(su <= 9) { // �� : 1 ~ 9
				System.out.printf("%d * %d = %d\n", dan, su, dan*su);
				su++;
			}
			dan ++;
		}
	}
	public static void test3() {
		for(int dan=2; dan<=9; dan++) {
			for(int su =1; su<=9; su++) {
				System.out.printf("%d * %d = %d\n", dan, su, dan*su);
			}
		}
	}
	public static void test4() {
		// �Ҽ� �˻�
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int number = input.nextInt();
		boolean isPrime = true;
		
		for(int count = 2; count < number; count++) {
			if(number % count == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) // isPrime == true
			System.out.println("�Ҽ��Դϴ�");
		else
			System.out.println("�Ҽ��� �ƴմϴ�");
	}
	public static void test5() {
		Prime ob = new Prime();
		ob.determinePrime();
	}
}
