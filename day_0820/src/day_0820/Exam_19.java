package Day_0820;

import java.awt.Label;
import java.util.Scanner;

/* 
 * 
 * */
public class Exam_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean a = true;
		while (a) {
			System.out.print("점수입력 : ");
			int score = Integer.parseInt(sc.nextLine());
			if (score >= 80 && score <= 100) {
				System.out.println("합격");
			} else if (score < 80 && score >= 0) {
				System.out.println("불합격");

			} else {
				System.out.println("잘못된 점수를 입력하셨습니다.");
			}
			System.out.println("입력된 점수는 " + score + "점");

			System.out.print("다시 하시겠습니까? yes or no ");
			String answer = sc.nextLine();
			
			System.out.println(answer);
			if (answer == "no") {
				a = false;
			} else if (answer == "yes") {
				a = true;
			} else {
				System.out.println("올바르지 않은 답변입니다.");
			}
		}
		System.out.println("프로그램을 종료합니다");
	}
}
