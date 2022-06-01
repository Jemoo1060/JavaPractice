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
		// 배열: 동일한 자료형의 데이터를 하나로 묶은것 
		// 배열은 연속된 메모리 공간을 할당 받음
		// 배열의 각 요소는 위치값(index)
		int[] a = {10,20,30,40,50};
		System.out.println(a[0]);
		System.out.println(a[3]);
		
		// 자바에서 배열은 객체이다.
		System.out.println(a.length); // 개수
		// 자바에서 배열을 정의할 때 초기값을 주면 객체가 자동 생성
		
		// 초기값 없이 배열 생성
		int []b = new int[4]; // 0으로 초기화
		System.out.println(b[0]);
		// System.out.println(b[4]); 배열의 범위를 벗어남
		b[0] = 100;
		b[1] = 200;
		}
	public static void test2() {
		// 배열의 모든 요소에 접근 : 반복문
		int[] score = {90,87, 65, 93, 48, 20};
		int total = 0;
		for(int index = 0; index < score.length; index++) {
			System.out.println(score[index]);
			total += score[index];
		}
		System.out.println("합계: "+total);
	}
	public static void test3() {
		Scanner input = new Scanner(System.in);
		int[] score = new int[5];
		int total = 0;
		for(int index=0; index < score.length; index++) {
		System.out.print("점수 입력: ");
		score[index] = input.nextInt();
		total += score[index];
		}
		System.out.println("평균: "+(double)total/score.length);
	}
	public static void test4() {
		// 피보나치 수열
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
			if(index!=fibo.length-1) // 마지막이 아니면
			System.out.print(", ");
		}
		System.out.println("]");
	}
}
