package j23_예외처리;

public class Throws01Main {
	
	public void test() throws Exception{
		Throws01 throws01 = new Throws01();
		
		throws01.printArray(new int[] {1,2,3,4,5,6,7,8,9});
	}
	
	public static void main(String[] args){
		Throws01Main main = new Throws01Main();
		try {
			main.test();
		} catch (Exception e) {
			e.printStackTrace();// 예외가 어디까지 발생했는지를 보여줌 
		}
		
		System.out.println("test");
	}
}
