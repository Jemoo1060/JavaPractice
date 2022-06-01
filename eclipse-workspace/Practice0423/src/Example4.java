// 오버라이딩(overriding)
// 상속을 받을 경우 부모의 메서드는 자식에 포함
// 자식이 상속을 받은 부모의 메서드와 동일한 메서드를 정의할 수 있다.
// 부모의 메서드를 그대로 사용하면서 자식은 추가로 재정의 하여 구현

class Superex {
	protected int number;
	
	public void setnumber(int number) {
		this.number = number;
	}
	public void displaySuper() {
		System.out.println(number);
	}
	public void displayMessage() {
		System.out.println("Super Hello");
	}
	public void display() { 
		System.out.println(number);
	}
	// 절대 오버라이딩 하고 싶지 않은 메서드는 final을 붙인다. 중요 
	/*public final void display() { 
		System.out.println(number);
	}*/
}
class Subex extends Superex {
	// 부모가 상속한 메서드와 똑같은 메서드를 정의
	protected int value;
	public void setValue(int number, int values) {
		super.setnumber(number);
		this.value = value;
	}
	
	@Override // 어노테이션: 오버라이딩된 메서드임을 알려줌. 오버라이딩이 아니면 오류나옴.
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println(super.number+value);
	}
	
	public void displayMessage() { // 오버라이딩
		super.displayMessage();
		System.out.println("Sub Hello");
	}
	public void displayMessage(String s) { // 오버로딩
		System.out.println("Sub "+ s);
	}  
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	public static void test1() {
		Subex ob = new Subex();
		// 오버로딩 메서드는 자식의 메서드를 호출
		ob.displayMessage(); // 오버라이딩
		ob.displayMessage("World"); // 오버라이딩
		ob.setValue(10,20);
		ob.display();
	}
}
