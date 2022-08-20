package Day_0820;


/* 키보드로 번호 국어 영어 수학 점수를 입력
 * "합격","불합격" 출력
 * 합격조선 : 3과목 모두 40이상 , 평균 60이상
 * */
public class Exam_23 {
	public static void main(String[] args) {
		int avg = 79;
		char grade;
		if(avg>=90) {
			grade = 'A';
		}else if(avg>=80) {
			grade = 'B';
		}else if(avg>=70) {
			grade = 'C';
		}else if(avg>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println("평균은 : " + avg + "이고, 학점은 : " + grade + "입니다.");
	}
}
