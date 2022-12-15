package j03_연산;

public class Operation01 {

	public static void main(String[] args) {
		int num = 10;
		
		num = num + 1;
		
		/*
		 * ++num, --num : 선증가,감소 -> 실행전 1을 증가
		 * System.out.println(++num);	12
		 * System.out.println(num);		12
		 * 
		 * 
		 * num++, num-- : 후증가,감소 -> 다음번에 num을 실행할때 1이 증가 또는 감소된 상태로 실행
		 * System.out.println(num++);	11	
		 * System.out.println(num);		12
		 * 
		 */
		
		System.out.println(num++);
		System.out.println(num);
		
		System.out.println(--num);
		System.out.println(num--);
		System.out.println(num);
	}

}
