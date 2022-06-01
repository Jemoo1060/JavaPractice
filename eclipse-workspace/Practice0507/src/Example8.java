import java.util.Scanner;

interface Grade {
	char computeGrade(double average);
}
interface Pass {
	boolean passDecision(double average);
}

class Student {
	protected int[] score;
	
	public Student() {
		// TODO Auto-generated constructor stub
		this.score = new int[3];
		
	}
	
	public void inputScore() {
		Scanner input = new Scanner(System.in);
		for(int count = 0; count < score.length; count++) {
			System.out.printf("점수 %d: ",count+1);
			score[count] = input.nextInt();
		}
	}
	public int computeTotal() {
		int total = 0;
		for(int item : score)
			total += item;
		
		return total;
	}
	
	public double computeAverage() {
		return (double)computeTotal()/score.length;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = String.format("점수: [");
		for(int count = 0; count < score.length; count++) {
			message += String.format("%d",score[count]);
			if(count!=score.length-1)
				message += String.format(", ");
		}
		message += String.format("]\n");
		message += String.format("총합: %d\n",computeTotal());
		message += String.format("평균: %.2f\n",computeAverage());
		return message;
	}
}

class StudentGrade extends Student implements Grade,Pass {
	
	@Override
	public char computeGrade(double average) {
		// TODO Auto-generated method stub
		char level;
		switch((int)average/10) {
		case 10:
		case 9:
			level = 'A'; break;
		case 8:
			level = 'B'; break;
		case 7:
			level = 'C'; break;
		default:
			level = 'F';
		}
		return level;
	}
	@Override
	public boolean passDecision(double average) {
		// TODO Auto-generated method stub
		if(average >= 80)
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = super.toString();
		message += String.format("등급: %c\n", computeGrade(computeAverage()));
		if(passDecision(computeAverage()))
			message += "판정: 합격\n";
		else
			message += "판정: 불합격\n";
		return message;
	}
}

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	public static void test1() {
		Student ob = new Student();
		ob.inputScore();
		System.out.println(ob);
	}
	public static void test2() {
		StudentGrade ob = new StudentGrade();
		ob.inputScore();
		System.out.println(ob);
	}
}