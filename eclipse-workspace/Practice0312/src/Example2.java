// �Ϲ� Ŭ������ ����(�Ӽ��� �޼���� ����)
class Point1 {
	// �Ӽ� ���� (Ŭ������ ��� ����)
	int x = 100, y = 200;
}
class Point2 {
	int x,y; // �ʱ� �� ����
	double z; // 0.0���� �ʱ�ȭ
	String name; // null�� �ʱ�ȭ
}

class Point {
	// �Ӽ��� ����
	int x,y;
	
	//�޼��带 ����
	void display() {	
		System.out.printf("(%d %d)\n", x,y);
	}
	void myDisplay() {
		System.out.println("x�� : " + x);
		System.out.println("y�� : "+ y);
	}
}


public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		test3();
	}
	
	public static void test1() {
		Point1 pt = new Point1(); // ��ü����
		// pt : ��ü ���� ����, new Point1() : ���� ��ü
		// ��ü ���� ������ ����Ͽ� ���(�Ӽ�)�� ���� : �޼���
		// �޼��� ǥ�� ��� : ��ü.�Ӽ�, ��ü.�޼���
		System.out.println(pt.x);
		System.out.println(pt.y);
		
		pt.x = 10;
		pt.y = 20;
		System.out.println(pt.x + pt.y);
		
		Point1 mypt = new Point1();
		System.out.printf("(%d, %d)\n", mypt.x, mypt.y);
	}
	
	public static void test2() {
		Point2 pt1 = new Point2();
		System.out.println(pt1.x+", "+pt1.y + ", " + pt1.z + ", " + pt1.name);
	}
	
	public static void test3() {
		Point pt = new Point();
		pt.x=100;
		pt.y=200;
		pt.display(); //��ü�� ����Ͽ� �޼��带 ȣ��
		pt.myDisplay();

	}

}
