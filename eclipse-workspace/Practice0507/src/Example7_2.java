interface Base2 {
	int addCompute(int number1, int number2);
	int subCompute(int number1, int number2);	
}
interface Extend2 extends Base2 {
	int mulCompute(int number1, int number2);
}
interface Complete2 extends Extend2 {
	double divCompute(int number1, int number2);
}

class Calculator2 implements Complete2 {
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
		return (double)number1 / number2;
	}

}

public class Example7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	public static void test1() {
		Calculator2 mycal = new Calculator2();
		System.out.println(mycal.addCompute(10, 20));
		System.out.println(mycal.subCompute(10, 20));
		System.out.println(mycal.mulCompute(10, 20));
		System.out.println(mycal.divCompute(10, 20));
	}
}