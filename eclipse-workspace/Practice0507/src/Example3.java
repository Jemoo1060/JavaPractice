abstract class Car {
	abstract public void drive();
	abstract public void stop();
	
	public void start() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	// 템플릿 메서드
	// 프레임워크에서 많이 사용
	// 매서드의 실행순서(시나리오)를 정의
	// 절대 하위 클래스에서 오버라이딩할 수 없음
	final public void run() {
		start();
		drive();
		stop();
		turnOff();
	}
}

class AICar extends Car {
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("자율주행합니다");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("자동차가 알아서 멈춥니다");
	}
	
}

class ManCar extends Car {
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("사람이 운전합니다");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("브레이크로 정지합니다");
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자율주행차");
		Car mycar = new AICar();
		mycar.run();
		System.out.println("수동주행차");
		Car youcar = new ManCar();
		youcar.run();
	}

}





















