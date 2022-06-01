import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
// 이벤트 : 사용자가 마우스를 클릭하거나 키를 누르는 동작
// 이벤트가 발생하면 자동으로 이벤트 객체(ActionEvent)가 생성
// 이벤트를 처리 : 이벤트 처리 코드를 작성
// 이벤트 리스너 (Event Listener) : 클래스를 정의
// 이벤트가 발생하면 이벤트 처리 : 리스너 객체를 생성를 통해서 처리
// 리스너 클래스 내부에 이벤트를 처리하는 메서드를 구현
// 콜백(Callback) 메서드 : 이벤트 발생시 자동으로 한번 호출
// 리스너 클래스 정의 방법
// 이벤트 종류에 따라 필요한 인터페이스를 구현함


// 이벤트 리스너 작성방법
// 1. 이벤트 리스너 클래스를 직접 외부에 구현 
// 		- 리스너 클래스에서 프레임 클래스의 멤버에 접근하는 것이 아려움
// 		- 멤버를 static을 사용하여 정적 멤버(공유)로 사용
// 2. 이벤트 리스너 클래스를 직접 내부에 구현(외부클래스 멤버 접근 단점을 보완 할수 있다.)
// 3. 프레임 클래스 자체를 리스너로 사용하는 방법
// 4. 무명클래스로 리스너 클래스를 정의하는 방법
// 		- 리스너를 장착하는 과정에서 리스너를 정의


// 이벤트 처리 방법
// 1. 이벤트 리스너 클래스를 정의한다.
// 2. 리스너 객체를 생성한다.
// 3. 객체를 컴포넌트에 부착한다.

class BasicFrame extends JFrame{
	private Container frame;
	public static JButton btn1, btn2;  // static을 많이 사용하는건 보안 상 좋지 못하다. 보완필요
	public static int state = 0; // 0 = 확인, 1 = 취소
	
	public BasicFrame() {
		// TODO Auto-generated constructor stub
		setTitle("이벤트 테스트1");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		frame = getContentPane();
		frame.setLayout(new FlowLayout());
		
		eventTest1();
		eventTest2();
		
		setVisible(true);
	}
	public void eventTest1() {
		// 코드에서 아이콘 이미지를 사용하기 위해서는 객체화
		// ImageIcon 클래스 활용
		// 될수 있으면 아이콘 파일은 소문자로
		ImageIcon ismile = new ImageIcon("emoticon_smile.png");
		
		//btn1 = new JButton("확인", ismile);
		//btn1.setPreferredSize(new Dimension(200,50)); // 이미지 짤려버림, 이미지 크기 조절이 필요함.
		
		// 이미지의 크기와 화질을 조절하는 방법
		// 이미지를 Image객체로 다시 정의
		//Image icon = ismile.getImage(); // 이미지 추출
		//icon = icon.getScaledInstance(100, 100, 0);  // 이미지 사이즈 변환
		Image icon = ismile.getImage().getScaledInstance(100, 100, 0); // 0적은 곳은 부드럽게할꺼냐 등등 여러가지 메소드가 잇음.
		// 다시 ImageIcon으로 객체화
		ismile = new ImageIcon(icon);
		// 버튼에 이미지를 삽입
		btn1 = new JButton("확인", ismile);
		btn1.setPreferredSize(new Dimension(200,100));
		// 버튼의 글자 크기 조정       글꼴,스타일,글자크기
		Font myfont = new Font("궁서", Font.BOLD,30); // 원래는 생성자에 넣어놓는게 좋다.
		btn1.setFont(myfont);
	
		frame.add(btn1);
		
		// 리스터 객체를 생성
		ButtonClickListener listener = new ButtonClickListener();
		// 리스너 객체를 버튼에 장착
		btn1.addActionListener(listener);
	}
	public void eventTest2() {
		btn2 = new JButton("0"); // 버튼에 표시되는 정보 (String)
		btn2.setPreferredSize(new Dimension(200,100));
		btn2.setFont(new Font(Font.SANS_SERIF, Font.BOLD,80));
		frame.add(btn2);
		btn2.addActionListener(new ButtonClickListener()); //리스너 객체 장착
		
	}
}
// 이벤트 리스너 클래스를 직접 작성 ( 외부 )
// 이벤트 종류에 따른 인터페이스를 사용하여 구현
// ActionListener 인터페이스를 사용
class ButtonClickListener implements ActionListener{
	
	
	// 내부에 이벤트처리를 위한 메서드를 반드시 오버라이딩 해야된다.
	// 콜백메서드(Callback Method)
	// 이벤트가 발생되면 자동으로 호출
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// e : 이벤트가 발생한 객체 정보
		// e에 대한 정보를 가져옴
		// getSource() 메서드는 Object타입으로 반환
		// 사용할 객체로 형변환이 필요하다.
		
		JButton button = (JButton)e.getSource();
		// setText는 버튼의 글자 내용을 지정
		// 두 개의 버튼에 대한 동작을 구분하여 작성
		if(button == BasicFrame.btn1) {
			if(BasicFrame.state == 0) {
				button.setText("취소");
				BasicFrame.state = 1;
				} else {
					button.setText("확인");
					BasicFrame.state = 0;
				}
		} else { // btn2
			// 카운트
			// 버튼에 표시된 글자는 문자 -> 정수로 변환
			// getText는 버튼의 글자 내용을 불러옴
			int count = Integer.parseInt(button.getText());
			// 버튼에 다시 표시하기 위해서는 문자열로 변환
			button.setText(Integer.toString(++count));
		}
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BasicFrame();
	}

}




























