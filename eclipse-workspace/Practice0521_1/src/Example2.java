import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

// 컴포넌트: 버튼, 레이블, 라디오버튼, 체크박스, ......
// 일반 컴포넌트, 컨테이너: 일반 컴포넌트나 컨테이너를 담을 수 있는 컴포넌트(프레임, 패널)
// 레이아웃(배치관리자: 컴포넌트의 배치방법) 

class LayoutFrame1 extends JFrame{	
	public LayoutFrame1() {
		// TODO Auto-generated constructor stub
		setTitle("레이아웃 테스트1");
		setSize(500,500);
		setLocationRelativeTo(null); // 프레임 중앙에 놓겠다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}
class LayoutFrame2 extends JFrame{	
	public LayoutFrame2() {
		// TODO Auto-generated constructor stub
		setTitle("레이아웃 테스트2");
		setSize(500,500);
		setLocationRelativeTo(null); // 프레임 중앙에 놓겠다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Flow Layout: 컴포넌트를 순차적으로 배치
		FlowLayout flow1 = new FlowLayout();
		// flowlayout 기본값 : 가로중앙정렬,  hgap = 5(가로 마진), vgap = 5(세로 마진)
		
		FlowLayout flow2 = new FlowLayout(FlowLayout.LEFT,50,50);
		// 왼쪽정렬,  hgap = 50(가로 마진), vgap = 50(세로 마진)
		
		
		// 레이아웃을 프레임에 지정
		setLayout(flow2);  // flow1넣어보고 비교 
		
		JButton btnOK = new JButton("확인"); 
		this.add(btnOK);
		
		JButton btnCancel = new JButton("취소");
		this.add(btnCancel); 
		
		setVisible(true);
	}
}
class LayoutFrame3 extends JFrame{
	public LayoutFrame3() {
		// TODO Auto-generated constructor stub
		setTitle("레이아웃 테스트3");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Border Layout: 컨테이너 공간을 동, 서, 남, 북, 중앙 구분
		BorderLayout border1 = new BorderLayout();
		// 컴포넌트의 간격 기본: 0
		BorderLayout border2 = new BorderLayout(20, 20);
		// 컴포넌트 간격 20,20
		setLayout(border2);
		
		// 컴포넌트를 동서남북으로 지정
		JButton btnOK = new JButton("확인"); 
		this.add(btnOK, BorderLayout.WEST);
		
		JButton btnCancel = new JButton("취소");
		this.add(btnCancel,BorderLayout.EAST); 
		
		JButton btnA = new JButton("A");
		this.add(btnA,BorderLayout.NORTH); 
		
		JButton btnB = new JButton("B");
		this.add(btnB,BorderLayout.SOUTH);
		
		JButton btnC = new JButton("C");
		this.add(btnC,BorderLayout.CENTER);
		
		setVisible(true);
	}
}
class LayoutFrame4 extends JFrame{
	public LayoutFrame4() {
		// TODO Auto-generated constructor stub
		setTitle("레이아웃 테스트4");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Grid Layout: 컨테이너를 격자모양 (테이블)
		GridLayout grid1 = new GridLayout();
		
		
		GridLayout grid2 = new GridLayout(2,6);
		// 2행 6열
		setLayout(grid2);
		
		JButton btnA = new JButton("A");
		this.add(btnA); 
		
		JButton btnB = new JButton("B");
		this.add(btnB);
		
		JButton btnC = new JButton("C");
		this.add(btnC);
		
		JButton btnD = new JButton("D");
		this.add(btnD); 
		
		JButton btnE = new JButton("E");
		this.add(btnE);
	
		JButton btnF = new JButton("F");
		this.add(btnF);
		
		setVisible(true);
	}
}
class LayoutFrame5 extends JFrame{
	public LayoutFrame5() {
		// TODO Auto-generated constructor stub
		setTitle("레이아웃 테스트5");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 배치 관리자가 없는 경우
		// 개발자가 컴포넌트의 위치를 직접 지정
		// 컴포넌트를 겹쳐야하는 경우
		setLayout(null); // 기본이 Border 이기때문에 null로 설정해줘야됨.
		
		JButton btnA = new JButton("A");
		btnA.setSize(50,50);
		btnA.setLocation(100,100);
		this.add(btnA); 
		
		for(int count = 1; count <=5; count++) {
			// 버튼의 이름은 문자열
			JButton btn = new JButton(Integer.toString(count)); // 숫자를 문자열로
			btn.setSize(100,100);
			btn.setLocation(count*50,count*50);
			this.add(btn); 
		}
		
		setVisible(true);
	}
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		//test4();
		test5();
	}
	public static void test1() {
		LayoutFrame1 myframe = new LayoutFrame1();
		// 버튼의 정의 (JButton클래스)
		JButton btnOK = new JButton("확인"); // 생성자를 통해서 이름을 지정
		myframe.add(btnOK);
		
		JButton btnCancel = new JButton("취소"); // 생성자를 통해서 이름을 지정
		myframe.add(btnCancel);  // 확인 버튼과 취소 버튼이 서로 중복되서 확인이 안보임. 레이아웃 필요
		
		
		myframe.setVisible(true); // setVisible은 항상 마지막에 아니면 밑에 코드들 적용이 안됨.
		// 프레임의 기본레이아웃은 Border Layout
	}
	public static void test2() {
		// Flow Layout
		LayoutFrame2 myframe = new LayoutFrame2();
	}
	public static void test3() {
		// Border Layout
		LayoutFrame3 myframe = new LayoutFrame3();
	}
	public static void test4() {
		// Grid Layout
		LayoutFrame4 myframe = new LayoutFrame4();
	}
	public static void test5() {
		// 레이아웃 없을때 
		LayoutFrame5 myframe = new LayoutFrame5();
	}
}
























