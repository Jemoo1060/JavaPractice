interface Base {
	int addCompute(int number1, int number2);
	int subCompute(int number1, int number2);	
}
interface Extend {
	int mulCompute(int number1, int number2);
}
interface Complete extends Base, Extend  { // 인터페이스는 다중 상속됨.
	int divCompute(int number1, int number2);
}

class Calculator implements Complete{
	@Override
	public int addCompute(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1 + number2;
	}
	@Override
	public int subCompute(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1 - number2;
	}
	@Override
	public int mulCompute(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1 * number2;
	}
	@Override
	public int divCompute(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1 / number2;
	}

}

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	public static void test1() {
		Calculator mycal = new Calculator();
		System.out.println(mycal.addCompute(10, 20));
		System.out.println(mycal.subCompute(10, 20));
		System.out.println(mycal.mulCompute(10, 20));
		System.out.println(mycal.divCompute(10, 20));
	}
}