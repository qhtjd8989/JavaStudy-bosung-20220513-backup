package j06_반복;

public class Continue {

	public static void main(String[] args) {
		/*
		 * continue: 다음 반복으로 진행
		 * break: 반복 멈춤
		 */
		
		
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
