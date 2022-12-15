package j04_입력;

import java.util.Scanner; // Scanner 클래스 호출

/*
 * 1.기본적인 데이터 타입들을 Scanner 의 메소드를 사용하여 입력받을 수 있다.
 * String(문자열)로 입력받고 싶으면 next() 나 nextLine() 을, int(정수)로 입력받고 싶다면 nextInt() 를 사용하여 입력받으면 알아서 해당 타입으로 입력된다.
 * 
 * 	2. Scanner 을 사용할 시 util 패키지를 경로의 Scanner 클래스를 호출해야 한다.
 * 	자바에서 쓰이는 대부분의 클래스는 lang 패키지가 아니라면 import 을 통해 호출해주어야 한다.
 * 	Scanner 의 경우는 java.util 패키지에 있다.
 * 
 * 	3. 공백(띄어쓰기) 또는 개행(줄 바꿈)을 기준으로 읽는다.
 * 	Scanner 의 입력 메소드들은 대부분 공백과 개행(' ', '\t', '\r', '\n' 등등..)을 기준으로 읽는다. 이 덕분에 사용자의 편의에 따라 쉽게 입력을 받을 수 있다.
 */

public class Input01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
		
		
		System.out.print("첫번째 값 입력: "); // 입력을 받을때는 println이 아니라 print
		int num1 = scanner.nextInt();
		System.out.print("두번째 값 입력: ");
		int num2 = scanner.nextInt();
		
		System.out.println("입력한 값: " + num1);
		System.out.println("두값을 더한 값: " + (num1 + num2));
		
		scanner.next();				//문자열(String)
		scanner.nextLine();			//문자열(String)
		scanner.next().charAt(0);	//문자(char)
		scanner.nextInt();			//정수(int)
		scanner.nextDouble();		//실수(double)
		
		
		/*
		 * 숙제: 스캐너 이용해서 윤년 만들어보기
		 */
		
//		System.out.print("년도 입력: ");
//		int year = scanner.nextInt();
//		
//		String result = null;
//		result = year % 4 == 0 
//				&& year % 100 != 0 
//				|| year % 400 == 0 ? "윤년" : "윤년이 아님";
//		
//		System.out.println(result);
		
		
		
	}

}
