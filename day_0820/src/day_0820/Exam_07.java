package Day_0820;

import java.util.Scanner;

/* 키보드로 번호, 이름, 국어, 영어 수학 입력
 * 총점, 평균을 구하여 모니터 출력
 * */
public class Exam_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 : ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		int sum = kor + eng + mat;
		int avg = sum/3;
		System.out.println("번호\t이름\t총점\t평균");
		System.out.println( num +"\t" + name +"\t" + sum + "\t" + avg);
		
		System.out.println("---" + num + "번의 성적표----");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("--------------------------");
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %d",avg );
		System.out.println();
		System.out.println("--------------------------");
	}
}
