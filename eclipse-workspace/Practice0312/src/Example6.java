import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		//test4();
		//test5();
		//test6();
		//test7();
		test8();
	}
	
	public static void test1() {
		Scanner input = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = input.nextInt();
		
		// 19세 이상 성인
		if(age >= 19) { //조건(비교: >, <, >=, <= ,== 같으냐, != 다르냐)
			System.out.println("성인입니다");
			System.out.println("축하합니다");
		} 
		// 조건이 참일 경우 문장을 수행한다.
		// 그러나 조건이 거짓일 경우 : 무시하고 다음 문장 수행
		
		else{System.out.println("미성년자입니다");
		}
		
	}

	public static void test2() {
		Scanner input = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = input.nextInt();
		
		// 19세 이상 성인
		if(age >= 19) { //참인 경우
			System.out.println("성인입니다");
			System.out.println("축하합니다");
		} 
		// 조건이 참일 경우 문장을 수행한다.
		// 그러나 조건이 거짓일 경우 : 무시하고 다음 문장 수행
		
		else{// 거짓인 경우
			if(age >= 14) {
				System.out.println("청소년입니다");		
			}else {
				if(age >= 8) {
					System.out.println("어린이입니다");
				} else {
			System.out.println("유아입니다");}
			}
		}
		
	}
	public static void test3() {
		Scanner input = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = input.nextInt();
		
		if(age >= 19) {
			System.out.println("성인입니다");
			System.out.println("축하합니다");
		} 
		else if (age >= 14){ 
			System.out.println("청소년입니다");
			}
		else if(age >= 8){
			System.out.println("어린이입니다");
			} 
		else {
			System.out.println("유아입니다");
			}
	}
	public static void test4() {
		Scanner input = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int number = input.nextInt();
		
		if(number%2==0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
	public static void test5() {
		// 논리연산자(and: 그리고, or: 또는)
		// and: 둘다 참이면 참
		// or: 둘중 하나만 참이더라도 참
		// 10 ~ 30까지 : 범위
		
		int n = 15;
		
		if(n>=10 && n<=20){
			System.out.println("ok");
		}else {
				System.out.println("no");
			}
		if(n <10 || n>20){
			System.out.println("ok");
		}else {
				System.out.println("no");
			}
	}
	public static void test6() {
		// 면담조건
		int score = 90;
		//비교연산자가 논리연산자보다 우선 순위가 높다.
		// &&가 ㅣㅣ 보다 연산순위가 높다. 
		if(score < 50 || score <= 90 && score <= 100) {
			System.out.println("ok");
		} else {
			System.out.println("no");
		}
	}
	public static void test7() {
		int number1 = 10;
		int number2 = 20;
		boolean result = number1 < 0 && ++number2 > 0; //number1 < 0 이 거짓이라 뒤에 연산 자체도 하지않는다
		System.out.println(number1 + ", "+number2); // 그래서 number2 값이 20으로 출력됨
		System.out.println(result);
	}
	public static void test8() {
		int number1 = 10;
		int number2 = 20;
		boolean result = number1 > 0 || ++number2 > 0; //number1 > 0 이 참이라 뒤에 연산 자체도 하지않는다
		System.out.println(number1 + ", "+number2); // 그래서 number2 값이 20으로 출력됨
		System.out.println(result);
		System.out.println(result);
		// &&와 ||을 사용할 때 이미 앞쪽(왼쪽) 결과가 결정되면 이후의 연산은 수행하지 않는다.
		}
}			
