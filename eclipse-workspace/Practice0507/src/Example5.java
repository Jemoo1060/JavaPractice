// �������̽�
// ������Ʈ�� �Ը� Ŀ���ų� Ȯ���� �䱸�� ���
// ����� ���ϼ�, �������� ���� ǥ��ȭ �ϴ� ���
// Ŭ������� �̸� ��� interface ��� �̸����� ��ü
// �޼����� �������ٴ� ����(�߻� �޼���)������ ����
// �������̽��� ����Ͽ� ������ Ŭ������ ���� ����(implementation)


interface Remocon {
	int VOLUME = 10; // �������̽��� �Ӽ�(���) : �ݵ�� �ʱ�ȭ
	void turnOn();
	void turnOff();
	default void sleep() {  // �������̽������� �޼����� ������ ����
		System.out.println("���ڴ� �Ҹ�����"); // �ڽĵ��� �޼��带 ���� ���� �ʿ� ����.
	}
	static void search() { // static �� �̿��ؼ� �޼��� ���� ����
		System.out.println("������ ã��");
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
		
		//tvR.display(); // �������� Tv�� ������ �ִ� �޼��� 
		TV tv = (TV)tvR; // �ٿ�ĳ����(����ȯ)
		tv.display();
		
		tvR.sleep(); // default �޼���
		
		Remocon.search(); // static �� ����� �޼���
		//tvR.search(); // �������� Remocon���� �ִ� �޼��� static
		
		System.out.println(Remocon.VOLUME); // static ó�� �ᵵ��.
		
		Remocon[] my = {new TV(), new Radio()};
		for(Remocon r : my) {
			if(r instanceof TV)
				System.out.println("�ڷ�����");
			else if(r instanceof Radio)
				System.out.println("����");
			
			r.turnOn();
			r.turnOff();
			r.sleep();
			Remocon.search();
		}
	}
}





























