import java.util.Scanner;

// �ִ�����, �ּҰ����
class Common{
	int number1, number2;

	
	public int computeGCM() {
		int gcm=0;
		for(int count = 1; count <= number1; count++) {
			if((number1 % count == 0) && (number2 % count == 0)) {
				gcm = count;
			}
		}
		return gcm;
	}
	public int computeLCM() {
		int lcm =0;
		for(int count = 1; count <= number1*number2; count++) {
			if((count % number1 == 0) && (count % number2 == 0)) {
				lcm = count;
				break;
			}
		}
		return lcm;
	}
}
// �־��� ���ڿ����� ������ ������ ������ ���ϴ� ���
class CharRepeat{
	public int checkChar(String message,char search) {
		int number = 0;
		for (int index = 0; index < message.length(); index++) {
			if(message.charAt(index)!= search)
				continue;
			number++;
		}
		return number;
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		test4();
	}
	public static void test1() {
		Common ob = new Common();
		Scanner input = new Scanner(System.in);
		System.out.print("ù ��° ��: ");
		ob.number1 = input.nextInt();
		System.out.print("�� ��° ��: ");
		ob.number2 = input.nextInt();
		
		System.out.printf("�ִ� �����: %d\n", ob.computeGCM());
		System.out.printf("�ּ� �����: %d\n", ob.computeLCM());
	}
	public static void test2() {
		// continue :  ���� �ݺ��� ���߰� ���� �ݺ��� ����
		for(int count = 1; count <=10; count ++) {
			if(count == 5)
				continue;  // 5�� ���� ����
			System.out.println(count);
			
		}
	}
	public static void test3() {
		for(int count = 1; count <= 20; count++) {
			if(count % 2 == 0 || count % 3 == 0)
					continue; // 2�� ����� 3�� ����� �ƴ� �͸� ����
				System.out.println(count);
		}
	}
	public static void test4() {
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		String message = input.nextLine();
		System.out.print("ã�� ����: ");
		char search = input.next().charAt(0);
		
		CharRepeat my = new CharRepeat();
		System.out.println(my.checkChar(message, search)+ "��");
	}

}
