package Day_0820;

/* 자바의 표준 출력 -> 모니터 출력
 * System.out.println() -> \n 자동 줄바꿈이 들어가있음
 * System.out.print() -> \n 자동 줄바꿈이 빠져있음
 * 
 * */
public class Exam_03 {

	public static void main(String[] args) {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");

		for (int j = 1; j < 4; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
