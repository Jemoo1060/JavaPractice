import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	public static void test1() {
		// 2차원 배열: 인덱스 2개를 가지고 접근
		// 배열의 배열이다(배열의 요소가 배열)
		// 자바에서는 행마다 열의 개수를 다르게 할 수 있다.
		int[][] a  = new int[3][2]; // 행,열 숫자 지정
		int[][] b = {{10},{30,40},{50,60,70}}; // 행마다 열의 갯수가 다름 1개, 2개, 3개
		
		
		System.out.println(a[1][1]); // 객체 행과 열을 지정 해두었을 경우 기본값 0
		System.out.println(b[1][1]);
		
		System.out.println(b.length); // 행의 갯수
		System.out.println(b[0].length); // 첫번째 행의 열의 갯수
		System.out.println(b[1].length);
		System.out.println(b[2].length);
		
		// 모든 요소 접근 (중첩 반복)
		for(int row = 0; row < b.length; row++) {
			for(int cul = 0; cul < b[row].length; cul++) {
				System.out.printf("%-3d", b[row][cul]);
			}
			System.out.println();
		}
	}
	public static void test2() {
		// 아파트 인구수 구하기
		// 층멸 인구수와 전체 인구수 구하기
		int[][] apt = new int[4][2];
		Scanner input = new Scanner(System.in);
		
		for(int floor = 0; floor < apt.length; floor++) {
			for(int house = 0; house < apt[floor].length; house++) {
				System.out.printf("%d0%d호 인구입력: ",floor+1,house+1);
				apt[floor][house] = input.nextInt();
			}
		}
		int total_apt= 0;
		for(int floor = 0; floor < apt.length; floor++) {
			int total_floor = 0;
			for(int house = 0; house < apt[floor].length; house++) {
				// 층별 인구수
				total_floor += apt[floor][house];
				total_apt += total_floor; 				
			}
			System.out.printf("%d층 인구: %d명\n",floor+1,total_floor);
		}
		System.out.printf("전체 인구: %d명",total_apt);
	}

}
