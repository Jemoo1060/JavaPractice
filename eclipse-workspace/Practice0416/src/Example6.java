class Box{
	private int width;
	private int height;
	private int depth;
	private static int BoxID;
	// BoxID = 0; 디폴트
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
		return String.format("박스%d의 부피: %d",BoxID,getVolume());
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
		
		// 배열로 처리
		Box[] bx = {bx1,bx2,bx3,bx4};
		for(int count = 0; count < bx.length; count++) {
			System.out.println(bx[count].displayBox());
		}
		
		
		//전체 박스 수
		System.out.printf("총: %d개\n", Box.getID());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
