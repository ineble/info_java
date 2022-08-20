package Day_0820;

import java.util.Scanner;

/* 
 * 
 * */
public class Exam_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력 : ");
		int score = sc.nextInt();
		if(score>=80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
			
		}
		System.out.println("입력된 점수는 " + score + "점");
		
	}
}
