import java.util.Scanner;

// 지수와 기수를 입력 받아 거듭제곱 구하기
// 3의 2승 -> 9
class Exponent{
	private int radix; // 3
	private int expo; // 2
	private int result; // 9
	
	public void setData(int _radix,int _expo) {
		if(_radix < 0) {
			System.out.println("가수는 양수이어야 합니다");
			System.exit(1);
		} else {
			result = 1;
			radix = _radix;
			expo = _expo;
			computeExponent();
		}
	}
	private void computeExponent() {
		for(int count = 0; count < expo; count++) {
			result*=radix;
		}
	}
	public int getData() {
		return result;
	}
}

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("기수 입력: ");
		int radix = input.nextInt();
		System.out.print("지수 입력: ");
		int expo = input.nextInt();
		
		Exponent ob = new Exponent();
		ob.setData(radix, expo);
		System.out.println("결과: "+ob.getData());
	}

}
