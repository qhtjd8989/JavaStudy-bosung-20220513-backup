package j17_스태틱.studnet;

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student(1, "김준일", 1);
		Student student2 = new Student(2, "김준이", 2);
		Student student3 = new Student(3, "김준삼", 3);
		Student student4 = new Student(4, "김준사", 2);
		Student student5 = new Student(5, "김준오", 1);
		
		student1.studentInfo();
		student2.studentInfo();
		student3.studentInfo();
		student4.studentInfo();
		student5.studentInfo();
	}

}
