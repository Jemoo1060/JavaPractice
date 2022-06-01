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
		setTitle("타이머");
		setSize(500,500);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame = getContentPane();
		setLayout(new FlowLayout());
		
		for(int index = 0; index < timerLabel.length; index ++) {
			timerLabel[index] = new JLabel();
			timerLabel[index].setPreferredSize(new Dimension(200,200));
			timerLabel[index].setFont(new Font("고딕", Font.ITALIC,100));
			timerLabel[index].setForeground(Color.RED); // 글자색 바꾸기
			// 레이블 가운데 정렬
			timerLabel[index].setHorizontalAlignment((int)CENTER_ALIGNMENT);
			frame.add(timerLabel[index]);
			
			// 스레드를 수행, 스레드를 사용하기 때문에 무한루프를 하고 있어도 밑에 코드들이 컴파일 된다.
			TimerRunnable runnable = new TimerRunnable(timerLabel[index]);
			th = new Thread(runnable);
			th.start();
			
		}
		// 타이머를 먼저 수행할 경우
		// 타이머 내의 무한 루프로 인해 다음 코드의 진행 불가, 무한루프로 다음 코드 컴파일 불가 
		//timerStart();
		
		pack();
		setVisible(true);
		
		
		//timerStart(timerLabel[0]); // timerLabel[0]이 무한루프를 하기 때문에 스레드를 사용하지 않으면 밑의 timerStart(timerLabel[1]);는 컴파일 되지 않음. 
		//timerStart(timerLabel[1]);
		 
	}
	// 스레드로 구현 하지 않을 경우의 코드
	// 카운터 정의
	public void timerStart(JLabel label) {
		int count = 0;
		
		while(true) { 
			
			label.setText(Integer.toString(count++));
			// sleep()는 반드시  예외처리가 필요하다, 굳이 thread는 상속 안받아도 쓸수 잇음.
			try {
				Thread.sleep(1000); // 타이머 : 밀리세컨드(1초 =  1000ms), 1초간 슬립. 정지한다.
			} catch(Exception exp) {
				return; // 리턴하면 반환 값 없이 그냥 종료
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
	// 스레드를 수행하는 메서드
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count = 0;
		
		while(true) { 
			
			label.setText(Integer.toString(count++));
			// sleep()는 반드시  예외처리가 필요하다, 굳이 thread는 상속 안받아도 쓸수는 잇음.
			try {
				Thread.sleep(1000); // 타이머 : 밀리세컨드(1초 =  1000ms), 1초간 슬립. 정지한다.
			} catch(Exception exp) {
				return; // 리턴하면 반환 값 없이 그냥 종료
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


