import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickerFrame  extends JFrame{
	private Container frame;
	
	public FlickerFrame() {
		// TODO Auto-generated constructor stub
		setTitle("Flicker");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBackground(Color.WHITE);
		
		frame= getContentPane();
		frame.setLayout(new FlowLayout());
		
		
		FlickerLabel label = new FlickerLabel("�ȳ��ϼ���", 1000);
		frame.add(label);
		
		pack();
		setVisible(true);
	}
}
class FlickerLabel extends JLabel implements Runnable{
	private int delay;
	private  Color[] raindow = {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.BLUE,new Color(0,0,80),new Color(153,51,153)};
	
	public FlickerLabel(String message, int delay) {
		// TODO Auto-generated constructor stub
		super(message); // ���� �ʱ�ȭ ��� �θ�Ŭ������ JLabel�� �̿�
		this.delay = delay;
		setPreferredSize(new Dimension(350,100));
		setHorizontalAlignment(CENTER);
		setFont(new Font("�������", Font.BOLD,50));
		//setOpaque(true); // ���� ������ �����ϵ��� ����
		
		Thread th = new Thread(this);
		th.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count = 0;
		while(true) {
			// ù��° ���� ��������
		/*	if(count % 2 == 1) {
				setForeground(Color.RED);	
			} else {
				setForeground(Color.WHITE);
			}
			try {
				Thread.sleep(delay);
			} catch(Exception exp) {
				return;
			}
			count++; */ 
			
			// �ι�° ������ ��

			//setBackground(raindow[count]); // �׳� �̴�� ���� ����ȵ�.  setOpaque(true); �� ���� ���� ����
			setForeground(raindow[count]);
			try {
				Thread.sleep(delay);
			} catch(Exception exp) {
				return;
			}
			count++; 
			if(count == raindow.length) count = 0;
				
		}
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlickerFrame();
	}

}






































