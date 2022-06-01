class Person{
	protected String name;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("�̸�: %s", name);
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
		message += String.format("����: %s", major);
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
		message += String.format("����: %s", subject);
		return message;
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ob1 = new Student("ȫ�浿", "computer");
		Teacher ob2 = new Teacher("������","Java");
		
		Person[] ob = {ob1,ob2};
		for(Person p : ob) {
			if(p instanceof Student)
				System.out.print("�л�");
			else if(p instanceof Teacher)
				System.out.print("����");
			
			System.out.println(p);
		}
	}
}








































