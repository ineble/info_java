package Day_0820;

/* �ڹ��� ǥ�� ��� -> ����� ���
 * System.out.println() -> \n �ڵ� �ٹٲ��� ������
 * System.out.print() -> \n �ڵ� �ٹٲ��� ��������
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
