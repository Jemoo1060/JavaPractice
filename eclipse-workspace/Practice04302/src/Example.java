
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		test4();
	}
	public static void test1() {
		Customer ob = new Customer(101,"홍길동");
		System.out.println("지불금액: "+ ob.calcPrice(10000));
		//System.out.println(ob.showCustomerInfo());
		System.out.println(ob);
	}
	public static void test2() {
		VIPCustomer ob = new VIPCustomer(102,"박지성",5);
		System.out.println("지불금액: "+ob.calcPrice(1000000));
		System.out.println(ob);
	}
	public static void test3() {
		GoldCustomer ob = new GoldCustomer(103, "김연아");
		System.out.println("지불금액: "+ob.calcPrice(500000));
		System.out.println(ob);
	}
	public static void test4() {
		Customer[] member = new Customer[3]; // 상위클래스는 하위클래스에 객체들을 묶을 수 있다.
		member[0] = new Customer(101,"홍길동");
		member[1] = new VIPCustomer(102,"박지성",5);
		member[2] = new GoldCustomer(103, "김연아");
		
		for(Customer ob : member) {
			System.out.println("지불금액: "+ob.calcPrice(10000000));
			System.out.println(ob);
		}
	}
	
}
