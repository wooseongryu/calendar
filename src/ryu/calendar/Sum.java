package ryu.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		System.out.println("�� ���� �Է��ϼ��� : ");
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		String[] splitedValue = number.split(" ");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		System.out.println("�� ���� ���� " + (first + second) + "�Դϴ�.");
	}
}
