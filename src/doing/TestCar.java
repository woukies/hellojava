package doing;

public class TestCar {
	public static void main(String[] args) {
		//Car car = new Car();

	}

}

class Car {
	private String color = "Black";
	private int speed = -1;
	private int gear = 0;

	public Car(String c, int s, int g) {
		this.color = c;
		this.speed = s;
		this.gear = g;
	}

	// ��ó�� �ʱ�ȭ ���൵ ������ ������ �Ʒ� ����� ����
	public Car() {
		this("White", 0, 1);
	}

	public String toString() {
		return String.format("Color: %s, Speed: %d, gear: %d", color, speed, gear);
	}
	
	public void speedUp() {
		this.speed += 10;
	}
}