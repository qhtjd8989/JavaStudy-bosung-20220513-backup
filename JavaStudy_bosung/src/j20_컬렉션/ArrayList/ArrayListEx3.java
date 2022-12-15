package j20_컬렉션.ArrayList;

import java.util.ArrayList;

import j20_컬렉션.Entity.Student;

public class ArrayListEx3 {

	public static void main(String[] args) {
		
		/*
		 * Student 자료형을 담을 수 있는 Arraylist를 생성.
		 * 
		 * 학생정보 추가
		 * sutdentCode	name 	schoolName
		 * 20220001 	김준일	부산교육대학원
		 * 20220002		곽나경	부산대학교
		 * 20220002		정현경	부경대학교
		 * 20220002 	한재안	부산대학교
		 * 20220005		전주홍	동아대학교
		 * 
		 * 전체 학생 정보 출력
		 * 
		 * 인덱스 3의 위치에 삽입
		 * 20220006		한대경	서울대학교
		 * 
		 * 인덱스 2의 위치에 있는 학생의 학교명을 고려대학교로 수정
		 * 
		 * 인덱스 5의 위치에 있는 학생의 정보를
		 * 20220007 	김나예	부산여자중학교
		 * 
		 * 인덱스 0의 위치에 있는 학생의 정보를 삭제
		 * 
		 */
		
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
//		Student s = new Student();
//		studentList.add(s);
		
		studentList.add(new Student(20220001, "김준일", "부산교육대학교")); //주소값을 담는것이라 add에 생성 가능(위의 방식이랑 동일)
		studentList.add(new Student(20220002, "곽나경", "부산대학교"));
		studentList.add(new Student(20220003, "정현경", "부경대학교"));
		studentList.add(new Student(20220004, "한재안", "부산대학교"));
		studentList.add(new Student(20220005, "전주홍", "동아대학교"));
		
//		System.out.println(studentList);
		
		studentList.add(3, new Student(20220006, "한대경", "서울대학교"));
		
		studentList.get(2).setSchoolName("고려대학교"); // get으로 학생정보를 불러와서 set으로 수정
		
		studentList.set(5, new Student(20220007, "김나예", "부산여자중학교"));
		
		studentList.remove(0);
		
		System.out.println(studentList);
	}
}
