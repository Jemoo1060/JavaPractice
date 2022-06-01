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
		
		
		FlickerLabel label = new FlickerLabel("안녕하세요", 1000);
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
		super(message); // 라벨의 초기화 방법 부모클래스의 JLabel를 이용
		this.delay = delay;
		setPreferredSize(new Dimension(350,100));
		setHorizontalAlignment(CENTER);
		setFont(new Font("맑은고딕", Font.BOLD,50));
		//setOpaque(true); // 배경색 변경이 가능하도록 지정
		
		Thread th = new Thread(this);
		th.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count = 0;
		while(true) {
			// 첫번째 예시 깜빡깜빡
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
			
			// 두번째 무지개 색

			//setBackground(raindow[count]); // 그냥 이대로 쓰면 적용안됨.  setOpaque(true); 를 같이 쓰면 적용
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






































