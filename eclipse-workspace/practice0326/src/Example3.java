import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		test4();
	}
	public static void test1() {
		// �迭: ������ �ڷ����� �����͸� �ϳ��� ������ 
		// �迭�� ���ӵ� �޸� ������ �Ҵ� ����
		// �迭�� �� ��Ҵ� ��ġ��(index)
		int[] a = {10,20,30,40,50};
		System.out.println(a[0]);
		System.out.println(a[3]);
		
		// �ڹٿ��� �迭�� ��ü�̴�.
		System.out.println(a.length); // ����
		// �ڹٿ��� �迭�� ������ �� �ʱⰪ�� �ָ� ��ü�� �ڵ� ����
		
		// �ʱⰪ ���� �迭 ����
		int []b = new int[4]; // 0���� �ʱ�ȭ
		System.out.println(b[0]);
		// System.out.println(b[4]); �迭�� ������ ���
		b[0] = 100;
		b[1] = 200;
		}
	public static void test2() {
		// �迭�� ��� ��ҿ� ���� : �ݺ���
		int[] score = {90,87, 65, 93, 48, 20};
		int total = 0;
		for(int index = 0; index < score.length; index++) {
			System.out.println(score[index]);
			total += score[index];
		}
		System.out.println("�հ�: "+total);
	}
	public static void test3() {
		Scanner input = new Scanner(System.in);
		int[] score = new int[5];
		int total = 0;
		for(int index=0; index < score.length; index++) {
		System.out.print("���� �Է�: ");
		score[index] = input.nextInt();
		total += score[index];
		}
		System.out.println("���: "+(double)total/score.length);
	}
	public static void test4() {
		// �Ǻ���ġ ����
		final int MAX = 20;
		int[] fibo= new int[MAX];
		
		fibo[0] = 1;
		fibo[1] = 1;
		
		for(int index = 2; index < fibo.length; index++) {
			fibo[index] = fibo[index-2] + fibo[index-1];
		}
		System.out.print("fibo = [");
		for(int index = 0; index < fibo.length; index++) {
			System.out.print(fibo[index]);
			if(index!=fibo.length-1) // �������� �ƴϸ�
			System.out.print(", ");
		}
		System.out.println("]");
	}
}
