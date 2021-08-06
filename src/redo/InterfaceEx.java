package redo;

// JAVA 7+ 상수, 추상
// JAVA 8+ default
interface PhoneInterface {
	final int TIMEOUT = 10000;

	// public abstract void sendCall();
	void sendCall(); // 추상 메소드

	void receiveCall();

	default void printLogo() {
		System.out.println("** PHONE **");
	}
}

class SamsungPhone implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}

	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}

}

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
