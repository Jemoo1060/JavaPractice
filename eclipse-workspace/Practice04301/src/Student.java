
public class Student {
	String studentName;
	int money;
	
	public Student(String studentName, int money) {
		// TODO Auto-generated constructor stub
		this.studentName = studentName;
		this.money = money;
	}
	
	// 학생이 타는 버스를 인수로 전달
	public void takeBus(Bus bus) { 
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	public void showInfo() {
		System.out.printf("%s님의 남은 돈은 %d입니다\n",studentName,money);
	}
}

