package Day_0820;


/* Ű����� ��ȣ ���� ���� ���� ������ �Է�
 * "�հ�","���հ�" ���
 * �հ����� : 3���� ��� 40�̻� , ��� 60�̻�
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
		System.out.println("����� : " + avg + "�̰�, ������ : " + grade + "�Դϴ�.");
	}
}
