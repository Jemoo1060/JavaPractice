
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		test4();
	}
	public static void test1() {
		Customer ob = new Customer(101,"ȫ�浿");
		System.out.println("���ұݾ�: "+ ob.calcPrice(10000));
		//System.out.println(ob.showCustomerInfo());
		System.out.println(ob);
	}
	public static void test2() {
		VIPCustomer ob = new VIPCustomer(102,"������",5);
		System.out.println("���ұݾ�: "+ob.calcPrice(1000000));
		System.out.println(ob);
	}
	public static void test3() {
		GoldCustomer ob = new GoldCustomer(103, "�迬��");
		System.out.println("���ұݾ�: "+ob.calcPrice(500000));
		System.out.println(ob);
	}
	public static void test4() {
		Customer[] member = new Customer[3]; // ����Ŭ������ ����Ŭ������ ��ü���� ���� �� �ִ�.
		member[0] = new Customer(101,"ȫ�浿");
		member[1] = new VIPCustomer(102,"������",5);
		member[2] = new GoldCustomer(103, "�迬��");
		
		for(Customer ob : member) {
			System.out.println("���ұݾ�: "+ob.calcPrice(10000000));
			System.out.println(ob);
		}
	}
	
}
