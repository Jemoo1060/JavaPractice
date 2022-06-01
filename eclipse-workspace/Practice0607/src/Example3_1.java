import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

class GenNumber1 extends JFrame{
	private Container frame;
	private JLabel numberLabel = new JLabel();
	private String[] number = {"", "", ""};
	
	
	public GenNumber1() {
		// TODO Auto-generated constructor stub
		setTitle("���ڻ���");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		frame = getContentPane();
		frame.setLayout(new FlowLayout());
		
		numberLabel.setPreferredSize(new Dimension(300,150));
		numberLabel.setHorizontalAlignment((int)CENTER_ALIGNMENT);
		numberLabel.setFont(new Font("���", Font.ITALIC,100));
		
		//testGenerate(); // �տ��θ� �������� ������ �ڿ� �ڵ���� �ʰ� ���´�. Thread.sleep(1000); ����
		
		frame.add(numberLabel);
		
		pack();
		setVisible(true);
		testGenerate1();
	}
	public void testGenerate1() {
		// ������ ����(RandomŬ����)
		Random random = new Random();
		String display = "";
		
		for(int count = 0; count < 3; count ++) {
			try {
				Thread.sleep(1000);
			} catch(Exception exp) {
				return;
			}
			number[count] = Integer.toString(random.nextInt(10));// 0 ~ 9 ���� ����, 10�� �ȳ���
			display += number[count];
			numberLabel.setText(display);
		}
	}
}
public class Example3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GenNumber1();
	}

}