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
			System.out.print("�����Է� : ");
			int score = Integer.parseInt(sc.nextLine());
			if (score >= 80 && score <= 100) {
				System.out.println("�հ�");
			} else if (score < 80 && score >= 0) {
				System.out.println("���հ�");

			} else {
				System.out.println("�߸��� ������ �Է��ϼ̽��ϴ�.");
			}
			System.out.println("�Էµ� ������ " + score + "��");

			System.out.print("�ٽ� �Ͻðڽ��ϱ�? yes or no ");
			String answer = sc.nextLine();
			
			System.out.println(answer);
			if (answer == "no") {
				a = false;
			} else if (answer == "yes") {
				a = true;
			} else {
				System.out.println("�ùٸ��� ���� �亯�Դϴ�.");
			}
		}
		System.out.println("���α׷��� �����մϴ�");
	}
}
