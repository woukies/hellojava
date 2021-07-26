package box;

public class CarArrayTest {

	public static void main(String[] args) {

		final int NUM_CARS = 5;
		Car[] cars = new Car[NUM_CARS];

//		¾È µÊ!!		
//		for (Car car : cars) {
//			car = new Car("White", (int) (Math.random() * 100), (int) (Math.random() * 10));
//		}

		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car("White", (int) (Math.random() * 100), (int) (Math.random() * 10));
		}
		
		for (Car car : cars) {
			System.out.println(car);
		}

		System.out.println("> SPEED UP!");
		for (Car car : cars) {
			car.speedUp();
		}

		for (Car car : cars) {
			System.out.println(car);
		}
	}

}