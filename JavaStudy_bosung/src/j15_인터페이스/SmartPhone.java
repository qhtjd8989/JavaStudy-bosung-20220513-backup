package j15_인터페이스;

public class SmartPhone {
	
	private final Hdmi hdmi;
	private final VGA vga;
	
	public SmartPhone(Hdmi hdmi, VGA vga) {
		this.hdmi = hdmi;
		this.vga = vga;
	}
	
	public void powerOn() {
		System.out.println("스마트폰의 전원을 켭니다.");
		hdmi.connect();
	}
	
	public void powerOff() {
		System.out.println("스마트폰의 전원을 끕니다.");
		hdmi.disconnect();
	}
	
	public void vgaConnect() {
		System.out.println("vga");
		vga.vgaConnect();
	}
}
