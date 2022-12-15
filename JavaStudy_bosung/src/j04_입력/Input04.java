package j04_입력;

import java.util.Scanner;

public class Input04 {

	public static void main(String[] args) {
		
		/*
		 * next, nextLine 연습
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String a = null;
		String b = null;
		String c = null;
		String d = null;
		String e = null;
		String f = null;
		String g = null;
		
		
		
		System.out.print("개요: ");
		a = scanner.nextLine();
		System.out.print("감독: ");
		b = scanner.nextLine();
		System.out.print("등급: ");
		c = scanner.nextLine();
		System.out.print("흥행: ");
		d = scanner.nextLine();
		System.out.print("줄거리: ");
		e = scanner.nextLine();
		
		f = scanner.nextLine();
		g = scanner.nextLine();
		
		
		
		System.out.println("개요: " +  a);
		System.out.println("감독: " +  b);
		System.out.println("출연: " +  c);
		System.out.println("등급: " +  d);
		System.out.println("줄거리: " + e);
		System.out.println(f);
		System.out.println(g);
		
		
	}

}
