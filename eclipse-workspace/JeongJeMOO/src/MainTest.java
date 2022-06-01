interface Empolyee{
	double COMMISSION = 0.2;
	int HOUR_SALARY = 30000;
	
	int getBaseSalay();
	double computeEarining();
}

interface EmployeeBonus{
	void setBonus(int bonus);
}

class BaseEmployee{
	private String name;
	private int baseSalary;
	
	public BaseEmployee(String name,int baseSalary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	public String getName() {
		return name;
	}
	public int getBaseSalary() {
		return baseSalary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("�����̸� : %s\n�⺻�޿� : %d��",name,baseSalary);
	}
}

class RegularEmployee extends BaseEmployee implements Empolyee{
	private int sales;
	private int bonus;
	
	
	public RegularEmployee(String name,int baseSalary,int sales) {
		// TODO Auto-generated constructor stub
		super(name,baseSalary);
		this.sales = sales;
	}
	
	public int getSales() {
		return sales;
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	@Override
	public int getBaseSalay() {
		// TODO Auto-generated method stub
		return super.getBaseSalary() + bonus;
	}
	@Override
	public double computeEarining() {
		// TODO Auto-generated method stub
		return this.getBaseSalay() + (sales * COMMISSION);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("������\n�����̸� : %s\n�⺻�޿� : %d��\n�Ǹűݾ� : %d��\n�����޿� : %.0f��\n", getName(), getBaseSalay(),sales,computeEarining());
	}
}

class HourEmployee extends BaseEmployee implements Empolyee {
	private int workingHour;
	
	public HourEmployee(String name,int baseSalary,int workingHour) {
		// TODO Auto-generated constructor stub
		super(name, baseSalary);
		this.workingHour = workingHour;
	}
	public int getWorkingHour() {
		return workingHour;
	}
	@Override
	public int getBaseSalay() {
		// TODO Auto-generated method stub
		return super.getBaseSalary();
	}
	@Override
	public double computeEarining() {
		// TODO Auto-generated method stub
		return this.getBaseSalary() + (workingHour * HOUR_SALARY);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("�ð���\n�����̸� : %s\n�⺻�޿� : %d��\n�ٹ��ð� : %d�ð�\n�����޿� : %.0f��\n", getName(),this.getBaseSalary(),workingHour,computeEarining());
	}
}
public class MainTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularEmployee regular = new RegularEmployee("ȫ�浿", 2000000, 3000000);
		regular.setBonus(1000000);
		BaseEmployee[] array = {regular, new HourEmployee("������", 1000000, 20)};
		
		for(BaseEmployee ob : array) 
		System.out.println(ob);
	}
}
































