package j17_스태틱.studnet;

public class Student {
	/*
	 * student_code(정수)
	 * student_name(이름)
	 * student_year(학년)
	 * 
	 */
	
	private int student_code = 20220000;
	private String student_name;
	private int student_year;
//	private static int sumCode;
	
	public Student(int student_code, String student_name, int student_year) {
//		student_code += ++sumCode;
		this.student_code += student_code;
		this.student_name = student_name;
		this.student_year = student_year;
	}
	
	public void studentInfo() {
		System.out.println("학번: " + student_code);
		System.out.println("이름: " + student_name);
		System.out.println("학년: " + student_year);
		System.out.println();
		
	}
}
