import java.util.Scanner;

// ���ڿ����� ���� �˻�
class Charcount {
	int nNumber;
	int nLetter;
	int nOther;
	
	public void CheckLetter(String m) {
		int index = 0;
		while(index < m.length()) { // m.length(): ���ڿ��� ����
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
		System.out.printf("����: %d��\n",nLetter);
		System.out.printf("����: %d��\n",nNumber);
		System.out.printf("��Ÿ: %d��\n",nOther);
	}
}
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("���ڿ� �Է�: ");
		String message = input.nextLine();
		
		Charcount my = new Charcount();
		my.CheckLetter(message);
		my.displayCount();
		
	}

}
