// ����(exception)ó��
// ����ó��
// ����: �����ϻ󿡼� �߻�, ���� �߿��� �߻�
// ���� �߿� �߻��� ������ ���ذ��� �� ( �߰��� ���α׷��� ������ �ʵ��� ��ġ)
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		//test5();
		test6();
	}
	
	public static void test1() {
		// java.lang.ArithmeticException
		int number1 = 10, number2 = 0, result;
		result = number1 / number2;
		System.out.println(result);
	}
	public static void test2() {
		// java.lang.ArrayIndexOutOfBoundsException
		int a[] = {10,20,30};
		a[4] = 40;
	}
	public static void test3() {
		// java.lang.StringIndexOutOfBoundsException
		String s = "hello";
		char ch = s.charAt(5);
		System.out.println(ch);
	}
	public static void test4() {
		// java.lang.NullPointerException
		String s = null;
		int len = s.length();
		System.out.println(len);
	}
	public static void test5() {
		//  java.lang.ClassCastException
		Object number = new Integer(100);
		System.out.println((char)number);
	}
	public static void test6() {
		// java.lang.NumberFormatException
		String s = "hello";
		int number = Integer.parseInt(s);
		System.out.println(s);
	}
}






























