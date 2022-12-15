package j23_예외처리;

/*
 * 프로그램의 오류
 * 1. 예외(프로그램이 실행 중) RuntimeException
 * 2. 컴파일 중 오류(컴파일 에러) -> ex) 드라이버 IOException
 * 3. 버그(오작동)
 * 
 */
public class ArraException01 {

	public static void main(String[] args) {
		 
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		 
		try {
			for(int i = 0; i < numbers.length + 1; i++) {
				 
	 		}
		}catch (StringIndexOutOfBoundsException e) {
			 System.out.println(e); // 최상위의 toString이 실행
			 System.out.println("StringIndexOutOfBoundsException 예외가 발생하였음.");
		}catch (Exception e) {
			System.out.println(e);
		}
		
		// 아래의 두가지 예외처리를 안하고 상위 예외처리 하나만해도 됨
//		catch (StringIndexOutOfBoundsException e) {
//			 System.out.println(e); // 최상위의 toString이 실행
//			 System.out.println("StringIndexOutOfBoundsException 예외가 발생하였음.");
//		}catch (ArrayIndexOutOfBoundsException e) {
//			 System.out.println(e);
//			 System.out.println("ArrayIndexOutOfBoundsException 예외가 발생하였음");
//		}
		
		System.out.println("지금까지 진행한 작업을 저장합니다.");
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
	}

}
