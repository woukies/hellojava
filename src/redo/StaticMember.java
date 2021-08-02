package redo;

import java.util.Scanner;

class CurrencyConverter {
	private static double rate;

	public static double toDollar(double won) {
		return won / rate;
	}

	public static double toKRW(double dollar) {
		return dollar * rate;
	}

	public static void setRate(double r) {
		rate = r;
	}
}

public class StaticMember {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double rate;

		System.out.print("환율(달러))>>");
		rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate);

		System.out.printf("백만원은 $%.2f\n", CurrencyConverter.toDollar(1000000));
		System.out.printf("$100는 %.2f원\n", CurrencyConverter.toKRW(100));

		scanner.close();
	}
}

/*
 * class StaticMethod { int n;
 * 
 * void f1(int x) { n = x; }
 * 
 * void f2(int x) { m = x; }
 * 
 * static int m;
 * 
 * static void s1(int x) { // n = x; }
 * 
 * static void s2(int x) { // f1(3); }
 * 
 * static void s3(int x) { m = x; }
 * 
 * static void s4(int x) { s3(3); }
 * 
 * }
 * 
 * class StaticAndThis { int n; static int m;
 * 
 * void f1(int x) { this.n = x; }
 * 
 * void f2(int x) { this.m = x; }
 * 
 * static void s1(int x) { // this.n = x; }
 * 
 * static void s2(int x) { // this.m = x; } }
 */
