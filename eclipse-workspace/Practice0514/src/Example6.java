class Axis<T, V>{
	private T x;
	private V y;
	
	public Axis(T x, V y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public V getY() {
		return y;
	}
	public double getArea() {
		// Wrapper Ŭ������ �⺻ ������ Ÿ������ ����ȯ
		double x =  ((Number)getX()).doubleValue();
		double y = ((Number)getY()).doubleValue();
		return  x*y;
		//double x =  (double)getX();  ��������  
		//double y = (double)getY(); ��������
		//return (double)getX()*(double)getY();
	}
}
public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	public static void test1() {
		Axis<Integer,Double> pt = new Axis<>(12, 11.3);
		System.out.printf("area: %.1f", pt.getArea());
		
	}
}
