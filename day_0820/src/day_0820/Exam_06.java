package Day_0820;

/* ��ȣ, �̸�, ����, ����, ���� ������ �̿��Ͽ�
 * ��ȣ, �̸�, ����, ����� ����ϴ� ���α׷� �ۼ�
 * */
public class Exam_06 {
	public static void main(String[] args) {
		int num = 1101;
		String name = "���л�";
		int kor = 90;
		int eng = 87;
		int mat = 89;
		int sum = kor + eng + mat;
		double avg = sum / 3;
		System.out.println("---" + num + "���� ����ǥ----");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + mat);
		System.out.println("--------------------------");
		System.out.println("���� : " + sum);
		System.out.printf("��� : %.1f",avg );
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("��ȣ\t�̸�\t����\t���");
		System.out.println( num +"\t" + name +"\t" + sum + "\t" + avg);
	}
}
