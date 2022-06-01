class Person{
	protected String name;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("이름: %s", name);
	}
}

class Student extends Person{
	
	private String major;
	
	public Student(String name, String major) {
		// TODO Auto-generated constructor stub
		super.name = name;
		this. major = major;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = super.toString()+ "\n";
		message += String.format("전공: %s", major);
		return message;
	}
}

class Teacher extends Person{
	
	private String subject; 
	
	public Teacher(String name, String subject) {
		// TODO Auto-generated constructor stub
		super.name = name;
		this.subject = subject;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = super.toString()+ "\n";
		message += String.format("과목: %s", subject);
		return message;
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ob1 = new Student("홍길동", "computer");
		Teacher ob2 = new Teacher("박지성","Java");
		
		Person[] ob = {ob1,ob2};
		for(Person p : ob) {
			if(p instanceof Student)
				System.out.print("학생");
			else if(p instanceof Teacher)
				System.out.print("교사");
			
			System.out.println(p);
		}
	}
}








































