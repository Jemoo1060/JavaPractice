import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

class GenNumber2 extends JFrame{
	private Container frame;
	private JLabel numberLabel = new JLabel();
	private String[] number = {"", "", ""};
	
	
	public GenNumber2() {
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
		
		RndNumber2 th1 = new RndNumber2(0,1000);
		th1.start();
		
		RndNumber2 th2 = new RndNumber2(1,3000);
		th2.start();
		
		RndNumber2 th3 = new RndNumber2(2,2000);
		th3.start();
		
		
		pack();
		setVisible(true);
		
	}
	class RndNumber2 extends Thread {
		private int position, delay;
		
		// position : 선택 자리, delay: 시간 간격
		public RndNumber2(int position, int delay ) {
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

public class Example3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GenNumber2();
	}

}
