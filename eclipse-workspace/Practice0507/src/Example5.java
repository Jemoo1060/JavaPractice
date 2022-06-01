// 인터페이스
// 프로젝트의 규모가 커지거나 확장을 요구할 경우
// 기능의 통일성, 다형성을 위한 표준화 하는 방법
// 클래스라는 이름 대신 interface 라는 이름으로 대체
// 메서드의 구현보다는 형태(추상 메서드)만으로 구성
// 인터페이스를 사용하여 각각의 클래스를 새로 구현(implementation)


interface Remocon {
	int VOLUME = 10; // 인터페이스의 속성(상수) : 반드시 초기화
	void turnOn();
	void turnOff();
	default void sleep() {  // 인터페이스에서도 메서드의 구현이 가능
		System.out.println("잠자는 소리제거"); // 자식들이 메서드를 굳이 가질 필요 없다.
	}
	static void search() { // static 을 이용해서 메서드 정의 가능
		System.out.println("리모컨 찾기");
	}
}

class TV implements Remocon{
	public void display() {
		System.out.println("TVdisplay");
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV ON");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV OFF");
	}
}

class Radio implements Remocon{
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("RADIO ON");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("RADIO OFF");
	}
}

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remocon tvR = new TV();
		tvR.turnOn();
		
		//tvR.display(); // 오류나옴 Tv만 가지고 있는 메서드 
		TV tv = (TV)tvR; // 다운캐스팅(형변환)
		tv.display();
		
		tvR.sleep(); // default 메서드
		
		Remocon.search(); // static 를 사용한 메서드
		//tvR.search(); // 오류나옴 Remocon에만 있는 메서드 static
		
		System.out.println(Remocon.VOLUME); // static 처럼 써도됨.
		
		Remocon[] my = {new TV(), new Radio()};
		for(Remocon r : my) {
			if(r instanceof TV)
				System.out.println("텔레비전");
			else if(r instanceof Radio)
				System.out.println("라디오");
			
			r.turnOn();
			r.turnOff();
			r.sleep();
			Remocon.search();
		}
	}
}





























