
public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	
	public static void test1() {
		
		int total = 0;
		for(int count =1; count <= 10;count++) {
			System.out.println("hello "+count);
			if(count%2 == 0)
			total += count;
		}
		System.out.println(total);
	}
	
	public static void test2() {
		// 1ºÎÅÍ È¦¼ö 10°³
		int number = 1;

		for(int count=1;count<=10; count++, number+=2) {
				System.out.println(number);
		}
	}
	
}
