package Day_0820;

/* 번호, 이름, 국어, 영어, 수학 점수를 이용하여
 * 번호, 이름, 총점, 평균을 출력하는 프로그램 작성
 * */
public class Exam_06 {
	public static void main(String[] args) {
		int num = 1101;
		String name = "김학생";
		int kor = 90;
		int eng = 87;
		int mat = 89;
		int sum = kor + eng + mat;
		double avg = sum / 3;
		System.out.println("---" + num + "번의 성적표----");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("--------------------------");
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.1f",avg );
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("번호\t이름\t총점\t평균");
		System.out.println( num +"\t" + name +"\t" + sum + "\t" + avg);
	}
}
