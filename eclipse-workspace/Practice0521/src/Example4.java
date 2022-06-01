import java.util.InputMismatchException;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	public static void test1() {
		Scanner input = new Scanner(System.in);
		try {
			inputNumber();
		} catch(ArithmeticException exp) {
			System.out.println("0���� ����");
		} catch(InputMismatchException exp) {
			System.out.println("�Է°� ����");
		}
	}
	public static int divide(int n1, int n2) throws ArithmeticException{ // divide���� �߻��� ������ ������.
		return n1 / n2;
		
	}
	public static void inputNumber() throws InputMismatchException,  ArithmeticException { 
		Scanner input = new Scanner(System.in);
		System.out.print("ù ��° ��: ");
		int number1 = input.nextInt();
		System.out.print("�� ��° ��: ");
		int number2 = input.nextInt();
		System.out.println(divide(number1,number2));	
	}
	public static void test2() {
		Scanner input = new Scanner(System.in);
		System.out.print("ù ��° ��: ");
		int number1 = input.nextInt();
		System.out.print("�� ��° ��: ");
		int number2 = input.nextInt();
		
		try {
			if(number2 == 1) { // ���� ����� 1�� ������ ó���ϰ� ��.
				throw new ArithmeticException("1�� ���� �� ����.");
			} else {
				System.out.println(number1 / number2);
			}
		} catch(ArithmeticException exp) {
			System.out.println(exp.getMessage());
		}
	}
}


























