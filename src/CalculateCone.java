import java.util.Scanner;

public class CalculateCone {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double radius, height, volume;

		System.out.print("���� ���� ���� �������� �Է��ϼ���: ");
		radius = scan.nextDouble();
		System.out.print("������ ���̸� �Է��ϼ���: ");
		height = scan.nextDouble();
		
		volume = radius * radius * Math.PI * height / 3;
		System.out.println("���� ���� ���� ������: " + radius);
		System.out.println("������ ����: " + height);
		System.out.println("������ ����: " + volume);
		
		scan.close();
	}
}
