import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// �����̳�: ������Ʈ�� ����, ������, �г�
// �г�: �ٸ� ������Ʈ�� ���� �� ����
// �����̳ʷ� �۵��ϴ� Ŭ����: JFrame, JPanel, JWindow, ...
class PanelFrame1 extends JFrame {
	public PanelFrame1() {
		// TODO Auto-generated constructor stub
		setTitle("�г� �׽�Ʈ1");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setBackground(Color.YELLOW); // ����ȵȴ�. �������� �޴���, �׵θ��� ��� �����̳ʿ����ܿ��� �������� �־ �� ������ �ȵ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		// �г� ����
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		// ��������: ColorŬ������ ��� 
		panel1.setBackground(Color.RED);
		
		JButton a = new JButton("A");
		panel1.add(a);
		JButton b = new JButton("B");
		panel1.add(b);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.setBackground(Color.blue);
	
		JButton c = new JButton("C");
		panel2.add(c);
		JButton d = new JButton("D");
		panel2.add(d);
		
		this.add(panel1);
		this.add(panel2);
	}
}
public class Example3 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	public static void test1() {
		PanelFrame1 myframe = new PanelFrame1();
		// �������� �����̳ʷ� ���� ( ������ �����ϱ� ���� )
		Container con = myframe.getContentPane(); // �������� �����̳ʿ����� ������.
		con.setBackground(Color.WHITE); // �����̳ʿ����� �������� ���ұ⿡ ȭ��Ʈ���� �����̵ȴ�.
		myframe.setVisible(true);
	}
}