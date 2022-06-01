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
		setTitle("슬롯머신");
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
		numberLabel.setFont(new Font("고딕",0,100));
		numberLabel.setText("000");
		frame.add(numberLabel,BorderLayout.NORTH);
	}
	public void initButton() {
		
		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(300,50));
		buttonPanel.setLayout(new FlowLayout());
		btnStart = new JButton("시작");
		btnStop = new JButton("정지");
		buttonPanel.add(btnStart);
		buttonPanel.add(btnStop);
		frame.add(buttonPanel,BorderLayout.SOUTH);
		
		btnStart.addActionListener(new ButtonClickListener());
		btnStop.addActionListener(new ButtonClickListener());
	}
	
	// 내부 클래스에 버튼 클릭 리스너
	class ButtonClickListener implements ActionListener{
		// 스레드(task)의 작업 번호
		private int thIndex = 0;
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == btnStart) {
				// 시작버튼
				machineStart();
			} else {
				// 정지버튼
				machineStop();
			}
		}
		public void machineStart() { // 시작 버튼 연타하면 실행되는 스레드가 중복되서 바뀌는 속도가 빨라지게 보임.
			for(int index = 0; index < thread.length; index++) {
				int delay =  new Random().nextInt(201) + 100;    // 100 ~ 300정도
				thread[index] = new GenNumber(index, delay);
				thread[index].start();
			}
			
		}
		public void machineStop() {
			// 1초 간격으로 스레드 중지
			// 타이머 사용 (Timer 클래스, TimerTask 클래스)
			// 타이머 클래스의 run() 콜백메서드 오버라이드 정의
			Timer mytimer = new Timer(); // 타이머 동작
			// 타이머 객체가 수행할 내용을 정의
			TimerTask task = new TimerTask() {
				// 타이머가 수행되는 동안 코드를 수행
				@Override
				public void run() {
					// TODO Auto-generated method stub
					// 3개의 스레드를 순차적으로 정지(interrupt)
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
			// 타이머에 task를 적용
			// 단발성
			//mytimer.schedule(task, 2000); // 뒤에 숫자는 버튼을 누르고 적용되기 까지 딜레이가 생기는 시간. 0 이면 버튼부르면 바로 실행
			
			// task = 타이머가 실행된 수에 수행될 메소드
			// 연발성 : 1초후에 다시 1초간 타이머를 실행
			mytimer.schedule(task, 1000, 2000); // 1번 클릭하면 1초후(delay) 실행, 실행이 끝나고 2초(period)뒤에 또 자동으로 재생, 연발성
			
			
		}
	}
	// 스레드 클래스
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
		// 랜덤으로 각 숫자가 나타나며, 나타나는 간격 또한 랜덤
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
		// 숫자가 차례로 카운트하며 나타남. 간격 랜덤
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




































