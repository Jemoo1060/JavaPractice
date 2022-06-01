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
		
		//testGenerate(); // 앞에두면 컴파일이 느려서 뒤에 코드들이 늦게 나온다. Thread.sleep(1000); 때문
		
		frame.add(numberLabel);
		
		pack();
		setVisible(true);
		testGenerate1();
	}
	public void testGenerate1() {
		// 랜덤값 생성(Random클래스)
		Random random = new Random();
		String display = "";
		
		for(int count = 0; count < 3; count ++) {
			try {
				Thread.sleep(1000);
			} catch(Exception exp) {
				return;
			}
			number[count] = Integer.toString(random.nextInt(10));// 0 ~ 9 까지 랜덤, 10은 안나옴
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