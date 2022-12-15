package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> studnetMap = new HashMap<Integer, String>();
		
		// 값 추가(키 값 중복 불가) 키 값이 같으면 마지막값이 들어감, 키 값이 다르면 중복값이 들어갈 수 있다
		studnetMap.put(20, "김준일");
		studnetMap.put(10, "김준이");
		studnetMap.put(22, "김준삼");
		studnetMap.put(33, "김준사");
		studnetMap.put(44, "김준오");
		
		System.out.println(studnetMap);
		
		// key로 값 가져오기
		System.out.println(studnetMap.get(10)); // 0번 키 값(인덱스번호X)
		
		// 수정
		studnetMap.put(10, "김준육"); //put으로 덮어쓰기(별로 안좋음) put은 key 값이 없을때 값을 추가가 됨
		studnetMap.replace(10, "김준칠");
		
		
		//삭제
		studnetMap.remove(10);
		
		Iterator<Integer> iterator = studnetMap.keySet().iterator(); //keySet: Set형태로 리턴
		while(iterator.hasNext()) {
			Integer key = iterator.next(); //키값을 변수 key에 담는다
			String value = studnetMap.get(key);	//key변수 값에 있는 값을 value에 담는다
//			if(value.equals("김준오")) {
//				System.out.println(studnetMap.get(key));
//			}
			System.out.println(value);
		}
		
		//람다식(함수형 프로그래밍)
		studnetMap.forEach((k, v) ->{
			System.out.println("key: " + k);
			System.out.println("value: " + v);
		});
		
		//값 찾기
		System.out.println(studnetMap.containsKey(22));
		System.out.println(studnetMap.containsValue("김준구"));
		
	}

}
