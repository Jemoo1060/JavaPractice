import java.util.Scanner;

class Pass {
	int pass;
	int failure;
	
	public void determine(int score) {
		if(score>=80) {
			pass++;
		}else {
			failure++;
		}
	}
	
	public void display() {
		System.out.printf("�հ�: %d, ���հ�: %d\n", pass,failure);
	}
}


public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		test4();
	}
	
	public static void test1() {
		// �ݺ�
		int count = 1; // �ݺ� �ʱⰪ
		while(true){// ������ ���� ��� �ݺ� ����
			//���ѹݺ�
			System.out.println("hello"+count);
			
			if(count == 10)
				break; // ������ ����� ��� 
			
			count++; // ����
			// count = count + 1;
			// count += 1;
		}  
	}
	public static void test2() {
		// ����ݺ�
		int count = 1;
		while(count <= 10) { //������ ���� ���� �ݺ�
			System.out.println("korea"+count);
			count++;
		}
	}
	public static void test3() {
		Pass my = new Pass();
		Scanner input = new Scanner(System.in);
		
		int count = 1;
		while(count <=10) {
			System.out.print("����: ");
			int score = input.nextInt();
			my.determine(score);
			count++;
		}
		my.display();
	}
	
	public static void test4() {
		int count =1;
		int total =0;
		while(count <= 10) {
			total += count; // total = total + count;
			count++;
		}
		System.out.print("total: "+ total);		
	}
}


