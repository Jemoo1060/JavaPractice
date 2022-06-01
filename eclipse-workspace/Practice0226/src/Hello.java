class Animal {
	
	void dog() {
		System.out.println("¸Û¸Û¸Û");
	}
	
	void cat() {
		System.out.println("³Ä¾Æ¿Ë");
	}
	
	
}

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¾È³çÇÏ¼¼¿ä");
		System.out.println("¹Ý°©½À´Ï´Ù");
		
		Example1();
	}
	
	
	public static void Example1() {
		System.out.println("¼Ò¸§");
		
		Test();
		Example2();
		
		Animal happy = new Animal();
		happy. dog();
		happy. cat();
	}
	
	
	public static void Example2() {
		System.out.println("¼Ò¿À¸§");
		
		
	}
	
	public static void Test( ) {
		System.out.println("¼Ò¿À¿À¸§");
	}

}
