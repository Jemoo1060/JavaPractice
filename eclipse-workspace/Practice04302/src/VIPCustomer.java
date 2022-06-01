// VIP ��
// ��ǰ�� ������ �� 10% ����
// ���ʽ� 5% ����
// ��� �������� ����

public class VIPCustomer extends Customer { // �θ� �Ϲ� �����ڰ� �ִµ� �ڽĿ��� �θ������ ����ȣ�� �����ָ� ������
	private int agentID;
	double saleRatio; // ������
	
	
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
			message += String.format("%s���� ���� ���� ID�� %d�Դϴ�.",customerName,getAgentID());
			return message;
		}
}
