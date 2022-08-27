package Day_0827;

import java.util.Scanner;

/*	평균이 90이상 A 80이상 B 70이상 C 60이상 D 60미만 F
 * */

public class Exam_18 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			System.out.println("---------" + i + "단---------");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}

		for (int i = 2; i <= 9; i++) {
			System.out.print("["+i+"단]\t");
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
