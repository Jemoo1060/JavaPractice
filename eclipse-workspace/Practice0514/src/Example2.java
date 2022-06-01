
interface Mylist {
	int MAX = 10;
	void insert(int number); // 삽입
	int delete(); // 삭제
	void display();
}
class DataList{
	int[] data;
	int count; // 현재 항목 개수
	
	public DataList(int[] data) {
		// TODO Auto-generated constructor stub
		this.data  = data;
	}
	public void display() {
		System.out.print("List = [");
		for(int index = 0; index < count; index++) {
			System.out.printf("%d", data[index]);
			if(index < count-1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
}
class StackList extends DataList implements Mylist{
	
	public StackList(int[] data) {
		// TODO Auto-generated constructor stub
		super(data);
	}
	// 스택의 push 연산
	@Override
	public void insert(int number) {
		// TODO Auto-generated method stub
		if(count == MAX)
			System.out.println("overflow No push");
		else {
			System.out.printf(" push Item: %d\n", number);
		data[count] = number;
		count++;
		}
	}
	// 스택의 pop 연산
	@Override
	public int delete() {
		// TODO Auto-generated method stub
		int item = -999999;
		
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
class QueueList extends DataList implements Mylist{
	
	public QueueList(int[] data) {
		// TODO Auto-generated constructor stub
		super(data);
	}
	// 큐 삽입 연산
	@Override
	public void insert(int number) {
		// TODO Auto-generated method stub
		if(count == MAX)
			System.out.println(" No Insert");
		else {
			System.out.printf(" Insert Item: %d\n", number);
			data[count] = number;
			count++;
		} 
	}
	// 큐 삭제 연산
	@Override
	public int delete() {
		// TODO Auto-generated method stub
		int item = -1;
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
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	public static void test1() {
		int[] data = new int[Mylist.MAX];
		StackList myStack = new StackList(data);
		myStack.display();
		myStack.insert(10);
		myStack.insert(20);
		myStack.insert(30);
		myStack.insert(40);
		myStack.display();
		System.out.println(myStack.delete());
		System.out.println(myStack.delete());
		myStack.display();
		}
	public static void test2() {
		int[] data = new int[Mylist.MAX];
		QueueList myQueue = new QueueList(data);
		myQueue.display();
		myQueue.insert(10);
		myQueue.insert(20);
		myQueue.insert(30);
		myQueue.insert(40);
		myQueue.display();
		System.out.println(myQueue.delete());
		System.out.println(myQueue.delete());
		myQueue.display();
	}
	public static void test3() {
		int[] data = new int[Mylist.MAX];
		Mylist[] list = {new StackList(data),new QueueList(data)};
		
		for(int index = 0; index < list.length; index++) {
			if(list[index] instanceof StackList)
				System.out.println("Stack Example");
			else if(list[index] instanceof QueueList)
				System.out.println("Queue Example");
			list[index].display();
			list[index].insert(10);
			list[index].insert(20);
			list[index].insert(30);
			list[index].insert(40);
			list[index].display();
			System.out.println(list[index].delete());
			System.out.println(list[index].delete());
			list[index].display();
			System.out.println();
		}
	}
}




































