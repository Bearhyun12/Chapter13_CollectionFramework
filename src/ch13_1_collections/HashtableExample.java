package ch13_1_collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>();
	/**
	 * [HashTable] implemets Map
	 * 
	 * HashMap과 동일한 내부구조
	 * - 동기화(synchronized) 된 메소드로 구성
	 *  : 하나의 스레드가 실행 완료해야만 다른 스레드 접근 가능
	 */
	map.put("spring", "12");
	map.put("summer", "123");
	map.put("fall", "1234");
	map.put("winter", "12345");
	
	Scanner scanner = new Scanner(System.in);
	
	while(true) {
		System.out.println("아이디와 비밀번호를 입력해주세요");
		
		System.out.print("아이디: ");
		String id = scanner.nextLine().trim(); // trim() 공백제거
		
		System.out.print("비밀번호: ");
		String password = scanner.nextLine().trim();
		System.out.println();
		
		// ID가 없다면...
		if(!map.containsKey(id)) { //map에 key가 담겨있니?
			System.out.println("입력하신 ID가 존재하지 않습니다 " + "다시 입력해주세요.");
		}
		// ID가 있다면...	
		else {
			//비번 불일치
			if (!map.get(id).equals(password)) {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		
	        //비번 일치
			else { 
			System.out.println("로그인 되었습니다.");
			break;
		
			}
		}
	}
	scanner.close();
	}
}
    
