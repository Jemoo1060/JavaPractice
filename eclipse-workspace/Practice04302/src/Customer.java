
public class Customer {
	protected int customerID; // ����ȣ
	protected String customerName; // ���̸�
	protected String customerGrade; // �����
	
	int bonusPoint;
	double bonusRatio;
	
	
	
	public Customer(int customerID, String customerName) {
		// TODO Auto-generated constructor stub
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "Silver";
		this.bonusRatio = 0.01; // ���ʽ�
	}
	
	// ���ʽ��� �����ϰ� ���Ұ����� ����
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		String message = String.format("%s���� ����� %s�̸�, ", customerName, customerGrade);
		message += String.format("���ʽ�����Ʈ�� %d�Դϴ�.", bonusPoint);
		return message;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = String.format("%s���� ����� %s�̸�, ", customerName, customerGrade);
		message += String.format("���ʽ�����Ʈ�� %d�Դϴ�.", bonusPoint);
		return message;
	}
}
