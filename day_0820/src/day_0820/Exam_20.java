package Day_0820;

import java.awt.Label;
import java.util.Scanner;

/* Ű����� ��ȣ ���� ���� ���� ������ �Է�
 * "�հ�","���հ�" ���
 * �հ����� : 3���� ��� 40�̻� , ��� 60�̻�
 * */
public class Exam_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȣ(���� 3����):");
		int bun = sc.nextInt();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		int avg = (kor + eng + mat) / 3;
		if (avg >= 60 && kor >= 40 && eng >= 40 && mat >= 40) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
			if(avg<60) {
				System.out.println("��� �̸�");
			}else {
				System.out.println("����");
			}
//			if(kor < 40 || eng < 40 || mat < 40){
//				System.out.println("����");
//			}
		}
	}
}
