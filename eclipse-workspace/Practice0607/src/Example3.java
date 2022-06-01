import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

class GenNumber extends JFrame{
	private Container frame;
	private JLabel numberLabel = new JLabel();
	private String[] number = {"", "", ""};
	
	// 여러개의 스레드를 하나로 관리
	private Thread[] thread = new Thread[3];
	
	
	public GenNumber() {
		// TODO Auto-generated constructor stub
		setTitle("숫자생성");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		frame = getContentPane();
		frame.setLayout(new FlowLayout());
		
		numberLabel.setPreferredSize(new Dimension(300,150));
		numberLabel.setHorizontalAlignment((int)CENTER_ALIGNMENT);
		numberLabel.setFont(new Font("고딕", Font.ITALIC,100));
		
		frame.add(numberLabel);
		
		int delay = 4000;
		for(int index = 0; index < thread.length; index ++) {
			delay -= 1000;
			
			thread[index] = new RndNumber(index,delay);
			thread[index].start();
		}
		
		
		pack();
		setVisible(true);
		
	}
	class RndNumber extends Thread {
		private int position, delay;
		
		// position : 선택 자리, delay: 시간 간격
		public RndNumber(int position, int delay ) {
			// TODO Auto-generated constructor stub
			this.position = position;
			this.delay = delay;	
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			// 랜덤값 생성(Random클래스)
			Random random = new Random();
			String display = "";
			
			try {
				Thread.sleep(delay);
			} catch(Exception exp) {
				return;
			}
			// 0 ~ 9 까지 랜덤, 10은 안나옴
			number[position] = Integer.toString(random.nextInt(10));
			for(int count = 0 ; count < 3; count++) {
				display += number[count];
				numberLabel.setText(display);	
			}
			
		}
	}
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GenNumber();
	}

}






































