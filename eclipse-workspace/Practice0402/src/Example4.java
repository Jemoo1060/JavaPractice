
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a: "+args[0]); // cmd 사용해서 출력 
		System.out.println("b: "+args[1]); // cmd 쓰기 싫으면 RUN >> cover confi >> argument에 args 입력
		String total = args[0] + args[1]; // args는 문자열
		System.out.println(total); 
		
		//문자열을 정수로 변환
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println(a+b);
		
		double c =Double.parseDouble(args[2]);
	}

}
