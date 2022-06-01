abstract class Car {
	abstract public void drive();
	abstract public void stop();
	
	public void start() {
		System.out.println("�õ��� �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�");
	}
	
	// ���ø� �޼���
	// �����ӿ�ũ���� ���� ���
	// �ż����� �������(�ó�����)�� ����
	// ���� ���� Ŭ�������� �������̵��� �� ����
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
		System.out.println("���������մϴ�");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("�ڵ����� �˾Ƽ� ����ϴ�");
	}
	
}

class ManCar extends Car {
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("����� �����մϴ�");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("�극��ũ�� �����մϴ�");
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����������");
		Car mycar = new AICar();
		mycar.run();
		System.out.println("����������");
		Car youcar = new ManCar();
		youcar.run();
	}

}





















