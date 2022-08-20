package Day_0820;

import java.util.Scanner;

/* 키보드로 번호 국어 영어 수학 점수를 입력
 * "합격","불합격" 출력
 * 합격조선 : 3과목 모두 40이상 , 평균 60이상
 * */
public class Exam_21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수험 번호를 입력해주세요 : ");
		int bun = sc.nextInt();
		System.out.print("국어의 점수를 입력해주세요 : ");
		int kor = sc.nextInt();
		System.out.print("영어의 점수를 입력해주세요 : ");
		int eng = sc.nextInt();
		System.out.print("수학의 점수를 입력해주세요 : ");
		int mat = sc.nextInt();
		int avg;
		if (kor >= 40 && eng >= 40 && mat >= 40) {
			avg = (kor + eng + mat) / 3;
			if(avg >= 60) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
				System.out.println("평균미만");
			}
		} else {
			System.out.println("불합격");
			System.out.println("과락");
		}
	}
}
