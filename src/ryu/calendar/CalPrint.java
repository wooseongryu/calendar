package ryu.calendar;

import java.util.Scanner;
// 31 --- 1 3 5 7 8 10 12
// 28 --- 2
// 30 --- 4 6 9 11
public class CalPrint {
	private static final int[] MaxDaysOfMonth =  {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static int MaxDay(int month) {
		return MaxDaysOfMonth[month - 1];
	}
	
	public static void main(String[] args) {
		System.out.println("���� �Է��ϼ���.");
		System.out.print("> ");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int MaxDay = MaxDay(month);
		
		System.out.println(" �� ȭ ��  �� ��  ��  ��");
		System.out.println("--------------------");
		for (int i = 1; i <= MaxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println();
			}
		}
	}

}
