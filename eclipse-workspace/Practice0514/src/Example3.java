// Object Ŭ������ �̿��ϸ� int double string char�� ���� �Ű������� �������� �ʾƵ� �ѹ��� �� ���� �� �ִ�.
class Point {
	private Object x,y;
	
	public void setPoint(Object x, Object y) {
		this.x = x;
		this.y = y;
	}	
	public Object getX() {
		return x;
	}
	public Object getY() {
		return y;
	}
	public int getIntX() {
		return (int)x;
	}
	public int getIntY() {
		return (int)y;
	}
	public double getDoubleX() {
		return (double)x;
	}
	public double getDoubleY() {
		return (double)y;
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	public static void test1() {
		Point pt = new Point();
		pt.setPoint(10.1,20.2);
		System.out.println(pt.getX()+", "+ pt.getY());
		System.out.printf("%.1f, %.1f\n",pt.getDoubleX(),pt.getDoubleY());
	}

}
