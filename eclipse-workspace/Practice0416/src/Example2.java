// ��, ��, �� �� ǥ��
// ����ǥ�ؽð�	 ex) 15:23:55
// ǥ�ؽð� 	 ex) 03:23:55 PM
class TimeDisplay {
	private int hour;
	private int minute;
	private int seconds;
	
	private void setHour(int hour) {
		if(hour>=0 && hour < 24)
			this.hour = hour;
		else {
			System.out.println("�ð��� ������ ���");
			System.exit(1);
		}
	}
	private void setMinute(int minute) {
		if(minute>=0 && minute<60)
			this.minute = minute;
		else {
			System.out.println("�ð��� ������ ���");
			System.exit(1);
		}

	}
	private void setSeconds(int seconds) {
		if(seconds>=0 && seconds<60)
			this.seconds = seconds;
		else {
			System.out.println("�ð��� ������ ���");
			System.exit(1);
		}
	}
	
	public void setTime(int hour, int minute, int seconds) {
		// ���ο��� �˻� �ɷ���
		setHour(hour);
		setMinute(minute);
		setSeconds(seconds);
	}
	public String getUniversal() {
		// 15:23:55
		String message = "";
		message +=String.format("%02d:%02d:%02d", hour, minute, seconds);
		return message;
	}
	public String getStandard() {
		// 03:23:55 PM
		/*String message = "";
		String Time;
		if(hour>12) {
			this.hour = hour-12;
			Time = "PM";
		}
		else
			Time = "AM";	
		message +=String.format("%02d:%02d:%02d %s", hour, minute, seconds,Time); */ //���� ���� ����
		int stHour;
		if(hour == 0 || hour == 12)
			stHour = 12;
		else
			stHour = hour % 12;
		String ampm;
		if(hour > 12)
			ampm = "PM";
		else
			ampm = "AM";
		
		return String.format("%02d:%02d:%02d %s", stHour, minute, seconds,ampm);
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeDisplay my = new TimeDisplay();
		my.setTime(15, 23, 55);
		System.out.println(my.getUniversal());
		System.out.println(my.getStandard());
	}

}
