import java.util.Arrays;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	public static  int[] makeScore() {
		// ��ĳ�ʸ� ����Ͽ� ������ 5�� �Է�
		Scanner input = new Scanner(System.in);
		int[] score = new int[5];
		System.out.print("�Է�: ");
		for(int i = 0; i < score.length; i++ ) {
			score[i] = input.nextInt();
		}
		return score;
	}
	public static double averageScore(int[] sc){
		double average;
		int total = 0;
		for(int i : sc)
			total += i;
		average = (double)total/sc.length; 
		
		return average;
	}
	public static int maxScore(int[] sc) {
		int max = 0;
		for(int i : sc) {
			if(max < i)
				max = i;
		}
		return max;
	}
	public static String displayScore(int[] sc) {
		// ���, �ִ� ���
		String message = "";
		message += String.format("���: %.2f\n", averageScore(sc)); 
		message += String.format("�ִ����: %d\n",  maxScore(sc));
		return message;
	}
	public static void test1() {
		int score[] = makeScore();
		System.out.println(Arrays.toString(score));
		System.out.println(displayScore(score));
	}
}
