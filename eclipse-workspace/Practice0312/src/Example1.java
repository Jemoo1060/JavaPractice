
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();

	}
	
	public static void test1(){
		int kor = 100, eng = 95, mat = 82;
		int total = kor + eng + mat;
		double average = total/3.0;
		//double average = (double)total/3;
		
		System.out.print("�հ� : " + total + '\n');
		System.out.printf("�հ� : %d�� �Դϴ�\n",total);
		System.out.println("��� : " + average);
		System.out.printf("��� : %.2f�� �Դϴ�\n",average);
	}
	
	public static void test2() {
		String name = "ȫ�浿";
		// String�� ������ Ÿ���� �ƴ϶� Ŭ������. 
		// name�� string Ŭ������ ��ü�̴�.
		System.out.println(name + "�� �ݰ����ϴ�.");
		System.out.printf("%s�� �ݰ����ϴ�.\n",name);
		
		int a = 10;
		String b = "hello";
		Integer c = 100;
		System.out.println(a+b+c);
		
	}

}
