import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		//test4();
		test5();

	}
	public static void test1() {
		int count;
		int total = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("�� ����? ");
		count = input.nextInt();
		System.out.print("�� ����? ");
		int number = input.nextInt();
		while(count <= number) {
			if(count%2==0 || count%3==0){
			total += count;
			}
			count++;
			
		}
		System.out.printf("��: %d\n",total);
	}
	
	public static void test2() {
		// ������ �Է� �޾� �� ���ϱ�
		// �� 0�� �Է��ϸ� ����
		int sum = 0;
		int count = 0;
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("����: ");
			int number =  input.nextInt();
			if(number!=-1) { 
				sum +=number;
				count++;
			}
			 else 
				break;
		}
		System.out.println("��: "+sum);
		System.out.printf("���: %.1f\n",sum/(double)count);
	}
	
	public static void test3() {
		Scanner input = new Scanner(System.in);
		System.out.print("�� ����? ");
		int first = input.nextInt();
		System.out.print("�� ����? ");
		int last = input.nextInt();
		
		if(first < last) {
		while(true) {
			if(first >= last)break;
			first++;
			last--;
			}
		System.out.println("�߰� ��: "+last);
	} else {
		System.out.println("ù ���� �� ��° ������ �۾ƾ��մϴ�");
	}		
   }
	
	public static void test4() {
		// �����Է�: 100 100 100 100 (�����鰣 ����)
		Scanner input = new Scanner(System.in);
		int total = 0;
		int score;
		System.out.print("������ �������� �����Ͽ� �Է�(����: ctrl+z):");
		// EOF(End Of File)
		while(input.hasNext()) { // �Է¹��ۿ� ���� ���� �ִ���?
			   score = input.nextInt();
			   System.out.println("#");
			   total += score;
		}
		System.out.println("��: "+total);
	}
	
	public static void test5() {
		Scanner input = new Scanner(System.in);
		int total = 0;
		int count =1;
		/*
		while(count <= 5) {
			System.out.print("���� �Է�: ");
			int score = input.nextInt();
			total += score;
			count++;
		}
		*/
		do {
			System.out.print("���� �Է�: ");
			int score = input.nextInt();
			total += score;
			count++;
		}while(count <=5); // ���� �˻縦 ���߿�
		System.out.println("��: "+total);
	}
}










