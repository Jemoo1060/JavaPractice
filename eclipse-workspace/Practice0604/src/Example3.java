import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class PizzaFrame extends JFrame{
	private Container frame;
	
	public PizzaFrame() {
		// TODO Auto-generated constructor stub
		setTitle("피자주문");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		frame = getContentPane();
		frame.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		
		PizzaType type = new PizzaType();
		frame.add(type);
		
		PizzaOrder order = new PizzaOrder();
		frame.add(order);
		
		
		pack();
		setVisible(true);
		
	}
}
class PizzaType extends JPanel{
	private JRadioButton[] rdoPizza = new JRadioButton[3];
	private JLabel[] lblPizza = new JLabel[3];
	private ImageIcon[] imgPizza = new ImageIcon[3];
	private String[] namePizza = {"쉬림프피자", "베이컨피자", "치즈피자"};
	private int[] pricePizza = {17000, 16000,18000};
	// 라디오 버튼을 하나로 그룹핑
	private ButtonGroup grpPizza = new ButtonGroup();
	// 가격
	private static int price;
	
	
	public PizzaType() {
		// TODO Auto-generated constructor stub
		setLayout(new GridLayout(3,2));
		setBorder(BorderFactory.createTitledBorder("피자 종류"));
		setPreferredSize(new Dimension(350,350));
		
		for(int count = 0; count < rdoPizza.length; count++) {
			String name = String.format("%s (%d원)",namePizza[count],pricePizza[count]);
			// 라디오버튼 정의
			rdoPizza[count] = new JRadioButton(name);
			grpPizza.add(rdoPizza[count]);
			add(rdoPizza[count]);
			// 피자 이미기 가져오기
			imgPizza[count] = new ImageIcon("image/pizza"+(count+1)+".png");
			// 이미지 사이즈 조정
			Image img = imgPizza[count].getImage().getScaledInstance(100, 100, 0);
			// image 객체를 -> imageIcon으로 변환
			imgPizza[count] = new ImageIcon(img);
			// 이미지를 담기위한 레이블
			lblPizza[count] = new JLabel(imgPizza[count]);
			add(lblPizza[count]);
			
			// 라디오 버튼에 이벤트 장착
			rdoPizza[count].addItemListener(new PizzaItemClickListener());
		}
	}
	public static int getPrice() {
		return price;
	}
	// 라디오 버튼 이벤트 리스너
	// 선택이 변경 될 때 마다 이벤트가 발생
	// ActionListener이 아님.
	class PizzaItemClickListener implements ItemListener{ 
		
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			// 선택 여부를 모두 검사
			for(int count = 0; count < 3; count++) {
				if(rdoPizza[count].isSelected()) { // isSelected는 선택이 됫냐 안됫냐. 나타냄.
					price = pricePizza[count];
				}
			}
		}
	}
}
class PizzaOrder extends JPanel{
	private JPanel panel;
	private JTextField txtNumber;
	private JLabel lblNumber, lblPrice;
	private JCheckBox chkTake;
	private JButton btnOrder;
	private int takeout;
	
	public PizzaOrder() {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		setBorder(BorderFactory.createTitledBorder("피자 주문"));
		setPreferredSize(new Dimension(150,350));
		
		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT,0,10));
		
		lblNumber = new JLabel("주문개수");
		txtNumber = new JTextField(5);
		add(lblNumber);
		add(txtNumber);
		add(panel);
		
		chkTake = new JCheckBox("Take Out");
		add(chkTake);
		
		// 체크박스 선택에 따른 이벤트 처리
		chkTake.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				// 체크가 되었는지 아닌지 검사
				// e : 클릭한 체크박스의 정보
				if(e.getStateChange() == ItemEvent.SELECTED) { // 현재 상태가 체크박스에 체크 되엇나 확인
					takeout = 2000;
				} else {
					takeout = 0;
				}
			}
		});
		
		
		btnOrder = new JButton("결재");
		btnOrder.setPreferredSize(new Dimension(120,50));
		add(btnOrder);
		
		lblPrice = new JLabel("결과 표시");
		add(lblPrice);
		
		btnOrder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(txtNumber.getText().equals("")) {
					lblPrice.setText("개수를 입력하세요");
				} else {
					int totalPrice = Integer.parseInt(txtNumber.getText()) ;
					totalPrice *= PizzaType.getPrice();
					totalPrice -= takeout;
					lblPrice.setText(Integer.toString(totalPrice));
				}
			}
		});
		
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PizzaFrame();
	}

}

























