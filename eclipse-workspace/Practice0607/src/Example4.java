import java.awt.BorderLayout;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class SlotMachine extends JFrame{
	private Container frame;
	private String[] number = new String[3];
	private Thread[] thread = new Thread[3];
	private JLabel numberLabel;
	private JPanel buttonPanel;
	private JButton btnStart, btnStop;
	
	public SlotMachine() {
		// TODO Auto-generated constructor stub
		setTitle("���Ըӽ�");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setResizable(false);
		
		frame = getContentPane();
		frame.setLayout(new BorderLayout());
		
		initLabel();
		initButton();
		
		pack();
		setVisible(true);		
	}
	public void initLabel() {
		numberLabel = new JLabel();
		numberLabel.setPreferredSize(new Dimension(300,150));
		numberLabel.setHorizontalAlignment((int)CENTER_ALIGNMENT);
		numberLabel.setFont(new Font("���",0,100));
		numberLabel.setText("000");
		frame.add(numberLabel,BorderLayout.NORTH);
	}
	public void initButton() {
		
		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(300,50));
		buttonPanel.setLayout(new FlowLayout());
		btnStart = new JButton("����");
		btnStop = new JButton("����");
		buttonPanel.add(btnStart);
		buttonPanel.add(btnStop);
		frame.add(buttonPanel,BorderLayout.SOUTH);
		
		btnStart.addActionListener(new ButtonClickListener());
		btnStop.addActionListener(new ButtonClickListener());
	}
	
	// ���� Ŭ������ ��ư Ŭ�� ������
	class ButtonClickListener implements ActionListener{
		// ������(task)�� �۾� ��ȣ
		private int thIndex = 0;
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == btnStart) {
				// ���۹�ư
				machineStart();
			} else {
				// ������ư
				machineStop();
			}
		}
		public void machineStart() { // ���� ��ư ��Ÿ�ϸ� ����Ǵ� �����尡 �ߺ��Ǽ� �ٲ�� �ӵ��� �������� ����.
			for(int index = 0; index < thread.length; index++) {
				int delay =  new Random().nextInt(201) + 100;    // 100 ~ 300����
				thread[index] = new GenNumber(index, delay);
				thread[index].start();
			}
			
		}
		public void machineStop() {
			// 1�� �������� ������ ����
			// Ÿ�̸� ��� (Timer Ŭ����, TimerTask Ŭ����)
			// Ÿ�̸� Ŭ������ run() �ݹ�޼��� �������̵� ����
			Timer mytimer = new Timer(); // Ÿ�̸� ����
			// Ÿ�̸� ��ü�� ������ ������ ����
			TimerTask task = new TimerTask() {
				// Ÿ�̸Ӱ� ����Ǵ� ���� �ڵ带 ����
				@Override
				public void run() {
					// TODO Auto-generated method stub
					// 3���� �����带 ���������� ����(interrupt)
					if(thIndex < 3 ) {
						thread[thIndex].interrupt();
						thIndex++;
						if(thIndex == 3)
							thIndex = 0;
					} else {
						mytimer.cancel();
					}
				}
			};
			// Ÿ�̸ӿ� task�� ����
			// �ܹ߼�
			//mytimer.schedule(task, 2000); // �ڿ� ���ڴ� ��ư�� ������ ����Ǳ� ���� �����̰� ����� �ð�. 0 �̸� ��ư�θ��� �ٷ� ����
			
			// task = Ÿ�̸Ӱ� ����� ���� ����� �޼ҵ�
			// ���߼� : 1���Ŀ� �ٽ� 1�ʰ� Ÿ�̸Ӹ� ����
			mytimer.schedule(task, 1000, 2000); // 1�� Ŭ���ϸ� 1����(delay) ����, ������ ������ 2��(period)�ڿ� �� �ڵ����� ���, ���߼�
			
			
		}
	}
	// ������ Ŭ����
	class GenNumber extends Thread {
		private int position;
		private int delay;
		
		public GenNumber(int position,int delay) {
			// TODO Auto-generated constructor stub
			this.position = position;
			this.delay = delay;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			//generate1();
			generate2();
		}
		// �������� �� ���ڰ� ��Ÿ����, ��Ÿ���� ���� ���� ����
		public void generate1() {
			Random random = new Random();
			while(true){
				number[position] = Integer.toString(random.nextInt(10)); // 0~9
				
				String display = "";
				for(int count = 0; count < number.length; count ++) {
					display += number[count];
					numberLabel.setText(display);
				}
				try {
					Thread.sleep(delay);
				} catch(Exception exp) {
					return;
				}
			}
		}
		// ���ڰ� ���ʷ� ī��Ʈ�ϸ� ��Ÿ��. ���� ����
		public void generate2() {
			int n = 0;
			while(true) {
				number[position] = Integer.toString(n++);
						
				String display = "";
				for(int count = 0; count < number.length; count ++) {
					display += number[count];
					numberLabel.setText(display);
				}
				try {
					Thread.sleep(delay);
				} catch(Exception exp) {
					return;
				}
				if(n==10) n=0;
			}
		}
		
	}
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SlotMachine();
	}

}




































