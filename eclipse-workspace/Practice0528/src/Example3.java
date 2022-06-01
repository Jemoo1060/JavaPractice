import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 이벤트 리스너 작성방법
// 1. 이벤트 리스너 클래스를 직접 외부에 구현 
// 		- 리스너 클래스에서 프레임 클래스의 멤버에 접근하는 것이 아려움
// 		- 멤버를 static을 사용하여 정적 멤버(공유)로 사용
// 2. 이벤트 리스너 클래스를 직접 내부에 구현(외부클래스 멤버 접근 단점을 보완 할수 있다.)
// 3. 프레임 클래스 자체를 리스너로 사용하는 방법
// 4. 무명클래스로 리스너 클래스를 정의하는 방법
// 		- 리스너를 장착하는 과정에서 리스너를 정의

class SampleFrame extends JFrame implements ActionListener{
	private Container frame;
	private JButton btn1, btn2, btn3, btn4, btn5;
	private int nimage = 0;  // 0 = 1번이미지  1=2번이미지
	private ImageIcon icon1,icon2;
	private JLabel label;
	
	
	public SampleFrame() {
		// TODO Auto-generated constructor stub
		setTitle("이벤트 테스트 2");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame = getContentPane();
		frame.setLayout(new FlowLayout());
		
		eventTest3();
		eventTest4();
		eventTest5();
		eventTest6();
		
		this.setVisible(true);
	}
	public void eventTest3() {
		btn1 = new JButton("노랑");
		btn1.setPreferredSize(new Dimension(200,100));
		btn1.setFont(new Font("굴림",Font.ITALIC,80));
		frame.add(btn1);
		
		btn2 = new JButton("초록");
		btn2.setPreferredSize(new Dimension(200,100));
		btn2.setFont(new Font("굴림체",Font.ITALIC,80));
		frame.add(btn2);
		
		// 두개의 버튼에 모두 같은 리스너를 장착
		// 이벤트 발생을 감지
		btn1.addActionListener(new ButtonClickListener());
		btn2.addActionListener(new ButtonClickListener());
	}
	// 리스너 클래스를 내부 클래스로 정의
	// 프레임 클래스 안에 클래스를 정의
	class ButtonClickListener implements ActionListener {
		
		// 리스너 클래스의 콜백 메서드
		// 이벤트가 발생하면 자동으로 한번 호출
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			// e : 이벤트가 발생된 객체 넘어옴
			if(e.getSource() == btn1) {
				frame.setBackground(Color.YELLOW);
			} else {
				frame.setBackground(Color.GREEN);
			}
		}
	}
	public void eventTest4() {
		btn3 = new JButton("이미지 보기");
		btn3.setPreferredSize(new Dimension(200,100));
		btn3.setFont(new Font("굴림",Font.ITALIC,30));
		frame.add(btn3);
		// 자기 자신이 리스너이므로 자기 자신을 장착
		btn3.addActionListener(this);
	}
	// 프레임 클래스를 리스너로 구현하는 경우
	// 프레임 클래스 안에 콜백메서드를 오버라이딩
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.setBackground(Color.WHITE);
		new ShowImage();
	}
	public void eventTest5() {
		btn4 = new JButton();
		btn4.setPreferredSize(new Dimension(200,100));
		icon1 = new ImageIcon("fun1.png");
		icon2 = new ImageIcon("fun2.png");
		Image img1 = icon1.getImage().getScaledInstance(100, 100, 0);
		Image img2 = icon2.getImage().getScaledInstance(100, 100, 0);
		icon1 = new ImageIcon(img1);
		icon2 = new ImageIcon(img2);
		
		btn4.setIcon(icon1);
		frame.add(btn4);
		
		// 무명클래스로 리스너 클래스를 정의하는 방법
		// 무명 클래스 : 이름이 없는 클래스
		// 바로 리스너를 장착
		// 무명클래스에서 사용할 객체는 반드시 외부에 정의 
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(nimage == 0 ) {
					frame.setBackground(Color.RED);
					btn4.setIcon(icon2); 
					nimage++;
				} else {
					frame.setBackground(Color.WHITE);
					btn4.setIcon(icon1);
					nimage=0;
				}
			}
		}); // addActionListener(); 안에 무명메소드를 만듬. 일회용
	}
	public void eventTest6() {
		btn5 = new JButton("눌러보세요");
		btn5.setPreferredSize(new Dimension(200,100));
		btn5.setFont(new Font("굴림",Font.ITALIC,30));
		frame.add(btn5);
		
		label = new JLabel("?");
		label.setPreferredSize(new Dimension(200,100));
		label.setFont(new Font("굴림",Font.ITALIC,20));
		label.setHorizontalAlignment(JLabel.CENTER); // 중앙에 놓겟다.
		frame.add(label);
		
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("감사합니다");
			}
		});
	}
}
// 이미지를 표시하는 프레임
class ShowImage extends JFrame{
	private Image image;
	
	public ShowImage() {
		// TODO Auto-generated constructor stub
		// 외부에서 이미지를 가져와 객체화
		ImageIcon icon = new ImageIcon("mypic.jpg");
		// 이미지의크기, 정보를 다루기 위해서는 Image 객체로 재정의
		image = icon.getImage();
		// 이미지와 프레임의 크기는 동일해야 하므로
		// 이미지의 가로 세로 길이를 구함
		int width = image.getWidth(this);
		int height = image.getHeight(this);
		
		setTitle("이미지 표시");
		setSize(width,height);
		setLocationRelativeTo(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //이거 넣으면 x버튼 눌렀을때 전체 다 종료되버림.
		this.setVisible(true);
	}	
	// 이미지를 표시 : 이미지 그린다(draw), 이미지를 로딩
	// 이미지를 로딩하기 위해서는 Image객체를 사용
	// 스윙에서 프레임에 이미지 표시를 위해서 paint() 콜백메서드를 정의
	// 스윙에서 패널 이미지 표시를 위해서 paintComponet() 콜백메서드를 정의
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		// 이미지를 그림 ( 이미지 객체, 그려질 좌표(x),그려질 좌표(y), 가로, 세로
		g.drawImage(image,0,0,this.getWidth(),this.getHeight(), null);
	}
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SampleFrame();
	}

}


















