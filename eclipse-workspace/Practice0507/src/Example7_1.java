interface Base1 {
	int addCompute(int number1, int number2);
	int subCompute(int number1, int number2);	
}
interface Extend1 {
	int mulCompute(int number1, int number2);
	double divCompute(int number1, int number2);
}

class Calculator1 implements Base1, Extend1{ // 인터페이스는 다중 상속됨
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
	public double divCompute(int number1, int number2) {
		// TODO Auto-generated method stub
		return (double)number1/number2;
	}
}

public class Example7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	public static void test1() {
		Calculator1 mycal = new Calculator1();
		System.out.println(mycal.addCompute(10, 20));
		System.out.println(mycal.subCompute(10, 20));
		System.out.println(mycal.mulCompute(10, 20));
		System.out.println(mycal.divCompute(10, 20));
	}
}