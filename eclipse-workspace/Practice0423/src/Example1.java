// 상속 : 클래스로부터 속성과 메서드를 물려받음
// 클래스를 만들 때 클래스의 속성이나 중복을 제거
// 사전에 정의된 클래스의 속성과 메서드를 상속 받아 다시 사용
// 상위(부모, 슈퍼) 클래스 : 상속을 하는 클래스 
// 하위(자식, 서브) 클래스 : 상속을 받는 클래스
// 상속을 정의하는 방법 : 하위 클래스에서 extends 라는 키워드를 사용

class Numbers {
	public int number1;
	public int number2;
	
	public void setNumber(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
}
class Calculator extends Numbers{
	
	public int computeAdd() {
		return number1 + number2;
	}
	public int computeSub() {
		return number1 - number2;
	}
}
class Parent {
	public int pnumber;
	public void setParent(int pnumber) {
		this.pnumber = pnumber;
	}
	public void displayParent() {
		System.out.println("p= "+pnumber);
	}
}
class Child extends Parent {
	public int cnumber;
	public void setChild(int pnumber, int cnumber) {
		setParent(pnumber);
		//this.pnumber = pnumber;
		this.cnumber = cnumber;
	}
	public void displayChild() {
		//System.out.println("p= "+pnumber);
		displayParent();
		System.out.println("c= "+cnumber);
	}
}
class Baby extends Child{
	public int bnumber;
	public void setBaby(int pnumber, int cnumber, int bnumber) {
		//this.pnumber = pnumber;
		//this.cnumber = cnumber;
		setChild(pnumber, cnumber);
		this.bnumber = bnumber;
	}
	public void displayBaby() {
		//System.out.println("p= "+pnumber);
		//System.out.println("c= "+cnumber);
		displayChild();
		System.out.println("b= "+bnumber);
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	public static void test1() {
		Calculator my = new Calculator();
		//my.number1 = 10;
		//my.number2 = 20;
		my.setNumber(10,20);
		System.out.println(my.computeAdd());
	}
	
	
	public static void test2() {
		Parent pob = new Parent();
		pob.setParent(10);
		pob.displayParent();
		
		Child cob = new Child();
		cob.setChild(10, 20);
		cob.displayChild();
		
		Baby bob = new Baby();
		bob.setBaby(10,20,30);
		
		bob.displayBaby();
	}

	
	

}
