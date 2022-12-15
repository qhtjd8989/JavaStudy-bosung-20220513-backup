package j02_변수와_상수;

public class MaxMin {

	public static void main(String[] args) {
		
//		final int MAX_NUMBER = 100; 선언과 초기화
		
		final int MAX_NUMBER; // MAX값 선언     // 상수가 둘 이상의 단어가 합쳐진 변수명이면  _로 구분한다 (상수는 대문자로 표기)
		MAX_NUMBER = 100;	  // MAX값 초기화
		final int MIN_NUMBER;
		MIN_NUMBER = 0;
		
		final double PI = 3.14;
		
//		MAX = 1000;
//		MIN = 100;
//		
//		System.out.println("최대값: " + MAX);
//		System.out.println("최소값: " + MIN);
		
		System.out.println(MAX_NUMBER);
		System.out.println(MIN_NUMBER);

	}

}
