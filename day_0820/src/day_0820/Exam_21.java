package Day_0820;

import java.util.Scanner;

/* Ű����� ��ȣ ���� ���� ���� ������ �Է�
 * "�հ�","���հ�" ���
 * �հ����� : 3���� ��� 40�̻� , ��� 60�̻�
 * */
public class Exam_21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ��ȣ�� �Է����ּ��� : ");
		int bun = sc.nextInt();
		System.out.print("������ ������ �Է����ּ��� : ");
		int kor = sc.nextInt();
		System.out.print("������ ������ �Է����ּ��� : ");
		int eng = sc.nextInt();
		System.out.print("������ ������ �Է����ּ��� : ");
		int mat = sc.nextInt();
		int avg;
		if (kor >= 40 && eng >= 40 && mat >= 40) {
			avg = (kor + eng + mat) / 3;
			if(avg >= 60) {
				System.out.println("�հ�");
			}else {
				System.out.println("���հ�");
				System.out.println("��չ̸�");
			}
		} else {
			System.out.println("���հ�");
			System.out.println("����");
		}
	}
}
