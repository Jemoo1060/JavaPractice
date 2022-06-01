import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// �̺�Ʈ ������ �ۼ����
// 1. �̺�Ʈ ������ Ŭ������ ���� �ܺο� ���� 
// 		- ������ Ŭ�������� ������ Ŭ������ ����� �����ϴ� ���� �Ʒ���
// 		- ����� static�� ����Ͽ� ���� ���(����)�� ���
// 2. �̺�Ʈ ������ Ŭ������ ���� ���ο� ����(�ܺ�Ŭ���� ��� ���� ������ ���� �Ҽ� �ִ�.)
// 3. ������ Ŭ���� ��ü�� �����ʷ� ����ϴ� ���
// 4. ����Ŭ������ ������ Ŭ������ �����ϴ� ���
// 		- �����ʸ� �����ϴ� �������� �����ʸ� ����

class SampleFrame extends JFrame implements ActionListener{
	private Container frame;
	private JButton btn1, btn2, btn3, btn4, btn5;
	private int nimage = 0;  // 0 = 1���̹���  1=2���̹���
	private ImageIcon icon1,icon2;
	private JLabel label;
	
	
	public SampleFrame() {
		// TODO Auto-generated constructor stub
		setTitle("�̺�Ʈ �׽�Ʈ 2");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame = getContentPane();
		frame.setLayout(new FlowLayout());
		
		eventTest3();
		eventTest4();
		eventTest5();
		eventTest6();
		
		this.setVisible(true);
	}
	public void eventTest3() {
		btn1 = new JButton("���");
		btn1.setPreferredSize(new Dimension(200,100));
		btn1.setFont(new Font("����",Font.ITALIC,80));
		frame.add(btn1);
		
		btn2 = new JButton("�ʷ�");
		btn2.setPreferredSize(new Dimension(200,100));
		btn2.setFont(new Font("����ü",Font.ITALIC,80));
		frame.add(btn2);
		
		// �ΰ��� ��ư�� ��� ���� �����ʸ� ����
		// �̺�Ʈ �߻��� ����
		btn1.addActionListener(new ButtonClickListener());
		btn2.addActionListener(new ButtonClickListener());
	}
	// ������ Ŭ������ ���� Ŭ������ ����
	// ������ Ŭ���� �ȿ� Ŭ������ ����
	class ButtonClickListener implements ActionListener {
		
		// ������ Ŭ������ �ݹ� �޼���
		// �̺�Ʈ�� �߻��ϸ� �ڵ����� �ѹ� ȣ��
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			// e : �̺�Ʈ�� �߻��� ��ü �Ѿ��
			if(e.getSource() == btn1) {
				frame.setBackground(Color.YELLOW);
			} else {
				frame.setBackground(Color.GREEN);
			}
		}
	}
	public void eventTest4() {
		btn3 = new JButton("�̹��� ����");
		btn3.setPreferredSize(new Dimension(200,100));
		btn3.setFont(new Font("����",Font.ITALIC,30));
		frame.add(btn3);
		// �ڱ� �ڽ��� �������̹Ƿ� �ڱ� �ڽ��� ����
		btn3.addActionListener(this);
	}
	// ������ Ŭ������ �����ʷ� �����ϴ� ���
	// ������ Ŭ���� �ȿ� �ݹ�޼��带 �������̵�
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.setBackground(Color.WHITE);
		new ShowImage();
	}
	public void eventTest5() {
		btn4 = new JButton();
		btn4.setPreferredSize(new Dimension(200,100));
		icon1 = new ImageIcon("fun1.png");
		icon2 = new ImageIcon("fun2.png");
		Image img1 = icon1.getImage().getScaledInstance(100, 100, 0);
		Image img2 = icon2.getImage().getScaledInstance(100, 100, 0);
		icon1 = new ImageIcon(img1);
		icon2 = new ImageIcon(img2);
		
		btn4.setIcon(icon1);
		frame.add(btn4);
		
		// ����Ŭ������ ������ Ŭ������ �����ϴ� ���
		// ���� Ŭ���� : �̸��� ���� Ŭ����
		// �ٷ� �����ʸ� ����
		// ����Ŭ�������� ����� ��ü�� �ݵ�� �ܺο� ���� 
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(nimage == 0 ) {
					frame.setBackground(Color.RED);
					btn4.setIcon(icon2); 
					nimage++;
				} else {
					frame.setBackground(Color.WHITE);
					btn4.setIcon(icon1);
					nimage=0;
				}
			}
		}); // addActionListener(); �ȿ� ����޼ҵ带 ����. ��ȸ��
	}
	public void eventTest6() {
		btn5 = new JButton("����������");
		btn5.setPreferredSize(new Dimension(200,100));
		btn5.setFont(new Font("����",Font.ITALIC,30));
		frame.add(btn5);
		
		label = new JLabel("?");
		label.setPreferredSize(new Dimension(200,100));
		label.setFont(new Font("����",Font.ITALIC,20));
		label.setHorizontalAlignment(JLabel.CENTER); // �߾ӿ� ���ٴ�.
		frame.add(label);
		
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("�����մϴ�");
			}
		});
	}
}
// �̹����� ǥ���ϴ� ������
class ShowImage extends JFrame{
	private Image image;
	
	public ShowImage() {
		// TODO Auto-generated constructor stub
		// �ܺο��� �̹����� ������ ��üȭ
		ImageIcon icon = new ImageIcon("mypic.jpg");
		// �̹�����ũ��, ������ �ٷ�� ���ؼ��� Image ��ü�� ������
		image = icon.getImage();
		// �̹����� �������� ũ��� �����ؾ� �ϹǷ�
		// �̹����� ���� ���� ���̸� ����
		int width = image.getWidth(this);
		int height = image.getHeight(this);
		
		setTitle("�̹��� ǥ��");
		setSize(width,height);
		setLocationRelativeTo(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�̰� ������ x��ư �������� ��ü �� ����ǹ���.
		this.setVisible(true);
	}	
	// �̹����� ǥ�� : �̹��� �׸���(draw), �̹����� �ε�
	// �̹����� �ε��ϱ� ���ؼ��� Image��ü�� ���
	// �������� �����ӿ� �̹��� ǥ�ø� ���ؼ� paint() �ݹ�޼��带 ����
	// �������� �г� �̹��� ǥ�ø� ���ؼ� paintComponet() �ݹ�޼��带 ����
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		// �̹����� �׸� ( �̹��� ��ü, �׷��� ��ǥ(x),�׷��� ��ǥ(y), ����, ����
		g.drawImage(image,0,0,this.getWidth(),this.getHeight(), null);
	}
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SampleFrame();
	}

}


















