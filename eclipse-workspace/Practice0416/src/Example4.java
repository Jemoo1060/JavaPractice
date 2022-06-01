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
		message += String.format("평균: %.2f",getAverage());
		return message;
	}
}

// 환자의 정보를 관리
// 입원날짜, 퇴원 날짜
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
		System.out.printf("%d년 %d월 %d일\n", year, month, day);
	}
	
	public String getDates() {
		return String.format("%d년 %d월 %d일", year, month, day);
	}
}
class Patients{
	private String name;
	private Dates admission; // 입원날짜  Dates클래스의 객체로 멤버를 지정
	private Dates discharge; // 퇴원날짜
	
	public Patients(String name, Dates admission, Dates discharge) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.admission = admission;
		this.discharge = discharge;	
	}
	public void displayPatients() {
		System.out.printf("환자이름: %s\n",name);
		System.out.print("입원날짜: ");
		admission.displayDates();
		System.out.print("퇴원날짜: ");
		discharge.displayDates();
	}
	
	public String getPatients() {
		String message = "";
		message += String.format("환자이름: %s\n", name);
		message += String.format("입원날짜: %s\n", admission.getDates());
		message += String.format("퇴원날짜: %s\n", discharge.getDates());
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
		Grade my = new Grade("자바", score);
		System.out.println(my.displayGrade());
	}
	public static void test2() {
		Dates birth = new Dates(1995,12,25);
		System.out.println(birth.getDates());
	}
	public static void test3() {
		Dates addmission = new Dates(1997, 3, 21);
		Dates discharge = new Dates(2003, 5, 12);
		Patients man = new Patients("홍길동", addmission, discharge);
		man.displayPatients();
	}
	public static void test4() {
		Dates addmission = new Dates(1998, 2, 21);
		Dates discharge = new Dates(2000, 7, 12);
		Patients man = new Patients("박지성", addmission, discharge);
		System.out.println(man.getPatients());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
