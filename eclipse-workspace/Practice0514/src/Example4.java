import java.util.Scanner;

// ���׸� (generic) 
// ���α׷��� ������
// � ���� �ϳ��� �������� �ڷ����� �ƴ� ���� ���� �ڷ����� ����� �� �ְ� �Ѵ�.
// ���׸����� �⺻ ������ Ÿ���� ����� �� ����.
// �⺻ ������ Ÿ���� Wrapper Ŭ������ Ȱ���Ѵ�.
// Integer, Character, Double, .....

// ���׸� Ŭ����, T, E, K, V
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
		// new Sample<>() �ϋ� �ȿ� �ڷ��� �ᵵ�ǰ� �Ƚᵵ��.
		// ���׸��� �Ѱ����� ���׸� Ŭ�����ȿ� toString, printf�� ���� %d,%f�� ����.
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
		SamplePair<String, Integer> ob1 = new SamplePair<>("����",25);
		System.out.println(ob1);
		
		SamplePair<Integer, String> ob2 = new SamplePair<>(25, "����");
		System.out.println(ob2);
	}
	public static void test3() {
		SamplePair<String, Integer>[] fruit = new SamplePair[3];
		//fruit[0] = new SamplePair<>("���", 1500);
		//fruit[1] = new SamplePair<>("�ٳ���", 2500);
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < fruit.length; i++) {
			System.out.print("����: ");
			String f = input.nextLine();
			System.out.print("����: ");
			int p = input.nextInt();
			input.nextLine();
			fruit[i] = new SamplePair<>(f,p);
		}
		
		for(int i = 0; i < fruit.length; i++) {
			System.out.println(fruit[i]);
		}
	}
}


























