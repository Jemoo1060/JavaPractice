import java.util.Scanner;

class Box{
	int boxID;
	static int count;
	
	public static void increment() {
		count++;
	}
}
class Swap{
	int number1 = 10;
	int number2 = 20;
	
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	public static void test1() {
		Scanner input = new Scanner(System.in);
		System.out.print("생성할 박스의 수: ");
		int number = input.nextInt();
		Box[] mybox = new Box[number];
		
		for(int count = 0; count < number; count++) {
			mybox[count] = new Box();
			mybox[count].boxID = 101 + count;
			Box.increment();
			System.out.printf("%d 박스 생성\n",mybox[count].boxID);
		}
		System.out.println("총 박스의 수: "+Box.count);
	}
	
	
	public static int max1(int n1, int n2, int  n3) {
		int max = n1;
		if(n2 > max) 
			max = n2;
		if(n3 > max)
			max = n3;
		return max;
		
	}
	
	public static int max2(int n1, int n2, int  n3) {
		int max = Math.max(n1, Math.max(n2, n3));
		return max;
	}
	public static int max3(int...n) { // 가변인수
		// 인수를 받아서 배열의 형태로 전달
		
		System.out.println("인수 개수: "+ n.length);
		System.out.println(n[2]); // 배열로 넘어와짐(리스트)
		for(int item : n) {
			System.out.print(item+" " );
		}
		System.out.println();
		int max = 0;
		for(int item : n) {
			if(max < item)
				max = item;
		}
		return max;
	}
	public static void test2() {
		System.out.println("max= "+ max1(10, 30, 20));
		System.out.println("max= "+ max2(10, 30, 20));
		System.out.println("max= "+ max3(10, 30, 20, 5, 6, 7, 8));
	}
	
	public static void swap1(int number1,int number2) {
		// 매개변수는 지역변수
		int temp = number1;
		number1 = number2;
		number2 = temp;
	}
	public static void swap2(Swap ob1) {
		// 인수로 객체를 전달(참조값이 복사) Swap ob1 = ob;
		// 실제로 밭은 객체를 참조
		int temp = ob1.number1;
		ob1.number1 = ob1.number2;
		ob1.number2 = temp;
	}
	public static void test3() {
		int number1 = 10, number2 = 20;
		swap1(number1,number2); // 매개변수를 써서 결과값이 바뀔것 같지만 test의 number과 swap의 number은 서로 다른것
		System.out.println(number1+ " " +number2);
		
		Swap ob = new Swap();
		swap2(ob);
		System.out.println(ob.number1+ " " +ob.number2 );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
