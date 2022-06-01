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
	    System.out.println("��: "+my.totalRightDia());
	    System.out.println("��: "+my.totalLeftDia());
	    System.out.println("��: "+my.totalLeftDown());
	    System.out.println("��: "+my.totalRightUP());
	}
	public static void test2() {
		// Arrays Ŭ������ ���
		// Arrays Ŭ������ ���ǵ� �޼���� ��ü�� �������� �ʰ� Ŭ���� �̸����� �ٷ� ��� ���� (Ŭ���� �޼���)
		// Arrays.method();
		// inport�� ����Ͽ� ���� ��Ű���� �߰�
		int[] number1 = { 70,10,20,30,90,40,50 };
		int[] number2 = new int[5];
		
		Arrays.fill(number2,10); // number2�� 10���� ä��ڴ�.
		
		System.out.println("number1= "+Arrays.toString(number1)); //�迭�� ������ ���ڿ��� ���
		System.out.println("number2= "+Arrays.toString(number2));
		
		if(Arrays.equals(number1, number2))
			System.out.println("����");
		else
			System.out.println("�ٸ���");
		
		Arrays.sort(number1); // ���� �������� �������ִ� �Լ�
		System.out.println("number1= "+Arrays.toString(number1));
		int search = Arrays.binarySearch(number1, 30);
		System.out.println(search); // ã�� �ε����� ��ġ ���� ���.
		// ����. �迭�� ������������ ������ �Ǿ��־�� ��ġ���� ��Ȯ�� ���´�. �����˻��̱� ������
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
