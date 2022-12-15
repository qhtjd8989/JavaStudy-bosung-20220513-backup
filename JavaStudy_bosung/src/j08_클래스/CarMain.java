package j08_클래스;

public class CarMain {

	public static void main(String[] args) {
		Car car1 = new Car(); // 생성자 : 반환자료형이 생략, 클래스명과 이름이 똑같다
		
		car1.company = "KIA";
		car1.model = "K7";
		car1.color = "블랙";
		car1.showCompanyInfo();
		car1.showInfoAll();
		System.out.println(car1.getCar());
		car1.setColor("블루");
		car1.showInfoAll();
		
		System.out.println();
		
		Car car2 = new Car();
		
		car2.company = "현대자동차";
		car2.model = "소나타";
		car2.color = "화이트";
		car2.showCompanyInfo();
		car2.showInfoAll();
		System.out.println(car2.getCar());
		car2.setColor("그레이");
		car2.showInfoAll();
		
		System.out.println();
		
		Car car3 = new Car();
		
		car3.company = "Tesla";
		car3.model = "model3";
		car3.color = "레드";
		car3.showCompanyInfo();
		car3.showInfoAll();
		System.out.println(car3.getCar());
		car3.setColor("그린");
		car3.showInfoAll();
	}

}
