package j07_메소드;

public class Method02 {
	
	//매개변수가 없으면서 반환도 없는 메소드
	public static void test1() {
		System.out.println("test1 메소드 실행");
	}
	
	//매개변수는 있고 반환이 없는 메소드
	public static void test2(int age, int year) { // 괄호안에 있는 것을 매개변수라 함
		System.out.println("나이: " + age);
		System.out.println("출생년도: " + year);
	}
	
	//매개변수가 없고 반환이 있는 메소드
	public static String test3() {
		return "최보성";
	}
	
	public static int test4() {
		return 10000;
	}
	
	// 매개변수도 있고 반환도 있는 메소드
	public static String test5(String name, int num) {
		return name + num;
	}
	
	// 리턴자료형이 void일 때 메소드를 강제로 탈출하는 방법
	public static void test6() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 6) {
				System.out.println("메소드 탈출");
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("메인함수 시작");
		test1(); //호출
		test2(29, 1994);
		
		String name = test3();
		System.out.println(test3());
		System.out.println(name);
		
		System.out.println(test5("김준일", 1));
		
		test6();
		System.out.println("메인함수 끝");
		
	}
}
