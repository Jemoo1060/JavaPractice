
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main �޼����� �Ű����� �� ��ü(String[] args)
		// String[] args: String�� ��ҷ��ϴ� ��ü�迭
		// ������ �Ű������� ���޵Ǵ� �����ʹ� ������� �μ�
		// ����࿡�� �ڹ��ڵ带 �����ϴ� ���
		// ���������Ʈ(cmd)���� �ش� �ڹ�������Ʈ�� bin��ġ�� �̵�
		// ��) ���������Ʈ �󿡼� cd C:\Java\eclipse-workspace\Practice0402\bin
		// java Example5(����Ŭ�����̸�) �μ�1(args[0]) �μ�2(args[1])....
		// �μ����� ���� �޼����� args �迭�� ����
		// args[0] -> �μ�1 args[1] -> �μ�2�� ��
		// �� ���޵Ǵ� �μ����� ��� ���ڿ��� ���޵�
		// �ʿ信 ���� ����,�Ǽ��� ����ȯ�� �ʿ�
		// Wrapper Ŭ������ �޼��带 Ȱ���Ͽ� ��ȯ
		// Wrapper Ŭ����: �⺻�ڷ���(int, double)�� Ŭ������ �����
		// int -> Integer, double -> Double, char -> Character,....
		// Wrepper Ŭ������ �޼���� ��κ� static �޼���� ���ǵ�
		// �� �޼������ ��ü �������� Ŭ���� �̸����� �޼��带 ȣ���� �� ����
		// ��) String m = "100";
		// ��) int a = Integer.parseInt(m);
		
		// �ܺο��� ���� �����Ͽ� ����ϴ� ��Ģ ����
		// ���� ��) java Example5 10 + 20
		
		if(args.length != 3) {
			System.out.println("������ ���� �ʽ��ϴ�");
			System.exit(1);
		}
		
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[2]);
		
		switch(args[1]) {
		case "+":
			System.out.printf("���: %d\n",number1+number2);
			break;
		case "-":
			System.out.printf("���: %d\n",number1-number2);
			break;
		case "x":
			System.out.printf("���: %d\n",number1*number2);
			break;
		case "/":
			System.out.printf("���: %d\n",number1/number2);
			break;
		default:
			System.out.println("������ �߸� �Է�");
		}
	}

}
