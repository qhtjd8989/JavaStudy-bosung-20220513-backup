package j17_스태틱.싱글톤;

public class SingletonMain {

	public static void main(String[] args) {
		/*
		 * 싱글톤
		 * 
		 * 1. 유일한 객체(인스턴스)를 생성해야한다.
		 * 2. 생성자는 private으로 지정하여 외부에서 생성할 수 없게 만들어야한다.
		 * 3. 싱글톤으로 설계된 클래스의 유일한 instance를 return해줄 수 있는 
		 * 	  getInstance() static 메소드가 존재해야 한다.
		 * 4. 싱글톤 instance를 저장할 변수면이 instance인 static 변수가 존재해야 한다.
		 */
		Singleton singleton = Singleton.getInstance();
		singleton.setCount(10);
		singleton.getCount();
		
		Singleton singleton2 = Singleton.getInstance();
		singleton2.setCount(20);
		singleton2.getCount();
		

	}

}
