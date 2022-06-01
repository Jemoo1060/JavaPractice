import java.util.Scanner;

class Adder {
	int number1,number2,result;
	
	void computeAdder() {
		result = number1 + number2;
	}
	
	int computeDisplay() {
		 return number1 + number2;
	}
	
	void displayAdder() {
		System.out.println("결과 : " + result);
	}
}

class Human {
	String name;
	int age;
	double weight;
	char blood;
	
	void displayHuman() {
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
		System.out.println("몸무게 : "+ weight);
		System.out.println("혈액형 : "+ blood);
	
	}
}

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		test4();
	}
	public static void test1() {
		// 키보드로 표준 입력 방법( 콘솔 입력 : System.in)
		// 외부로부터 값을 입력 받는 방법
		// scanner 클래스를 활용
		Scanner input = new Scanner(System.in);
		// 콘솔로 입력 받을 수 있는 Scanner 객체를 생성
		System.out.print("정수 입력 : ");
		int number = input.nextInt(); // 정수를 입력
		System.out.println("결과 : " +(number+10));
		
		input.nextLine(); // 앞의 결과의 엔터가 다음 nextLine에 적용 안되게 하기 위해 트릭으로 1개 넣어둔다. (엔터키 흡수)
		
		System.out.print("취미을 입력 : ");
		String hobby = input.nextLine(); // 공백도 포함
		System.out.println("취미 : "+ hobby);
		
		System.out.print("이름을 입력 : ");
		String name = input.next(); // 공백은 처리하지 않는다.
		System.out.println("이름 : "+name); 
	}
	public static void test2() {
		Adder my = new Adder();
		Scanner input = new Scanner(System.in);
		System.out.print("첫 번째 수 : ");
		my.number1=input.nextInt();
		System.out.print("두 뻔째 수 : ");
		my.number2=input.nextInt();
		
		my.computeAdder();
		my.displayAdder();
		
		System.out.printf("답 : %d\n",my.computeDisplay());
	}
	public static void test3() {
		Human man = new Human();
		Scanner input = new Scanner(System.in);
		System.out.print("이름 ? ");
		man.name=input.nextLine();
		System.out.print("나이 ? ");
		man.age = input.nextInt();
		System.out.print("몸무게 ? ");
		man.weight = input.nextDouble();
		System.out.print("혈액형 ? ");
		man.blood= input.next().charAt(0);
		// 문자의 입력은 문자열에서 첫번째 글자(0)만 가져온다.
		// 문자열 메서드의 charAt()을 이용
		man.displayHuman();
		
	}
	
	public static void test4() {
		String message="Korea";
		System.out.println(message);
		System.out.println(message.charAt(0));
		System.out.println(message.length());
		System.out.println(message.toUpperCase());
		
		
	}
}

