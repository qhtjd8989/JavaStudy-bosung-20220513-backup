package j01_첫수업;

public class HelloJava {

	public static void main(String[] args) {
		System.out.print("Hello, Java"); //출력하는 명령어
		System.out.println("Hello, Java"); // 마지막에 줄바꿈을 해서 출력하는 명령어
		System.out.print(10 + 5);
		System.out.println();
		
		int age = 29; 
//		double age = 10.4; // 동일한 변수명을 두번쓸 수 없다
		
		System.out.println(age);
		
		System.out.print("이름: ");
		System.out.println("김준일");
		System.out.print("직업: ");
		System.out.println("강사");
		System.out.print("나이: ");
		System.out.println(age);
		
		age = 30; //age를 30으로 초기화
		
		System.out.print("이름: ");
		System.out.println("김준일");
		System.out.print("직업: ");
		System.out.println("강사");
		System.out.print("나이: ");
		System.out.println(age);
		
		age = age + 1; // = <- 기호는 대입하는 기호
		
		System.out.println(age);
	}
	
}
