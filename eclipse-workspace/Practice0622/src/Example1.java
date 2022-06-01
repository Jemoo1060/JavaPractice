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
		// 정적 배열 : 크기가 고정
		String[] a = {"홍길동", "김연아", "박지성"};
		// a.length : 길이
		// a[index] : 값 접근
		
		
		// 동적 배열 : 리스트의 길이가 가변적
		ArrayList<String> data = new ArrayList<>();
		// data.size() : 길이
		// data.get(index) : 값 접근
		data.add("김연아");
		data.add("박지성");
		data.add("홍길동");
		
		for(int index = 0; index < data.size(); index++ ) {
			System.out.println(data.get(index));
		}
		// Iterator(이터레이터) : 컬렉션구조에 저장된 요소를 읽어오는 방법
		Iterator<String> iter = data.iterator();
		while(iter.hasNext()) { // 다음 데이터가 있으면 접근 수행
			System.out.println(iter.next()); // 접근 요소를 반환
		}			
	}
	public static void test2() {
		// Map 인터페이스
		// 쌍(키 ,값)으로 데이터를 구성한 컬렉션 자료 구조
		// {"이름":"홍길동","나이": "25", "주소":"서울"} -> 집합
		// keyset : ("이름","나이","주소")
		// valuseset : ("홍길동","25","서울") 
		// 키에 해당하는 값 : get(key)
		// 키는 중복할 수 없음
		
		HashMap<String, String> map = new HashMap<>();
		// 스트링 타입의 키와 String 타입의 값을 저장하는 Map
		// 값을 추가
		map.put("1","one");
		map.put("2","two");
		map.put("3", "three");
		// { "1" : "one" , "2" : "two" , "3" : "three" }
		
		System.out.println(map);
		System.out.println(map.get("2"));
		System.out.println(map.get("4"));
		
		System.out.println(map.entrySet()); // 전체 map 자료 []형식으로 출력
		System.out.println(map.keySet()); // map에서 키만 출력
		
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




























