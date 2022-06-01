
public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	public static void test1() {
		int[] a = { 10, 20, 30 ,40, 50 };
		int[][] b = {{10,20}, {11,22,33}, {4,5,6,7}};
		// 배열로 부터 값을 하나씩 가져와 변수에 저장
		int total = 0;
		for(int item : a) {
			System.out.println(item);
			total += item;
		}
		System.out.println(total/a.length);
		
		for(int[] row : b) { // 2차원 배열의 행단위 요소를 가져옴 ( 1차원 배열로 변형)
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
