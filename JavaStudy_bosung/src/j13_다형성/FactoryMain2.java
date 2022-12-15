package j13_다형성;

public class FactoryMain2 {

	public static void main(String[] args) {
		Factory[] factories = new Factory[100];
		
//		factories[0] = new SmartPhoneFactory();
//		factories[1] = new ComputerFactory();
		
		for(int i = 0; i < factories.length; i++) {
			//삼항연산자, 조건연산자
			factories[i] = i % 2 == 0 ? new SmartPhoneFactory() : new ComputerFactory();
		}
		
//		for(Factory factory : factories) {
//			factory.start();
//		}
		
		System.out.println();
		
		for(Factory factory : factories) {
			if(factory instanceof SmartPhoneFactory) {
				SmartPhoneFactory spf = (SmartPhoneFactory) factory;
				spf.showSmartPhone();
			}else if(factory instanceof ComputerFactory) {
				ComputerFactory cf = (ComputerFactory) factory;
				cf.showComputer();
			}else {
				System.out.println("다운캐스팅 할 수 없습니다.");
			}
			
		}
		
		
	}

}










