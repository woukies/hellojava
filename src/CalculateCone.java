import java.util.Scanner;

public class CalculateCone {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double radius, height, volume;

		System.out.print("원뿔 밑의 원의 반지름을 입력하세요: ");
		radius = scan.nextDouble();
		System.out.print("원뿔의 높이를 입력하세요: ");
		height = scan.nextDouble();
		
		volume = radius * radius * Math.PI * height / 3;
		System.out.println("원뿔 밑의 원의 반지름: " + radius);
		System.out.println("원뿔의 높이: " + height);
		System.out.println("원뿔의 부피: " + volume);
		
		scan.close();
	}
}
