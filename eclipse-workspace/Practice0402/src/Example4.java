
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a: "+args[0]); // cmd ����ؼ� ��� 
		System.out.println("b: "+args[1]); // cmd ���� ������ RUN >> cover confi >> argument�� args �Է�
		String total = args[0] + args[1]; // args�� ���ڿ�
		System.out.println(total); 
		
		//���ڿ��� ������ ��ȯ
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println(a+b);
		
		double c =Double.parseDouble(args[2]);
	}

}
