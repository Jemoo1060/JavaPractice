class Book{
	private int poem;
	private int comic;
	private int magazine;
	
	// 생성자가 없으면 자동으로 밑의 예시와 같은 생성자(기본생성자)를 생성
	// default constructor
	// 일반 생성자가 하나라도 있으면 기본 생성자 생성하지 않음.
	// 그래서 필요하다면 기본생성자는 직접 정의하여야 함.
	
	//생성자 오버로딩
	public Book() {
		// TODO Auto-generated constructor stub
		//poem = 0;
		//comic = 0;
		//magazine = 0;
		//setBook(0,0,0);
		this(0,0,0);
	}
	
	public Book(int poem) {
		// TODO Auto-generated constructor stub
		//this.poem = poem;
		//comic = 1;
		//magazine = 1;
		//setBook(poem,1,1);
		this(poem,1,1);
	}
	public Book(int poem, int comic) {
		// TODO Auto-generated constructor stub
		//this.poem = poem;
		//this.comic = comic;
		//magazine = 1;
		//setBook(poem,comic,1);
		this(poem,comic,1); // 생성자가 다른 생성자를 호출할 때: this();
	}
	
	// 일반생성자(매개 변수가 있는것)
	public Book(int poem, int comic, int magazine) {
		this.poem = poem;
		this.comic = comic;
		this.magazine = magazine;
		//setBook(poem,comic,magazine);
	}
	/*
	// 설정자(setter) 
	public void setBook(int poem, int comic, int magazine) {
		this.poem = poem;
		this.comic = comic;
		this.magazine = magazine;
	}
	*/
	public int totalBook() {
		return poem + comic + magazine;
	}
}
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book my = new Book();
		Book my1 = new Book(10);
		Book my2 = new Book(10,20);
		Book my3 = new Book(10,20,30);
		System.out.println(my.totalBook());
		System.out.println(my1.totalBook());
		System.out.println(my2.totalBook());
		System.out.println(my3.totalBook());
	}

}
