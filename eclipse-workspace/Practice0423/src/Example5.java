import java.util.Scanner;

class Score {
	protected int[] jumsu;
	protected int scoreCount;
	
	public void setScore() {
		Scanner input = new Scanner(System.in);
		System.out.print("입력할 점수 개수: ");
		scoreCount = input.nextInt();
		System.out.printf("점수%d개를 차례로 입력하세요.", scoreCount);
		jumsu = new int[scoreCount];
		for(int count = 0; count < jumsu.length; count++ ) {
			jumsu[count] = input.nextInt();
		}
	}
	public void displayScore() {
		System.out.print("점수: ");
		for(int item : jumsu) {
			System.out.printf("%4d", item);
		}
		System.out.println();
	}
}
class ScoreTotal extends Score {
	protected int total;
	protected double average;
	
	public void totalScore() {
		for(int item : jumsu)
			total += item;
		
	average = (double)total/scoreCount;
	}
	
	@Override
	public void displayScore() {
		// TODO Auto-generated method stub
		super.displayScore();
		this.totalScore();
		System.out.printf("총합: %d\n",this.total);
		System.out.printf("평균: %.2f\n",this.average );
	}
}

class ScoreGrade extends ScoreTotal{
	private int aCount, bCount, cCount, fCount;
	
	public void determineGrade() {
		for(int item : jumsu) {
			switch(item/10) {
			case 10:
			case 9:
				aCount++;
				break;
			case 8:
				bCount++;
				break;
			case 7:
				cCount++;
				break;
			default:
				fCount++;
			}	
		}
	}
	
	@Override
	public void displayScore() {
		// TODO Auto-generated method stub
		super.displayScore();
		this.determineGrade();
		System.out.printf("A: %d, B: %d, C: %d, F: %d",aCount,bCount,cCount,fCount);
	}
}
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	public static void test1() {
		Score my = new Score();
		my.setScore();
		my.displayScore();
	}
	public static void test2() {
		ScoreTotal my = new ScoreTotal();
		my.setScore();
		my.displayScore();
	}
	public static void test3() {
		ScoreGrade my = new ScoreGrade();
		my.setScore();
		my.displayScore();
	}	
}
