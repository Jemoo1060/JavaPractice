import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	public static void test1() {
		// 2���� �迭: �ε��� 2���� ������ ����
		// �迭�� �迭�̴�(�迭�� ��Ұ� �迭)
		// �ڹٿ����� �ึ�� ���� ������ �ٸ��� �� �� �ִ�.
		int[][] a  = new int[3][2]; // ��,�� ���� ����
		int[][] b = {{10},{30,40},{50,60,70}}; // �ึ�� ���� ������ �ٸ� 1��, 2��, 3��
		
		
		System.out.println(a[1][1]); // ��ü ��� ���� ���� �صξ��� ��� �⺻�� 0
		System.out.println(b[1][1]);
		
		System.out.println(b.length); // ���� ����
		System.out.println(b[0].length); // ù��° ���� ���� ����
		System.out.println(b[1].length);
		System.out.println(b[2].length);
		
		// ��� ��� ���� (��ø �ݺ�)
		for(int row = 0; row < b.length; row++) {
			for(int cul = 0; cul < b[row].length; cul++) {
				System.out.printf("%-3d", b[row][cul]);
			}
			System.out.println();
		}
	}
	public static void test2() {
		// ����Ʈ �α��� ���ϱ�
		// ���� �α����� ��ü �α��� ���ϱ�
		int[][] apt = new int[4][2];
		Scanner input = new Scanner(System.in);
		
		for(int floor = 0; floor < apt.length; floor++) {
			for(int house = 0; house < apt[floor].length; house++) {
				System.out.printf("%d0%dȣ �α��Է�: ",floor+1,house+1);
				apt[floor][house] = input.nextInt();
			}
		}
		int total_apt= 0;
		for(int floor = 0; floor < apt.length; floor++) {
			int total_floor = 0;
			for(int house = 0; house < apt[floor].length; house++) {
				// ���� �α���
				total_floor += apt[floor][house];
				total_apt += total_floor; 				
			}
			System.out.printf("%d�� �α�: %d��\n",floor+1,total_floor);
		}
		System.out.printf("��ü �α�: %d��",total_apt);
	}

}
