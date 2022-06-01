import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerCount2 extends JFrame {
	private Container frame;
	private JLabel[]  timerLabel = new JLabel[2];
	private Thread th;
	
	
	public TimerCount2() {
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
			TimerRunnable runnable = new TimerRunnable(timerLabel[index]);
			th = new Thread(runnable);
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
	// ������� ���� ���� ���� ����� �ڵ�
	// ī���� ����
	public void timerStart(JLabel label) {
		int count = 0;
		
		while(true) { 
			
			label.setText(Integer.toString(count++));
			// sleep()�� �ݵ��  ����ó���� �ʿ��ϴ�, ���� thread�� ��� �ȹ޾Ƶ� ���� ����.
			try {
				Thread.sleep(1000); // Ÿ�̸� : �и�������(1�� =  1000ms), 1�ʰ� ����. �����Ѵ�.
			} catch(Exception exp) {
				return; // �����ϸ� ��ȯ �� ���� �׳� ����
			}
				
		}
	}
}
class Basic {
	
}
class TimerRunnable extends Basic implements Runnable {
	private JLabel label;
	
	public TimerRunnable(JLabel label) {
		// TODO Auto-generated constructor stub
		this.label = label; 
	}
	// �����带 �����ϴ� �޼���
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count = 0;
		
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
public class Example1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TimerCount2();
	}
}


