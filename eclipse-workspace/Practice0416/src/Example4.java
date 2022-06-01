class Grade {
	private String subject;
	private int[] score;
	
	public Grade(String subject, int[] score) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		this.score = score;
	}
	
	public String getSubject() {
		return this.subject;
	}
	
	public double getAverage() {
		int total = 0;
		for(int item : score) {
			total += item;
		}
		return (double)total / score.length;
	}
	public String displayGrade() {
		String message = "";
		message += getSubject() + " ";
		message += String.format("���: %.2f",getAverage());
		return message;
	}
}

// ȯ���� ������ ����
// �Կ���¥, ��� ��¥
class Dates {
	private int year;
	private int month;
	private int day;
	
	public Dates(int year, int month, int day) {
		// TODO Auto-generated constructor stub
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void displayDates() {
		System.out.printf("%d�� %d�� %d��\n", year, month, day);
	}
	
	public String getDates() {
		return String.format("%d�� %d�� %d��", year, month, day);
	}
}
class Patients{
	private String name;
	private Dates admission; // �Կ���¥  DatesŬ������ ��ü�� ����� ����
	private Dates discharge; // �����¥
	
	public Patients(String name, Dates admission, Dates discharge) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.admission = admission;
		this.discharge = discharge;	
	}
	public void displayPatients() {
		System.out.printf("ȯ���̸�: %s\n",name);
		System.out.print("�Կ���¥: ");
		admission.displayDates();
		System.out.print("�����¥: ");
		discharge.displayDates();
	}
	
	public String getPatients() {
		String message = "";
		message += String.format("ȯ���̸�: %s\n", name);
		message += String.format("�Կ���¥: %s\n", admission.getDates());
		message += String.format("�����¥: %s\n", discharge.getDates());
		return message;
	}
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		test4();
	}
	public static void test1() {
		int[] score = { 100, 90, 87, 67, 88};
		Grade my = new Grade("�ڹ�", score);
		System.out.println(my.displayGrade());
	}
	public static void test2() {
		Dates birth = new Dates(1995,12,25);
		System.out.println(birth.getDates());
	}
	public static void test3() {
		Dates addmission = new Dates(1997, 3, 21);
		Dates discharge = new Dates(2003, 5, 12);
		Patients man = new Patients("ȫ�浿", addmission, discharge);
		man.displayPatients();
	}
	public static void test4() {
		Dates addmission = new Dates(1998, 2, 21);
		Dates discharge = new Dates(2000, 7, 12);
		Patients man = new Patients("������", addmission, discharge);
		System.out.println(man.getPatients());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
