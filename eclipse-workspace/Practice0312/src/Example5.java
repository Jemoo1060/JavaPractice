import java.util.Scanner;

class Exchange{
	int kmoney;
	double umoney,jmoney;
	
	void computeExchange() {
		umoney = kmoney*0.88; 
		jmoney = kmoney*96.03;
	}
	
	
	void display() {
		//1000원 -> 0.88달러, 96.03엔
		System.out.printf("USD = %.1f달러\n", umoney);
		System.out.printf("JPY = %.1f엔\n", jmoney);
	}
}



public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	public static void test1() {
		Exchange money = new Exchange();
		Scanner input = new Scanner(System.in);
		
		System.out.print("원화(천원)를 입력하세요.");
		money.kmoney = input.nextInt();
		money.computeExchange();
		money.display();
	}

}
