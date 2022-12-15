package j06_반복;

import java.util.Scanner;

public class For02 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int n = 0;
		System.out.print("숫자입력: ");
		n = scanner.nextInt();
		
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i + 1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < n - i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (i * 2) +1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


























