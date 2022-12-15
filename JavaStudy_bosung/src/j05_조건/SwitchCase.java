package j05_조건;

public class SwitchCase {

	public static void main(String[] args) {
		/*
		 * 스위치케이스
		 * 기준이 되는 곳에서 하위항목을 전부 실행
		 * break: 해당위치에서 하위항목을 실행하지 않고 끝냄
		 * default: 해당되는 항목이 없으면 실행 default를 사용할 때에는 바로 위의 항목에 break를 걸어준다
		 */
		
		
		
		int num = 2;
		char c = 'c';
		String str = "박준형";
		
		switch(num) { // 스위치 조건문안에 수식을 넣을 수 있다.
			case 1:
				System.out.println("case 1");
				break;
			case 2:
				System.out.println("case 2");
				break;
			case 3:
				System.out.println("case 3");
				break;
			default:
				System.out.println("찾을 수 없음");
		}
		
		switch(c) {
			case 'a':
				System.out.println("case a");
				break;
			case 'b':
				System.out.println("case b");
				break;
			case 'c':
				System.out.println("case c");
				break;
			default:
				System.out.println("찾을 수 없음");
		}
		
		switch(str) {
			case "김준일":
				System.out.println("case 김준일");
				break;
			case "박준형":
				System.out.println("case 박준형");
				break;
			case "한재안":
				System.out.println("case 한재안");
				break;
			default:
				System.out.println("찾을 수 없음");
		}
		
	}

}
