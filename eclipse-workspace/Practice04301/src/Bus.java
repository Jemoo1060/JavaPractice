// ���� 176 ����
public class Bus {
	int busNumber; // ������ȣ
	int passengerCount; // �°���
	int money; // ��������
	
	public Bus(int busNumber) {
		// TODO Auto-generated constructor stub
		this.busNumber = busNumber;
		this.money = 0;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.printf("����%d���� �°��� %d���̰�, ������ %d�Դϴ�\n",busNumber,passengerCount,money);
	}
}
