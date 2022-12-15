package j23_예외처리;

import java.io.IOException;

public class Throws01 {
	// 메소드를 호출하면 예외처리를 해야됨
	public void printArray(int[] arrays) throws Exception{
		
		for(int i = 0; i < arrays.length + 1; i++) {
			System.out.println("index" + i + ": " + arrays[i]);
		}
	}
}
