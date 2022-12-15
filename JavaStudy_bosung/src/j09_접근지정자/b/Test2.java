package j09_접근지정자.b;

import j09_접근지정자.a.Test1;

public class Test2 {
	public String ccc;
	String ddd;
	
	public Test2() {
		Test1 t1 = new Test1(); //Test1을 import했다고 해서 생성할 수 있는것은 아니다
								//(Test1을 public으로 하면 가능)
	}
}
