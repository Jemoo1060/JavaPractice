import java.util.Scanner;

class Grade{
	int[] score;
	
	public int getTotal() {
		int total = 0;
		for(int i = 0; i<score.length; i++)
			total += score[i];
		return total;
	}
	public void starChart() {
		int[] level = new int[11];
		for(int index =0; index < score.length; index++) {
				level[score[index]/10] ++;
	}
		
		for(int index = 0; index < level.length; index++) {
			if(index < 10)
				System.out.printf("%2d~%2d: ",index*10,index*10+9);
			else
				System.out.printf("  100: ",index*10);
			// 실제 별을 개수만큼 출력
			for(int star = 0; star<level[index]; star++) {
			System.out.print("*");
			}
			System.out.println();
		}
}
}
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	public static void test1() {
		Grade my = new Grade();
		Scanner input = new Scanner(System.in);
		my.score = new int[5];
		for(int i=0; i <my.score.length; i++) {
			System.out.print("점수 입력: ");
			my.score[i]=input.nextInt();
		}
	
		System.out.println("총합: "+my.getTotal());
	}
	public static void test2() {
		// 별의 개수를 가지고 있는 배열
		int[] level = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};
		
		for(int index = 0; index < level.length; index++) {
			System.out.printf("%2d: ",index);
			// 실제 별을 개수만큼 출력
			for(int star = 0; star<level[index]; star++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void test3() {
		Scanner input = new Scanner(System.in);
		Grade my = new Grade();
		my.score = new int[5];
		for(int i=0; i <my.score.length; i++) {
			System.out.print("점수 입력: ");
			my.score[i]=input.nextInt();
		}
		my.starChart();
	}
}

