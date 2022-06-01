class Top {
	private int tNumber = 10;
	
	public Top() {  // Top(부모) 일반생성자 생성시  부모의 기본생성자가 없으면 오류가 나옴.
		// TODO Auto-generated constructor stub
		System.out.println("Top 기본생성자");
	}
	// 기본생성자는 생성자가 정의되지 않았을 때 자동으로 생성.
	// 일반 생성자만 있을 경우 기본 생성자는 자동으로 생성되지 않는다.
	public Top(int tNumber) {
		// TODO Auto-generated constructor stub
		System.out.println("Top 일반생성자");
		this.tNumber = tNumber;
	}
	public void setTop(int tNumber) {
		this.tNumber = tNumber;
	}
	public int getTop() {
		return tNumber;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//System.out.println("tNumber="+ getTop()); 이렇게 해도 출력 상관없음.
		return String.format("tNumber= %d", getTop());
	}
}
class Middle extends Top{
	public int mNumber = 20;
	
	public Middle() {
		// TODO Auto-generated constructor stub
		System.out.println("Middle 기본생성자");
	}
	public Middle(int tNumber,int mNumber) {
		// TODO Auto-generated constructor stub
		// 생성자 코드에서 가장 먼저 수행
		super(tNumber); // 부모의 생성자를 호출

		System.out.println("Middle 일반생성자");
		//super.setTop(tNumber);
		
		// 부모의 생성자를 명시적으로 호출
		//super(); 오류나옴. 순서가 잘못됨. 부모생성자의 코드는 반드시 자식생성자 실행코드 맨 위에 존재.
		// 자식생성자가 실행 중에 부모 생성자 호출은 순서에 맞지 않는다.
		this.mNumber = mNumber;
	}
	public void setMiddle(int tNumber,int mNumber) {
		//super.tNumber = tNumber; >> private라 오류
		//this.tNumber = tNumber;  >> private라 오류
		super.setTop(tNumber);
		this.mNumber = mNumber;
	}
	public int getMiddle() {
		return mNumber;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = super.toString() + "\n";
		message += String.format("mNumber= %d", getMiddle());
		return message;
	}
}
class Bottom extends Middle{
	private int bNumber;
	
	public Bottom(int tNumber, int mNumber, int bNumber) {
		// TODO Auto-generated constructor stub
		super(tNumber,mNumber);
		this.bNumber = bNumber;
		System.out.println("Bottom 일반생성자");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = super.toString() + "\n";
		message += String.format("bNumber= %d", getBottom());
		return message;
	}
	public int getBottom() {
		return bNumber;
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		//test4();
		test5();
	}
	public static void test1() {
		Middle ob = new Middle();
		ob.setMiddle(100,200);
		//System.out.println(ob.tNumber); >> private라 오류
		System.out.println(ob.mNumber);
	}
	public static void test2() {
		Middle ob = new Middle();
		ob.setMiddle(100,200);
		System.out.println(ob.getTop());
		System.out.println(ob.getMiddle());
	}
	public static void test3() {
		Top t = new Top();
		System.out.println(t);
		Middle ob = new Middle();
		ob.setMiddle(100,200);
		System.out.println(ob);
	}
	public static void test4() {
		Middle ob = new Middle(100,200); // 자식 객체를 생성해도 부모생성자가 실행이 된다(부모가 우선 실행됨). 
		// 상속관계에서 생성자의 호출
		// 생성자가 존재하지 않을 경우: 기본생성자를 자동생성
		// 생성자의 호출 순서
		// 1. 자식의 생성자 호출
		// 2. 부모의 생성자 호출
		// 3. 부모의 생성자 실행
		// 4. 자식의 생성자 실행
		
		System.out.println(ob);
	}
	public static void test5() {
		Bottom ob = new Bottom(101,201,301);
		System.out.println(ob);
	}
}


















