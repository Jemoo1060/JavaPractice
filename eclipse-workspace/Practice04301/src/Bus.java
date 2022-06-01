// 교재 176 예제
public class Bus {
	int busNumber; // 버스번호
	int passengerCount; // 승객수
	int money; // 버스수입
	
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
		System.out.printf("버스%d번의 승객은 %d명이고, 수입은 %d입니다\n",busNumber,passengerCount,money);
	}
}
