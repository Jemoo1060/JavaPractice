
// 예외 처리 : Try ~ catch ~ finally
// Try: 예외가 발생할 수 있는 코드들
// catch: 예외를 처리하는 코드
// finally: 예외와 상관없이 처리하는 문장
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		test4();
	}
	public static void test1() {
		int number1 = 10, number2 = 0, result = 0;
		
		try{
			result = number1 / number2; // 잠재적 예외발생 가능
		} catch(ArithmeticException exp) { // 발생할 예외를 명시
			System.out.println(exp);
		} finally { // 예외처리시에 0이 출력됨. 0이 출력되는건 오류나서 프로그램이 멈춘게 아니고 finally까지 컴파일 됨을 의미함. 프로그램이 멈추진 않음.
			System.out.println(result);
		}
	}
	public static void test2() {
		int a[] = {10,20,30};
		try {
			a[4] = 40;
		} catch(ArrayIndexOutOfBoundsException exp) {
			System.out.println(exp);
			System.out.println("배열 접근에 문제가 있다");
		} finally {
			System.out.println("오류처리로 프로그램이 멈추지 않고 끝까지 컴파일 된다");
		}
		System.out.println("오류처리로 프로그램이 멈추지 않고 끝까지 컴파일 된다");
	}
	public static void test3() {
		// 2가지 오류 동시 발생
		int[] div = { 2, 0, 3, 0, 4 };
		int number = 10;
		for(int count = 0; count < 7; count++) {
			try{
				int result = number / div[count];
				System.out.println(result);	
			} catch(ArithmeticException exp) {
				exp.printStackTrace(); // 프로그램은 멈추지 않고 오류 추적 정보를 알려준다.
				System.out.println(exp.getMessage()); // 오류 메세지만 알려줌.
				System.out.println("0으로 나눔");
			} catch(ArrayIndexOutOfBoundsException exp) {
				exp.printStackTrace();
				System.out.println(exp.getMessage());
				System.out.println("배열 범위 넘었음");
			}
		}
	}
	public static void test4() {
		int[] div = { 2, 0, 3, 0, 4 };
		int number = 10;
		int result = 0;
		for(int count = 0; count < 7; count++) {
			try{
				 result = number / div[count];
				System.out.println(result);	
			} catch(Exception exp) {
				exp.printStackTrace(); // 프로그램은 멈추지 않고 오류 추적 정보를 알려준다.
				System.out.println(exp.getMessage()); // 오류 메세지만 알려줌.
				System.out.println("error");
			}
		}
	}
}


































