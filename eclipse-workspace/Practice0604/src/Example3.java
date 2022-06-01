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
		setTitle("�����ֹ�");
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
	private String[] namePizza = {"����������", "����������", "ġ������"};
	private int[] pricePizza = {17000, 16000,18000};
	// ���� ��ư�� �ϳ��� �׷���
	private ButtonGroup grpPizza = new ButtonGroup();
	// ����
	private static int price;
	
	
	public PizzaType() {
		// TODO Auto-generated constructor stub
		setLayout(new GridLayout(3,2));
		setBorder(BorderFactory.createTitledBorder("���� ����"));
		setPreferredSize(new Dimension(350,350));
		
		for(int count = 0; count < rdoPizza.length; count++) {
			String name = String.format("%s (%d��)",namePizza[count],pricePizza[count]);
			// ������ư ����
			rdoPizza[count] = new JRadioButton(name);
			grpPizza.add(rdoPizza[count]);
			add(rdoPizza[count]);
			// ���� �̹̱� ��������
			imgPizza[count] = new ImageIcon("image/pizza"+(count+1)+".png");
			// �̹��� ������ ����
			Image img = imgPizza[count].getImage().getScaledInstance(100, 100, 0);
			// image ��ü�� -> imageIcon���� ��ȯ
			imgPizza[count] = new ImageIcon(img);
			// �̹����� ������� ���̺�
			lblPizza[count] = new JLabel(imgPizza[count]);
			add(lblPizza[count]);
			
			// ���� ��ư�� �̺�Ʈ ����
			rdoPizza[count].addItemListener(new PizzaItemClickListener());
		}
	}
	public static int getPrice() {
		return price;
	}
	// ���� ��ư �̺�Ʈ ������
	// ������ ���� �� �� ���� �̺�Ʈ�� �߻�
	// ActionListener�� �ƴ�.
	class PizzaItemClickListener implements ItemListener{ 
		
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			// ���� ���θ� ��� �˻�
			for(int count = 0; count < 3; count++) {
				if(rdoPizza[count].isSelected()) { // isSelected�� ������ �̳� �ȵ̳�. ��Ÿ��.
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
		setBorder(BorderFactory.createTitledBorder("���� �ֹ�"));
		setPreferredSize(new Dimension(150,350));
		
		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT,0,10));
		
		lblNumber = new JLabel("�ֹ�����");
		txtNumber = new JTextField(5);
		add(lblNumber);
		add(txtNumber);
		add(panel);
		
		chkTake = new JCheckBox("Take Out");
		add(chkTake);
		
		// üũ�ڽ� ���ÿ� ���� �̺�Ʈ ó��
		chkTake.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				// üũ�� �Ǿ����� �ƴ��� �˻�
				// e : Ŭ���� üũ�ڽ��� ����
				if(e.getStateChange() == ItemEvent.SELECTED) { // ���� ���°� üũ�ڽ��� üũ �Ǿ��� Ȯ��
					takeout = 2000;
				} else {
					takeout = 0;
				}
			}
		});
		
		
		btnOrder = new JButton("����");
		btnOrder.setPreferredSize(new Dimension(120,50));
		add(btnOrder);
		
		lblPrice = new JLabel("��� ǥ��");
		add(lblPrice);
		
		btnOrder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(txtNumber.getText().equals("")) {
					lblPrice.setText("������ �Է��ϼ���");
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

























