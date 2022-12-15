package j06_반복;

public class For03 {
	
	public static void main(String[] args) {
		
		for(int dan = 0; dan < 8; dan++) {
			System.out.println((dan + 2) + "단");
			for(int num = 0; num < 9; num++) {
				System.out.println((dan + 2) + " X " + (num + 1) + " = "  + (dan + 2) * (num + 1));
			}
			System.out.println();
		}
		
		
	}
}


























