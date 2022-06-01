import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 컨테이너: 컴포넌트를 담음, 프레임, 패널
// 패널: 다른 컴포넌트를 담을 수 있음
// 컨테이너로 작동하는 클래스: JFrame, JPanel, JWindow, ...
class PanelFrame1 extends JFrame {
	public PanelFrame1() {
		// TODO Auto-generated constructor stub
		setTitle("패널 테스트1");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setBackground(Color.YELLOW); // 적용안된다. 프레임은 메뉴바, 테두리선 등등 컨테이너영역외에도 여러개가 있어서 색 적용이 안됨.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		// 패널 정의
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		// 색상지정: Color클래스의 상수 
		panel1.setBackground(Color.RED);
		
		JButton a = new JButton("A");
		panel1.add(a);
		JButton b = new JButton("B");
		panel1.add(b);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.setBackground(Color.blue);
	
		JButton c = new JButton("C");
		panel2.add(c);
		JButton d = new JButton("D");
		panel2.add(d);
		
		this.add(panel1);
		this.add(panel2);
	}
}
public class Example3 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	public static void test1() {
		PanelFrame1 myframe = new PanelFrame1();
		// 프레임을 컨테이너로 정의 ( 색상을 적용하기 위해 )
		Container con = myframe.getContentPane(); // 프레임의 컨테이너영역을 가져옴.
		con.setBackground(Color.WHITE); // 컨테이너영역만 한정지어 놓았기에 화이트색상 적용이된다.
		myframe.setVisible(true);
	}
}