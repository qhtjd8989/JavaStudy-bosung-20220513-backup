package j14_추상;

public class FactoryMain {
	
	public static void main(String[] args) {
		
		Factory samsung = new SamsungFactory();
		Factory lg = new LGFactory();
		
		// Factory클래스를 상속받은 모든 클래스(인스턴스)를 담을 수 있는 공간 2개의 배열 생성.
		Factory[] factories = new Factory[2];
		
		//업캐스팅
		factories[0] = new SamsungFactory();
		factories[1] = new LGFactory();
		
		for(Factory factory : factories) { // foreach : 처음부터 끝까지 반복
			factory.start();
		}
		
		for(Factory factory : factories) {
			factory.stop();
		}
		
	}
}
