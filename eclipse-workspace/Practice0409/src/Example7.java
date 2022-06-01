class Point{
	private int x,y;
	
	// 접근자 용도
	// 값을 초기화, 값의 제한값 지정(0~100)
	public void setX(int x) {
		if(x >=0 && x <= 100)
			this.x = x;
		else {
			System.out.println("x값의 범위를 벗어났습니다");
			this.x=0;
			System.exit(1);
		}
	}
	public void setY(int y) {
		if(y >=0 && y <= 100)
			this.y = y;
		else {
			System.out.println("y값의 범위를 벗어났습니다");
			this.x=0;
			System.exit(1);
		}
	}
	/*public void setX(int x) {
		this.x = x;
	}*/
	/*public void setY(int y) {
		this.y = y;
	}*/
	
	public void setPoint(int x, int y) {
		//x = x; // x가 전역이냐 매개변수냐
		//y = y;
		//x = _x; 
		//y = _y; 
		// this : 자기 자신을 참조하는 참조변수
		//this.x = x;  // this.x는 전역변수쪽  x는 매개변수쪽
		//this.y = y;
		setX(x);
		setY(y);
		
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public String displayPoint() {
		return String.format("(%d, %d)", x,y);
	}
}
public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	public static void test1() {
		Point pt = new Point();
		pt.setPoint(10, 20);
		System.out.println(pt.displayPoint());
	}

}
