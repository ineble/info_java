package Day_0820;

import java.util.Scanner;

/* 
 * 
 * */
public class Exam_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int score = sc.nextInt();
		if(score>=80) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
			
		}
		System.out.println("�Էµ� ������ " + score + "��");
		
	}
}
