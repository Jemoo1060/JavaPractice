import java.util.Scanner;

class Calculater {
	int number1; // 객체 생성시 초기값은 0으로 지정
	int number2;
	int result;
	
	
	public int inputNumber() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("1.덧셈, 2.뺄셈, 3.곱셈, 4.나눗셈");
		System.out.print("선택 : ");
		int menu = input.nextInt();
		
		
		if(menu >= 1 && menu <=4) {
			System.out.print("첫번 째 수: ");
			number1 = input.nextInt();
			System.out.print("두번 째 수: ");
			number2 = input.nextInt();
		}
		
		return menu;
		
	}
	public boolean compute() {
		int menu = inputNumber();
		boolean tf = true;
		
		if(menu == 1) {
			result = number1 + number2;
	}   else if (menu == 2) {
		result = number1 - number2;
	}   else if(menu == 3) {
		result = number1 * number2;
	}   else if(menu == 4) {
		result = number1 / number2;
	}   else {
		System.out.print("메뉴 에러");
		tf = false;
	}
		return tf;
	}
	
	public void display(int menu) {
		if(menu >= 1 && menu <=4) {
			System.out.print("결과:  " + result);
			}
	}
} 

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
		//test3();
	}
	public static void test1(){
		// 시간(0 ~ 24)을 입력 받아 인사하기
		Scanner input = new Scanner(System.in);
		System.out.print("시간을 입력 : ");
		int hour = input.nextInt();
		if(hour >= 0 && hour < 12) { // 0 이상 12미만 (범위)
			System.out.println("Morning");
		} else if(hour >= 12 && hour <18) {
			System.out.println("Afternoon");
		} else if(hour >= 18 && hour < 24) {
			System.out.println("Evening");
		} else {
			System.out.println("입력 오류");
		}
	}
	
	public static void test2(){
		// 사칙연산기
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
		
		if(menu == 1) {
			result = number1 + number2;
	}   else if (menu == 2) {
		result = number1 - number2;
	}   else if(menu == 3) {
		result = number1 * number2;
	}   else if(menu == 4) {
		result = number1 / number2;
	}   else {
		System.out.print("메뉴 에러");
	}
		if(menu >= 1 && menu <=4) {
		System.out.print("결과:  " + result);
		}
}
	public static void test3() {
		Calculater mycal = new Calculater();
		if(mycal.compute()) {
			System.out.println("결과: "+ mycal.result);
		}
				
	}
}



