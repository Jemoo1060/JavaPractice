class Fruit{
	public int apple;
	int banana; // 기본값 package로 설정 package 쓰면 오류남
	private int strawberry;
	private int total;
	
	// 설정자(setter)
	public void setStrawberry(int s) {
		strawberry = s;		
	}
	// 접근자(getter)
	public int getTotal() {
		return total;
	}
	private void totalFruit() {
		total = apple + strawberry + banana;
	}
	public String displayFruit() {
		totalFruit();
		String message = String.format("총합: %d\n", total);
		return message;
	}
}
class Student{
	private String name;
	private int kor, eng, math;
	private int total;
	
	public void Setscore(String n,int k, int e, int m){
		name = n;
		kor = k;
		eng = e;
		math = m;
	}
	private void computeTotal() {
		total = kor + eng + math;
	}
	public String displayStudent() {
		String message = "";
		// 이름, 합계
		computeTotal();
		message += String.format("이름: %s\n", name);
		message += String.format("합계: %d\n", total);
		return message;
	}
}
public class Example6 {
	int number;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	public static void test1() {
		// 정보은닉: 클래스 내부의 구현은 최대한 숨기자 
		// 캡슐화: 정보은닉을 위해 잘 묶자 ( 공개할 것과 비공개할 것을 나누자)
		// 접근제어 : public, package, private, protected
		Fruit my = new Fruit();
		my.apple = 5;
		my.banana = 3;
		// my.strawberry = 10; //오류뜸, private 접근
		my.setStrawberry(10); // private 설정을 위해 돌아서 감
		System.out.print(my.displayFruit());
		System.out.println(my.getTotal() + 10);
	}
	public static void test2() {
		Student man = new Student();
		man.Setscore("홍길동", 90, 86, 79);
		System.out.print(man.displayStudent());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
