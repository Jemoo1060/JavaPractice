// 교수님 급발진 전 추상화 클래스

abstract class  Numbers1{   // 추상메서드를 쓰기위해 abstract
	protected int number1, number2;
	
	public Numbers1(int number1, int number2) {
		// TODO Auto-generated constructor stub
		this.number1 = number1;
		this.number2 = number2;
	}
	
	//오버라이딩의 용도
	/*
	public int compute() {
		return -999999999; // 오버라이딩의 역할을 위해 대충 형태만 맞추어놓음
	}*/
	
	abstract public int compute(); 
	// 추상메서드(오버라이딩의 역할을 하기위해 껍데기를 만들수 밖에 없는데 간략하게 만들기 위해 만듬) 
}

class AddNumber1 extends Numbers1 {
	
	public AddNumber1(int number1, int number2){
		super(number1,number2);
	}
	@Override
	public int compute() {
		// TODO Auto-generated method stub
		return number1 + number2;
	}

}
class MulNumber1 extends Numbers1{
	
	public MulNumber1(int number1, int number2) {
		// TODO Auto-generated constructor stub
		super(number1, number2);
	}
	@Override
	public int compute() {
		// TODO Auto-generated method stub
		return number1 * number2;
	}
}

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	public static void test1() {
		AddNumber1 ob1 = new AddNumber1(10,20);
		System.out.println("합: "+ob1.compute());
		MulNumber1 ob2 = new MulNumber1(10, 20);
		System.out.println("곱: "+ob2.compute());
	}
	public static void test2() {
		Numbers1 ob;
		ob = new AddNumber1(10,20);
		System.out.println("합: "+ob.compute());
		ob = new MulNumber1(10,20);
		System.out.println("곱: "+ob.compute());
	}
}
