import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class DistanceFrame extends JFrame{
	private Container frame;
	private JPanel panel1, panel2, panel3;
	private JLabel lblInput, lblOutput;
	private JTextField txtInput, txtOutput;
	private JButton btnCompute;
	private Font myfont = new Font("맑은고딕", Font.BOLD, 20); // 폰트이름, 스타일, 사이즈 
	
	public DistanceFrame() {
		// TODO Auto-generated constructor stub
		setTitle("거리계산");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame = getContentPane();
		frame.setLayout(new BorderLayout());
		
		inputPanel();
		outputPanel();
		compute();
		
		pack();
		setVisible(true);
	}
	public void inputPanel() {
		panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		panel1.setBackground(Color.YELLOW);
		
		lblInput = new JLabel("거리를 입력하세요 (km)");
		// 레이블의 폰트 설정 : Font 객체를 사용
		lblInput.setFont(myfont);
		txtInput = new JTextField(5); // 숫자는 텍스트 필드의 사이즈가 됨. 글자수
		txtInput.setFont(myfont);
		
		panel1.add(lblInput);
		panel1.add(txtInput);
		frame.add(panel1,BorderLayout.NORTH);
	}
	public void outputPanel() {
		panel2 = new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		panel2.setBackground(Color.GREEN);
		
		lblOutput = new JLabel("변환된 마일 (mile) ");
		lblOutput.setFont(myfont);
		txtOutput = new JTextField(10); // 숫자는 텍스트 필드의 사이즈가 됨. 글자수
		txtOutput.setFont(myfont);
		
		panel2.add(lblOutput);
		panel2.add(txtOutput);
		frame.add(panel2,BorderLayout.CENTER);
	}
	public void compute() {
		panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		panel3.setBackground(Color.CYAN);
		
		btnCompute = new JButton("계산");
		btnCompute.setFont(myfont);
		
		
		panel3.add(btnCompute);
		frame.add(panel3,BorderLayout.SOUTH);
		
		// 이벤트 처리
		btnCompute.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 1마일은 -> 1.6km
				if(e.getSource() == btnCompute) {
					// 값이 존재하느냐를 따짐
					if(txtInput.getText().equals("")) {
						System.out.println("값을 입력하세요");
						// 대화상자(대화상자가 뜨는 위치, 내용, 타이틀, x표시)
						JOptionPane.showMessageDialog(frame, "값을 입력하세요", "경고", JOptionPane.ERROR_MESSAGE);
					} else {	
					// 입력된 문자열 데이터를 실수로 캐스팅
					double km = Double.parseDouble(txtInput.getText());
					// 계산결과를 문자열로
					txtOutput.setText(String.valueOf(km/1.6));
					//String mile = Double.toString(km/1.6); // 내가 짠 코드
					//txtOutput.setText(mile);
					}
				}
			}
		});
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DistanceFrame();
	}

}



















