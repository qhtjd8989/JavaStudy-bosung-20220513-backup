package j22_람다식;

public class Main {

	public static void main(String[] args) {
		//인터페이스는 바로 생성할 수 없다
		//Math2 m2 = new Math2();
		//인터페이스에 메소드가 하나일 경우에만 람다식을 쓸 수 있다
		
		Math2 m2_1 = new Math2Impl();
		
		Math2 m2_2 = new Math2() {
			@Override
			public double calc(double value1, double value2) {
				value1 += 2;
				value2 -= 1;
				return value1 * value2;
			}
		};

		// 결과가 return 밖에 없을 대 중괄호({}) 생략
		Math2 m2_3 = (v1, v2) -> v1 / v2;
		
		Math2 m2_4 = (v1, v2) -> {
			v1 += 2;
			v2 -= 1;
			return v1 % v2;
		};
		
		double t = m2_3.calc(10, 3);
		System.out.println(t);
	}

}
