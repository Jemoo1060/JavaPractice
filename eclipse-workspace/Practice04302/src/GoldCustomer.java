// Gold 고객
// 제품 할인률 10%
// 보너스포인트 2%
// 전문 상담원 없음.
public class GoldCustomer extends Customer {
	double saleRatio;
	
	public GoldCustomer (int customerID,String customerName) {
		// TODO Auto-generated constructor stub
		super(customerID,customerName);
		this.saleRatio = 0.1;
		super.bonusRatio = 0.02;
		super.customerGrade = "Gold";
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
		return super.toString();
	}
	
}
