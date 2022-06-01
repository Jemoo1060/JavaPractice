// ��ǥ ��ü
class Axis{
	private int x;
	private int y;
	
	// �Ϲ� ������
	public Axis(int x, int y) {
		if((x >= 0 && x<=100)&&(y >= 0 && y<=100)){
		this.x = x;
		this.y = y;
		} else {
			System.out.println("��ǥ�� ������ ���");
			System.exit(1);
		}
	}
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
	
	// ��ǥ���� ���
	public String getAxis() {
		return String.format("(%d, %d)",x,y);
	}
}

// ���� ���� (�߽���, ������)
class Circle {
	private Axis center; // �߽���(100,150)
	private int radius; // ������
	
	// ������
	public Circle(Axis center, int radius) {
		// TODO Auto-generated constructor stub
		this.center = center;
		this.radius = radius;
		ShowCircle.displayCircle2(this);
	}
	
	public Axis getCenter() {
		return center;
	}
	
	public int getradius() {
		return radius;
	}
	// String ���ڿ� ���� ���
	public String getCircle1() {
		String message = "";
		message += String.format("�߽���: %s\n", center.getAxis());
		message += String.format("������: %d", radius);
		return message;
	}
	public String getCircle2() {
		String message = "";
		message += String.format("�߽���: (%d, %d)\n",center.getX(),center.getY());
		message += String.format("������: %d", radius);
		return message;
	}
}
class ShowCircle{
	
	public ShowCircle(Circle c) {
		// TODO Auto-generated constructor stub
		displayCircle(c);
	}
	
	public void displayCircle(Circle c) {
		System.out.printf("�߽���: (%d, %d)\n", c.getCenter().getX(),c.getCenter().getY());
		System.out.printf("�߽���: %s\n",c.getCenter().getAxis());
		System.out.printf("������: %d\n",c.getradius());
	}
	public static void displayCircle2(Circle c) {
		System.out.printf("�߽���: (%d, %d)\n", c.getCenter().getX(),c.getCenter().getY());
		System.out.printf("�߽���: %s\n",c.getCenter().getAxis());
		System.out.printf("������: %d\n",c.getradius());
	}

}
public class Example7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Axis pt = new Axis(70,80);
		Circle my = new Circle(pt,15);
		System.out.println(my.getCircle1());
		System.out.println(my.getCircle2());
		
		ShowCircle ob = new ShowCircle(my);
		ShowCircle.displayCircle2(my);
	}

}
