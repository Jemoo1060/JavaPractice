class Top {
	private int tNumber = 10;
	
	public Top() {  // Top(�θ�) �Ϲݻ����� ������  �θ��� �⺻�����ڰ� ������ ������ ����.
		// TODO Auto-generated constructor stub
		System.out.println("Top �⺻������");
	}
	// �⺻�����ڴ� �����ڰ� ���ǵ��� �ʾ��� �� �ڵ����� ����.
	// �Ϲ� �����ڸ� ���� ��� �⺻ �����ڴ� �ڵ����� �������� �ʴ´�.
	public Top(int tNumber) {
		// TODO Auto-generated constructor stub
		System.out.println("Top �Ϲݻ�����");
		this.tNumber = tNumber;
	}
	public void setTop(int tNumber) {
		this.tNumber = tNumber;
	}
	public int getTop() {
		return tNumber;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//System.out.println("tNumber="+ getTop()); �̷��� �ص� ��� �������.
		return String.format("tNumber= %d", getTop());
	}
}
class Middle extends Top{
	public int mNumber = 20;
	
	public Middle() {
		// TODO Auto-generated constructor stub
		System.out.println("Middle �⺻������");
	}
	public Middle(int tNumber,int mNumber) {
		// TODO Auto-generated constructor stub
		// ������ �ڵ忡�� ���� ���� ����
		super(tNumber); // �θ��� �����ڸ� ȣ��

		System.out.println("Middle �Ϲݻ�����");
		//super.setTop(tNumber);
		
		// �θ��� �����ڸ� ��������� ȣ��
		//super(); ��������. ������ �߸���. �θ�������� �ڵ�� �ݵ�� �ڽĻ����� �����ڵ� �� ���� ����.
		// �ڽĻ����ڰ� ���� �߿� �θ� ������ ȣ���� ������ ���� �ʴ´�.
		this.mNumber = mNumber;
	}
	public void setMiddle(int tNumber,int mNumber) {
		//super.tNumber = tNumber; >> private�� ����
		//this.tNumber = tNumber;  >> private�� ����
		super.setTop(tNumber);
		this.mNumber = mNumber;
	}
	public int getMiddle() {
		return mNumber;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = super.toString() + "\n";
		message += String.format("mNumber= %d", getMiddle());
		return message;
	}
}
class Bottom extends Middle{
	private int bNumber;
	
	public Bottom(int tNumber, int mNumber, int bNumber) {
		// TODO Auto-generated constructor stub
		super(tNumber,mNumber);
		this.bNumber = bNumber;
		System.out.println("Bottom �Ϲݻ�����");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = super.toString() + "\n";
		message += String.format("bNumber= %d", getBottom());
		return message;
	}
	public int getBottom() {
		return bNumber;
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		//test4();
		test5();
	}
	public static void test1() {
		Middle ob = new Middle();
		ob.setMiddle(100,200);
		//System.out.println(ob.tNumber); >> private�� ����
		System.out.println(ob.mNumber);
	}
	public static void test2() {
		Middle ob = new Middle();
		ob.setMiddle(100,200);
		System.out.println(ob.getTop());
		System.out.println(ob.getMiddle());
	}
	public static void test3() {
		Top t = new Top();
		System.out.println(t);
		Middle ob = new Middle();
		ob.setMiddle(100,200);
		System.out.println(ob);
	}
	public static void test4() {
		Middle ob = new Middle(100,200); // �ڽ� ��ü�� �����ص� �θ�����ڰ� ������ �ȴ�(�θ� �켱 �����). 
		// ��Ӱ��迡�� �������� ȣ��
		// �����ڰ� �������� ���� ���: �⺻�����ڸ� �ڵ�����
		// �������� ȣ�� ����
		// 1. �ڽ��� ������ ȣ��
		// 2. �θ��� ������ ȣ��
		// 3. �θ��� ������ ����
		// 4. �ڽ��� ������ ����
		
		System.out.println(ob);
	}
	public static void test5() {
		Bottom ob = new Bottom(101,201,301);
		System.out.println(ob);
	}
}


















