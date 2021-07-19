package helloWorld;

import java.util.Scanner;

public class radius {

	public static void main(String[] args) {
		double radius;
		double area;
		Scanner input = new Scanner(System.in);
		System.out.println("¹İÁö¸§?");
		radius = input.nextDouble();
		input.close();
		area = Math.PI * radius * radius;
		
		System.out.println(area);

	}

}
