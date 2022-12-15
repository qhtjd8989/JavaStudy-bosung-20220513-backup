package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import j20_컬렉션.Entity.Student;

public class HashSetEx2 {

	public static void main(String[] args) {
		
		/*
		 * HashSet<Student>
		 * 
		 * 20220001, 김준일, "부산대학교"
		 * 20220002, 김준이, "부경대학교"
		 * 
		 */
		
		HashSet<Student> students = new HashSet<Student>(); 
		
		students.add(new Student(20220001, "김준일", "부산대학교"));
		students.add(new Student(20220002, "김준이", "부경대학교"));
		
		Iterator<Student> iterator = students.iterator(); //iterator를 변수에 담는 이유 : iterator를 변수에 안담고 students.iterator()로 사용하면 계속 새로 줄세우기 때문에 변수에 담아서 사용 
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getStudentCode() == 20220002) {
				System.out.println(student);
			}
		}
		iterator = students.iterator(); //iterator 초기화 : 새로 사용
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getStudentCode() == 20220001) {
				students.remove(student);
			}
		}
		
		System.out.println(students);
	}

}
