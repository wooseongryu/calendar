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
		String promt = "cal > ";
		Calendar cal = new Calendar();
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.printf("월을 입력하세요. \n%s", promt);
			int month = scanner.nextInt();

			if (month > 0 && month < 13) {
			System.out.printf("%d월은 %d일 까지 있습니다.\n", month, cal.MaxDaysOfMonth[month]);
			} else if (month == -1){
			System.out.printf("Have a nice day!\n");
			break;
			} else {
				System.out.print("1에서 12사이의 값을 입력하세요.\n");
			}
			
			System.out.printf("\n");
		}
		scanner.close();
	}
}
