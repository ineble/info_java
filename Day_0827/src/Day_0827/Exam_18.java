package Day_0827;

import java.util.Scanner;

/*	����� 90�̻� A 80�̻� B 70�̻� C 60�̻� D 60�̸� F
 * */

public class Exam_18 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			System.out.println("---------" + i + "��---------");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}

		for (int i = 2; i <= 9; i++) {
			System.out.print("["+i+"��]\t");
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}


	}
}
