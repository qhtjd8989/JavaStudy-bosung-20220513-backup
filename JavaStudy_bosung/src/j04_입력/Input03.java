package j04_입력;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Input03 {

	public static void main(String[] args) {
		/*
		 * [개인정보 입력]
		 * 이름: 최보성
		 * 나이: 27
		 * 연락처: 010-3087-2758
		 * 주소: 부산 진구 연지동
		 * 성별: 남
		 * 
		 * 이름 => 최보성
		 * 나이 => 27
		 * 연락처 => 010-3087-2758
		 * 주소 => 부산 진구 연지동
		 * 성별 => 남
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String name = null;
		int age = 0;
		String phone = null;
		String address = null;
		char gender = ' ';
		
		scanner.next(); // 스페이스바를 통해서 값을 끝냄 Ex) (부산 진구 연지동)이 하나의 변수로 구성되면 전부 출력되고 여러개의 변수로 구성되면 부산에서 값을끝낸다
						// next의 경우 스페이스, 엔터를 무시하고 텍스트만 출력
		scanner.nextLine(); // nextLine은 스페이스, 엔터를 포함한다
		
		System.out.println("[개인정보 입력]");
		System.out.print("이름: ");		
		name = scanner.next();			// 최보성\n
		System.out.print("나이: ");		
		age = scanner.nextInt();		// 27\n
		System.out.print("연락처: ");	
		phone = scanner.next();			//010-3087-2758\n
		scanner.nextLine();				//해당 명령어만 사용하더라도 입력을 받는 행위이다.
		System.out.print("주소: ");		
		address = scanner.nextLine();
		System.out.print("성별: ");
		gender = scanner.next().charAt(0);
		
		System.out.println();
		
		System.out.println("이름 => " + name);
		System.out.println("나이 => " + age);
		System.out.println("연락처 => " + phone);
		System.out.println("주소 => " + address);
		System.out.println("성별 => " + gender);
		
		
		
	}

}
