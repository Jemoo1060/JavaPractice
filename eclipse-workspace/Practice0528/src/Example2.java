import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
// �̺�Ʈ : ����ڰ� ���콺�� Ŭ���ϰų� Ű�� ������ ����
// �̺�Ʈ�� �߻��ϸ� �ڵ����� �̺�Ʈ ��ü(ActionEvent)�� ����
// �̺�Ʈ�� ó�� : �̺�Ʈ ó�� �ڵ带 �ۼ�
// �̺�Ʈ ������ (Event Listener) : Ŭ������ ����
// �̺�Ʈ�� �߻��ϸ� �̺�Ʈ ó�� : ������ ��ü�� ������ ���ؼ� ó��
// ������ Ŭ���� ���ο� �̺�Ʈ�� ó���ϴ� �޼��带 ����
// �ݹ�(Callback) �޼��� : �̺�Ʈ �߻��� �ڵ����� �ѹ� ȣ��
// ������ Ŭ���� ���� ���
// �̺�Ʈ ������ ���� �ʿ��� �������̽��� ������


// �̺�Ʈ ������ �ۼ����
// 1. �̺�Ʈ ������ Ŭ������ ���� �ܺο� ���� 
// 		- ������ Ŭ�������� ������ Ŭ������ ����� �����ϴ� ���� �Ʒ���
// 		- ����� static�� ����Ͽ� ���� ���(����)�� ���
// 2. �̺�Ʈ ������ Ŭ������ ���� ���ο� ����(�ܺ�Ŭ���� ��� ���� ������ ���� �Ҽ� �ִ�.)
// 3. ������ Ŭ���� ��ü�� �����ʷ� ����ϴ� ���
// 4. ����Ŭ������ ������ Ŭ������ �����ϴ� ���
// 		- �����ʸ� �����ϴ� �������� �����ʸ� ����


// �̺�Ʈ ó�� ���
// 1. �̺�Ʈ ������ Ŭ������ �����Ѵ�.
// 2. ������ ��ü�� �����Ѵ�.
// 3. ��ü�� ������Ʈ�� �����Ѵ�.

class BasicFrame extends JFrame{
	private Container frame;
	public static JButton btn1, btn2;  // static�� ���� ����ϴ°� ���� �� ���� ���ϴ�. �����ʿ�
	public static int state = 0; // 0 = Ȯ��, 1 = ���
	
	public BasicFrame() {
		// TODO Auto-generated constructor stub
		setTitle("�̺�Ʈ �׽�Ʈ1");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		frame = getContentPane();
		frame.setLayout(new FlowLayout());
		
		eventTest1();
		eventTest2();
		
		setVisible(true);
	}
	public void eventTest1() {
		// �ڵ忡�� ������ �̹����� ����ϱ� ���ؼ��� ��üȭ
		// ImageIcon Ŭ���� Ȱ��
		// �ɼ� ������ ������ ������ �ҹ��ڷ�
		ImageIcon ismile = new ImageIcon("emoticon_smile.png");
		
		//btn1 = new JButton("Ȯ��", ismile);
		//btn1.setPreferredSize(new Dimension(200,50)); // �̹��� ©������, �̹��� ũ�� ������ �ʿ���.
		
		// �̹����� ũ��� ȭ���� �����ϴ� ���
		// �̹����� Image��ü�� �ٽ� ����
		//Image icon = ismile.getImage(); // �̹��� ����
		//icon = icon.getScaledInstance(100, 100, 0);  // �̹��� ������ ��ȯ
		Image icon = ismile.getImage().getScaledInstance(100, 100, 0); // 0���� ���� �ε巴���Ҳ��� ��� �������� �޼ҵ尡 ����.
		// �ٽ� ImageIcon���� ��üȭ
		ismile = new ImageIcon(icon);
		// ��ư�� �̹����� ����
		btn1 = new JButton("Ȯ��", ismile);
		btn1.setPreferredSize(new Dimension(200,100));
		// ��ư�� ���� ũ�� ����       �۲�,��Ÿ��,����ũ��
		Font myfont = new Font("�ü�", Font.BOLD,30); // ������ �����ڿ� �־���°� ����.
		btn1.setFont(myfont);
	
		frame.add(btn1);
		
		// ������ ��ü�� ����
		ButtonClickListener listener = new ButtonClickListener();
		// ������ ��ü�� ��ư�� ����
		btn1.addActionListener(listener);
	}
	public void eventTest2() {
		btn2 = new JButton("0"); // ��ư�� ǥ�õǴ� ���� (String)
		btn2.setPreferredSize(new Dimension(200,100));
		btn2.setFont(new Font(Font.SANS_SERIF, Font.BOLD,80));
		frame.add(btn2);
		btn2.addActionListener(new ButtonClickListener()); //������ ��ü ����
		
	}
}
// �̺�Ʈ ������ Ŭ������ ���� �ۼ� ( �ܺ� )
// �̺�Ʈ ������ ���� �������̽��� ����Ͽ� ����
// ActionListener �������̽��� ���
class ButtonClickListener implements ActionListener{
	
	
	// ���ο� �̺�Ʈó���� ���� �޼��带 �ݵ�� �������̵� �ؾߵȴ�.
	// �ݹ�޼���(Callback Method)
	// �̺�Ʈ�� �߻��Ǹ� �ڵ����� ȣ��
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// e : �̺�Ʈ�� �߻��� ��ü ����
		// e�� ���� ������ ������
		// getSource() �޼���� ObjectŸ������ ��ȯ
		// ����� ��ü�� ����ȯ�� �ʿ��ϴ�.
		
		JButton button = (JButton)e.getSource();
		// setText�� ��ư�� ���� ������ ����
		// �� ���� ��ư�� ���� ������ �����Ͽ� �ۼ�
		if(button == BasicFrame.btn1) {
			if(BasicFrame.state == 0) {
				button.setText("���");
				BasicFrame.state = 1;
				} else {
					button.setText("Ȯ��");
					BasicFrame.state = 0;
				}
		} else { // btn2
			// ī��Ʈ
			// ��ư�� ǥ�õ� ���ڴ� ���� -> ������ ��ȯ
			// getText�� ��ư�� ���� ������ �ҷ���
			int count = Integer.parseInt(button.getText());
			// ��ư�� �ٽ� ǥ���ϱ� ���ؼ��� ���ڿ��� ��ȯ
			button.setText(Integer.toString(++count));
		}
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BasicFrame();
	}

}




























