import java.util.Scanner;

class Score{
	String name;
	int kor,eng,math;
	int total;
	double average;
	
	public void computeScore() {
		total = kor + eng + math;
		average = (double)total / 3;
	}
	public void displayScore() {
		System.out.printf("�̸�: %s �հ�: %d ���: %.2f\n", name,total,average);
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	public static void test1() {
		String week = new String("��"); // String�� Ŭ����  ==String week = "��";
		// ���ڿ� ��ü�� ������ ���� �� �ִ� ��ü �迭
		String[] week2 = new String[7];
		
		
		String[] week3 = {"��","ȭ","��","��","��","��","��"}; 
		String message = "[";
		for(int count = 0; count < week3.length; count++) {
			message += week3[count];	
			if(count!=week3.length-1)
				message += ", ";	
		}
		System.out.println(message+"]");
	}
	public static void test2() {
		Score man = new Score();
		Scanner input = new Scanner(System.in);
		System.out.print("�̸�: ");
		man.name = input.nextLine();
		System.out.print("����: ");
		man.kor = input.nextInt();
		System.out.print("����: ");
		man.eng = input.nextInt();
		System.out.print("����: ");
		man.math = input.nextInt();
		
		man.computeScore();
		man.displayScore();
		
	}
	public static void test3() {
		Score[] man = new Score[3];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i<man.length; i++) {
			man[i] = new Score();
			System.out.print("�̸�: ");
			man[i].name = input.nextLine();
			System.out.print("����: ");
			man[i].kor = input.nextInt();
			System.out.print("����: ");
			man[i].eng = input.nextInt();
			System.out.print("����: ");
			man[i].math = input.nextInt();
			input.nextLine();
		}
		for(int i =0; i <man.length; i++) {
			man[i].computeScore();
			man[i].displayScore();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
