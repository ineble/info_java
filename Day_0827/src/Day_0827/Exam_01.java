package Day_0827;

import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է����ּ��� : ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}

}
