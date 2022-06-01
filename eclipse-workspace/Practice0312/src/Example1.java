
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();

	}
	
	public static void test1(){
		int kor = 100, eng = 95, mat = 82;
		int total = kor + eng + mat;
		double average = total/3.0;
		//double average = (double)total/3;
		
		System.out.print("합계 : " + total + '\n');
		System.out.printf("합계 : %d점 입니다\n",total);
		System.out.println("평균 : " + average);
		System.out.printf("평균 : %.2f점 입니다\n",average);
	}
	
	public static void test2() {
		String name = "홍길동";
		// String은 데이터 타입이 아니라 클래스다. 
		// name은 string 클래스의 객체이다.
		System.out.println(name + "님 반갑습니다.");
		System.out.printf("%s님 반갑습니다.\n",name);
		
		int a = 10;
		String b = "hello";
		Integer c = 100;
		System.out.println(a+b+c);
		
	}

}
