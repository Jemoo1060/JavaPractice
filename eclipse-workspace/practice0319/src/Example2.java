import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	public static void test1() {
		Scanner input = new Scanner(System.in);
		System.out.println("1.����, 2.����, 3.����, 4.������");
		System.out.print("���� : ");
		int menu = input.nextInt();
		
		int number1 = 0, number2 = 0, result = 0;
		
		if(menu >= 1 && menu <=4) {
			System.out.print("ù�� ° ��: ");
			number1 = input.nextInt();
			System.out.print("�ι� ° ��: ");
			number2 = input.nextInt();
		}
		
		switch(menu) { // �μ��� ����
			case 1:
				result = number1 + number2;
				break;
			case 2:
				result = number1 - number2;
				break;
			case 3:
				result = number1 * number2;
				break;
			case 4:
				result = number1 / number2;
				break;
			default:
				System.out.println("�޴� ����");
		}
		
		if(menu >= 1 && menu <=4) {
		System.out.println("���:  " + result);
		}
	}
	public static void test2() {
		Scanner input = new Scanner(System.in);
		System.out.print("(M)orning,(A)fternoon,(E)vening : ");
		char menu = input.next().toLowerCase().charAt(0);  // �빮�ڸ� �Է� �޾Ƶ� ���� �ҹ��ڷ� �Է��̵�. toLowerCase
		// �Է� ���� ���ڿ��� ù ��° ���ڸ� ����
		
		switch(menu) {
			case 'M':
			case 'm':
				System.out.println("morning");
				break;
			case 'A':
			case 'a':
				System.out.println("afternoon");
				break;
			case 'E':
			case 'e':
				System.out.println("evening");
				break;
			default:
				System.out.println("error");
			
		}
	}
	public static void test3() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("(M)orning,(A)fternoon,(E)vening : ");
		String menu = input.next();
		// �Է� ���� ���ڿ��� ù ��° ���ڸ� ����
		// �ڹٴ� ���ڿ��� switch���� �����ϴ� c�� �Ұ���
		
		// ���� : ���ڿ��� ��
		/*
		 String a = "korea";
		 if(a=="korea")�� ������ ���´�.
		 �ڹٿ��� String�� ������ �ƴ� ��ü
		 c�� ������ ����
		  */
		
		String a = "korea";
		if(a.equals("korea"))
			System.out.println("����"); // ���ڿ��� if�� �����ϰ� ������ equals�� ���
		
		switch(menu) {
			case "morning":
				System.out.println("morning");
				break;
			case "afternoon":
				System.out.println("afternoon");
				break;
			case "evening":
				System.out.println("evening");
				break;
			default:
				System.out.println("error");
			
		}
	}

}
