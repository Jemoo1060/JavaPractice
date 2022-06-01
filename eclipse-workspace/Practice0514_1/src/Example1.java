class Point{
	int x,y;
	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("(%d, %d)", x,y);
	}
}
interface Mylist<T> {
	int MAX = 10;
	void insert(T value); // 삽입
	T delete(); // 삭제
	void display();
}
class DataList<T>{
	T[] data;
	int count; // 현재 항목 개수
	
	public DataList(T[] data) {
		// TODO Auto-generated constructor stub
		this.data  = data;
	}
	public void display() {
		System.out.print("List = [");
		for(int index = 0; index < count; index++) {
			System.out.print(data[index]);
			if(index < count-1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
}
class StackList<T>extends DataList<T> implements Mylist<T>{
	
	public StackList(T[] data) {
		// TODO Auto-generated constructor stub
		super(data);
	}
	// 스택의 push 연산
	@Override
	public void insert(T value) {
		// TODO Auto-generated method stub
		if(count == MAX)
			System.out.println("overflow No push");
		else {
			System.out.println(" push Item: " + value);
		data[count] = value;
		count++;
		}
	}
	// 스택의 pop 연산
	@Override
	public T delete() {
		// TODO Auto-generated method stub
		T item = null;
		
		if(count == 0)
			System.out.println("underfolw No pop");
		else {
			System.out.print("pop item: ");
			item = data[count-1];
			count--;
		}
		return item;
	}
}
class QueueList<T> extends DataList<T> implements Mylist<T>{
	
	public QueueList(T[] data) {
		// TODO Auto-generated constructor stub
		super(data);
	}
	// 큐 삽입 연산
	@Override
	public void insert(T value) {
		// TODO Auto-generated method stub
		if(count == MAX)
			System.out.println(" No Insert");
		else {
			System.out.println(" Insert Item: "+ value);
			data[count] = value;
			count++;
		} 
	}
	// 큐 삭제 연산
	@Override
	public T delete() {
		// TODO Auto-generated method stub
		T item = null;
		if(count == 0)
			System.out.println("No Delete");
		else {
			System.out.print("Delete Item: ");
			item = data[0];
			for(int index = 1; index < count; index++ ) {
				data[index-1] = data[index];
			}
			count--;
		}
		return item;
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	public static void test1() {
		Integer[] data = new Integer[Mylist.MAX];
		StackList<Integer> myStack = new StackList<>(data);
		myStack.display();
		myStack.insert(10);
		myStack.insert(20);
		myStack.insert(30);
		myStack.insert(40);
		myStack.display();
		System.out.println(myStack.delete());
		System.out.println(myStack.delete());
		myStack.display();
		System.out.println();
		}
	public static void test2() {
		String[] data = new String[Mylist.MAX];
		QueueList<String> myQueue = new QueueList<>(data);
		myQueue.display();
		myQueue.insert("A");
		myQueue.insert("B");
		myQueue.insert("C");
		myQueue.insert("D");
		myQueue.display();
		System.out.println(myQueue.delete());
		System.out.println(myQueue.delete());
		myQueue.display();
	}
	public static void test3() {
		Point pt1 = new Point(10, 20);
		Point pt2 = new Point(30, 40);
		Point pt3 = new Point(50, 60);
		Point pt4 = new Point(70, 80);
		
		Point[] data = new Point[Mylist.MAX];
		StackList<Point> myStack = new StackList<>(data);
		myStack.display();
		myStack.insert(pt1);
		myStack.insert(pt2);
		myStack.insert(pt3);
		myStack.insert(pt4);
		myStack.display();
		System.out.println(myStack.delete());
		System.out.println(myStack.delete());
		myStack.display();
	}
}






















