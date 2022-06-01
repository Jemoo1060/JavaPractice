import java.util.ArrayList;

class Points{
	int x,y;
	public Points(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("(%d, %d)", x,y);
	}
}
public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		//test2();
	}
	public static void test1() {
		ArrayList<Integer> scoreList = new ArrayList<>();
		scoreList.add(90);
		scoreList.add(80);
		scoreList.add(70);
		scoreList.add(60);
		
		System.out.println(scoreList.size());
		System.out.println(scoreList);
		System.out.println(scoreList.toString());
		System.out.println(scoreList.get(1));
		System.out.println(scoreList.isEmpty());
		System.out.println(scoreList.get(0));
		
		scoreList.remove(3);
		System.out.println(scoreList);
		
		scoreList.remove((Integer)70); // 그냥 70 넣으면 안됨. 여기서 70은 객체이다.
		System.out.println(scoreList);
		scoreList.clear();
		System.out.println(scoreList);
	}
	public static void test2() {
		
		ArrayList<Points> scoreList = new ArrayList<>();
		
		Points pt1 = new Points(10, 20);
		Points pt2 = new Points(30, 40);
		Points pt3 = new Points(50, 60);
		Points pt4 = new Points(70, 80);
		
		
		scoreList.add(pt1);
		scoreList.add(pt2);
		scoreList.add(pt3);
		scoreList.add(pt4);
		
		System.out.println(scoreList.size());
		System.out.println(scoreList);
		System.out.println(scoreList.toString());
		System.out.println(scoreList.get(1));
		System.out.println(scoreList.isEmpty());
		System.out.println(scoreList.get(0));
		
		scoreList.remove(2);
		System.out.println(scoreList);
	}

}
