import java.util.Scanner;

class Box{
	int boxID;
	static int count;
	
	public static void increment() {
		count++;
	}
}
class Swap{
	int number1 = 10;
	int number2 = 20;
	
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	public static void test1() {
		Scanner input = new Scanner(System.in);
		System.out.print("������ �ڽ��� ��: ");
		int number = input.nextInt();
		Box[] mybox = new Box[number];
		
		for(int count = 0; count < number; count++) {
			mybox[count] = new Box();
			mybox[count].boxID = 101 + count;
			Box.increment();
			System.out.printf("%d �ڽ� ����\n",mybox[count].boxID);
		}
		System.out.println("�� �ڽ��� ��: "+Box.count);
	}
	
	
	public static int max1(int n1, int n2, int  n3) {
		int max = n1;
		if(n2 > max) 
			max = n2;
		if(n3 > max)
			max = n3;
		return max;
		
	}
	
	public static int max2(int n1, int n2, int  n3) {
		int max = Math.max(n1, Math.max(n2, n3));
		return max;
	}
	public static int max3(int...n) { // �����μ�
		// �μ��� �޾Ƽ� �迭�� ���·� ����
		
		System.out.println("�μ� ����: "+ n.length);
		System.out.println(n[2]); // �迭�� �Ѿ����(����Ʈ)
		for(int item : n) {
			System.out.print(item+" " );
		}
		System.out.println();
		int max = 0;
		for(int item : n) {
			if(max < item)
				max = item;
		}
		return max;
	}
	public static void test2() {
		System.out.println("max= "+ max1(10, 30, 20));
		System.out.println("max= "+ max2(10, 30, 20));
		System.out.println("max= "+ max3(10, 30, 20, 5, 6, 7, 8));
	}
	
	public static void swap1(int number1,int number2) {
		// �Ű������� ��������
		int temp = number1;
		number1 = number2;
		number2 = temp;
	}
	public static void swap2(Swap ob1) {
		// �μ��� ��ü�� ����(�������� ����) Swap ob1 = ob;
		// ������ ���� ��ü�� ����
		int temp = ob1.number1;
		ob1.number1 = ob1.number2;
		ob1.number2 = temp;
	}
	public static void test3() {
		int number1 = 10, number2 = 20;
		swap1(number1,number2); // �Ű������� �Ἥ ������� �ٲ�� ������ test�� number�� swap�� number�� ���� �ٸ���
		System.out.println(number1+ " " +number2);
		
		Swap ob = new Swap();
		swap2(ob);
		System.out.println(ob.number1+ " " +ob.number2 );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
