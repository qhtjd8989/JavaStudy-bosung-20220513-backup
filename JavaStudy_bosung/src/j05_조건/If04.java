package j05_조건;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		/*
		 * 문제
		 * 4분면 고르기
		 * 
		 */
		int x = 0;
		int y = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x축을 입력하세요: ");
		x = scanner.nextInt();
		System.out.print("y축을 입력하세요: ");
		y = scanner.nextInt();
		
//		if(x > 1000 || x < -1000 || y > 1000 || y < -100 ) {
//			System.out.println("계산 불가");
//		}else if(x == 0 && y == 0) {
//			 System.out.println("원점");
//		}else if(x > 0 && y > 0) {	
//			System.out.println("1사분면");
//		}else if(x < 0 && y > 0) {
//			System.out.println("2사분면");
//		}else if(x < 0 && y < 0) {
//			System.out.println("3사분면");
//		}else if(x > 0 && y < 0) {
//			System.out.println("4사분면");
//		}else if(x == 0 || y == 0){
//			System.out.println("계산 불가");
//		}
		
		
//		if(x > 1000 || x < -1000 || y > 1000 || y < -1000 ) {
//			System.out.println("계산 불가");
//		}else if(x == 0 && y == 0) {
//			 System.out.println("원점");
//		}else if(x == 0 || y == 0){
//			System.out.println("계산 불가");
//		}
//		else if(x > 0) {	
//			if(y > 0) {
//				System.out.println("1사분면");
//			}else {
//				System.out.println("4사분면");
//			}
//		}else if(x < 0) {
//			if(y > 0) {
//				System.out.println("2사분면");
//			}else {
//				System.out.println("3사분면");
//			}
//		}
		
		if((x > 1000 || x < -1000 || y > 1000 || y < -1000 || x == 0 || y == 0)
				&& (x != 0 || y != 0)) {
			System.out.println("계산 불가");
		}else if(x > 0 && y > 0) {	
			System.out.println("1사분면");
		}else if(x < 0 && y > 0) {
			System.out.println("2사분면");
		}else if(x < 0 && y < 0) {
			System.out.println("3사분면");
		}else if(x > 0 && y < 0) {
			System.out.println("4사분면");
		}else {
			System.out.println("원점");
		}
		
		// 삼항연산자로 사분면문제 풀기
		String result = (x > 1000 || x < -1000 || y > 1000 || y < -1000 || x == 0 || y == 0)
						&& (x != 0 || y != 0) ? "계산 불가" 
						: x > 0 && y > 0 ? "1사분면" 
						: x < 0 && y > 0 ? "2사분면"
						: x < 0 && y < 0 ? "3사분면"
						: x > 0 && y < 0 ? "4사분면" : "원점";
														
		System.out.println(result);
		
	}

}
