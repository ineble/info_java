package Day_0820;

import java.util.Scanner;

/* Ű����� ��ȣ, �̸�, ����, ���� ���� �Է�
 * ����, ����� ���Ͽ� ����� ���
 * */
public class Exam_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��� : ");
		int num = sc.nextInt();
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		int sum = kor + eng + mat;
		int avg = sum / 3;
		System.out.println("��ȣ\t�̸�\t����\t���");
		System.out.println(num + "\t" + name + "\t" + sum + "\t" + avg);

		System.out.println("---" + num + "���� ����ǥ----");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + mat);
		System.out.println("--------------------------");
		System.out.println("���� : " + sum);
		System.out.printf("��� : %d", avg);
		System.out.println();
		System.out.println("--------------------------");
	}
}
