package ryu.calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MaxDaysOfMonth =  {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static int MaxDay(int month) {
		return MaxDaysOfMonth[month - 1];
	}
	
	public static void calendar() {
		System.out.println(" 월 화 수  목 금  토  일");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	
	public static void main(String[] args) {	
		System.out.printf("달을 입력하세요.\n");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		Calendar cal = new Calendar();
		System.out.printf("%d월은 %d일 까지 있습니다.\n", month, cal.MaxDay(month));
		scanner.close();
	}
}
