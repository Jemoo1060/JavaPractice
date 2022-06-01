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
		System.out.print("몇 부터? ");
		count = input.nextInt();
		System.out.print("몇 까지? ");
		int number = input.nextInt();
		while(count <= number) {
			if(count%2==0 || count%3==0){
			total += count;
			}
			count++;
			
		}
		System.out.printf("합: %d\n",total);
	}
	
	public static void test2() {
		// 점수를 입력 받아 합 구하기
		// 단 0을 입력하면 종료
		int sum = 0;
		int count = 0;
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("점수: ");
			int number =  input.nextInt();
			if(number!=-1) { 
				sum +=number;
				count++;
			}
			 else 
				break;
		}
		System.out.println("합: "+sum);
		System.out.printf("평균: %.1f\n",sum/(double)count);
	}
	
	public static void test3() {
		Scanner input = new Scanner(System.in);
		System.out.print("몇 부터? ");
		int first = input.nextInt();
		System.out.print("몇 까지? ");
		int last = input.nextInt();
		
		if(first < last) {
		while(true) {
			if(first >= last)break;
			first++;
			last--;
			}
		System.out.println("중간 값: "+last);
	} else {
		System.out.println("첫 수가 두 번째 수보다 작아야합니다");
	}		
   }
	
	public static void test4() {
		// 점수입력: 100 100 100 100 (점수들간 공백)
		Scanner input = new Scanner(System.in);
		int total = 0;
		int score;
		System.out.print("점수들 엔터으로 구분하여 입력(종료: ctrl+z):");
		// EOF(End Of File)
		while(input.hasNext()) { // 입력버퍼에 다음 값이 있느냐?
			   score = input.nextInt();
			   System.out.println("#");
			   total += score;
		}
		System.out.println("합: "+total);
	}
	
	public static void test5() {
		Scanner input = new Scanner(System.in);
		int total = 0;
		int count =1;
		/*
		while(count <= 5) {
			System.out.print("점수 입력: ");
			int score = input.nextInt();
			total += score;
			count++;
		}
		*/
		do {
			System.out.print("점수 입력: ");
			int score = input.nextInt();
			total += score;
			count++;
		}while(count <=5); // 조건 검사를 나중에
		System.out.println("합: "+total);
	}
}










