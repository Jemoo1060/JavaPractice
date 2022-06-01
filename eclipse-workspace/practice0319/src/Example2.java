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
		System.out.println("1.덧셈, 2.뺄셈, 3.곱셈, 4.나눗셈");
		System.out.print("선택 : ");
		int menu = input.nextInt();
		
		int number1 = 0, number2 = 0, result = 0;
		
		if(menu >= 1 && menu <=4) {
			System.out.print("첫번 째 수: ");
			number1 = input.nextInt();
			System.out.print("두번 째 수: ");
			number2 = input.nextInt();
		}
		
		switch(menu) { // 인수는 정수
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
				System.out.println("메뉴 에러");
		}
		
		if(menu >= 1 && menu <=4) {
		System.out.println("결과:  " + result);
		}
	}
	public static void test2() {
		Scanner input = new Scanner(System.in);
		System.out.print("(M)orning,(A)fternoon,(E)vening : ");
		char menu = input.next().toLowerCase().charAt(0);  // 대문자를 입력 받아도 전부 소문자로 입력이됨. toLowerCase
		// 입력 받은 문자열의 첫 번째 문자만 저장
		
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
		// 입력 받은 문자열의 첫 번째 문자만 저장
		// 자바는 문자열로 switch문이 가능하다 c는 불가능
		
		// 참고 : 문자열의 비교
		/*
		 String a = "korea";
		 if(a=="korea")는 거짓이 나온다.
		 자바에서 String은 변수가 아닌 객체
		 c는 참으로 나옴
		  */
		
		String a = "korea";
		if(a.equals("korea"))
			System.out.println("같다"); // 문자열을 if로 조건하고 싶을때 equals를 사용
		
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
