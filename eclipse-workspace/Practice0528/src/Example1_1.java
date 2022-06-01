import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


// 프레임 생성 방법 ( 패널의 생성 방법도 거의 동일 )
// 1. JFrame 클래스의 객체를 생성하여 구현
// 2. 메인클래스에서 JFrame을 직접 상속 받아 구현
//	  - 생성자에서 구현, 메인 메서드에서 메인 클래스 객체를 생성
// 3. JFrame을 상속 받은 프레임 클래스를 직접 정의

// 패널 클래스를 활용
class MyPanel extends JPanel{
	private JButton btn1, btn2;
	
	public MyPanel(String a, String b) {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(200,200));
		setBackground(Color.GREEN);
		
		btn1 = new JButton(a);
		btn2 = new JButton(b);
		this.add(btn1);
		this.add(btn2);
	}
}
class PanelFrame1 extends JFrame{
	private JPanel panel1;
	private MyPanel panel2;
	
	public PanelFrame1() {
		// TODO Auto-generated constructor stub
		setTitle("프레임 생성");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		//FlowLayout layout = new FlowLayout();
		//setLayout(layout);
		setLayout(new FlowLayout(FlowLayout.LEFT,10,10)); // 센터 마진 5,5가 기본값
		
		// 별도의컨텐트팬을 프레임 컨테이너로 정의. 컨테이너 영역을 동적으로 교체하거나 수정할때 변해짐. 
		Container frame = getContentPane();
		
		// 패널정의 
		panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel1.setBackground(Color.YELLOW);
		
		//panel1.setSize(200,200); // 적용이 안됨. 패널에서 사이즈 적용은 안된다.
		//panel1.setSize(new Dimension(200,200)); // setSize 자체가 적용 안됨.
		panel1.setPreferredSize(new Dimension(200,200)); // 이건 적용된다.
		
		JButton a = new JButton("A");
		//a.setSize(50,50); // 이것도 적용 안됨
		a.setPreferredSize(new Dimension(50,50));
		panel1.add(a);
		
		//패널 클래스의 객체 생성
		panel2 = new MyPanel("확인","취소");
		
		frame.add(panel1);
		frame.add(panel2);
		setVisible(true);
	}
	
}
public class Example1_1{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PanelFrame1();	
	}
}


















