
public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	public static void test1() {
		int[] a = { 10, 20, 30 ,40, 50 };
		int[][] b = {{10,20}, {11,22,33}, {4,5,6,7}};
		// �迭�� ���� ���� �ϳ��� ������ ������ ����
		int total = 0;
		for(int item : a) {
			System.out.println(item);
			total += item;
		}
		System.out.println(total/a.length);
		
		for(int[] row : b) { // 2���� �迭�� ����� ��Ҹ� ������ ( 1���� �迭�� ����)
			for(int item : row) {
				System.out.println(item);
			}
		}
	}
	public static void test2() {
		int[] score = {67, 45, 78, 94, 34, 69};
		int max = score[0];
		for (int item : score) {
			if(max < item)
				max = item;
		}
		System.out.println(max);
	}

}
