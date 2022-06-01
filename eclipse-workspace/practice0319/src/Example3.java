import java.util.Scanner;

class Pass {
	int pass;
	int failure;
	
	public void determine(int score) {
		if(score>=80) {
			pass++;
		}else {
			failure++;
		}
	}
	
	public void display() {
		System.out.printf("합격: %d, 불합격: %d\n", pass,failure);
	}
}


public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		test4();
	}
	
	public static void test1() {
		// 반복
		int count = 1; // 반복 초기값
		while(true){// 조건이 참일 경우 반복 수행
			//무한반복
			System.out.println("hello"+count);
			
			if(count == 10)
				break; // 현재의 블록을 벗어남 
			
			count++; // 증감
			// count = count + 1;
			// count += 1;
		}  
	}
	public static void test2() {
		// 계수반복
		int count = 1;
		while(count <= 10) { //조건이 참인 동안 반복
			System.out.println("korea"+count);
			count++;
		}
	}
	public static void test3() {
		Pass my = new Pass();
		Scanner input = new Scanner(System.in);
		
		int count = 1;
		while(count <=10) {
			System.out.print("점수: ");
			int score = input.nextInt();
			my.determine(score);
			count++;
		}
		my.display();
	}
	
	public static void test4() {
		int count =1;
		int total =0;
		while(count <= 10) {
			total += count; // total = total + count;
			count++;
		}
		System.out.print("total: "+ total);		
	}
}


