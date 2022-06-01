import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ShowContents extends JFrame{
	private Container frame;
	private JPanel panel1, panel2;
	private CardLayout cardContents = new CardLayout();
	
	public ShowContents() {
		// TODO Auto-generated constructor stub
		setTitle("카드레이아웃");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame = getContentPane();
		frame.setLayout(new BorderLayout());// border은 기본 값이라 굳이 안적어줘도됨.
		
		panel1 = new ButtonPanel();
		frame.add(panel1,BorderLayout.NORTH);
		
		// 카드 레이아웃
		// 패널을 가지고 있다가 이벤트 요청에 의해 원하는 패널(카드)을 나타냄 
		// 카드 레이아웃의 부모 패널 생성
		panel2 = new JPanel(cardContents);
		// 준비된 패널(카드)를 부모패널에 추가
		panel2.add(new contents1(), "contents1"); // 카드의 이름을 지정
		panel2.add(new contents2(), "contents2");
		panel2.add(new contents3(), "contents3");
		frame.add(panel2,BorderLayout.SOUTH);
		
		
		
		pack();
		setVisible(true);
	}
	// 내부 클래스로 패널을 정의
	// 카드레이아웃의 객체를 쉽게 접근
	class ButtonPanel extends JPanel implements ActionListener{
		private JButton[] btnContents = new JButton[6];

		
		public ButtonPanel() {
			// TODO Auto-generated constructor stub
			setPreferredSize(new Dimension(300,100));
			setBackground(Color.YELLOW);
			setLayout(new GridLayout(2,3));

			
			for(int count = 0; count < btnContents.length; count++) {
				btnContents[count] = new JButton("예제"+(count+1)); // count +1 괄로 안하면 문자처럼 붙음.
				add(btnContents[count]);
				btnContents[count].addActionListener(this);
			}
		}
		// 버튼을 클릭했을 때 자동으로 호출되는 콜백메서드
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			// e : 이벤트가 수행된 컴포넌트
			JButton button = (JButton)e.getSource(); // object 객체가 반환
			
			if(button == btnContents[0]) {
				// 카드를 보여줌(맨위로)
				cardContents.show(panel2, "contents1");
			} else if(button == btnContents[1]) {
				cardContents.show(panel2, "contents2");
			} else if(button == btnContents[2]) {
				cardContents.show(panel2, "contents3");
			}
		}

	}
}

class contents1 extends JPanel{
	public contents1() {
		// TODO Auto-generated constructor stub
		setPreferredSize(new Dimension(300,300));
		setBackground(Color.RED);
	}
}
class contents2  extends JPanel{
	public contents2() {
		// TODO Auto-generated constructor stub
		setPreferredSize(new Dimension(300,300));
		setBackground(Color.GREEN);
	}
}
class contents3  extends JPanel{
	public contents3() {
		// TODO Auto-generated constructor stub
		setPreferredSize(new Dimension(300,300));
		setBackground(Color.BLUE);
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ShowContents();
	}

}































