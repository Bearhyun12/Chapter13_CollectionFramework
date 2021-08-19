package ch13_1_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		/**
		 *  키(key) 객체, 값(Value)객체로 구성된 Map,Entry 객체를 저장하는 구조
		 *   : Entry는 Map 인터페이스 내부에 선언 된 중첩 인터페이스
		 *   
		 *   - 키(Key)는 중복 저장 될 수 없지만 값은 중복 저장 가능
		 */
		
		// 이름과 점수를 저장하는 자료 구조
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("신용권", new Integer(85));
		map.put("홍길동", 90);
		map.put("장길산", 80);
		
		//키가 같으므로 마지막 저장 값으로 대체 (홍길동(Key)은 같은데 점수가 다른상황 -> 95로 오버라이드)
		map.put("홍길동", 65);
		System.out.println("총 Entry 수 : " + map.size());
		
		//객체 찾기
		System.out.println("\t홍길동 " + map.get("홍길동"));
		System.out.println("key존재 여부: " + map.containsKey("장길산"));
		System.out.println("============================================================");
		
		//[객체 루핑 및 처리]
		
		
		
		
		// 1. Set<Key> 이용,       여기서 Set은 '주머니' 같은 역할을 한다 
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
		System.out.println("\t" + key + " : " + value);
		
		}
		keyIterator = keySet.iterator();
		System.out.println("======================================================================");
	
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());

		
		// 2. Set<Map.Entry> 이용
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		entryIterator = entrySet.iterator();
			System.out.println();
			
			//객체 전체 삭제
			map.clear();
			System.out.println("총 Entry 수: " + map.size());
	}
	
}
