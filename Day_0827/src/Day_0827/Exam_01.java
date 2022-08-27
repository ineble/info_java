package Day_0827;

import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력해주세요 : ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}

}
