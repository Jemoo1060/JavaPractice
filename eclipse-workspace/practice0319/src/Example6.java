import java.util.Scanner;

class Grade{
	int score;
	int total;
	double average;
	int person;
	int aCount, bCount,cCount,fCount;
	
	public void inputScore() {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("정수입력(종료: -1): ");
			score = input.nextInt();
			if(score < 0) break;
			person++;
			computeScore();
			determineGrade();
		}
	}
	
	public void computeScore() {
		total += score;
		average = (double)total / person;
	}
	
	
	public void determineGrade() {
		switch(score/10){
			case 10:
			case 9:
				aCount++; break;
			case 8:
				bCount++; break;
			case 7:
				cCount++; break;
			default:
				fCount++;
		}
	}
	
	public void displayGrade() {
		System.out.printf("총합: %d\n",total);
		System.out.printf("평균: %.1f\n",average);
		System.out.printf("A: %d, B: %d, C: %d, F: %d\n",aCount,bCount,cCount,fCount);
	}
	
}
public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade student = new Grade();
		student.inputScore();
		student.displayGrade();

	}

}
