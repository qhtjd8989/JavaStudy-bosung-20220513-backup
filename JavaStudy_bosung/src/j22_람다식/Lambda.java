package j22_람다식;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda {

	public static void main(String[] args) {
		/*
		 * CustomLambda interface
		 */
		CustomLambda<String> lambda1 = new CustomLambda<String>() {
			
			@Override
			public String test(String t) {
				System.out.println("익명 클래스 테스트");
				return "data: " + t;
			}
		};
		String data =  lambda1.test("springboot");
		
		System.out.println(data);
		
		CustomLambda<String> lambda2 = str -> {
			System.out.println("람다테스트");
			return "data: " + str;
		};
		
		System.out.println(lambda2.test("spring"));
		System.out.println();
		
		/*
		 * Runnable interface
		 */
		
		Runnable runnable = () -> {
			System.out.println("Runnable 실행");
		};
		
		runnable.run(); // 실행
		System.out.println();
		
		/*
		 * Supplier interface
		 */
		
		Supplier<String> supplier = () -> "Supplier를 통해 공급";
		
		System.out.println(supplier.get());
		System.out.println();
		
		/*
		 * Consumer interface
		 */
		
		Consumer<Integer> consumer = (d) -> {
			System.out.println("Consumer가 data를 받아서 소비한다. data: " + d);
		};
		
		consumer.accept(9999);
		System.out.println();
		
		/*
		 * Function interface
		 */
		
		Function<Integer, String> function = param -> Integer.toString(param * 2);
		
		System.out.println(function.apply(10));
		System.out.println();
		
		/*
		 * Predicate interface
		 */
		
		Predicate<Integer> predicate = num -> num % 2 == 0;
		
		System.out.println(predicate.test(9));
	}

}









