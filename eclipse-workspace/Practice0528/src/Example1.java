import javax.swing.JFrame;

// ���۳�Ʈ : UI�� �����ϴ� ���(����)
// �����̳� : ���� ������Ʈ�� ���ο� ���� �� �ִ� ������Ʈ
// �����̳��� �� : ������(������), �г�, 
// ������ ���� : Frame, Menu Bar, Content Pane
// �����ӿ��� ����Ʈ���� �ַ� �����̳� ������ ����
// �г� : �����̳��� ��ǥ���� ������Ʈ�� ���� ������Ʈ���� ������ ��

// ������ ���� ���
// 1. ����Ŭ�������� JFrame�� ���� ��� �޾� ����
//	  - �����ڿ��� ����, ���� �޼��忡�� ���� Ŭ���� ��ü�� ����
// 2. JFrame�� ��� ���� ������ Ŭ������ ���� ����
public class Example1 extends JFrame{  // ���ο��� ������ ���� ���
	
	public Example1() {
		// TODO Auto-generated constructor stub
		setTitle("������ ����");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(100,100);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example1(); // ����Ŭ������ ��ü�� �ٷιٷ� ���� ����
	}

}
