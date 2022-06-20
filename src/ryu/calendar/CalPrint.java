package ryu.calendar;

import java.util.Scanner;
// 31 --- 1 3 5 7 8 10 12
// 28 --- 2
// 30 --- 4 6 9 11
public class CalPrint {
	public static void main(String[] args) {
		System.out.println("종료하려면 -1을 입력하세요.");
		while (true) {
			System.out.println("월을 입력하세요.");
			System.out.print("> ");
			Scanner scanner = new Scanner(System.in);
			int month = scanner.nextInt();
			if (month == 2) {
				calendar28();
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				calendar30();
			} else if (month == -1) {
				System.out.println("Bye");
				break;
			} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				calendar31();
			} else {
				System.out.println("1에서 12사이의 값을 입력해 주세요.");
			}
		}
	}
	
	public static void calendar31() {
		System.out.println(" 일 화 수  목 금  토  월");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("29 30 31");
	}
	
	public static void calendar28() {
		System.out.println(" 일 화 수  목 금  토  월");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	
	public static void calendar30() {
		System.out.println(" 일 화 수  목 금  토  월");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("29 30");
	}
}
