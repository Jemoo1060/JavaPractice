class Data{
	int[] number;  // �迭�� �Ӽ�
	int max;
	int min;
	
	public void getMax() {
		for(int i = 0; i<number.length; i++) {
			if( max < number[i] ) {
				max = number[i];
			}
		}
	}
	public void getMin() {
		min = number[0];
		for(int i = 1; i<number.length; i++) {
			if( min > number[i] ) {
				min = number[i];
			}
		}
		
	}
	public void displayData() {
		System.out.println("�ִ밪: "+max);
		System.out.println("�ּҰ�: "+min);
		
	}
	
}
public class Example4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	public static void test1() {
		// �ִ� �� ���ϱ�
		int[] number = {75, 67, 34, 87, 45, 25};
		int max = number[0];
		for(int i = 1; i<number.length; i++) {
			if( max < number[i] ) {
				max = number[i];
			}
		}
		System.out.println("�ִ밪: "+max);
	}
	public static void test2() {
		Data my = new Data();
		int[] a = {94, 67, 34, 87, 45, 25};
		my.number = a;
		//my.min = my.number[0];
		my.getMax();
		my.getMin();
		my.displayData();
	}

}
