
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		test3();
		test4();
		test5();
		test6();
	}

	public static void test1() {
		// �ڷ���(data type)
		// ����(����, �Ǽ�)
		// ���� : (char(1), byte(1), short(2), int(4), long(8)) 
		byte number1= 127; // -128~127 1byte = 8��Ʈ = 2�� 8��
		short number2 = 20;// -32768~32767 2�� 16�� ����
		// �Ǽ� : float(4), double(8)
		// �Ǽ� ����� ��� 8byte �Ҵ� 2�� 64��
		float pi = (float)3.14; 
		// ������� �Ҵ� ���� �޸� ������ ũ�⸦ ���� 3.14�� 8byte���� ������ 4byte ����
		System.out.println(number1+number2+pi);
		
		int a = (int)65.94; 
		System.out.println(a);
		
		char b = (char)a;
		System.out.println(b);
		// ����ȯ (casting) : ������Ÿ���� ����
		
		// boolean Ÿ�� (true/false) : �ҹ���
		boolean result = 10 < 9; // ��(1), ����(0)
		System.out.println(result);
	}
	
	public static void test2() {
		int number1 = 10;
		int number2 = 3;
		// ���� : ��, ������ 
		System.out.println(number1 / (double)number2);
		System.out.println(number1/number2); //��������
		// ���������� / ���� = ���� ��
		System.out.println(number1 % number2); //����(������)
	}
	public static void test3() {
		// ��ü �ʸ� �ú��ʷ� ǥ���ϱ�
		int full_second = 8345;
	    // ��� : ??�ð� ??�� ??��
		int hour = (full_second/60)/60;
		int minute = (full_second/60)%60;
		int second = full_second%60;
		System.out.printf("%d�ð� %d�� %d��\n", hour, minute, second);	
	}
	public static void test4() {
		// ���(constant) : ���ڿ�(""), ����('')
		// 10����, 2���� ,8����, 16����
		int number1 = 0725; //8����
		System.out.println(number1); // 10���� 469
		System.out.printf("%x\n", number1); // = 16���� �� 1d5
		
		int number2 = 0x1d5; //16����
		System.out.println(number2);
		System.out.printf("%o\n",number2); // = 8���� �� 725
		System.out.printf("%d\n",number2);// 10���� 469
		
	}
	public static void test5() {
		// ��࿬�� : ������ ������ ������
		int a = 10;
		int b = a + 5;
		System.out.println(b);
		
		int c = 10;
		c += 5; // c = c + 5;
		System.out.println(c);
		
		int d = 20;
		d += 1;
		System.out.println(d);
	
		int e = 30;
		//e++; // 1����
		++e;
		System.out.println(e); // �� ����, �� ���� ������� ������ 1����
		
		int f = 40;
		System.out.println(f++); // �� ���� ���� ���� 40 ��µ�
		System.out.println(f);
		// f--, --f�� ����
		
	}
	
	public static void test6() {
		// ���� ��ȯ (% ������) -> %= 
		int money = 5680;
		// ���
		// 500�� ??��, 100�� ??��, 50�� ??��, 10�� ??��
		/*int m500 = money/500;
		int m100 = (money%500)/100;
		int m50 = ((money%500)%100)/50;
		int m10 = (((money%500)%100)%50)/10;*/
		
	int m500 = money/500;
	money %= 500;
	int m100 = money/100;
	money %=100;
	int m50 = money/50;
	money %= 50;
	int m10 = money/ 10;
		System.out.printf("500�� %d��, 100�� %d��, 50�� %d��, 10�� %d��\n", m500, m100,m50,m10);
	}
	
	
}























