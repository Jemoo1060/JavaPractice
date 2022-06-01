class Test{
	int[][] player;
	
	// ntest: 테스트 개수, nplayer: 선수번호
	public double getScore(int ntest, int nplayer) {
		int total = 0;
		for(int test = 0; test < ntest; test++) {
			total += player[nplayer][test];
		}
		return (double)total / ntest;
	}
	public void displayTest() {
		for(int count = 0; count < player.length; count++) {
		System.out.printf("선수%d ",count+1);
		double average = getScore(player[count].length, count);
		System.out.printf("%5.2f", average);
		for(int i =0; i < player[count].length; i++) {
			System.out.printf("%5d",player[count][i]);
		}
		System.out.println();
		}
	}
}
public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test my = new Test();
		int[][] t = {{10,9,7,7},{8,6},{10,9,9}}; 
		my.player = t;
		my.displayTest();
	}

}
