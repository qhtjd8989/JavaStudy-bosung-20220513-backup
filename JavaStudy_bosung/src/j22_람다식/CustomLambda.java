package j22_람다식;

@FunctionalInterface // 추상메소드 2개이상 만들지 못하게함
public interface CustomLambda<T> {
	
	public T test(T t);
	
}
