import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


// ������ ���� ��� ( �г��� ���� ����� ���� ���� )
// 1. JFrame Ŭ������ ��ü�� �����Ͽ� ����
// 2. ����Ŭ�������� JFrame�� ���� ��� �޾� ����
//	  - �����ڿ��� ����, ���� �޼��忡�� ���� Ŭ���� ��ü�� ����
// 3. JFrame�� ��� ���� ������ Ŭ������ ���� ����

// �г� Ŭ������ Ȱ��
class MyPanel extends JPanel{
	private JButton btn1, btn2;
	
	public MyPanel(String a, String b) {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(200,200));
		setBackground(Color.GREEN);
		
		btn1 = new JButton(a);
		btn2 = new JButton(b);
		this.add(btn1);
		this.add(btn2);
	}
}
class PanelFrame1 extends JFrame{
	private JPanel panel1;
	private MyPanel panel2;
	
	public PanelFrame1() {
		// TODO Auto-generated constructor stub
		setTitle("������ ����");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		//FlowLayout layout = new FlowLayout();
		//setLayout(layout);
		setLayout(new FlowLayout(FlowLayout.LEFT,10,10)); // ���� ���� 5,5�� �⺻��
		
		// ����������Ʈ���� ������ �����̳ʷ� ����. �����̳� ������ �������� ��ü�ϰų� �����Ҷ� ������. 
		Container frame = getContentPane();
		
		// �г����� 
		panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel1.setBackground(Color.YELLOW);
		
		//panel1.setSize(200,200); // ������ �ȵ�. �гο��� ������ ������ �ȵȴ�.
		//panel1.setSize(new Dimension(200,200)); // setSize ��ü�� ���� �ȵ�.
		panel1.setPreferredSize(new Dimension(200,200)); // �̰� ����ȴ�.
		
		JButton a = new JButton("A");
		//a.setSize(50,50); // �̰͵� ���� �ȵ�
		a.setPreferredSize(new Dimension(50,50));
		panel1.add(a);
		
		//�г� Ŭ������ ��ü ����
		panel2 = new MyPanel("Ȯ��","���");
		
		frame.add(panel1);
		frame.add(panel2);
		setVisible(true);
	}
	
}
public class Example1_1{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PanelFrame1();	
	}
}


















