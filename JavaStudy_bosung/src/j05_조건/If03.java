package j05_조건;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		/*
		 * 문제
		 * 점수입력받아 성적 출력해보기
		 * 0보다 작거나 100보다 크면 계산 할 수 없는 점수 입니다.
		 */
		int score = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		score = scanner.nextInt();
		
		
		
		if(score > 100 || score < 0) {
			 System.out.println("계산 할 수 없는 점수 입니다.");
		}else if(score > 89) {	
			System.out.println("A");
		}else if(score > 79) {
			System.out.println("B");
		}else if(score > 69) {
			System.out.println("C");
		}else if(score > 59) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
		
	}

}
