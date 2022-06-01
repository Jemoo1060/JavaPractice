import java.util.Scanner;
// 소수 (Prime) : 1과 자기자신을 제외하고 나누어 떨어지지 않는 수 
class Prime{
	int number;
	boolean isPrime; // true, false
	
	public void determinePrime() {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("수를 입력(0:종료): ");
			number = input.nextInt();
			if(number == 0 ) 
				break;
			if(number == 1 )
				System.out.println("값을 다시 입력");
			else // 소수체크
				checkPrime();
				displayPrime();
		}  
	}
	
	public void checkPrime() {
		isPrime = true;
		for(int count = 2; count < number; count++) {
			if(number % count == 0) {
				isPrime = false;
				break;
			}
		}
		
	}
	public void displayPrime() {
		if(isPrime) // isPrime == true
			System.out.println("소수입니다");
		else
			System.out.println("소수가 아닙니다");
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		//test4();
		test5();
	}
	public static void test1() {
		int a = 100;
		for(int count =0; count <10; count++, a+=10) {
			System.out.println(count+" "+a);
		}
	}
	public static void test2() {
		// 구구단
		int dan = 2;
		while(dan <= 9) { // 단 : 2 ~ 9
			int su =1;
			while(su <= 9) { // 수 : 1 ~ 9
				System.out.printf("%d * %d = %d\n", dan, su, dan*su);
				su++;
			}
			dan ++;
		}
	}
	public static void test3() {
		for(int dan=2; dan<=9; dan++) {
			for(int su =1; su<=9; su++) {
				System.out.printf("%d * %d = %d\n", dan, su, dan*su);
			}
		}
	}
	public static void test4() {
		// 소수 검사
		Scanner input = new Scanner(System.in);
		System.out.print("수를 입력: ");
		int number = input.nextInt();
		boolean isPrime = true;
		
		for(int count = 2; count < number; count++) {
			if(number % count == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) // isPrime == true
			System.out.println("소수입니다");
		else
			System.out.println("소수가 아닙니다");
	}
	public static void test5() {
		Prime ob = new Prime();
		ob.determinePrime();
	}
}
