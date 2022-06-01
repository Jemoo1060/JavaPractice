import java.util.Scanner;

// ������ ����� �Է� �޾� �ŵ����� ���ϱ�
// 3�� 2�� -> 9
class Exponent{
	private int radix; // 3
	private int expo; // 2
	private int result; // 9
	
	public void setData(int _radix,int _expo) {
		if(_radix < 0) {
			System.out.println("������ ����̾�� �մϴ�");
			System.exit(1);
		} else {
			result = 1;
			radix = _radix;
			expo = _expo;
			computeExponent();
		}
	}
	private void computeExponent() {
		for(int count = 0; count < expo; count++) {
			result*=radix;
		}
	}
	public int getData() {
		return result;
	}
}

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("��� �Է�: ");
		int radix = input.nextInt();
		System.out.print("���� �Է�: ");
		int expo = input.nextInt();
		
		Exponent ob = new Exponent();
		ob.setData(radix, expo);
		System.out.println("���: "+ob.getData());
	}

}
