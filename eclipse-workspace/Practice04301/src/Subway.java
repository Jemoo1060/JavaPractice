// ���� 178 ����
public class Subway {
	String lineNumber;
	int passengerCount;
	int money;

	public Subway(String lineNumber) {
		// TODO Auto-generated constructor stub
		this.lineNumber = lineNumber;
		this.money = 0;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.printf("����ö%s���� �°��� %d���̰�, ������ %d�Դϴ�\n",lineNumber,passengerCount,money);
	}
}
