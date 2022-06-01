import java.util.Scanner;

// 제네릭 (generic) 
// 프로그램의 유연성
// 어떤 값이 하나의 참조변수 자료형이 아닌 여러 참조 자료형을 사용할 수 있게 한다.
// 제네릭에는 기본 데이터 타입은 사용할 수 없다.
// 기본 데이터 타입은 Wrapper 클래스를 활용한다.
// Integer, Character, Double, .....

// 제네릭 클래스, T, E, K, V
class Sample<T> {
	private T data;
	public void setData(T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}
}
class SamplePair<K,V>{
	private K key;
	private V value;
	
	public SamplePair(K key, V value) {
		// TODO Auto-generated constructor stub
		this.key = key;
		this.value = value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "key: " + key +", "+ "value: " + value;
	}
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	public static void test1() {
		// new Sample<>() 일떄 안에 자료형 써도되고 안써도됨.
		// 제네릭의 한계점은 제네릭 클래스안에 toString, printf와 같은 %d,%f를 못씀.
		Sample<Integer> mydata1 = new Sample<Integer>();
		mydata1.setData(10);
		System.out.println(mydata1.getData());
		
		Sample<Double> mydata2 = new Sample<>();
		mydata2.setData(20.0);
		System.out.println(mydata2.getData());
		
		Sample<String> mydata3 = new Sample<>();
		mydata3.setData("Hello");
		System.out.println(mydata3.getData());
	}
	public static void test2() {
		SamplePair<String, Integer> ob1 = new SamplePair<>("나이",25);
		System.out.println(ob1);
		
		SamplePair<Integer, String> ob2 = new SamplePair<>(25, "나이");
		System.out.println(ob2);
	}
	public static void test3() {
		SamplePair<String, Integer>[] fruit = new SamplePair[3];
		//fruit[0] = new SamplePair<>("사과", 1500);
		//fruit[1] = new SamplePair<>("바나나", 2500);
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < fruit.length; i++) {
			System.out.print("과일: ");
			String f = input.nextLine();
			System.out.print("가격: ");
			int p = input.nextInt();
			input.nextLine();
			fruit[i] = new SamplePair<>(f,p);
		}
		
		for(int i = 0; i < fruit.length; i++) {
			System.out.println(fruit[i]);
		}
	}
}


























