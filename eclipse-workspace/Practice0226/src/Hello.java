class Animal {
	
	void dog() {
		System.out.println("�۸۸�");
	}
	
	void cat() {
		System.out.println("�ľƿ�");
	}
	
	
}

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ݰ����ϴ�");
		
		Example1();
	}
	
	
	public static void Example1() {
		System.out.println("�Ҹ�");
		
		Test();
		Example2();
		
		Animal happy = new Animal();
		happy. dog();
		happy. cat();
	}
	
	
	public static void Example2() {
		System.out.println("�ҿ���");
		
		
	}
	
	public static void Test( ) {
		System.out.println("�ҿ�����");
	}

}
