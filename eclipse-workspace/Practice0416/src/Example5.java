class Book{
	private int poem;
	private int comic;
	private int magazine;
	
	// �����ڰ� ������ �ڵ����� ���� ���ÿ� ���� ������(�⺻������)�� ����
	// default constructor
	// �Ϲ� �����ڰ� �ϳ��� ������ �⺻ ������ �������� ����.
	// �׷��� �ʿ��ϴٸ� �⺻�����ڴ� ���� �����Ͽ��� ��.
	
	//������ �����ε�
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
		this(poem,comic,1); // �����ڰ� �ٸ� �����ڸ� ȣ���� ��: this();
	}
	
	// �Ϲݻ�����(�Ű� ������ �ִ°�)
	public Book(int poem, int comic, int magazine) {
		this.poem = poem;
		this.comic = comic;
		this.magazine = magazine;
		//setBook(poem,comic,magazine);
	}
	/*
	// ������(setter) 
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
