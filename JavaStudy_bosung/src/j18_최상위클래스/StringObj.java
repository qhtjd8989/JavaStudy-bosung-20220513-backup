package j18_최상위클래스;

import java.util.Scanner;

public class StringObj {

	public static void main(String[] args) {
		String name = "김준일"; // 리터럴주소
		String name2 = "김준일";
		
		System.out.println(name == name2);
		
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름1: ");
		name = scanner.nextLine();
		System.out.print("이름2: ");
		name2 = scanner.nextLine();
		
		System.out.println(name == name2);
		
		name = new String("김준일");
		name2 = new String("김준일");
		
		System.out.println(name == name2);
		System.out.println(name.equals((name2))); //값을 비교
		

	}

}
