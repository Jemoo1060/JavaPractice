
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main 메서드의 매개변수 의 정체(String[] args)
		// String[] args: String을 요소로하는 객체배열
		// 메인의 매개변수로 전달되는 데이터는 명령행의 인수
		// 명령행에서 자바코드를 실행하는 방법
		// 명령프롬프트(cmd)에서 해당 자바프로젝트의 bin위치로 이동
		// 예) 명령프롬프트 상에서 cd C:\Java\eclipse-workspace\Practice0402\bin
		// java Example5(메인클래서이름) 인수1(args[0]) 인수2(args[1])....
		// 인수들을 메인 메서드의 args 배열로 전달
		// args[0] -> 인수1 args[1] -> 인수2가 들어감
		// 단 전달되는 인수들은 모두 문자열로 전달됨
		// 필요에 따라서 정수,실수로 형변환이 필요
		// Wrapper 클래스의 메서드를 활용하여 변환
		// Wrapper 클래스: 기본자료형(int, double)을 클래스로 만든것
		// int -> Integer, double -> Double, char -> Character,....
		// Wrepper 클래스의 메서드는 대부분 static 메서드로 정의됨
		// 이 메서드들은 객체 생성없이 클래스 이름으로 메서드를 호출할 수 있음
		// 예) String m = "100";
		// 예) int a = Integer.parseInt(m);
		
		// 외부에서 값을 전달하여 계산하는 사칙 계산기
		// 실행 예) java Example5 10 + 20
		
		if(args.length != 3) {
			System.out.println("형식이 맞지 않습니다");
			System.exit(1);
		}
		
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[2]);
		
		switch(args[1]) {
		case "+":
			System.out.printf("결과: %d\n",number1+number2);
			break;
		case "-":
			System.out.printf("결과: %d\n",number1-number2);
			break;
		case "x":
			System.out.printf("결과: %d\n",number1*number2);
			break;
		case "/":
			System.out.printf("결과: %d\n",number1/number2);
			break;
		default:
			System.out.println("연산자 잘못 입력");
		}
	}

}
