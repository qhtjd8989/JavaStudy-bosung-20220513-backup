package j20_컬렉션.ArrayList;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> nameList2 = new ArrayList<String>();
		
		//리스트에 값 추가 -> add() 
		
		nameList.add("최보성1");
		nameList.add("최보성2");
		nameList.add("최보성3");
		nameList.add("최보성4");
		nameList.add("최보성5");
		nameList.add("최보성6");
		nameList.add("최보성7");
		
		//리스트 중간에 값 삽입 -> add(인덱스 번호, 값)
		nameList.add(0, "최보성8");
		
		//리스트 내의 해당 인덱스 값 수정
		nameList.set(1, "최보성9");
		
		//리스트 내에서 인덱스로 값 삭제
		nameList.remove(3);
		
		//리스트 내에서 값을 바로 삭제
		nameList.remove("최보성3");
		
		//리스트에서 다른 리스트로 값 옮기기(깊은복사)
		nameList2.addAll(nameList);
		
		//리스트 내의 모든 값 확인 -> toString()
		System.out.println(nameList);
		
		//리스트에서 값 가져오기 -> get(인덱스 번호)
		System.out.println(nameList.get(3));
		
		//리스트 내에서 원하는 값이 있는지 확인
		System.out.println(nameList.contains("최보성4"));
		System.out.println(nameList.contains("최보성6"));
		
		//리스트내에 값이 하나라도 있으면 비우기
		if(!nameList.isEmpty()) {
			nameList.clear();
		}
		System.out.println(nameList);
		
		System.out.println(nameList2);
		
		//리스트로 배열로 변환
		Object[] objs = nameList2.toArray();
		
		for(Object obj : objs) {
			System.out.println((String)obj);
		}
		
		
	}
}
