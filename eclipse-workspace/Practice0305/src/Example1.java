
// �ڹٴ� Ŭ������ �����̴�.
// Ŭ������ ��ü�� �����ϱ� ���� ���赵�̴�.
// ��ü�� �Ӽ��� �޼���� �����Ѵ�.
// �ϳ��� �ڹ��ڵ忡�� �ݵ�� ���� Ŭ������ �����Ѵ�.
// ���� Ŭ������ �ڹټҽ� �ڵ��� ���� �̸��� �����ϴ�

// �Ϲ� Ŭ����
class Korea {
	
	
}

class Japan {
	
	
}

//���� Ŭ����
public class Example1 {
	
	// ����Ŭ�������� �ݵ�� ���� �޼��尡 ����
	// ���� �޼���� ���α׷��� ����� �� ���� ���� �� �ѹ� ȣ��ȴ�. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� Ŭ�������� �޼���� �̸��� ���
		// �ٸ� Ŭ������ �޼��带 ȣ���� ���� ��ü�� �����ؼ� ���
		test1(); // �޼��带 ȣ��
		test2();
		test3();
		test4();
		test5();
		test6();
		test7();
	}
	
	// �ʿ��ϸ� �ٸ� �޼���(�Լ�)�� ���� ����
	// void : ���� �ϴ� �μ��� ��ȯ���� ���� ��� ǥ��
	// �ڹ��� �޼���� �����ϴ� �μ��� ���� ��� void�� �����ص� �ȴ�.
	// Ư�� ���� Ŭ�������� �޼��� �ݵ�� public static�� ���δ�.
	public static void test1() {
		// ���ڿ� ��� : System.out ��ü�� ����Ͽ� ���
		// System.out ��ü�� ������ �ִ� println() �޼��带 ���
		// println()�� ���ڿ��� �μ��� ����
		// ���ڿ��� ���ڵ��� ���� " "�� ��� ����
		System.out.println("Hello");
		System.out.println("�ݰ����ϴ�");
		// println() : �ٹٲ�(enter)
		System.out.print("�������");
		System.out.print("�ȳ��ϼ���\n");
		// print() : �ٹٲ� ����
		// ���� : �̽������� ����('\n': �ٹٲ�)
		System.out.println("\"Oh\"my god");
		// printf() : format(���ڿ�, ����(����,�Ǽ�))����
		// %s : ���ڿ�, %d : ����, %f : �Ǽ�
		System.out.printf("�ݰ����ϴ� %s�Դϴ�\n", "ȫ�浿");
		System.out.printf("���̴� %d���Դϴ�", 20);
		System.out.printf("�����Դ� %fkg�Դϴ�\n", 67.8);
		// �Ǽ�(%f)�� ��� �Ҽ��� 6�ڸ����� �� ǥ�� // 67.800000
		System.out.printf("�����Դ� %.2fkg�Դϴ�\n", 67.8);
		System.out.printf("�����Դ� %.2fkg�Դϴ�\n", 67.8472);
		// %.2f : ������ 2�ڸ�(�ݿø�)
		// ���� : 'A' : %c
		System.out.printf("������ %c�� �Դϴ�\n", 'A');
		//������ ������ ����� ��� 
		System.out.printf("�̸��� %s�̰�, ���̴� %d�Դϴ�\n","ȫ�浿",20);
	}
	
	public static void test2() {
		// ���� : �޸� ������ �̸��� �Ҵ�(����)�ϰ� �̸��� ���� ��
		// ������ �����͸� �����ϰ� ���� ������
		// ������ ���� : ������ �������� ������ ũ�⸦ ����Ͽ� ����
		// int�� ���� : 4byte ũ���� �޸� ������ �Ҵ��ϰ� ������ ����
		// double�� ���� : 8byte ũ�⸦ �Ҵ�, �Ǽ��� ����
		int number1; //������ ����
		number1 = 100; //������ ���� �ʱ�ȭ
		
		System.out.println(number1);
		
		double number2;
		number2= 3.14;
		
		System.out.println(number2);
		
		// c���� ������
		// c++�̳� �ڹٿ����� ���� ������ �������� �ڵ� �߰��� �����ϴ�
	}
	
	public static void test3() {
		// �簢�� ����
		int width = 10; //������ �����԰� ���ÿ� �ʱ�ȭ ����
		int height = 20;
		int area = width * height; // * : ���ϱ�, / : ������
		System.out.println("���� : "+ area);
		System.out.printf("���� : %d\n", area);
	}
	public static void test4() {
		// �ﰢ�� ����
		// ������ �ڽ��� ������� ���������� ��ȿ
		// ������ ������ �ڵ����� �޸𸮿��� ����
		// ������ �̸��� ������ ����� ������ �ٸ��� ��� ������
		int height = 7;
		int width = 3;
		double value = height*width/2.0;
		// ������� : ������ ������ ���� ����� ����
		// �Ǽ� ����� �������� ������ �Ǽ��̾�� ��
		System.out.printf("�ﰢ���� ���� : %.2f\n", value);
		System.out.println("�ﰢ���� ���� : "+ value);
	}
	public static void test5() {
		// 3���� �Ļ縦 �ϰ� ���� �ݾ��� 14500��
		// ������ 5%�� �߰��� ����
		// ���� �󸶸� �����ϳ�?
		int money = 14650;
		double tip = 0.05;
		double pay = (money + money*tip)/3;
		//��� : �Ҽ� ��°�ڸ� ����, ???��
		System.out.printf("���� %.2f��\n", pay);
	}
	public static void test6() {
		// �ڷ��� (data type)
		// �ڹٿ����� 8���� �ڷ����� �����Ѵ�.
		// ����(char) : 1byte �޸� ���� �Ҵ�
		char blood = 'A'; // ���ڴ� ���� ����ǥ�� ����� ����
		System.out.println(blood);
		System.out.printf("%c\n", blood); //����	
	}
	public static void test7() {

		int blood1 = 'A';
		System.out.println(blood1);
		System.out.printf("%c\n", blood1); 
		System.out.printf("%d\n", blood1); 
		
		char number = 66;
		// char�� �뵵�� ���ڸ� �����ϱ� ���Ѱ�
		// char�� ����Ͽ� ���� ũ���� ������ �����ϴ� �뵵�ε� ����Ѵ�.
		System.out.println(number);
		System.out.printf("%c\n", number);
		// ����ȯ(casting)
		int n = (int)number;
		System.out.printf("%d\n",n);
	}

}
