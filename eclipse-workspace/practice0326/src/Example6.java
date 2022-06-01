class Point{
	int x,y;
	public void displayPoint() {
		System.out.printf("(%d, %d)\n",x,y );
	}
}
public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	
	public static void test1() {
		Point pt = new Point();
		pt.x = 10;
		pt.y = 20;
		pt.displayPoint();
	}
	public static void test2() {
		// 객체 배열: 객체를 요소로 하는 배열
		/*
		Point pt1 = new Point();
		pt1.x = 10;
		pt1.y = 20;
		
		Point pt2 = new Point();
		pt2.x = 30;
		pt2.y = 40;
		
		Point pt3 = new Point();
		pt3.x = 50;
		pt3.y = 60;
		
		Point[] mypt = {pt1, pt2, pt3}; 
		
		mypt[0].displayPoint();
		mypt[1].displayPoint();
		mypt[2].displayPoint();
		*/
		Point[] mypt = new Point[3]; // mypt[0],mypt[1],mypt[2]
		/*
		mypt[0] = new Point();
		mypt[1] = new Point();
		mypt[2] = new Point();
		*/
		for(int index=0; index < mypt.length; index++) {
			//mypt[index] = new Point();
			mypt[index].x=10*index;
			mypt[index].y=20*index;
		}
		
		for(int index=0; index < mypt.length; index++)
			mypt[index].displayPoint();
	}

}
