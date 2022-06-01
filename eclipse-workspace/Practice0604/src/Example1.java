import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ShowContents extends JFrame{
	private Container frame;
	private JPanel panel1, panel2;
	private CardLayout cardContents = new CardLayout();
	
	public ShowContents() {
		// TODO Auto-generated constructor stub
		setTitle("ī�巹�̾ƿ�");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame = getContentPane();
		frame.setLayout(new BorderLayout());// border�� �⺻ ���̶� ���� �������൵��.
		
		panel1 = new ButtonPanel();
		frame.add(panel1,BorderLayout.NORTH);
		
		// ī�� ���̾ƿ�
		// �г��� ������ �ִٰ� �̺�Ʈ ��û�� ���� ���ϴ� �г�(ī��)�� ��Ÿ�� 
		// ī�� ���̾ƿ��� �θ� �г� ����
		panel2 = new JPanel(cardContents);
		// �غ�� �г�(ī��)�� �θ��гο� �߰�
		panel2.add(new contents1(), "contents1"); // ī���� �̸��� ����
		panel2.add(new contents2(), "contents2");
		panel2.add(new contents3(), "contents3");
		frame.add(panel2,BorderLayout.SOUTH);
		
		
		
		pack();
		setVisible(true);
	}
	// ���� Ŭ������ �г��� ����
	// ī�巹�̾ƿ��� ��ü�� ���� ����
	class ButtonPanel extends JPanel implements ActionListener{
		private JButton[] btnContents = new JButton[6];

		
		public ButtonPanel() {
			// TODO Auto-generated constructor stub
			setPreferredSize(new Dimension(300,100));
			setBackground(Color.YELLOW);
			setLayout(new GridLayout(2,3));

			
			for(int count = 0; count < btnContents.length; count++) {
				btnContents[count] = new JButton("����"+(count+1)); // count +1 ���� ���ϸ� ����ó�� ����.
				add(btnContents[count]);
				btnContents[count].addActionListener(this);
			}
		}
		// ��ư�� Ŭ������ �� �ڵ����� ȣ��Ǵ� �ݹ�޼���
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			// e : �̺�Ʈ�� ����� ������Ʈ
			JButton button = (JButton)e.getSource(); // object ��ü�� ��ȯ
			
			if(button == btnContents[0]) {
				// ī�带 ������(������)
				cardContents.show(panel2, "contents1");
			} else if(button == btnContents[1]) {
				cardContents.show(panel2, "contents2");
			} else if(button == btnContents[2]) {
				cardContents.show(panel2, "contents3");
			}
		}

	}
}

class contents1 extends JPanel{
	public contents1() {
		// TODO Auto-generated constructor stub
		setPreferredSize(new Dimension(300,300));
		setBackground(Color.RED);
	}
}
class contents2  extends JPanel{
	public contents2() {
		// TODO Auto-generated constructor stub
		setPreferredSize(new Dimension(300,300));
		setBackground(Color.GREEN);
	}
}
class contents3  extends JPanel{
	public contents3() {
		// TODO Auto-generated constructor stub
		setPreferredSize(new Dimension(300,300));
		setBackground(Color.BLUE);
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ShowContents();
	}

}































