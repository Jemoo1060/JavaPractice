
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();

	}
	
	// void�� �Լ� : ��ȯ���� �������� ����
	// void�� �μ� : ���ް��� �������� ����
	public static void test1() {
		int number1 = 10, number2 = 20;
		// �����͸� �μ��� �޼��忡 ����
		computeAdd(number1,number2);
		int result = computeSub(number1,number2);
		// �޼���(�Լ�)�� ȣ��� ��ȯ�Ǵ� ���� ����
		System.out.printf("���2 : %d\n", result);
	}
	 // number1 �� number2�� ���� �޴� ���� n1, number2�� �Ű����� ��� �Ѵ�. (�̸� ���Ƶ� ��� ����)
	public static void computeAdd(int n1, int number2) {
		// �Ű�����(parameter) : �Լ� ������ ���� �����ϴ� ����
		// �����ڵ� : int n1 = number1;
		int result = n1 + number2;
		System.out.printf("��� : %d\n", result);
		
	}
	//int�� �޼��� : ��ȯ���� ����
	public static int computeSub(int n1, int n2) {
		int result = n1 - n2;
		// result�� test1�� �ǵ�����(��ȯ)
		return result; // ���� ��ȯ
		
		
		
	}

}
