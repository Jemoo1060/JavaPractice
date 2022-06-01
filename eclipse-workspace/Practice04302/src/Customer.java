
public class Customer {
	protected int customerID; // 고객번호
	protected String customerName; // 고객이름
	protected String customerGrade; // 고객등급
	
	int bonusPoint;
	double bonusRatio;
	
	
	
	public Customer(int customerID, String customerName) {
		// TODO Auto-generated constructor stub
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "Silver";
		this.bonusRatio = 0.01; // 보너스
	}
	
	// 보너스를 적립하고 지불가격을 결정
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		String message = String.format("%s님의 등급은 %s이며, ", customerName, customerGrade);
		message += String.format("보너스포인트는 %d입니다.", bonusPoint);
		return message;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = String.format("%s님의 등급은 %s이며, ", customerName, customerGrade);
		message += String.format("보너스포인트는 %d입니다.", bonusPoint);
		return message;
	}
}
