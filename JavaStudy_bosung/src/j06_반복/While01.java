package j06_반복;

public class While01 {

	public static void main(String[] args) {
		
		/*
		 * while(조건식) {
		 *	  실행문;
		 *	}
		 */
		int i = 0;
		int result = 0;
		
		while(i < 100) {
			//i += 1; 복합대입연산
			result = result + (i + 1);
			i++; // 반복문에선 후증가를 많이사용, 조건 변화 수식
			System.out.println(result);
		}
		

	}

}
