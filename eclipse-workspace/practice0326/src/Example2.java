import java.util.Scanner;

// 최대공약수, 최소공배수
class Common{
	int number1, number2;

	
	public int computeGCM() {
		int gcm=0;
		for(int count = 1; count <= number1; count++) {
			if((number1 % count == 0) && (number2 % count == 0)) {
				gcm = count;
			}
		}
		return gcm;
	}
	public int computeLCM() {
		int lcm =0;
		for(int count = 1; count <= number1*number2; count++) {
			if((count % number1 == 0) && (count % number2 == 0)) {
				lcm = count;
				break;
			}
		}
		return lcm;
	}
}
// 주어진 문자열에서 지정된 문자의 개수를 구하는 방법
class CharRepeat{
	public int checkChar(String message,char search) {
		int number = 0;
		for (int index = 0; index < message.length(); index++) {
			if(message.charAt(index)!= search)
				continue;
			number++;
		}
		return number;
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		test4();
	}
	public static void test1() {
		Common ob = new Common();
		Scanner input = new Scanner(System.in);
		System.out.print("첫 번째 수: ");
		ob.number1 = input.nextInt();
		System.out.print("두 번째 수: ");
		ob.number2 = input.nextInt();
		
		System.out.printf("최대 공약수: %d\n", ob.computeGCM());
		System.out.printf("최소 공배수: %d\n", ob.computeLCM());
	}
	public static void test2() {
		// continue :  현재 반복을 멈추고 다음 반복을 진행
		for(int count = 1; count <=10; count ++) {
			if(count == 5)
				continue;  // 5만 빼고 찍음
			System.out.println(count);
			
		}
	}
	public static void test3() {
		for(int count = 1; count <= 20; count++) {
			if(count % 2 == 0 || count % 3 == 0)
					continue; // 2의 배수와 3의 배수가 아닌 것만 찍어라
				System.out.println(count);
		}
	}
	public static void test4() {
		Scanner input = new Scanner(System.in);
		System.out.print("문장 입력: ");
		String message = input.nextLine();
		System.out.print("찾을 문자: ");
		char search = input.next().charAt(0);
		
		CharRepeat my = new CharRepeat();
		System.out.println(my.checkChar(message, search)+ "개");
	}

}
