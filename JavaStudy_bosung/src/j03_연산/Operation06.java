package j03_연산;

public class Operation06 {

	public static void main(String[] args) {
		/*
		 * 
		 * 삼항연산자
		 * (조건식) ? 참일 때의 값 : 거짓일 때의 값
		 * 삼항연산자의 자료형은 동일하게 사용해야한다.
		 * 
		 */
		
		int num = 80;
		
		String result = num % 4 == 0 ? "4의 배수" : "4의 배수가 아님";
		boolean result2 = num % 4 == 0 ? true : false;
		int result3 = num % 4 == 0 ? 1 : 0; 
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		
	}

}




















