package Day_0820;

import java.awt.Label;
import java.util.Scanner;

/* 키보드로 번호 국어 영어 수학 점수를 입력
 * "합격","불합격" 출력
 * 합격조선 : 3과목 모두 40이상 , 평균 60이상
 * */
public class Exam_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("번호(점수 3과목):");
		int bun = sc.nextInt();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		int avg = (kor + eng + mat) / 3;
		if (avg >= 60 && kor >= 40 && eng >= 40 && mat >= 40) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
			if(avg<60) {
				System.out.println("평균 미만");
			}else {
				System.out.println("과락");
			}
//			if(kor < 40 || eng < 40 || mat < 40){
//				System.out.println("과락");
//			}
		}
	}
}
