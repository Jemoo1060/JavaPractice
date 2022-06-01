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
		// �ڽ��� ����ϴ� Ŭ������ ��ü�� ������ �� �ִ�.
		// ���� Ŭ������ ��ü���������� ���� Ŭ������ ��ü�� �Ҵ� ���� �� �ִ�.
		Animal ani = new Animal();
		ani.move();
		//ani.flying(); �ڱⲨ�� �ƴ�.
		
		// �ڽ��� ����ϴ� Ŭ������ ��ü�� ������ �� �ִ�.
		// �������̵��� �޼��常 ȣ�� ����
		Animal ani1 = new Human();
		ani1.move(); 
		//ani1.reading(); �޸ո��� ������ �ִ� ���̶� ȣ�� �Ұ���. ����
		
		Animal ani2 = new Tiger();
		ani2.move();
		//ani2.Hunting(); ����
		
		Animal ani3 = new Eagle();
		ani3.move();
		//ani4.flying(); ����
		
	
		Animal[] a = {new Animal(),new Human(), new Tiger(), new Eagle()};
		
		for(int i = 0; i<a.length; i++) 
			a[i].move();
		
		for(Animal item : a)
			item.move();
	}
	public static void test2() {
		// ����ȯ(casting) : int -> double
		// �ٿ�ĳ����: ������ ��ü���������� ������ ��ü���������� ����ȯ
		Animal ani = new Human();
		//ani.reading(); ����
		System.out.println(ani instanceof Human);
		System.out.println(ani instanceof Tiger);
		System.out.println(ani instanceof Eagle);
		Human h = (Human)ani; // �ٿ�ĳ����
		h.reading();
		
		// A instance of B -> boolean(true/false)
		// A�� B�� ��ü���������̳�?
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





























