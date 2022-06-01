import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

// ������Ʈ: ��ư, ���̺�, ������ư, üũ�ڽ�, ......
// �Ϲ� ������Ʈ, �����̳�: �Ϲ� ������Ʈ�� �����̳ʸ� ���� �� �ִ� ������Ʈ(������, �г�)
// ���̾ƿ�(��ġ������: ������Ʈ�� ��ġ���) 

class LayoutFrame1 extends JFrame{	
	public LayoutFrame1() {
		// TODO Auto-generated constructor stub
		setTitle("���̾ƿ� �׽�Ʈ1");
		setSize(500,500);
		setLocationRelativeTo(null); // ������ �߾ӿ� ���ڴ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}
class LayoutFrame2 extends JFrame{	
	public LayoutFrame2() {
		// TODO Auto-generated constructor stub
		setTitle("���̾ƿ� �׽�Ʈ2");
		setSize(500,500);
		setLocationRelativeTo(null); // ������ �߾ӿ� ���ڴ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Flow Layout: ������Ʈ�� ���������� ��ġ
		FlowLayout flow1 = new FlowLayout();
		// flowlayout �⺻�� : �����߾�����,  hgap = 5(���� ����), vgap = 5(���� ����)
		
		FlowLayout flow2 = new FlowLayout(FlowLayout.LEFT,50,50);
		// ��������,  hgap = 50(���� ����), vgap = 50(���� ����)
		
		
		// ���̾ƿ��� �����ӿ� ����
		setLayout(flow2);  // flow1�־�� �� 
		
		JButton btnOK = new JButton("Ȯ��"); 
		this.add(btnOK);
		
		JButton btnCancel = new JButton("���");
		this.add(btnCancel); 
		
		setVisible(true);
	}
}
class LayoutFrame3 extends JFrame{
	public LayoutFrame3() {
		// TODO Auto-generated constructor stub
		setTitle("���̾ƿ� �׽�Ʈ3");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Border Layout: �����̳� ������ ��, ��, ��, ��, �߾� ����
		BorderLayout border1 = new BorderLayout();
		// ������Ʈ�� ���� �⺻: 0
		BorderLayout border2 = new BorderLayout(20, 20);
		// ������Ʈ ���� 20,20
		setLayout(border2);
		
		// ������Ʈ�� ������������ ����
		JButton btnOK = new JButton("Ȯ��"); 
		this.add(btnOK, BorderLayout.WEST);
		
		JButton btnCancel = new JButton("���");
		this.add(btnCancel,BorderLayout.EAST); 
		
		JButton btnA = new JButton("A");
		this.add(btnA,BorderLayout.NORTH); 
		
		JButton btnB = new JButton("B");
		this.add(btnB,BorderLayout.SOUTH);
		
		JButton btnC = new JButton("C");
		this.add(btnC,BorderLayout.CENTER);
		
		setVisible(true);
	}
}
class LayoutFrame4 extends JFrame{
	public LayoutFrame4() {
		// TODO Auto-generated constructor stub
		setTitle("���̾ƿ� �׽�Ʈ4");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Grid Layout: �����̳ʸ� ���ڸ�� (���̺�)
		GridLayout grid1 = new GridLayout();
		
		
		GridLayout grid2 = new GridLayout(2,6);
		// 2�� 6��
		setLayout(grid2);
		
		JButton btnA = new JButton("A");
		this.add(btnA); 
		
		JButton btnB = new JButton("B");
		this.add(btnB);
		
		JButton btnC = new JButton("C");
		this.add(btnC);
		
		JButton btnD = new JButton("D");
		this.add(btnD); 
		
		JButton btnE = new JButton("E");
		this.add(btnE);
	
		JButton btnF = new JButton("F");
		this.add(btnF);
		
		setVisible(true);
	}
}
class LayoutFrame5 extends JFrame{
	public LayoutFrame5() {
		// TODO Auto-generated constructor stub
		setTitle("���̾ƿ� �׽�Ʈ5");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ��ġ �����ڰ� ���� ���
		// �����ڰ� ������Ʈ�� ��ġ�� ���� ����
		// ������Ʈ�� ���ľ��ϴ� ���
		setLayout(null); // �⺻�� Border �̱⶧���� null�� ��������ߵ�.
		
		JButton btnA = new JButton("A");
		btnA.setSize(50,50);
		btnA.setLocation(100,100);
		this.add(btnA); 
		
		for(int count = 1; count <=5; count++) {
			// ��ư�� �̸��� ���ڿ�
			JButton btn = new JButton(Integer.toString(count)); // ���ڸ� ���ڿ���
			btn.setSize(100,100);
			btn.setLocation(count*50,count*50);
			this.add(btn); 
		}
		
		setVisible(true);
	}
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		//test4();
		test5();
	}
	public static void test1() {
		LayoutFrame1 myframe = new LayoutFrame1();
		// ��ư�� ���� (JButtonŬ����)
		JButton btnOK = new JButton("Ȯ��"); // �����ڸ� ���ؼ� �̸��� ����
		myframe.add(btnOK);
		
		JButton btnCancel = new JButton("���"); // �����ڸ� ���ؼ� �̸��� ����
		myframe.add(btnCancel);  // Ȯ�� ��ư�� ��� ��ư�� ���� �ߺ��Ǽ� Ȯ���� �Ⱥ���. ���̾ƿ� �ʿ�
		
		
		myframe.setVisible(true); // setVisible�� �׻� �������� �ƴϸ� �ؿ� �ڵ�� ������ �ȵ�.
		// �������� �⺻���̾ƿ��� Border Layout
	}
	public static void test2() {
		// Flow Layout
		LayoutFrame2 myframe = new LayoutFrame2();
	}
	public static void test3() {
		// Border Layout
		LayoutFrame3 myframe = new LayoutFrame3();
	}
	public static void test4() {
		// Grid Layout
		LayoutFrame4 myframe = new LayoutFrame4();
	}
	public static void test5() {
		// ���̾ƿ� ������ 
		LayoutFrame5 myframe = new LayoutFrame5();
	}
}
























