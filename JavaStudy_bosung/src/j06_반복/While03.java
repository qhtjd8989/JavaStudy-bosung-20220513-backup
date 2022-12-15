package j06_반복;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		/*
		 * 반복 횟수를 입력하세요: 5
		 */
		
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int a = 0;
		
		System.out.print("반복 횟수를 입력하세요: ");
		num = scanner.nextInt();
		
		while(a < num) {
			System.out.println((a + 1));
			a++;
		}
		
		a = 0;
		
		while(a < num) {
			System.out.println(num-1);
			a++;
		}
		

	}

}
