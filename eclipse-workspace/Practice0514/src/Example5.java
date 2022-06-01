class PrinterMat {
	
}

class Powder extends PrinterMat{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "���: �Ŀ��";
	}
}
class Plastic extends PrinterMat{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "���: �ö�ƽ";
	}
}
class Glass{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "���: ����";
	}
}
class ThreeDPrinter1{
	private Powder material;
	
	public void setMatrial(Powder material) {
		this.material = material;
	}
	public Powder getMaterial() {
		return material;
	}
}

class ThreeDPrinter2{
	private Object material;
	
	public void setMatrial(Object material) {
		this.material = material;
	}
	public Object getMaterial() {
		return material;
	}
}
// PrinterMat �� ���� �͵鸸 T�� ���� ���ִ�. Glass ��� ����
class ThreeDPrinter<T extends PrinterMat>{
	private T material;
	
	public void setMatrial(T material) {
		this.material = material;
	}
	public T getMaterial() {
		return material;
	}
}
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		//test4();
		test5();
	}
	public static void test1() {
		ThreeDPrinter1 printer = new ThreeDPrinter1();
		printer.setMatrial(new Powder());
		System.out.println(printer.getMaterial());
	}
	public static void test2() {
		ThreeDPrinter2 printer = new ThreeDPrinter2();
		printer.setMatrial(new Powder());
		System.out.println(printer.getMaterial());
		
		printer.setMatrial(new Plastic());
		System.out.println(printer.getMaterial());
	}
	public static void test3() {
		ThreeDPrinter<Powder> printer1 = new ThreeDPrinter<>();
		printer1.setMatrial(new Powder());
		System.out.println(printer1.getMaterial());
		
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<>();
		printer2.setMatrial(new Plastic());
		System.out.println(printer2.getMaterial());
	}
	public static void test4() {
		
		ThreeDPrinter  printer = new ThreeDPrinter();
		printer.setMatrial(new Powder());
		System.out.println(printer.getMaterial());
		
		Powder ob = (Powder)printer.getMaterial();
		System.out.println(ob);
		
//		ThreeDPrinter<Object>  printer1 = new ThreeDPrinter<>();  // T�� ���Ѱɷ��� object �������� ������ ��� ����
//		printer1.setMatrial(new Powder());
//		System.out.println(printer.getMaterial());
	}
	public static void test5() {
		/*ThreeDPrinter<Glass> printer1 = new ThreeDPrinter<>();
		printer1.setMatrial(new Glass());
		System.out.println(printer1.getMaterial()); */ //�������� T�� ���ѵ�.
		
		ThreeDPrinter<Powder> printer1 = new ThreeDPrinter<>();
		printer1.setMatrial(new Powder());
		System.out.println(printer1.getMaterial());
	}
}








































