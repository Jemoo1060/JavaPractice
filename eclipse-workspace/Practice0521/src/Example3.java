// ��������
class StudentPoll {
	public int[] response;
	public int[] answer;
	public int error;
	public int right;
	
	public StudentPoll() {
		// TODO Auto-generated constructor stub
		response = new int[20];
		answer = new int[5]; // �� ������ ������ ���� ����
	}
	public void pollCount() {
		for(int count = 0; count < response.length; count++) {
			try {
				answer[response[count]-1]++;
				right++;
			} catch(ArrayIndexOutOfBoundsException exp) {
				System.out.printf("%d���� %d�� �߸� ����\n",count+1,response[count]);
				error++;
			}
			 
		}
		System.out.println("response result");
		for(int count = 0; count < answer.length; count++) {
			System.out.printf("answer %d : %d��\n", count+1, answer[count]);
		}
		System.out.printf("���� %d��\n",right);
		System.out.printf("������ %d��",error);
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] poll = {1, 2, 5, 4, 5, 7, 2, 3, 5, 2, 12, 3, 4, 4, 1, 9, 3, 4, 1, 3};
		StudentPoll paper = new StudentPoll();
		paper.response = poll;
		paper.pollCount();
	}

}
