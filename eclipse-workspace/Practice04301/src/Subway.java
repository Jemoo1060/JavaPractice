// 교재 178 예제
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
		System.out.printf("지하철%s번의 승객은 %d명이고, 수입은 %d입니다\n",lineNumber,passengerCount,money);
	}
}
