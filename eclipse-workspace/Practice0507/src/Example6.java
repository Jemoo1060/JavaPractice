import java.util.Scanner;

interface Scheduler{
	void getNextCall(); // 다음 전화를 가져오기
	void sendcallToAgent(); // 상담원에게 전화 배분하기
}
class RoundRobin implements Scheduler{
	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("대기열에서 순서대로 전화를 가져옵니다");
	}
	@Override
	public void sendcallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("다음 순서 상담원에게 배분합니다");
	}
}
class shortJob implements Scheduler{
	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("대기열에서 순서대로 전화를 가져옵니다");
	}
	@Override
	public void sendcallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("상담이 없거나 상담이 적은 상담원에게 배분합니다");
	}
}
class Priority implements Scheduler{
	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("고객 등급이 높은 전화를 먼저 가져옵니다");
	}
	@Override
	public void sendcallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("업무능력이 좋은 상담원에게 배분");
	}
}

class Sample{
	// 팩토리 메서드
	// 한 인터페이스의 어떤 클래스의 객체를 할당 받는지를 결정
	public Scheduler selectCall() {
		System.out.println("전화 상담 방식:  1. RR,  2. SJ,  3. PR ");
		Scanner input = new Scanner(System.in);
		int select = input.nextInt();
		
		Scheduler sc = null;
		//Scheduler sc; 라고 해도 무방함.
		if(select == 1)
			sc = new RoundRobin();
		else if(select == 2)
			sc = new shortJob();
		else if(select == 3)
			sc = new Priority();
		else {
			System.out.println("잘못된 선택 값입니다");
			System.exit(1);
		}
		return sc;
		
	}
}
public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	public static void test1() {
		System.out.println("전화 상담 방식:  1. RR,  2. SJ,  3. PR ");
		Scanner input = new Scanner(System.in);
		int select = input.nextInt();
		
		Scheduler sc = null;
		//Scheduler sc; 라고 해도 무방함.
		if(select == 1)
			sc = new RoundRobin();
		else if(select == 2)
			sc = new shortJob();
		else if(select == 3)
			sc = new Priority();
		else {
			System.out.println("잘못된 선택 값입니다");
			System.exit(1);
		}
		sc.getNextCall();
		sc.sendcallToAgent();
	}
	public static void test2() {
		Sample ob = new Sample();
		Scheduler sc = ob.selectCall();
		sc.getNextCall();
		sc.sendcallToAgent();
	}
}