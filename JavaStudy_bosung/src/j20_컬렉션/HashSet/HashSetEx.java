package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> name = new HashSet<String>(); 
		
		//값을 중복하지 않고, 순서가 없다
		name.add("김준일");
		name.add("김준이");
		name.add("김준삼");
		name.add("김준사");
		name.add("김준일");
		name.add("김준일");
		
		//HashSet에서 자료 출력하는 방법
		Iterator<String> iterator = name.iterator(); //iterator를 사용할려면 <>안에 동일 자료형을 넣어줘야한다 (iterator는 한번만 사용할 수 있다)
		while (iterator.hasNext()) {				 //다음 값이 있는지 확인
			String name2 = iterator.next();			 //iterator값을 name2에 담는다
			if(name2.equals("김준이")) {			 //name2의 값이랑 내가 찾는 값이랑 같은지 확인
				System.out.println(name2);			 //맞으면 출력 아니면 다음 반복으로
			}
		}
		
		//삭제
		name.remove("김준사");  //remove는 바로 값을 넣어서 사용
		System.out.println(name);
		
		//HashSet에서의 수정은 값을 삭제하고 추가해야한다
		name.remove("김준이");
		name.add("김준오");
		System.out.println(name);
	}

}
