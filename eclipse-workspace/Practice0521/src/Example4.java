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
			System.out.println("0으로 나눔");
		} catch(InputMismatchException exp) {
			System.out.println("입력값 오류");
		}
	}
	public static int divide(int n1, int n2) throws ArithmeticException{ // divide에서 발생한 오류를 던진다.
		return n1 / n2;
		
	}
	public static void inputNumber() throws InputMismatchException,  ArithmeticException { 
		Scanner input = new Scanner(System.in);
		System.out.print("첫 번째 수: ");
		int number1 = input.nextInt();
		System.out.print("두 번째 수: ");
		int number2 = input.nextInt();
		System.out.println(divide(number1,number2));	
	}
	public static void test2() {
		Scanner input = new Scanner(System.in);
		System.out.print("첫 번째 수: ");
		int number1 = input.nextInt();
		System.out.print("두 번째 수: ");
		int number2 = input.nextInt();
		
		try {
			if(number2 == 1) { // 내가 맘대로 1을 오류로 처리하게 함.
				throw new ArithmeticException("1로 나눌 수 없음.");
			} else {
				System.out.println(number1 / number2);
			}
		} catch(ArithmeticException exp) {
			System.out.println(exp.getMessage());
		}
	}
}


























