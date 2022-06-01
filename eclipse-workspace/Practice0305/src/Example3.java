
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();

	}
	
	// void형 함수 : 반환값이 존재하지 않음
	// void형 인수 : 전달값이 존재하지 않음
	public static void test1() {
		int number1 = 10, number2 = 20;
		// 데이터를 인수로 메서드에 전달
		computeAdd(number1,number2);
		int result = computeSub(number1,number2);
		// 메서드(함수)의 호출로 반환되는 값을 저장
		System.out.printf("결과2 : %d\n", result);
	}
	 // number1 과 number2를 전달 받는 변수 n1, number2를 매개변수 라고 한다. (이름 같아도 상관 없다)
	public static void computeAdd(int n1, int number2) {
		// 매개변수(parameter) : 함수 안으로 값을 전달하는 역할
		// 가상코드 : int n1 = number1;
		int result = n1 + number2;
		System.out.printf("결과 : %d\n", result);
		
	}
	//int형 메서드 : 반환값이 정수
	public static int computeSub(int n1, int n2) {
		int result = n1 - n2;
		// result를 test1로 되돌려줌(반환)
		return result; // 값을 반환
		
		
		
	}

}
