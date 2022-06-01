import javax.swing.JFrame;

// 컴퍼넌트 : UI를 구성하는 요소(위젯)
// 컨테이너 : 여러 컴포넌트를 내부에 담을 수 있는 컴포넌트
// 컨테이너의 예 : 프레임(윈도우), 패널, 
// 프레임 구성 : Frame, Menu Bar, Content Pane
// 프레임에서 컨텐트팬이 주로 컨테이너 역할을 수행
// 패널 : 컨테이너의 대표적인 컴포넌트로 여러 컴포넌트들을 포함한 것

// 프레임 생성 방법
// 1. 메인클래스에서 JFrame을 직접 상속 받아 구현
//	  - 생성자에서 구현, 메인 메서드에서 메인 클래스 객체를 생성
// 2. JFrame을 상속 받은 프레임 클래스를 직접 정의
public class Example1 extends JFrame{  // 메인에서 프레임 생성 방법
	
	public Example1() {
		// TODO Auto-generated constructor stub
		setTitle("프레임 생성");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(100,100);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example1(); // 메인클래스의 객체도 바로바로 생성 가능
	}

}
