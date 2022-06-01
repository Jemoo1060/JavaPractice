import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

// GUI �������̽�
// GUI ��ü�� �����ϴ� ���
// 1. AWT
// 	 - �ü���� �����ϴ� �ڿ��� �̿��Ͽ� ������Ʈ�� ����
//	 - �����÷������� ���� ������Ʈ�� ����
//   - �÷����� ���ӵǹǷ� ������Ʈ�� �ٸ��� ���� �� �ִ�.
// 2. Swing
//	 - ������Ʈ�� �ڹٷ� �ۼ�
//   - � �÷��������� �ϰ����� ȭ���� ����
//	 - AWT���� �� ���� ������Ʈ�� ����
//	 - AWT���� Ŭ���� �̸��� �ߺ��� ���ϱ� ���� SwingŬ������ �տ� J�� ����
class BasicFrame1 extends JFrame {
	
}
// ������ Ŭ����
class BasicFrame2 extends JFrame {
	// �����ڸ� ���ؼ� �ڵ����� �������� ����
	public BasicFrame2() {
		// TODO Auto-generated constructor stub
		setTitle("�׽�Ʈ3"); // ������ �̸�
		setSize(500,500); // �������� ũ��(�ȼ� ����)
		setLocation(600,200); // �������� ��ġ
		setResizable(false); // false �ϸ� ũ���������� true ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ����� x��ư(����) Ŭ�������� â������ �ƴ� ���� �����Ű��.
		setVisible(true); // ������â�� ���ܳ�, false���ϸ� ����.
	}
}
class BasicFrame3 extends JFrame{
	
	// �������� �ʱ�ȭ
	public BasicFrame3() {
		// TODO Auto-generated constructor stub
		setTitle("�׽�Ʈ4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//setSize(500,500);
		// �������� ũ�⸦ DimensionŬ������ ��ü�� ����Ͽ� ũ�⸦ ����
		// Dimension ��üŬ����: ���� ���� ������ ������ ��ü
		// ����� �ػ�, ������ ũ�� �ڿ��� �����ϱ� ���ؼ� ����
		Dimension mydim = new Dimension(500,500); // �����ڸ� ���ؼ� ���� ���� ������ ����
		// Dimension ������ �������� ũ�⸦ ������ ��
		setPreferredSize(mydim);
		pack(); // ������ ũ��� ����
		
		//setLocation(600,200);
		// �������� ��ġ
		// �ڽ��� �ػ� ������ �������� �������� ��ġ�� ����
		// �ػ��� ���� ��ġ�� ����
		// Toolkit Ŭ������ Ȱ���Ͽ� ��ġ ������ ����
		// Toolkit Ŭ����: �ڽ��� �ý��� �ڿ��� ������ ������ �� �ִ� Ŭ����
		// ��Ʈ����, Ŀ���� ������, ȭ������, �̹��� �������� ��
		//  �� Ŭ������ ��κ��� ���� �޼���� ����
		Toolkit mykit = Toolkit.getDefaultToolkit(); // ������ ���� �Ҽ� �ִ� ��ü
		Dimension screen = mykit.getScreenSize();
		// ���� ȭ���� �ػ�
		System.out.println(screen);
		setPreferredSize(screen);
		pack();
		// ����: width, ����: height
		setLocation(screen.width/2, screen.height/2);
		
		// ������ ������ ����
		// �Ϲ��̹����� �ڿ����� ����ϱ� ���� toolkit ��ü�� Ȱ��
		// Image ��ü�� �Ҵ�
		Image icon = mykit.getImage("emoticon_smile.png");
		setIconImage(icon);
		
		setVisible(true);
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. ����Ŭ�������� JFrame�� ��� �޾� ���� �ϴ� ���
		// 2. JFrame�� ��� ���� Ŭ������ �����Ͽ� �����ϴ� ��� 
		//test1();
		//test2();
		//test3();
		test4();
	}
	public static void test1() {
		JFrame myframe = new JFrame("�׽�Ʈ 1");
		myframe.setSize(500,500); // �������� ũ��(�ȼ� ����)
		myframe.setLocation(600,200); // �������� ��ġ
		myframe.setVisible(true); // ������â�� ���ܳ�, false���ϸ� ����.
	}
	public static void test2() {
		// JFrame�� ��� ���� Ŭ������ ������ ����
		BasicFrame1 myframe = new BasicFrame1();
		myframe.setTitle("�׽�Ʈ2"); // ������ �̸�
		myframe.setSize(500,500); // �������� ũ��(�ȼ� ����)
		myframe.setLocation(600,200); // �������� ��ġ
		myframe.setResizable(false); // false �ϸ� ũ���������� true ����
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ����� x��ư(����) Ŭ�������� â������ �ƴ� ���� �����Ű��.
		myframe.setVisible(true); // ������â�� ���ܳ�, false���ϸ� ����.
	}
	public static void test3() {
		//BasicFrame2 myframe = new BasicFrame2(); �̷��� �ص��Ǵµ�
		 new BasicFrame2(); // �̷��Ե� ��. ������ ��ü�� �ϴ°� ���� ������.
	}
	public static void test4() {
		new BasicFrame3();
	}

}
