package doing;

import java.util.Scanner;

public class Radius {

	public static void main(String[] args) {
		double radius;
		double area;
		Scanner input = new Scanner(System.in);
		System.out.println("반지름?");
		radius = input.nextDouble();
		input.close();
		area = Math.PI * radius * radius;
		
		System.out.println(area);

	}

}
