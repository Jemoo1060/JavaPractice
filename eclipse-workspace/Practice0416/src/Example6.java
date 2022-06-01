class Box{
	private int width;
	private int height;
	private int depth;
	private static int BoxID;
	// BoxID = 0; ����Ʈ
	public Box(int width, int height, int depth) {
		// TODO Auto-generated constructor stub
		BoxID++;
		this.width =  width;
		this.height = height;
		this.depth = depth;
	}
	public Box() {
		// TODO Auto-generated constructor stub
		this(10,10,10);
	}
	public Box(int width) {
		// TODO Auto-generated constructor stub
		this(width,10,10);
	}
	public Box(int width,int height) {
		// TODO Auto-generated constructor stub
		this(width,height,10);
	}
	public static int getID() {
		return BoxID;
	}
	
	public int getVolume() {
		return width * height * depth;
	}
	public String displayBox() {
		return String.format("�ڽ�%d�� ����: %d",BoxID,getVolume());
	}
}
public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	public static void test1() {
		Box bx1 = new Box();
		System.out.println(bx1.displayBox());
		Box bx2 = new Box(12);
		System.out.println(bx2.displayBox());
		Box bx3 = new Box(15, 20);
		System.out.println(bx3.displayBox());
		Box bx4 = new Box(13, 21, 18);
		System.out.println(bx4.displayBox());
		
		// �迭�� ó��
		Box[] bx = {bx1,bx2,bx3,bx4};
		for(int count = 0; count < bx.length; count++) {
			System.out.println(bx[count].displayBox());
		}
		
		
		//��ü �ڽ� ��
		System.out.printf("��: %d��\n", Box.getID());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
