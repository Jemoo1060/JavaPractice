import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();

	}
	public static void test1() {
		// ���� �迭 : ũ�Ⱑ ����
		String[] a = {"ȫ�浿", "�迬��", "������"};
		// a.length : ����
		// a[index] : �� ����
		
		
		// ���� �迭 : ����Ʈ�� ���̰� ������
		ArrayList<String> data = new ArrayList<>();
		// data.size() : ����
		// data.get(index) : �� ����
		data.add("�迬��");
		data.add("������");
		data.add("ȫ�浿");
		
		for(int index = 0; index < data.size(); index++ ) {
			System.out.println(data.get(index));
		}
		// Iterator(���ͷ�����) : �÷��Ǳ����� ����� ��Ҹ� �о���� ���
		Iterator<String> iter = data.iterator();
		while(iter.hasNext()) { // ���� �����Ͱ� ������ ���� ����
			System.out.println(iter.next()); // ���� ��Ҹ� ��ȯ
		}			
	}
	public static void test2() {
		// Map �������̽�
		// ��(Ű ,��)���� �����͸� ������ �÷��� �ڷ� ����
		// {"�̸�":"ȫ�浿","����": "25", "�ּ�":"����"} -> ����
		// keyset : ("�̸�","����","�ּ�")
		// valuseset : ("ȫ�浿","25","����") 
		// Ű�� �ش��ϴ� �� : get(key)
		// Ű�� �ߺ��� �� ����
		
		HashMap<String, String> map = new HashMap<>();
		// ��Ʈ�� Ÿ���� Ű�� String Ÿ���� ���� �����ϴ� Map
		// ���� �߰�
		map.put("1","one");
		map.put("2","two");
		map.put("3", "three");
		// { "1" : "one" , "2" : "two" , "3" : "three" }
		
		System.out.println(map);
		System.out.println(map.get("2"));
		System.out.println(map.get("4"));
		
		System.out.println(map.entrySet()); // ��ü map �ڷ� []�������� ���
		System.out.println(map.keySet()); // map���� Ű�� ���
		
		for(String k : map.keySet()) {
			System.out.println(k);
		}
		
		for(String v : map.values()) {
			System.out.println(v);
		}
		
		System.out.println();
		
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(key);
			System.out.println(map.get(key));
		}
	}
}




























