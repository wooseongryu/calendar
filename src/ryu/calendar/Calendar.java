package ryu.calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		System.out.println(" �� ȭ ��  �� ��  ��  ��");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		System.out.printf("���� �Է��ϼ���.\n");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int[] cal = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.printf("%d���� %d�� ���� �ֽ��ϴ�.\n", month, cal[month]);
		scanner.close();
	}
}
