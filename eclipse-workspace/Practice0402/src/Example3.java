import java.util.Arrays;
import java.util.Scanner;

class Matrix{
	int[][] square;
	
	public void initMatrix(){
		int count = 0;
		for(int row = 0; row <square.length; row++) {
			for(int cul = 0; cul<square[row].length; cul++) {
				square[row][cul] = ++count;
			}
		}
	}
	public int totalRightDia(){
		int total = 0;
		for(int row = 0; row <square.length; row++) {
			for(int cul = 0; cul<square[row].length; cul++) {
				if(row == cul)
					total += square[row][cul];
			}
		}
		return total;
	}
	public int totalLeftDia(){
		int total = 0;
		for(int row = 0; row <square.length; row++) {
			for(int cul = 0; cul<square[row].length; cul++) {
				if(row + cul == 4)
					total += square[row][cul];
			}
		}
		return total;
	}
	public int totalLeftDown() {
		int total = 0;
		for(int row = 0; row <square.length; row++) {
			for(int cul = 0; cul<=row; cul++) {
			total += square[row][cul];
			}
		}
		return total;
	}
	public int totalRightUP() {
		int total = 0;
		for(int row = 0; row <square.length; row++) {
			for(int cul = row; cul<square[row].length; cul++) {
			total += square[row][cul];
			}
		}
		return total;
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	public static void test1() {
		Matrix my = new Matrix();
		my.square = new int[5][5];
		my.initMatrix();
	    System.out.println("합: "+my.totalRightDia());
	    System.out.println("합: "+my.totalLeftDia());
	    System.out.println("합: "+my.totalLeftDown());
	    System.out.println("합: "+my.totalRightUP());
	}
	public static void test2() {
		// Arrays 클래스의 사용
		// Arrays 클래스에 정의된 메서드는 객체를 생성하지 않고 클래스 이름으로 바로 사용 가능 (클래스 메서드)
		// Arrays.method();
		// inport를 사용하여 관련 패키지를 추가
		int[] number1 = { 70,10,20,30,90,40,50 };
		int[] number2 = new int[5];
		
		Arrays.fill(number2,10); // number2를 10으로 채우겠다.
		
		System.out.println("number1= "+Arrays.toString(number1)); //배열의 내용을 문자열로 출력
		System.out.println("number2= "+Arrays.toString(number2));
		
		if(Arrays.equals(number1, number2))
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		Arrays.sort(number1); // 오름 차순으로 정렬해주는 함수
		System.out.println("number1= "+Arrays.toString(number1));
		int search = Arrays.binarySearch(number1, 30);
		System.out.println(search); // 찾은 인덱스의 위치 값을 출력.
		// 단점. 배열이 오름차순으로 정렬이 되어있어야 위치값이 정확히 나온다. 이진검색이기 때문에
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
