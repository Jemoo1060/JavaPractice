interface  Numbers{   // 추상메서드를 쓰기위해 abstract
	
	int NUMBER = 100; // 상수 정도는 만들어도 됨. implements  되는 모든 곳에서 사용 가능.
	
	//오버라이딩의 용도
	/*
	public int compute() {
		return -999999999; // 오버라이딩의 역할을 위해 대충 형태만 맞추어놓음
	}*/
	
	public int compute(); 
	// 추상메서드(오버라이딩의 역할을 하기위해 껍데기를 만들수 밖에 없는데 간략하게 만들기 위해 만듬) 
}

class AddNumber implements Numbers {
	private int number1, number2;
		
	public AddNumber(int number1, int number2){
		this.number1 = number1;
		this.number2 = number2;
	}
	
	@Override
	public int compute() {
		// TODO Auto-generated method stub
		return number1 + number2;
	}

}
class MulNumber implements Numbers{
	private int number1, number2;
	
	public MulNumber(int number1, int number2){
		this.number1 = number1;
		this.number2 = number2;
	}
	@Override
	public int compute() {
		// TODO Auto-generated method stub
		return number1 * number2;
	}
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	public static void test1() {
		AddNumber ob1 = new AddNumber(10,20);
		System.out.println("합: "+ob1.compute());
		MulNumber ob2 = new MulNumber(10, 20);
		System.out.println("곱: "+ob2.compute());
	}
	public static void test2() {
		Numbers ob;
		ob = new AddNumber(10,20);
		System.out.println("합: "+ob.compute());
		ob = new MulNumber(10,20);
		System.out.println("곱: "+ob.compute());
		System.out.println(Numbers.NUMBER);
	}
}























