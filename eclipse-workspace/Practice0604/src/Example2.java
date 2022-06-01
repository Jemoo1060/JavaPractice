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
	private Font myfont = new Font("�������", Font.BOLD, 20); // ��Ʈ�̸�, ��Ÿ��, ������ 
	
	public DistanceFrame() {
		// TODO Auto-generated constructor stub
		setTitle("�Ÿ����");
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
		
		lblInput = new JLabel("�Ÿ��� �Է��ϼ��� (km)");
		// ���̺��� ��Ʈ ���� : Font ��ü�� ���
		lblInput.setFont(myfont);
		txtInput = new JTextField(5); // ���ڴ� �ؽ�Ʈ �ʵ��� ����� ��. ���ڼ�
		txtInput.setFont(myfont);
		
		panel1.add(lblInput);
		panel1.add(txtInput);
		frame.add(panel1,BorderLayout.NORTH);
	}
	public void outputPanel() {
		panel2 = new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		panel2.setBackground(Color.GREEN);
		
		lblOutput = new JLabel("��ȯ�� ���� (mile) ");
		lblOutput.setFont(myfont);
		txtOutput = new JTextField(10); // ���ڴ� �ؽ�Ʈ �ʵ��� ����� ��. ���ڼ�
		txtOutput.setFont(myfont);
		
		panel2.add(lblOutput);
		panel2.add(txtOutput);
		frame.add(panel2,BorderLayout.CENTER);
	}
	public void compute() {
		panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		panel3.setBackground(Color.CYAN);
		
		btnCompute = new JButton("���");
		btnCompute.setFont(myfont);
		
		
		panel3.add(btnCompute);
		frame.add(panel3,BorderLayout.SOUTH);
		
		// �̺�Ʈ ó��
		btnCompute.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 1������ -> 1.6km
				if(e.getSource() == btnCompute) {
					// ���� �����ϴ��ĸ� ����
					if(txtInput.getText().equals("")) {
						System.out.println("���� �Է��ϼ���");
						// ��ȭ����(��ȭ���ڰ� �ߴ� ��ġ, ����, Ÿ��Ʋ, xǥ��)
						JOptionPane.showMessageDialog(frame, "���� �Է��ϼ���", "���", JOptionPane.ERROR_MESSAGE);
					} else {	
					// �Էµ� ���ڿ� �����͸� �Ǽ��� ĳ����
					double km = Double.parseDouble(txtInput.getText());
					// ������� ���ڿ���
					txtOutput.setText(String.valueOf(km/1.6));
					//String mile = Double.toString(km/1.6); // ���� § �ڵ�
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



















