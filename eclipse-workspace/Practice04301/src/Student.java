
public class Student {
	String studentName;
	int money;
	
	public Student(String studentName, int money) {
		// TODO Auto-generated constructor stub
		this.studentName = studentName;
		this.money = money;
	}
	
	// �л��� Ÿ�� ������ �μ��� ����
	public void takeBus(Bus bus) { 
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	public void showInfo() {
		System.out.printf("%s���� ���� ���� %d�Դϴ�\n",studentName,money);
	}
}

