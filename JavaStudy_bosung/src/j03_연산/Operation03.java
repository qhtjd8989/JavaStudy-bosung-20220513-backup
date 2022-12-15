package j03_연산;

public class Operation03 {

	public static void main(String[] args) {
		/*
		 * 문제1
		 * 
		 * year = 1999
		 * result = 결과
		 * 년도가 4의 배수이면 True 아니면 False
		 * 
		 * 문제2
		 * 윤년 -> 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때
		 * 윤년이면 true 아니면 false
		 * 
		 */
		
		int year = 2000;
		
		//문제1
		boolean result = year % 4 == 0;
		
		System.out.println(result);
		
		//문제2
		boolean result2 = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
		
		System.out.println(result2);
		
						
		
	}

}




















