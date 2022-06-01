
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("James",5000);
		Student st2 = new Student("Park",10000);
		
		Bus bus100 = new Bus(100);
		Subway sub2 = new Subway("2È£¼±");
		
		st1.takeBus(bus100);
		st1.takeSubway(sub2);
		st1.showInfo();
		
		st2.takeBus(bus100);
		st2.showInfo();
		
		bus100.showInfo();
		sub2.showInfo();
	}
}
