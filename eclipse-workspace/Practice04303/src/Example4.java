// TV¿Í Radio
interface Remocon {
	int VOLUME = 0;
	void turnOn();
	void turnOff();
}
class TV implements Remocon{
	int volume = Remocon.VOLUME + 10;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV On");
		
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV Off");
	}
}
class Radio implements Remocon{
	
	@Override
	public void turnOn() {
		int volume = Remocon.VOLUME + 5;
		// TODO Auto-generated method stub
		System.out.println("Radio On");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Radio Off");
	}
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remocon tv = new TV();
		tv.turnOn();
		tv.turnOff();
		
		Remocon radio = new Radio();
		radio.turnOn();
		radio.turnOff();
	}

}





















