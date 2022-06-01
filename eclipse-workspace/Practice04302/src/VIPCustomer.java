// VIP 고객
// 제품을 구입할 때 10% 할인
// 보너스 5% 적립
// 담당 전문상담원 배정

public class VIPCustomer extends Customer { // 부모에 일반 생성자가 있는데 자식에서 부모생성자 지정호출 안해주면 오류뜸
	private int agentID;
	double saleRatio; // 할인율
	
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		// TODO Auto-generated constructor stub
		super(customerID, customerName);
		super.customerGrade = "VIP";
		super.bonusRatio = 0.05;
		this.agentID = agentID;
		this.saleRatio = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	@Override
		public int calcPrice(int price) {
			// TODO Auto-generated method stub
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
		}
@Override
		public String toString() {
			// TODO Auto-generated method stub
			String message = super.toString() + "\n";
			message += String.format("%s님의 전문 상담원 ID는 %d입니다.",customerName,getAgentID());
			return message;
		}
}
