package j15_인터페이스;

public class Main {

	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		BeamProjector beamProjector = new BeamProjector();
		
		SmartPhone smartPhone = new SmartPhone(monitor, monitor); // hdmi를 구현하고있는 클래스를 넣는다(업캐스팅)
		smartPhone.powerOn();
		smartPhone.powerOff();
		smartPhone.vgaConnect();
	}

}
