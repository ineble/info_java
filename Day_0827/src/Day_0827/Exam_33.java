package Day_0827;
/*
 *��ȯ Ÿ�԰� �Ű�����
 *��ȯ Ÿ��(X) �Ű�����(X)
 *��ȯ Ÿ��(O) �Ű�����(X)
 *��ȯ Ÿ��(X) �Ű�����(O)
 *��ȯ Ÿ��(O) �Ű�����(O)
 * */

public class Exam_33 {
	static void swapVar(int a[]) {
		int temp =a[0];
		a[0] = a[1];
		a[1] = temp;
	}
	
	public static void main(String[] args) {
		int[]a = {10,20};
		System.out.println("a[0] : " + a[0] + ", a[1] : " + a[1]);
		swapVar(a);
		//call by reference ������ ���� ȣ��
		System.out.println("a[0] : " + a[0] + ", a[1] : " + a[1]);
	}
	
}
