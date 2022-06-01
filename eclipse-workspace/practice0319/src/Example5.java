import java.util.Scanner;

// 문자열에서 문자 검사
class Charcount {
	int nNumber;
	int nLetter;
	int nOther;
	
	public void CheckLetter(String m) {
		int index = 0;
		while(index < m.length()) { // m.length(): 문자열의 길이
			char letter = m.charAt(index);
			if((letter > 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) 
				nLetter++;
			 else if(letter >= '0' && letter <= '9')
				 nNumber++;
			 else
				 nOther++;
			index++;
		}
	}
	public void displayCount(){
		System.out.printf("문자: %d개\n",nLetter);
		System.out.printf("숫자: %d개\n",nNumber);
		System.out.printf("기타: %d개\n",nOther);
	}
}
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String message = input.nextLine();
		
		Charcount my = new Charcount();
		my.CheckLetter(message);
		my.displayCount();
		
	}

}
