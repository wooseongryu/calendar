package ryu.calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MaxDaysOfMonth =  {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static int MaxDay(int month) {
		return MaxDaysOfMonth[month - 1];
	}
	
	public static void calendar() {
		System.out.println(" �� ȭ ��  �� ��  ��  ��");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	
	public static void main(String[] args) {
		System.out.printf("�ݺ� Ƚ���� �Է��ϼ��� : \n");
		Scanner scanner1 = new Scanner(System.in);
		int times = scanner1.nextInt();
		
		System.out.printf("���� �Է��ϼ��� : \n");
		Scanner scanner = new Scanner(System.in);
		int[] month = new int[times];
		for (int i = 0; i < times; i++) {
			month[i] = scanner.nextInt();
		}
		
		Calendar cal = new Calendar();
		for (int i = 0; i < times; i++) {
			System.out.printf("%d���� %d�� ���� �ֽ��ϴ�.\n", month[i], cal.MaxDay(month[i]));
		}
		scanner.close();
		scanner1.close();
	}
}
