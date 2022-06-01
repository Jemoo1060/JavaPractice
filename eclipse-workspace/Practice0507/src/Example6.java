import java.util.Scanner;

interface Scheduler{
	void getNextCall(); // ���� ��ȭ�� ��������
	void sendcallToAgent(); // �������� ��ȭ ����ϱ�
}
class RoundRobin implements Scheduler{
	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("��⿭���� ������� ��ȭ�� �����ɴϴ�");
	}
	@Override
	public void sendcallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("���� ���� �������� ����մϴ�");
	}
}
class shortJob implements Scheduler{
	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("��⿭���� ������� ��ȭ�� �����ɴϴ�");
	}
	@Override
	public void sendcallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("����� ���ų� ����� ���� �������� ����մϴ�");
	}
}
class Priority implements Scheduler{
	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("�� ����� ���� ��ȭ�� ���� �����ɴϴ�");
	}
	@Override
	public void sendcallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("�����ɷ��� ���� �������� ���");
	}
}

class Sample{
	// ���丮 �޼���
	// �� �������̽��� � Ŭ������ ��ü�� �Ҵ� �޴����� ����
	public Scheduler selectCall() {
		System.out.println("��ȭ ��� ���:  1. RR,  2. SJ,  3. PR ");
		Scanner input = new Scanner(System.in);
		int select = input.nextInt();
		
		Scheduler sc = null;
		//Scheduler sc; ��� �ص� ������.
		if(select == 1)
			sc = new RoundRobin();
		else if(select == 2)
			sc = new shortJob();
		else if(select == 3)
			sc = new Priority();
		else {
			System.out.println("�߸��� ���� ���Դϴ�");
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
		System.out.println("��ȭ ��� ���:  1. RR,  2. SJ,  3. PR ");
		Scanner input = new Scanner(System.in);
		int select = input.nextInt();
		
		Scheduler sc = null;
		//Scheduler sc; ��� �ص� ������.
		if(select == 1)
			sc = new RoundRobin();
		else if(select == 2)
			sc = new shortJob();
		else if(select == 3)
			sc = new Priority();
		else {
			System.out.println("�߸��� ���� ���Դϴ�");
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