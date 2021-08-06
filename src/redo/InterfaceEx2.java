package redo;

interface PhoneInterface2 {
	final int TIMEOUT = 10000;

	void sendCall();

	void receiveCall();

	default void printLogo() {
		System.out.println("** PHONE **");
	}
}

interface MobilePhoneInterface extends PhoneInterface2 {
	void SendSMS();

	void receiveSMS();
}

interface MP3Interface {
	public void play();

	public void stop();
}

class PDA {
	public int calculate(int x, int y) {
		return x + y;
	}
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {

	@Override
	public void sendCall() {
		System.out.println("따르릉~");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요");
	}

	@Override
	public void play() {
		System.out.println("음악 연주합니다");
	}

	@Override
	public void stop() {
		System.out.println("음악 중단합니다");
	}

	@Override
	public void SendSMS() {
		System.out.println("문자 갑니다");
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자 왔어요");
	}

	public void schedule() {
		System.out.println("일정 관리합니다");
	}
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3 + 5 = " + phone.calculate(3, 5));
		phone.schedule();
	}
}
