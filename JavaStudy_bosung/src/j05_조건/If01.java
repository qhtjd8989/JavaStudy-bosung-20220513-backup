package j05_조건;

public class If01 {

	public static void main(String[] args) {
		int num = 4;
		
		System.out.println("프로그램 시작");
		
		if(num > 5) {									//if(조건문)  			중괄호 구역표시
			System.out.println("5보다 큽니다."); 		//조건문이 참일 때 실행
		}else if(num == 5) {							//조건문이 거짓일 때 실행   //5랑 같은지 확인
			System.out.println("5랑 같습니다.");		//참
		}else {										
			System.out.println("5보다 작습니다.");		//거짓								
		}
		
		System.out.println("프로그램 종료");
	}

}
