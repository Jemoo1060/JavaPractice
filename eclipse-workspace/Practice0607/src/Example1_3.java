import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerCount3 extends JFrame implements Runnable {
	private Container frame;
	private JLabel[]  timerLabel = new JLabel[2];
	private Thread th;
	private int order;
	
	public TimerCount3() {
		// TODO Auto-generated constructor stub
		setTitle("Ÿ�̸�");
		setSize(500,500);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame = getContentPane();
		setLayout(new FlowLayout());
		
		for(int index = 0; index < timerLabel.length; index ++) {
			timerLabel[index] = new JLabel();
			timerLabel[index].setPreferredSize(new Dimension(200,200));
			timerLabel[index].setFont(new Font("���", Font.ITALIC,100));
			timerLabel[index].setForeground(Color.RED); // ���ڻ� �ٲٱ�
			// ���̺� ��� ����
			timerLabel[index].setHorizontalAlignment((int)CENTER_ALIGNMENT);
			frame.add(timerLabel[index]);
			
			// �����带 ����, �����带 ����ϱ� ������ ���ѷ����� �ϰ� �־ �ؿ� �ڵ���� ������ �ȴ�.
			th = new Thread(this);
			th.start();
			
		}
		// Ÿ�̸Ӹ� ���� ������ ���
		// Ÿ�̸� ���� ���� ������ ���� ���� �ڵ��� ���� �Ұ�, ���ѷ����� ���� �ڵ� ������ �Ұ� 
		//timerStart();
		
		pack();
		setVisible(true);
		
		
		//timerStart(timerLabel[0]); // timerLabel[0]�� ���ѷ����� �ϱ� ������ �����带 ������� ������ ���� timerStart(timerLabel[1]);�� ������ ���� ����. 
		//timerStart(timerLabel[1]);	 
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count = 0;
		JLabel label = timerLabel[order];
		order++;
		
		while(true) { 
			
			label.setText(Integer.toString(count++));
			// sleep()�� �ݵ��  ����ó���� �ʿ��ϴ�, ���� thread�� ��� �ȹ޾Ƶ� ������ ����.
			try {
				Thread.sleep(1000); // Ÿ�̸� : �и�������(1�� =  1000ms), 1�ʰ� ����. �����Ѵ�.
			} catch(Exception exp) {
				return; // �����ϸ� ��ȯ �� ���� �׳� ����
			}
				
		}	
	}
}
public class Example1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TimerCount3();
	}
}