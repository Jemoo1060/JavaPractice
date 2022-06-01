
// ���� ó�� : Try ~ catch ~ finally
// Try: ���ܰ� �߻��� �� �ִ� �ڵ��
// catch: ���ܸ� ó���ϴ� �ڵ�
// finally: ���ܿ� ������� ó���ϴ� ����
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
			result = number1 / number2; // ������ ���ܹ߻� ����
		} catch(ArithmeticException exp) { // �߻��� ���ܸ� ���
			System.out.println(exp);
		} finally { // ����ó���ÿ� 0�� ��µ�. 0�� ��µǴ°� �������� ���α׷��� ����� �ƴϰ� finally���� ������ ���� �ǹ���. ���α׷��� ������ ����.
			System.out.println(result);
		}
	}
	public static void test2() {
		int a[] = {10,20,30};
		try {
			a[4] = 40;
		} catch(ArrayIndexOutOfBoundsException exp) {
			System.out.println(exp);
			System.out.println("�迭 ���ٿ� ������ �ִ�");
		} finally {
			System.out.println("����ó���� ���α׷��� ������ �ʰ� ������ ������ �ȴ�");
		}
		System.out.println("����ó���� ���α׷��� ������ �ʰ� ������ ������ �ȴ�");
	}
	public static void test3() {
		// 2���� ���� ���� �߻�
		int[] div = { 2, 0, 3, 0, 4 };
		int number = 10;
		for(int count = 0; count < 7; count++) {
			try{
				int result = number / div[count];
				System.out.println(result);	
			} catch(ArithmeticException exp) {
				exp.printStackTrace(); // ���α׷��� ������ �ʰ� ���� ���� ������ �˷��ش�.
				System.out.println(exp.getMessage()); // ���� �޼����� �˷���.
				System.out.println("0���� ����");
			} catch(ArrayIndexOutOfBoundsException exp) {
				exp.printStackTrace();
				System.out.println(exp.getMessage());
				System.out.println("�迭 ���� �Ѿ���");
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
				exp.printStackTrace(); // ���α׷��� ������ �ʰ� ���� ���� ������ �˷��ش�.
				System.out.println(exp.getMessage()); // ���� �޼����� �˷���.
				System.out.println("error");
			}
		}
	}
}


































