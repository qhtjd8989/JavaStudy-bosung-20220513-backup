package j03_연산;

public class Operation08 {

	public static void main(String[] args) {
		
		/*
		 * 복습
		 * 
		 * num = 10
		 *
		 * num이 짝수면 짝수, 홀수면 홀수를 출력하는 프로그램을 작성.
		 * 
		 */
		
		int num = 11;
		String result = null;
		result = num % 2 == 0 ? "짝수" : "홀수";
		
		System.out.println(result);
//		System.out.println(num % 2 == 0 ? "짝수" : "홀수"); 
	}

}




















