package j02_변수와_상수;

public class MyInfo {

	public static void main(String[] args) {
		//주석
		/*
		 * 메모, 필기
		 * 
		 * 문제1.
		 * 
		 * name1 , name2, name3
		 * age(나이)
		 * phone(연락처)
		 * address(주소)
		 * 
		 * 이름:
		 * 나이:
		 * 연락처:
		 * 주소:
		 * 
		 */
		
		char name1 = '최';
		char name2 = '보';
		char name3 = '성';
		int age = 27;
		String phone = "010-3087-2758";
		String address = "부산 진구 연지동";
		
		
		System.out.println("이름: " + name1 + name2 + name3);
		System.out.println("나이: " + age);
		System.out.println("연락처: " + phone);
		System.out.println("주소: " + address);
		
		System.out.println("세수의 합: " + (10 + 20 + 30));
	}

}
