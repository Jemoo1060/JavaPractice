class Animal{
	public void move() {
		System.out.println("Animal move");
	}
}

class Human extends Animal{
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Human move");
	}
	public void reading() {
		System.out.println("Human Reading");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Tiger move");
	}
	public void Hunting() {
		System.out.println("Tiger Hunting");
	}
}
class Eagle extends Animal{
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Eagle move");
	}
	public void flying() {
		System.out.println("Eagle Flying");
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	public static void test1() {
		// 자신이 상속하는 클래스의 객체를 참조할 수 있다.
		// 상위 클래스의 객체참조변수는 하위 클래스의 객체를 할당 받을 수 있다.
		Animal ani = new Animal();
		ani.move();
		//ani.flying(); 자기꺼가 아님.
		
		// 자신이 상속하는 클래스의 객체를 참조할 수 있다.
		// 오버라이딩한 메서드만 호출 가능
		Animal ani1 = new Human();
		ani1.move(); 
		//ani1.reading(); 휴먼만이 가지고 있는 것이라 호출 불가능. 오류
		
		Animal ani2 = new Tiger();
		ani2.move();
		//ani2.Hunting(); 오류
		
		Animal ani3 = new Eagle();
		ani3.move();
		//ani4.flying(); 오류
		
	
		Animal[] a = {new Animal(),new Human(), new Tiger(), new Eagle()};
		
		for(int i = 0; i<a.length; i++) 
			a[i].move();
		
		for(Animal item : a)
			item.move();
	}
	public static void test2() {
		// 형변환(casting) : int -> double
		// 다운캐스팅: 상위의 객체참조변수가 하위의 객체참조변수로 형변환
		Animal ani = new Human();
		//ani.reading(); 오류
		System.out.println(ani instanceof Human);
		System.out.println(ani instanceof Tiger);
		System.out.println(ani instanceof Eagle);
		Human h = (Human)ani; // 다운캐스팅
		h.reading();
		
		// A instance of B -> boolean(true/false)
		// A는 B의 객체참조변수이냐?
	}
	public static void test3() {
		
		Animal[] ani = {new Animal(),new Human(), new Tiger(), new Eagle()};
		
		for(Animal item : ani) {
			item.move();
			if(item instanceof Human) {
				Human h =(Human)item;
				h.reading();
			}
			else if(item instanceof Tiger) {
				Tiger t = (Tiger)item;
				t.Hunting();
			}
			else if(item instanceof Eagle) {
				Eagle e = (Eagle)item;
				e.flying();
			}
			else item.move();
		}
	}
}





























