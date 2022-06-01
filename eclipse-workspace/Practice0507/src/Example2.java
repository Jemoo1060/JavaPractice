abstract class Employee{
	
	private String name;
	private int baseSalary; // �⺻�޿�
	
	public Employee(String name, int baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBaseSalary() {
		return baseSalary;
	}
	
	abstract public double earning();
}

class RegularEmployee extends Employee {
	private int sale; // �Ǹűݾ�
	private double commission; // Ŀ�̼�
	
	public RegularEmployee(String name, int baseSalary, int sale, double commission) {
		// TODO Auto-generated constructor stub
		super(name, baseSalary);
		this.sale = sale;
		this.commission = commission;
	}
	
	public int getSale() {
		return sale;
	}
	public double getCommission() {
		return commission;
	}
	@Override
	public double earning() {
		// TODO Auto-generated method stub
		return getBaseSalary() + (getSale()*getCommission());
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = "������ ����\n";
		message += String.format("�̸�: %s\n", getName());
		message += String.format("�⺻�޿�: %d\n", getBaseSalary());
		message += String.format("�Ǹűݾ�: %d\n", getSale());
		message += String.format("�Ǹż���: %.2f\n", getCommission());
		message += String.format("�����޿�: %.2f\n", earning());
		return message;
	}
}
class ContactEmployee extends Employee{
	
	private int addSalary; // �߰�����
	
	public ContactEmployee(String name, int baseSalary, int addSalary) {
		// TODO Auto-generated constructor stub
		super(name, baseSalary);
		this.addSalary = addSalary;
	}
	public int getAddSalary() {
		return addSalary;
	}
	@Override
	public double earning() {
		// TODO Auto-generated method stub
		return getBaseSalary() + getAddSalary() ;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = "����� ����\n";
		message += String.format("�̸�: %s\n", getName());
		message += String.format("�⺻�޿�: %d\n", getBaseSalary());
		message += String.format("�߰�����: %d\n", getAddSalary());
		message += String.format("�����޿�: %.2f\n", earning());
		return message;
	}
}
class HourEmployee extends Employee {
	private int hour;
	private int hourSalary; // �ð��� �ݾ�
	
	public HourEmployee(String name, int baseSalary, int hour, int hourSalary) {
		// TODO Auto-generated constructor stub
		super(name, baseSalary);
		this.hour = hour;
		this.hourSalary = hourSalary;
	}
	public int getHour() {
		return hour;
	}
	public int getHourSalary() {
		return hourSalary;
	}
	@Override
	public double earning() {
		// TODO Auto-generated method stub
		return getBaseSalary() + (getHour()*getHourSalary());
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = "�ð��� ����\n";
		message += String.format("�̸�: %s\n", getName());
		message += String.format("�⺻�޿�: %d\n", getBaseSalary());
		message += String.format("�ٹ��ð�: %d\n", getHour());
		message += String.format("�����޿�: %.2f\n", earning());
		return message;
	}
	
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	public static void test1() {
		RegularEmployee  regular = new RegularEmployee("ȫ�浿", 3000000, 5000000, 0.3);
		ContactEmployee contact = new ContactEmployee("������", 2500000, 2000000);
		HourEmployee hourem = new HourEmployee("�迬��", 1000000, 20, 20000);
		
		Employee [] ourem = {regular,contact,hourem};
		for(Employee em : ourem)
			System.out.println(em);
	}

}